package simplechatting.client;

import java.awt.EventQueue;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;

public class ChattingClient extends JFrame {

	private Socket socket;
	private String username;
	
	private JPanel contentPane;
	private JTextField ipInput;
	private JTextField portInput;
	private JTextArea contentView;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChattingClient frame = new ChattingClient();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ChattingClient() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 815, 657);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ipInput = new JTextField();
		ipInput.setBounds(509, 6, 130, 31);
		contentPane.add(ipInput);
		ipInput.setColumns(10);
		
		JButton connectButton = new JButton("연결");
		connectButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String ip = null;
				int port = 0;
				
				ip = ipInput.getText();
				port = Integer.parseInt(portInput.getText());
				
				try {
					socket = new Socket(ip, port);
					
					JOptionPane.showMessageDialog(null,
							socket.getInetAddress() + "서버 접속",
							"접속 성공",
							JOptionPane.INFORMATION_MESSAGE);
					
				InputStream inputStream = socket.getInputStream();
				BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
				
				if(in.readLine().equals("join")) {	//in.readLine이 join을 받는다. 
					username = JOptionPane.showInputDialog(null, "사용자이름을 입력하세요.", JOptionPane.INFORMATION_MESSAGE);
					
					OutputStream outputStream = socket.getOutputStream();	//서버한테 갈수있는 통로를 열어줌
					PrintWriter out = new PrintWriter(outputStream, true); //서버한테 값을 줌
					
					out.println(username + "님이 접속하였습니다.");	//서버한테 줄 내용
					
					String welcomeMessage = in.readLine();	// 다시 받는다
					contentView.append(welcomeMessage);
				}
					
					
				} catch (ConnectException e1) {
					
					JOptionPane.showMessageDialog(null,
							"서버 접속 실패",
							"접속 실패",
							JOptionPane.ERROR_MESSAGE);
					
				} catch (UnknownHostException e1) {
					e1.printStackTrace();
					
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		connectButton.setBounds(710, 6, 77, 31);
		contentPane.add(connectButton);
		
		portInput = new JTextField();
		portInput.setBounds(642, 6, 65, 31);
		contentPane.add(portInput);
		portInput.setColumns(10);
		
		JScrollPane contentScroll = new JScrollPane();
		contentScroll.setBounds(31, 6, 466, 534);
		contentPane.add(contentScroll);
		
		contentView = new JTextArea();
		contentScroll.setViewportView(contentView);
		
		JScrollPane usernameScroll = new JScrollPane();
		usernameScroll.setBounds(509, 47, 278, 493);
		contentPane.add(usernameScroll);
		
		JList userList = new JList();
		usernameScroll.setViewportView(userList);
		
		JScrollPane messageScroll = new JScrollPane();
		messageScroll.setBounds(29, 550, 627, 44);
		contentPane.add(messageScroll);
		
		JTextArea messageInput = new JTextArea();
		messageScroll.setViewportView(messageInput);
		
		JButton SendButton = new JButton("전송");
		SendButton.setBounds(668, 550, 106, 44);
		contentPane.add(SendButton);
	}
}
