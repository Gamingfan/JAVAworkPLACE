package hipster.Controller;

import javax.swing.JOptionPane;
import hipster.view.HipsterFrame;
import hipster.Model.Hipster;

public class Controller
{
	private HipsterFrame appFrame;
	private Hipster selfHipster;
	private Hipster[] classHipsters;
	private int hipsterCount;

	public Controller()
	{
		selfHipster = new Hipster();
		classHipsters = new Hipster[50];
		hipsterCount = 0;

	}

	public Hipster getSelfHipster()
	{
		return selfHipster;
	}

	public void setSelfHipster(Hipster selfHipster)
	{
		this.selfHipster = selfHipster;
	}

	/**
	 * Used to start application.
	 */
	public void start()

	{
		appFrame = new HipsterFrame(this);
	}

	public Hipster getSpecifiedHipster(int position)
	{
		Hipster currentHipster = null;

		if (position < classHipsters.length)
		{
			currentHipster = classHipsters[position];

		}

		return currentHipster;
	}

	/**
	 * Used to retrieve a random hipster from a class of hipsters. creates a
	 * hipster from an array of class hipsters fom the specified values.
	 * 
	 * @parm Books the array of books for the current Hipster.
	 * @parm Name the current hipster.
	 * @parm Type the current hipster.
	 * @parm Names the Hipster Phrase.
	 */
	public Hipster getRandomHipster()
	{
		Hipster currentHipster = null;

		int randomIndex = 0;
		double random = Math.random();
		randomIndex = (int) random * classHipsters.length;
		currentHipster = classHipsters[randomIndex];

		return currentHipster;
	}

	/**
	 * Makes a random hipster.
	 */

	public void addHipster(String[] books, String name, String type, String phrase)
	/**
	 * Add's a hipster to the class .
	 */
	{
		if (hipsterCount < classHipsters.length)
		{
			Hipster tempHipster = new Hipster(name, type, phrase, books);
			classHipsters[hipsterCount] = tempHipster;
			hipsterCount++;
		}

		else
		{
			JOptionPane.showMessageDialog(appFrame, " The class is as good as it get's eh");
		}

	}

}
