package A_뮤직플레이어;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatProgram extends JFrame {
  private JTextField enterField;
  private JTextArea displayArea;

  public ChatProgram() {
    super("Chat Program");
    enterField = new JTextField();
    enterField.setEditable(false);
    enterField.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        sendMessage(event.getActionCommand());
        enterField.setText("");
      }
    });
    add(enterField, BorderLayout.NORTH);
    displayArea = new JTextArea();
    add(displayArea, BorderLayout.CENTER);
    setSize(300, 150);
    setVisible(true);
  }

  private void sendMessage(String message) {
    displayArea.append(message + "\n");
  }

  public static void main(String[] args) {
    ChatProgram chatApp = new ChatProgram();
    chatApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}