package simplechatting.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerApplication {
	
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket(9090);
			System.out.println("=====<<< 서버 실행 >>>=====");
			
			Socket socket = serverSocket.accept();	// 클라이언트의 접속을 기다리는 녀석(연결버튼 누를때까지)
			
			OutputStream outputStream = socket.getOutputStream();
			PrintWriter out = new PrintWriter(outputStream, true); //클라이언트로부터 값을받음
			out.println("join");
			
			InputStream inputStream = socket.getInputStream();
			BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
			
			String welcomeMessage = in.readLine();	// 값을 받아서 welcomMessage변수에 넣는다
			System.out.println(welcomeMessage);
			out.println(welcomeMessage);
			
			while(true) {
				in.readLine();
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(serverSocket != null) {
				try {
					serverSocket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			System.out.println("======<<< 서버종료 >>>======");
		}
		
	}

}
