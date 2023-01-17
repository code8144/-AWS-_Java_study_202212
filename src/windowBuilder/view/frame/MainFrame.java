package windowBuilder.view.frame;

import java.awt.CardLayout;


import javax.swing.JFrame;
import javax.swing.JPanel;

import lombok.Data;
import windowBuilder.view.panel.MainPanel;

public class MainFrame extends JFrame{
	
	private CardLayout mainCard;
	private JPanel mainPanel;

	public MainFrame() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		
		JPanel mainPanel = MainPanel.getInstance();
		setContentPane(mainPanel);
	}

}
