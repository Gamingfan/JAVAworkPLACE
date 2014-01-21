package am.view;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import am.controller.GUIController;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * 
 * @author mveg2475
 *@version 1.2
 */
public class GUIPanel extends JPanel
{

	private GUIController baseController;
	private SpringLayout baseLayout;
	private JButton firstButton;
	private JButton secondButton;

	public GUIPanel(GUIController baseController)
	{
		this.baseController = baseController;
        
		baseLayout = new SpringLayout();
		firstButton = new JButton("my first button!!!");
		secondButton = new JButton("wow i made a second button!");
		
		secondButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		setupPanel();
		setupLayout();
	}

	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(firstButton);
		this.add(secondButton);

	}

	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, firstButton, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstButton, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, secondButton, 0, SpringLayout.WEST, firstButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, secondButton, -10, SpringLayout.SOUTH, this);
	}
}
