package J25.소켓.multiSocket.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor

public class clientReceive extends Thread{
	
	private final Socket socket;
	
	@Override
	public void run() {		//Thread는 무조건 run 메소드가 있어야함
		try {
			InputStream inputStream = socket.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
			
			while(true) {
				if(Client.name != null) {
					System.out.println(reader.readLine());
				}
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
