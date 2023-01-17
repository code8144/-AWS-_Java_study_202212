package windowBuilder.view.panel;

import javax.swing.JPanel;

public class LoginPanel extends JPanel{
	
	
	public LoginPanel(int width, int height) {
		MainPanel mainPanel = mainPanel.getInstance();
		setSize(mainPanel.getSize().width, mainPanel.getSize().height);
		setLayout(null);
		setBorder(null);
	}

}
