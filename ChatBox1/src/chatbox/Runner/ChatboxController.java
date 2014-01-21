package chatbox.Runner;

import java.util.ArrayList;

import chatbox.model.Chatbox;
import chatbox.view.ChatboxView;
/**
 *  import's so it can utilize arraylist
 * @author mveg2475
 *@version 1.3 10/31/13 removed old popup GUI, reference to Chatbot
 */

public class ChatboxController
{
	private ChatboxView myView;
	private Chatbox myChatBox;
	private Chatbox appFrame;
	
	public ChatboxController()
	{
//		myView = new ChatboxView();
		myChatBox = new Chatbox();

		
	}

	// contained in chatboxcontroller

	public void start()
	// void is empty space
	{
	appFrame = new Chatbox();
	}
	private String conversationHelper(ArrayList<String> conversationList)
	{
		String currentConversationPiece = "";
		if( conversationList.size() > 0)
		{
			currentConversationPiece = conversationList.remove(0);
			
		}
		
		return currentConversationPiece;
	}
	public String processConversation()
	{
		String currentConversation = "";
		
		currentConversation = conversationHelper(myChatBox.topicConversation());
		
		return currentConversation;
	}
	public String processMeme(String currentInput)
	{
		String memeResponse = "you don't like Meme's";
		
        if(myChatBox.memeCheckers(currentInput))
        { 
        	memeResponse =currentInput + "is a cool meme";
        }
        
        return memeResponse;
	}
	

}
