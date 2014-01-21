package chatbox.model;

// where this is contained

import java.util.ArrayList;

/**
 * Explanation of the class:Chatbot model to test String Maniplation and use.
 *public class Chatbox
 *
 */

/**
 * changes Arraylist String to myManuel
 * 
 * @parm currentInput Explanation of the variable. The current phrase typed by a
 *       user.
 * @return what is returned by the method. in this case the method returns
 *         whether or not the inputs is a meme or not
 */
public class Chatbox
{
	//
	private ArrayList<String> myMemes;
	private ArrayList<String> myManuel;
	private ArrayList<String> randomList;

	//
	public Chatbox()
	{
		myMemes = new ArrayList<String>();
		randomList = new ArrayList<String>();
		myManuel = new ArrayList<String>();

		fillTheRandomList();
		fillTheMemeList();
		filltheConversationList();
	}

	/**
	 * This fills the RandomList with random phrase's
	 * 
	 * @return's with
	 * @parm current
	 */
	private void fillTheRandomList()
	{
		randomList.add("I like Cheese");
		randomList.add("i hate essays");
		randomList.add("i like ceral");
		randomList.add("this is random");
		randomList.add("i like typing");
	}

	private void filltheConversationList()
	{
		ConversationList.add("hey");
		ConversationList.add("dasdas");
		ConversationList.add("coadsl");

	}

	/**
	 * this method chooses a random item from the randomList
	 * 
	 * @return a random element from the randomList.
	 * @parm set's parameter of list for chatbox that is random
	 */
	public String getRandomTopic()
	{
		String randomTopic = "";
		double myRandom = Math.random();
		int myRandomListPosition = (int) (myRandom * randomList.size());
		randomTopic = randomList.get(myRandomListPosition);

		return randomTopic;
	}

	/**
	 * adds to list in memelist
	 * 
	 * @parm current memelist
	 * @return
	 */
	public String alphabetizeYourName(String first, String middle, String last)
	{
		String nameInOrder = "";
		if (first.compareTo(middle)< 0)
		{
			if middle.compareTo(last) < 0)
			{
				nameInOrder = first +"," + middle + "," + last;
			}
			else 
			{
				nameInOrder = first +"," + last + "," + middle;
			}
			
		}
		else
		{
			nameInOrder = last + "," + first + ","+ middle;
					
		}
		else
		{
			if(middle.compareTo(last) < 0)
			{
				if(first.compareTo(last) <0)
				{
					nameInOrder = middle + "," + first + "," + last;
				}
				else
				{
					nameInOrder = middle + "," + last + "," + first;
				}		
				
			}
			else
			{
				nameInOrder = last ="," + middle + "," + first;
			}
		}
		
		return nameInOrder;
	}

//	public ArrayList<String> topicConversation()
//	{
//		ArrayList<String> conversation = new ArrayList<String>();
//		conversation.add("asdas");
//		return conversation;
//	}

	private void fillTheMemeList()
	{
		myMemes.add("nicolas cage");
		myMemes.add("arrow to the knee");
		myMemes.add("one does not simply");
		myMemes.add("y u no");
	}

	/**
	 * adds words to list that scans input for specified words then sends to
	 * loop if true
	 * 
	 * @parm List in array
	 * @return adds to list of phrase's that Manuelchecker looks for
	 */
	private void filltheManuel()
	{
		myManuel.add("Magikarp");
		myManuel.add("Trance");
		myManuel.add("ponies");
		myManuel.add("Rainbows");
		myManuel.add("MeatBell");
		myManuel.add("HelloKitty");
	}

	// fills the list with everything manuel and checks for it in input
	/**
	 * @return 
	 * 
	 */
	public ArrayList<String> topicConversation()
	{
		// must have at least 3 JOptionPane.showInputDialog Statements about a
		// single topic of your choice
	}

	/**
	 * one to two sentence explanation of the method. full sentences with
	 * punctuation. checks the current input from the user. it returns true if
	 * the input is a member of the list.
	 * 
	 * @param currentInput
	 *            explanation of the variable.
	 * @return what is returned from by the method
	 */

	public boolean ManuelChecker(String CurrentInput)
	{
		boolean hasManuel = false;
		// loop all the items in the list, if the input matches a meme change
		// hasmeme to true.
		for (String currentPhrase : myManuel)
		{
			if (CurrentInput.contains(currentPhrase))
			{
				CurrentInput = ("Magikarp");
				CurrentInput = ("Trance");
				CurrentInput = ("ponies");
				CurrentInput = ("Rainbows");
				CurrentInput = ("MeatBell");
				CurrentInput = ("HelloKitty");
			}
		}
		return hasManuel;
	}

	/**
	 * checks boolean loop if false and repeats
	 * 
	 */
	public boolean memeCheckers(String CurrentInput)
	{
		boolean hasMeme = false;
		// loop all the items in the list, if the input matches a meme change
		// hasmeme to true.
		for (String currentPhrase : myMemes)
		{
			if (currentPhrase.equalsIgnoreCase(CurrentInput))
			{
				hasMeme = true;
			}
		}
		return hasMeme;
	}
	// ends string
}
