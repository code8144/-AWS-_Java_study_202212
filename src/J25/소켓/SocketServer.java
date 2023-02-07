package J25.소켓;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class SocketServer {
	
	public static final int PORT = 9090; 
	
	public static void main(String[] args) {
		List<Socket> clients = new ArrayList<>();
		
		try {
			ServerSocket serverSocker = new ServerSocket(PORT);
			while(true) {
			System.out.println("클라이언트의 접속을 기다리는 중입니다.");
			Socket socket = serverSocker.accept();	//클라이언트 하나
			clients.add(socket);
			System.out.println("클라이언트가 연결되었습니다.");
			System.out.println(clients);
			OutputStream outputStream = socket.getOutputStream();
			PrintWriter out = new PrintWriter(outputStream, true);	//sysout 프린트와 같은느낌, 문자열을 클라이언트로 보낼줄때
			out.println("소환사의 협곡에 오신것을 환영합니다.");
		}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
