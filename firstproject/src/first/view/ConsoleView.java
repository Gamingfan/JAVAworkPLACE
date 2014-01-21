package first.view;

import first.model.Thingy;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ConsoleView

{
	private java.util.Scanner wordScanner;
	private Thingy testThingy;

	/**
	 * declare a Thingy object for testing purposes
	 */
	public ConsoleView()
	{
		wordScanner = new Scanner(System.in);
		testThingy = new Thingy();
		meetTheThingy();
	}

	public void Start()
	{
		System.out.println("Hi there, lets talk!");
		// getWords();
		// questionsAndAnswers();
	}

	private void meetTheThingy()
	{
		String answer;
		JOptionPane.showMessageDialog(null,"Here is a Thingy" + testThingy.getName());
		answer = JOptionPane.showInputDialog("?");
		JOptionPane.showMessageDialog(null,"Hi there"+ answer);
		
		String answer1;
		JOptionPane.showMessageDialog(null,"What do you want to change my name to?");
		answer1 = JOptionPane.showInputDialog("?");
		JOptionPane.showMessageDialog(null,"Hi there"+ answer1);
		
		//System.out.println("What do you want to change my name to?");
		//String newName = wordScanner.nextLine();

		System.out.print("Are you really sure you want my name to be:"
				+ newName + " really?");

		System.out.println("Type yes or no");

		String answer2 = wordScanner.nextLine();

		if (answer2.equals("yes"))
		{
			System.out.println("I hope you regret this!");
			testThingy.setName(newName);
			System.out.println("my new name is " + testThingy.getName());
		}
		else if (answer2.equals("no"))
		{
			System.out.println("I never liked the name of:" + newName
					+ " it sounded stoopid");
		}
		else
		{
			System.out.println("stop typing crap");
			meetTheThingy();
		}
		////////////////////////////////////////////////////////////////////////////
		System.out.println("ok my name is:" + testThingy.getName()
				+ " now what is my favorite movie ");

		String newMovie = wordScanner.nextLine();
		System.out.println("Type yes or No");

		if (answer.equals("yes"))
			System.out.println("i really did like that");
		testThingy.setMovie(newMovie);
		System.out.println("my favorite movie is" + testThingy.getMovie());
		{
			
		}
	    /////////////////////////////////////////////////
		
		/**
		 * 
		 * else if (answer.equals("no"))
		
			System.out.println("Never liked:" + newMovie);
		}
		else
		{
			System.out.println("Never going to bring that up");
			meetTheThingy();
	      **/
		
		//////////////////////////////////////////////////////////////////////////

		System.out.println("hmm what is my favorite food");

		String newFood = wordScanner.nextLine();

		System.out.print("im not sure if :" + newFood + " really?");

		System.out.println("Type yes or no");

		String answer3 = wordScanner.nextLine();

		if (answer3.equals("yes"))
		{
			System.out.println("Nevermind i was wrong its great" + newFood
					+ "!");
			testThingy.setFood(newFood);
			System.out.println("my new name is " + testThingy.getName());
		}
		else if (answer3.equals("no"))
		{
			System.out.println("i KNEW I WAS RIGHT:" + newFood + " sucks");
		}
		else
		{
			System.out.println("what is this");
			meetTheThingy();
		}
	
		System.out.println("ok so like" + newFood + "and the movie" + newMovie
				+ "and i am" + newName);
	}


	/**
	 * private void questionsAndAnswers() {
	 * System.out.println("Hi there, lets talk!"); getWords();
	 * 
	 * System.out.println("what is your favorite color"); getWords();
	 * 
	 * System.out.println("what is your favorite anime"); getWords();
	 * 
	 * System.out.println("what is your favorite pokemon"); getWords();
	 * 
	 * System.out.println("what is your favorite food"); getWords();
	 * 
	 * }
	 * 
	 * private void string() { System.out.println("Hi there, lets talk!");
	 * String test = wordScanner.nextLine();
	 * 
	 * }
	 **/

	public static void main(String[] args)
	{
	}

	public void show()
	{

	}

}
