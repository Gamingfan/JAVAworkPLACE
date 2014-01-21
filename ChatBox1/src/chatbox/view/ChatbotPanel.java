package chatbox.view;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import chatbox.Runner.ChatboxController;
import chatbox.model.Chatbox;


public class ChatbotPanel (ChatboxController  baseController)
{
	this.baseController = baseController;
	this.appBot = baseController.getMyChatbox();
	
	submitChatButton = new JButton("submit this to chatbot");
	userTextField = new JTextField(30);
	
	setupPanel();
	setupLayout();
	setupListeners();
		
	private JButton submitChatButton;
	private JTextField userTextField;
	private JTextArea chatArea;
	private SpringLayout baseLayout;
	private JTextField chatPane;
	private Chatbox appBot;
	
	chatArea = new JTextArea(10,30);
	chatPane = new JScrollPane(chatArea);
	baseLayout = new SpringLayout();
		
	private int clickCount;
	
	 startChat;
	 private void setupListeners()
		{
			submitButton.addactionListen(new ActionListener()
			{
				
				public void actionPerformed(ActionEvent clickCount)
				{
					clickout++;
					
					String CurrentInput= userTextField.getText();
					chatArea.append("\n" + CurrentInput);
					chatArea.append("\n" + appBot.getRandomTopic());
					chatArea.append(currentConversation);
					
					
					if(clickCount % 7 == 0 ){
						String conversation = baseController.processConversation();
						if(currentConversation.lenth() == 0)
							
						{
							clickCount++;
						}
						
						else if(clickCount % 11 == 0)
						{
							chatArea.append(baseController.processMeme(CurrentInput));
							
						}
						else
						{
							chatArea.Append(currentConversation);
							chatArea.append("\n" + CurrentInput);
							
							clickCount--;
						}
			}
}


private void setupListeners()
{
	this.setLayout(baseLayout);
	this.setBackground(Color.BLUE);
	this.add(submitChatButton);
	this.add(userTextField);
	this.add(chatPane);
	
	chatArea.setWrapStyleWord(true);
	chatArea.setLineWrap(true);

	
}

private void add(JButton submitChatButton2)
{
	// TODO Auto-generated method stub
	
}

private void setupLayout()
{
	// TODO Auto-generated method stub
	
}

private void setupPanel()
{
	// TODO Auto-generated method stub
	
}

}
}
