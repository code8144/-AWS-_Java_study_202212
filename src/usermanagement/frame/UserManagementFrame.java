package usermanagement.frame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UserManagementFrame extends JFrame {

	private CardLayout mainCard;
	private JPanel mainPanel;
	private JTextField usernameField;
	private JPasswordField passwordField;
	private JTextField registerUsernameField;
	private JPasswordField registerPasswordField;
	private JTextField registerNameField;
	private JTextField registerEmailField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserManagementFrame frame = new UserManagementFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UserManagementFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 500);
		mainPanel = new JPanel();
		mainPanel.setBackground(new Color(255, 255, 255));
		mainPanel.setBorder(null);

		setContentPane(mainPanel);
		mainCard = new CardLayout();
		mainPanel.setLayout(mainCard);
		
		JPanel loginPanel = new JPanel();
		loginPanel.setBackground(new Color(255, 255, 255));
		
		mainPanel.add(loginPanel, "loginPanel");
		loginPanel.setLayout(null);
		
		JLabel logoText = new JLabel("User Management");
		logoText.setFont(new Font("CookieRun Regular", Font.BOLD, 20));
		logoText.setHorizontalAlignment(SwingConstants.CENTER);
		logoText.setBounds(80, 39, 228, 61);
		loginPanel.add(logoText);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("D2Coding", Font.BOLD, 22));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(120, 86, 143, 45);
		loginPanel.add(lblNewLabel);
		
		usernameField = new JTextField();
		usernameField.setBounds(24, 164, 336, 31);
		loginPanel.add(usernameField);
		usernameField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(24, 223, 336, 31);
		loginPanel.add(passwordField);
		
		JLabel usernameLabel = new JLabel("username or email");
		usernameLabel.setHorizontalAlignment(SwingConstants.LEFT);
		usernameLabel.setFont(new Font("D2Coding", Font.PLAIN, 15));
		usernameLabel.setBounds(24, 142, 149, 24);
		loginPanel.add(usernameLabel);
		
		JLabel passwordLabel = new JLabel("password");
		passwordLabel.setHorizontalAlignment(SwingConstants.LEFT);
		passwordLabel.setFont(new Font("D2Coding", Font.PLAIN, 15));
		passwordLabel.setBounds(24, 201, 149, 24);
		loginPanel.add(passwordLabel);
		
		JButton loginButton = new JButton("Login");
		loginButton.setBackground(Color.WHITE);
		loginButton.setFont(new Font("D2Coding", Font.BOLD, 15));
		loginButton.setBounds(57, 301, 272, 31);
		loginPanel.add(loginButton);
		
		JLabel signupDesc = new JLabel("Don't have an account?");
		signupDesc.setFont(new Font("굴림", Font.BOLD, 12));
		signupDesc.setHorizontalAlignment(SwingConstants.CENTER);
		signupDesc.setBounds(57, 352, 173, 15);
		loginPanel.add(signupDesc);
		
		JLabel signupLink = new JLabel("Sign up");
		signupLink.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mainCard.show(mainPanel, "registerPanel");
			}
		});
		signupLink.setForeground(Color.BLUE);
		signupLink.setFont(new Font("굴림", Font.BOLD, 12));
		signupLink.setBounds(242, 352, 87, 15);
		loginPanel.add(signupLink);
		
		JLabel forgotPasswordLink = new JLabel("Forgot your password?");
		forgotPasswordLink.setForeground(Color.BLUE);
		forgotPasswordLink.setBackground(Color.WHITE);
		forgotPasswordLink.setHorizontalAlignment(SwingConstants.CENTER);
		forgotPasswordLink.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		forgotPasswordLink.setBounds(108, 402, 173, 15);
		loginPanel.add(forgotPasswordLink);
		
		JPanel registerPanel = new JPanel();
		registerPanel.setBackground(new Color(255, 255, 255));
		mainPanel.add(registerPanel, "registerPanel");
		registerPanel.setLayout(null);
		
		JLabel signLink = new JLabel("Sign in");
		signLink.setFont(new Font("D2Coding", Font.BOLD, 12));
		signLink.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mainCard.show(mainPanel, "loginPanel");
			}
		});
		signLink.setForeground(Color.BLUE);
		signLink.setHorizontalAlignment(SwingConstants.CENTER);
		signLink.setBounds(234, 400, 138, 38);
		registerPanel.add(signLink);
		
		JLabel registerLogoText = new JLabel("User Management");
		registerLogoText.setFont(new Font("CookieRun Regular", Font.BOLD, 20));
		registerLogoText.setHorizontalAlignment(SwingConstants.CENTER);
		registerLogoText.setBounds(80, 29, 228, 61);
		registerPanel.add(registerLogoText);
		
		JLabel registerUsernameLabel = new JLabel("username");
		registerUsernameLabel.setHorizontalAlignment(SwingConstants.LEFT);
		registerUsernameLabel.setFont(new Font("D2Coding", Font.PLAIN, 15));
		registerUsernameLabel.setBounds(27, 130, 149, 24);
		registerPanel.add(registerUsernameLabel);
		
		JLabel registerPasswordLabel = new JLabel("password");
		registerPasswordLabel.setHorizontalAlignment(SwingConstants.LEFT);
		registerPasswordLabel.setFont(new Font("D2Coding", Font.PLAIN, 15));
		registerPasswordLabel.setBounds(27, 184, 149, 24);
		registerPanel.add(registerPasswordLabel);
		
		registerUsernameField = new JTextField();
		registerUsernameField.setColumns(10);
		registerUsernameField.setBounds(27, 154, 336, 31);
		registerPanel.add(registerUsernameField);
		
		registerPasswordField = new JPasswordField();
		registerPasswordField.setBounds(27, 206, 336, 31);
		registerPanel.add(registerPasswordField);
		
		JLabel registerText = new JLabel("Register");
		registerText.setHorizontalAlignment(SwingConstants.CENTER);
		registerText.setFont(new Font("D2Coding", Font.BOLD, 22));
		registerText.setBounds(116, 75, 143, 45);
		registerPanel.add(registerText);
		
		JLabel registerNameLabel = new JLabel("name");
		registerNameLabel.setHorizontalAlignment(SwingConstants.LEFT);
		registerNameLabel.setFont(new Font("D2Coding", Font.PLAIN, 15));
		registerNameLabel.setBounds(27, 247, 149, 24);
		registerPanel.add(registerNameLabel);
		
		registerNameField = new JTextField();
		registerNameField.setColumns(10);
		registerNameField.setBounds(27, 267, 336, 31);
		registerPanel.add(registerNameField);
		
		JLabel registerEmailLabel = new JLabel("email");
		registerEmailLabel.setHorizontalAlignment(SwingConstants.LEFT);
		registerEmailLabel.setFont(new Font("D2Coding", Font.PLAIN, 15));
		registerEmailLabel.setBounds(27, 296, 149, 24);
		registerPanel.add(registerEmailLabel);
		
		registerEmailField = new JTextField();
		registerEmailField.setColumns(10);
		registerEmailField.setBounds(27, 320, 336, 31);
		registerPanel.add(registerEmailField);
		
		JButton registerButton = new JButton("Register");
		registerButton.setFont(new Font("D2Coding", Font.BOLD, 15));
		registerButton.setBackground(Color.WHITE);
		registerButton.setBounds(57, 359, 272, 31);
		registerPanel.add(registerButton);
		
		JLabel lblNewLabel2 = new JLabel("Login");
		lblNewLabel2.setFont(new Font("D2Coding", Font.BOLD, 22));
		lblNewLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel2.setBounds(120, 86, 143, 45);
		loginPanel.add(lblNewLabel2);
	}
}
