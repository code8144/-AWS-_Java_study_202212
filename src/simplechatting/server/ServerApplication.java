package simplechatting.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketOption;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
class ConnectedSocket extends Thread{
   private static List<ConnectedSocket> socketList = new ArrayList<>();
   private Socket socket;
   private InputStream inputStream;
   private OutputStream outputStream;
   
   private String username;
   
   public ConnectedSocket(Socket socket) {
      this.socket = socket;
      socketList.add(this);
   }
   
   @Override
   public void run() {
      try {
         outputStream = socket.getOutputStream();
         PrintWriter out = new PrintWriter(outputStream, true);
         out.println("join"); //클라이언트 한테 join이라는 텍스트값을 준다.
         
         inputStream = socket.getInputStream(); 
         BufferedReader in = new BufferedReader(new InputStreamReader(inputStream)); //클라이언트한테 받을 통로
         
         username = in.readLine(); // 값을 받아서 welcomMessage변수에 넣는다
         System.out.println(username + "님이 접속하였습니다."); //consol창에서 welcomMessage을 찍고 
         
         
         String userListStr = "";
         
         for(int i = 0; i < socketList.size(); i++) {
            userListStr += socketList.get(i).getUsername();
            if(i < socketList.size() - 1) {
               userListStr += ",";
            }
         }
         
         for(ConnectedSocket connectedSocket : socketList) {
            outputStream = connectedSocket.getSocket().getOutputStream();
            out = new PrintWriter(outputStream, true);
            out.println("@welcome/" + username + "님이 접속하였습니다.");
            out.println("@userList/" + userListStr);
         }
         
         while(true) {
            String message = in.readLine();
            for(ConnectedSocket connectedSocket : socketList) {
               outputStream = connectedSocket.getSocket().getOutputStream();
               out = new PrintWriter(outputStream, true);
               out.println(message);
            }
         } 
      }catch (IOException e) {
         e.printStackTrace();
      } //클라이언트 한테 줄수있는 통로를 뚫어놓은것
   }
}

public class ServerApplication {
   
   public static void main(String[] args) {
      ServerSocket serverSocket = null;
      try {
         serverSocket = new ServerSocket(9090);
         System.out.println("======<<서버실행>>======");
         
         while(true) {
            Socket socket = serverSocket.accept();   // 클라이언트의 접속을 기다리는 녀석(연결버튼 누를때까지)
            ConnectedSocket connectedSocket = new ConnectedSocket(socket);
            connectedSocket.start();         
            
            
         }
         
         
         
      } catch (IOException e) {
         e.printStackTrace();
      }finally {
         if(serverSocket != null) {
            try {
               serverSocket.close();
            } catch (IOException e) {
               e.printStackTrace();
            }
         }
         
         System.out.println("======<<서버종료>>======");
         
      }
   }
}

