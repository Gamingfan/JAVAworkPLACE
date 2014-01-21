package three.view;

import javax.swing.JOptionPane;

/**
 * 
 * @author mveg2475
 * 
 */

public class StringView
/**
 * Shows the runtime error when a non-integer is entered into JOptionpane input
 * field.
 */
{
//	public void displayError()
//	{
//		int test;
//		String temp;
//
//		JOptionPane.showMessageDialog(null, "Lets watch are program crash");
//		temp = JOptionPane.showInputDialog("type your favorite number");
//		test = Integer.parseInt(temp);
//		JOptionPane.showMessageDialog(null, "your favorite number is" + test);
//	}
//
//	public String getResponse()
//	{
//		/**
//		 * must have value assigned to a variable in a method or it cannot be
//		 * used and will cause an error.
//		 */
//		String response = null;
//		JOptionPane.showMessageDialog(null, "say something fun");
//		response = JOptionPane.showInputDialog("say something nao!!");
//		return response;
//	}

	public void showPassedVAlue(String currentValue)
	{
		JOptionPane.showMessageDialog(null, currentValue + "is that funny?");
	}

	public void moretInteractive(String first, String second)
	{
		JOptionPane.showMessageDialog(null, "hey" + first + "\n" + "Says:"
				+ "\n" + second);

	}

	// private void testString
	// {

	// }
//	private void testSubString(int StartPosition)
//	{
//		String testString = ("supercallifralis");
//		JOptionPane.showMessageDialog(null, "The substring method test'");
//		JOptionPane.showMessageDialog(null,
//				"we are going to from the 7th letter in the test string");
//		JOptionPane.showMessageDialog(null, "The test string is: " + first
//				+ second + "\n" + " + testString");
//		JOptionPane.showMessageDialog(
//				null,
//				"The testString.substring(7) call us:" + "\n"
//						+ testString.substring(7));
//		 JOptionPane.showMessageDialog("null, ")
//
//	}
	private String SubString (int StartPosition)
	{String testString = (" holy awesomeness");
	String testString = ("Holy Awesomeness");
	JOptionPane.showMessageDialog(null, " this is how crap works";) "+\n + "and this is fun" );"
	
		
	return null;	
	}

	/**private void testConcat(String addedString)
	{
		String testString = ("holy AWeSOMENESS");
		JOptionPane.showMessageDialog(null, " This is how crap works" "+\n + " and this is fun ");"	
			
	
	}
	*/

}