package io.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import io.controller.IOController;
import io.model.Game;

import javax.swing.*;

public class IOPanel extends JPanel
{

	private IOController baseController;
	private JButton saveButton;
	private JTextField titleField;
	private JTextField rankingField;
	private JLabel rulesLabel;
	private JLabel rankingLabel;
	private JLabel titleLabel;
	private SpringLayout baseLayout;
	private JTextArea rulesArea;
	private JTextArea rulesArea_1;
	private JButton loadButton;
	private JLabel gameCountLabel;

	public IOPanel(IOController baseController)
	{
		this.baseController = baseController;
		saveButton = new JButton("save the game stuff");
		titleField = new JTextField(15);
		titleLabel = new JLabel("Game Title:");
		rankingField = new JTextField(5);
		rankingLabel = new JLabel("Game Ranking:");
		rulesArea = new JTextArea(5, 20);
		rulesLabel = new JLabel("game Rules;");
		gameCountLabel = new JLabel("current game count:");
		baseLayout = new SpringLayout();
		baseLayout.putConstraint(SpringLayout.NORTH, rankingLabel, 17, SpringLayout.SOUTH, titleLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, rankingField, -3, SpringLayout.NORTH, rankingLabel);
		baseLayout.putConstraint(SpringLayout.WEST, rankingField, 6, SpringLayout.EAST, rankingLabel);
		baseLayout.putConstraint(SpringLayout.WEST, rulesLabel, 13, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, rankingLabel, 0, SpringLayout.WEST, rulesLabel);
		baseLayout.putConstraint(SpringLayout.WEST, titleField, 27, SpringLayout.EAST, titleLabel);
		baseLayout.putConstraint(SpringLayout.WEST, saveButton, 8, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, titleField, -228, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, titleLabel, 3, SpringLayout.NORTH, titleField);
		baseLayout.putConstraint(SpringLayout.WEST, titleLabel, 10, SpringLayout.WEST, this);
		loadButton = new JButton("Load Game");
		baseLayout.putConstraint(SpringLayout.NORTH, loadButton, 0, SpringLayout.NORTH, saveButton);
		baseLayout.putConstraint(SpringLayout.WEST, loadButton, 75, SpringLayout.EAST, saveButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, loadButton, 0, SpringLayout.SOUTH, saveButton);
		baseLayout.putConstraint(SpringLayout.EAST, loadButton, -124, SpringLayout.EAST, this);
		rulesArea_1 = new JTextArea();
		baseLayout.putConstraint(SpringLayout.NORTH, rulesArea_1, 23, SpringLayout.SOUTH, rankingField);
		baseLayout.putConstraint(SpringLayout.WEST, rulesArea_1, 19, SpringLayout.EAST, rulesLabel);
		baseLayout.putConstraint(SpringLayout.EAST, rulesArea_1, -233, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, saveButton, 43, SpringLayout.SOUTH, rulesArea_1);
		baseLayout.putConstraint(SpringLayout.NORTH, rulesLabel, 5, SpringLayout.NORTH, rulesArea_1);

		setupPanel();
		setupLayout();
		setupListeners1();
	}

	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(new Color(0, 255, 0));
		this.add(rankingField);
		this.add(rankingLabel);
		this.add(rulesLabel);
		this.add(saveButton);
		this.add(titleField);
		this.add(titleLabel);
		this.add(loadButton);
		this.add(rulesArea_1);
	}

	private void setupListeners1()
	{
		saveButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				Game tempGame = baseController.makeGameFromInput(titleField.getText(), rankingField.getText(), rulesArea.getText());
				if (tempGame != null)
				{
					baseController.saveGameInformation(tempGame);
					gameCountLabel.setText("current game count:" + baseController.getProjectGames().size());
				}
				else
				{
					JOptionPane.showMessageDialog(null, "try again with a valid number");

				}
			}

		});

		loadButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				Game tempGame = baseController.readGameInformation();
				if (tempGame != null)
				{
					titleField.setText(tempGame.getGameTitle());
					rankingField.setText(Integer.toString(tempGame.getFunRanking()));
					String temp = "";
					for (String currentRule : tempGame.getGameRules())
					{
						temp += currentRule + "\n";

					}
					rulesArea.setText(temp);
				}
			}
		});
	}

	private void setupLayout()
	{

	}

}
