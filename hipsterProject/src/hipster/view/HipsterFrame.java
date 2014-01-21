package hipster.view;

import javax.swing.JFrame;
import hipster.Controller.Controller;
import hipster.view.HipsterPanel;

/**
 * @author mveg2475
 * 
 */
public class HipsterFrame extends JFrame
{
	private HipsterFrame baseController;
	private HipsterPanel basePanel;

	public HipsterFrame(Controller controller)
	{
		this.baseController = baseController;
		basePanel = new HipsterPanel (baseController);

		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(450, 450);
		this.setVisible(true);
	}
	/**
	 * @param set's up Frame & holds everythingy
	 */

}
