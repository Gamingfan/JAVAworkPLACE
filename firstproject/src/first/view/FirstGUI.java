package first.view;

import javax.swing.JOptionPane;
import first.model.Thingy;
import first.model.Friend;

public class FirstGUI
{
	private Thingy newGUIthingy;
	
	public FirstGUI()
	{
		newGUIthingy = new Thingy();
		Friend = new Friend();
	}
	
	public void start()
	{
		findOutAboutFriends():
			showAndTell();
			checkWrapper();
//				JOptionPane.showMessageDialog(null,"silly");
//				JOptionPane.showMessageDialog(null,"You can't kill me mortal");
//				JOptionPane.showMessageDialog(null,"You cant destroy me");
//				JOptionPane.showMessageDialog(null,"I the powerful Message box");
//				JOptionPane.showMessageDialog(null,"I feel like im starting to get bored");
//				JOptionPane.showMessageDialog(null,"keep going");
//				JOptionPane.showMessageDialog(null,"well this is fun");
//				JOptionPane.showMessageDialog(null,"i hope you relize i enjoy this");
//				JOptionPane.showMessageDialog(null,"i really dont see why");
//				JOptionPane.showMessageDialog(null,"you keep fighting me");
//				JOptionPane.showMessageDialog(null,"well i know what is going to happen");
//				JOptionPane.showMessageDialog(null,"well want to hear a story");
//				JOptionPane.showMessageDialog(null,"there once was a person");
//				JOptionPane.showMessageDialog(null,"who had a computer");
//				JOptionPane.showMessageDialog(null,"who had it crash");
//				JOptionPane.showMessageDialog(null,"From some amazing pop ups");
//				JOptionPane.showMessageDialog(null,":D");
//				JOptionPane.showMessageDialog(null,"Im bored bye");
//				JOptionPane.showMessageDialog(null,"nope still not gone");
//				JOptionPane.showMessageDialog(null,"ok bye");
//				JOptionPane.showMessageDialog(null,"im kidding");
//				JOptionPane.showMessageDialog(null,"i know you love this");
				interact();
		checkWrapper();
	}
	
	private void interact()
	{
		String answer;
		JOptionPane.showMessageDialog(null,"alright lets chat");
		answer = JOptionPane.showInputDialog("what is your name?");
		//if i do not type a reponse null will be stored in my variable.
		//Cancel is the same as pressing the red X in the corner
		JOptionPane.showMessageDialog(null,"Hi there"+ answer);

	
		String answer1;
		JOptionPane.showMessageDialog(null,"Here is a Thingy" + newGUIthingy.getName());
		answer1 = JOptionPane.showInputDialog("?");
		JOptionPane.showMessageDialog(null,"Hi there"+ answer1);
		
		String answer2;
		JOptionPane.showMessageDialog(null,"What do you want to change my name to?");
		answer2 = JOptionPane.showInputDialog("?");
		JOptionPane.showMessageDialog(null,"Hi there"+ answer2);}
   private void checkWrapper()
   {
	   int age;
	   String answer;
	   JOptionPane.showMessageDialog(null,  "Hi, lets talk");
	   //if you press the red X or cancel on the input dialog you will return a null value
	   answer= JOptionPane.showInputDialog("How old are you")
			   if (answer.equalsIgnoreCase)("yes")
			   {
				   Pineapple= true;
			   }
	   age = Integer.parseInt(answer);
	   //look in the Integar class to read an int from a String parameter
	   JOptionPane.showMessageDialog(null, "So you are"+ age= years old?)next year you will be =( age + 1)+ years old
	  /** int age; 
	   
	   JOptionPane.showMessageDialog(null,"Hi, let's try something new");
	   String temp = JOptionPane.showInputDialog(" how old are you");
	 
	   age= Integer.parseInt(temp);
	   JOptionPane.showMessageDialog(null, "You are "+ age + "years old. next year you will be "+ (age+1)+ " years old");
	   		
	  */ // takes from parameter
   } 
}
 