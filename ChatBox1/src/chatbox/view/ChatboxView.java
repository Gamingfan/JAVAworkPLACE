package chatbox.view;

import javax.swing.JOptionPane;
import chatbox.model.Chatbox;

//import chatbot.view.View.java;
public class ChatboxView
{

	private Chatbox myChatbox;

	public void showApp()
	{
		String answer = ("keep Going");
		while (answer == null || !answer.equals("no"))
		{
			JOptionPane.showMessageDialog(null, myChatbox.getRandomTopic());
			answer = getInput();
			useInput(answer);
			// GATHERS RESPONSE and uses a "random topic to respond
		}

		answer = getInput();
		JOptionPane.showMessageDialog(null, " alright that seems interesting" + answer);
		// gathers response and adds to alright that seems interesting to it

	}

	// private String getInput()
	// {
	// String userInput = "";
	//
	// userInput = JOptionPane.showInputDialog("do you want to talk?");
	//
	// return userInput;
	//
	// }

	private void useInput(String currentInput)
	{
		JOptionPane.showMessageDialog(null, "TOTALLY");
	}
	// if the answer is null it automatically responds with TOTALLY
}
