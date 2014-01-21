package three.controller;

import javax.swing.JOptionPane;

import three.view.StringView;

public class StringController
{
	// Declartion Section
	// ALL needed models and view objects
	/**
	 * String controller for third project dealing with Strings in java
	 */
	private StringView myView;
	/**
	 * Creates a StringController object initializing all values.
	 */
	{
		myView = new StringView();
	}

	public StringController()
	{
		myView = new StringView();
	}

	/**
	 * displays error message from view(StringView).
	 */
	public void start()
	{

	//	myView.displayError();
		String myResponse = myView.getResponse();
		myView.showPassedVAlue(myView.getResponse());
		// myView.moreInteractive(myResponse);
		// myView.testStringMethods();
		
	}

}
