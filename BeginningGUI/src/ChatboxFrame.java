
//fix all of this today
public class ChatboxFrame;
import javax.swing.JPanel;
import chat.controller.ChatboxController;
public class ChatbotPanel extends JPanel;

/**
 * this goes in Chatbox panel
 * @param baseController
 * @return 
 */
//{ 
//	private ChatbotController baseController;
//	public ChatbotPanel extends JPanel
//	private JButton submitButton;
//	private JTextField userInputField;
//	private SpringLayout baseLayout;
//	

	public void ChatboxPanel(ChatboxController baseController)
		this.baseController = new baseController;
		{
		/** so does this
		 * 
		 */
//		submitButton = new button("submit this to the chatbot");
//		userInputField = new JTextField(30);
//		ChatArea = newJTextArea(10, 30);
//		baseLayout = new SpringLayout ();
//		setupPanel();
//		setupLayout();
//		setupListeners();
		basePanel = new ChatbotPanel(baseController);
		
		setupFrame();
	}
private void setupFrame()
{
	this.setContentPane(BasePanel);
	this.setSize(500,500);
	this.setVisible(true);

	
}
