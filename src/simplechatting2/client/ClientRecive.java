package simplechatting2.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

import com.google.gson.Gson;

import lombok.RequiredArgsConstructor;
import simplechatting2.dto.JoinRespDto;
import simplechatting2.dto.MessageReqDto;
import simplechatting2.dto.ResponseDto;

@RequiredArgsConstructor
public class ClientRecive extends Thread {

	private final Socket socket;
	private InputStream inputStream;
	private Gson gson;
	
	@Override
	public void run() {
		try {
			inputStream = socket.getInputStream();
			BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
			gson = new Gson();
			
			while(true) {
				String request = in.readLine();
				System.out.println(request);
				ResponseDto responseDto = gson.fromJson(request, ResponseDto.class);
				switch(responseDto.getResource()) {
				case "join" :
						JoinRespDto joinRespDto = gson.fromJson(responseDto.getBody(), JoinRespDto.class);
						ChattingClient.getInstance().getContentView().append(joinRespDto.getWelcomeMessage() + "\n");
						ChattingClient.getInstance().getUserListModel().clear();
						ChattingClient.getInstance().getUserListModel().addElement("--- 전체 ---");
						ChattingClient.getInstance().getUserListModel().addAll(joinRespDto.getConnectedUsers());
						ChattingClient.getInstance().getUserList().setSelectedIndex(0);
						break;
				case "sendMessage" : 
					MessageReqDto messageReqDto = gson.fromJson(responseDto.getBody(), MessageReqDto.class);
					ChattingClient.getInstance().getContentView().append(messageReqDto.getMessageValue() + "\n");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}














