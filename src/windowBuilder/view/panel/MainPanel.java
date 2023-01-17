package windowBuilder.view.panel;


import java.awt.CardLayout;

import javax.swing.JPanel;

import lombok.Data;

@Data

public class MainPanel extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CardLayout mainCard;
	private static MainPanel instance;
	
	public static MainPanel getInstance() {
		if(instance == null) {
			instance = new MainPanel();
		}
		return instance;
	}
	
	
	
	private MainPanel() {
		mainCard = new CardLayout();
		setSize(600, 500);
		setBorder(null);
		setLayout(mainCard);
	}
	
	public void init() {
		LoginPanel loginPanel= new LoginPanel();
		add(loginPanel, "loginPanel");
		
		RegisterPanel registerPanel = new RegisterPanel();
		add(registerPanel, "registerPanel");
	}

}
