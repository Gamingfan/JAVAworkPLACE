package am.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import am.controller.GUIController;


/**
 * Framework for a GuiFrame class.
 * 
 * @author mveg2475
 * @version 1.3 10/22/13
 */
public class GUIFrame extends JFrame

{
	/**
	 * The controller object that will be shared across the application.
	 */
	//private ChatboxPanel 
	
	private GUIController baseController;
	/**
	 * The main panel for the application
	 */
	private GUIPanel basePanel;

	public GUIFrame(GUIController baseController)
	{
		this.baseController = baseController;
		basePanel = new GUIPanel(baseController);

		setupFrame();
	}
	/**
	 * Helper method to setup the default size and panel for the frame.
	 */

	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(400, 200);
		this.setVisible(true);
	}

}
