package hipster.view;

import java.awt.event.ActionListener;
import java.net.URL;

import hipster.Controller.Controller;
import hipster.Model.Hipster;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

	public class HipsterPanel extends JPanel
	{
		private static final int realValues = 0;


		private Controller baseController;

		
			private JButton addHipsterButton;
			private JButton showRandomButton;
			private JButton showSpecificButton;
			private JButton showSelfButton;
			private JLabel nameLabel;
			private JLabel phraseLabel;
			private JLabel typeLAbel;
			private JLabel booksLabel;
			private JComboBox selectedHipsterComboBox;
			private JTextField nameField;
			private JTextField phraseField;
			private JTextField typeField;
			private JTextField booksArea;	
			private PicturePanel picturePanel;			
			private URL imageURL;
			private SpringLayout baseLayout;
			private String[] baseArray;
			{
				
			
			
			
			picturePanel = new PicturePanel ( imageURL, 200, 200);
					
			baseLayout = new SpringLayout();
		
	}
	
	{
		this.baseController = baseController;
		
		addHipsterButton = new JButton("add a hipster");
		showRandomButton = new JButton("show a random hipster");
		showSpecificButton = new JButton("show the original Hipster");
		nameField = new JTextField(25);
		phraseField = new JTextField(25);
		nameLabel = new JLabel("Hipster Name: ");
		booksLabel = new JLabel("Hipsters Phrase");
		baseLayout = new SpringLayout();
		setupComboBoBox();
		setupPanel();
		setupLayout();
		setupListeners();
		int realValues = 0;
		for (int count = 0; count < baseController.getClassHipsters().length; count++);
	
		 }
	{
			realValues++;
		}
		
		
public HipsterPanel(HipsterFrame baseController2)
	{

	}

private void setupPanel()
{this.
	
	String [] tempNames = new String[realValues];
	
	for (int realsize = 0; realsize < realValues; realsize++)
	{
		
	tempNames[realsize] baseController.getClassHipsters()[realsize].getName();
	
		return tempNames;
	}
	
	private void setupComboBoBox()
{
	// TODO Auto-generated method stub
	
}

	private void setupLayout()
{
	// TODO Auto-generated method stub
	
}

	private void updateHipsterCombo()
	{
		String[] comboValues = getNamesForComboBOx();
		
		selectedHipsterComboBox.setModel(new DefaultComboBoxModel(comboValues));
	}
	private void setupListeners()
	{
		addHipsterButton.addActionListener(new ActionListener()
		{
			public void actionPerformed = (actionClick)
			
			addHipsterButton.addActionListener(new ActionListener()
			if (selectedHipster != null)
			{
				Hipster selectedHipster = baseController.getSpecifiedHipster(0);
				if (selectedHipster != null)
				{
					populateFields(selectedHipster);
				}
				else
					
				{
					blankFields(true);
					
				}
				
			}
		});
					
		showSelfButton.addActionListener(new ActionListener())
		{
			
			addSelfButton.addActionListener(new ActionListener()
			{
				public void actionPerformed = (actionClick)
				
				addSelfButton.addActionListener(new ActionListener()
				if (selectedHipster != null)
				{
					Hipster selectedHipster = baseController.getSpecifiedHipster(0);
					if (selectedHipster != null)
					{
						populateFields(selectedHipster);
					}
					else
						
					{
						blankFields(true);
						
					}
					
				}
		}
		
		showSpecificButton.addActionListener(new ActionLister());
		{
			
			addSpecificButton.addActionListener(new ActionListener()
			{
				public void actionPerformed = (actionClick)
				
				addHipsterButton.addActionListener(new ActionListener();
				
				if (selectedHipster != null)
				{
					Hipster selectedHipster = baseController.getSpecifiedHipster(0);
					if (selectedHipster != null)
					{
						populateFields(selectedHipster);
					}
					else
						
					{
						blankFields(true);
						
					}
					
				}
		}
			
private String [] getNamesForComboBOx()
{
	int realValues = 0;
	for (int count = 0; count < baseController.getClassHipsters().length; count++)
		[
		 if (baseController.getClassHipsters()[count] !=null)
		 {
			 if (baseController.getClassHipsters()[count] !=null)
			 {
				 realValues++;
			 }
		 }
		 ]
				
}
		
		showRandomButton.addActionListener(new ActionLister());
		{
			addRandomButton.addActionListener(new ActionListener()
			{
				public void action = (actionClick)
				
				addRandomButton.addActionListener(new ActionListener());
				{
				if (selectedHipster != null)
				{
					Hipster selectedHipster = baseController.getSpecifiedHipster(0);
					if (selectedHipster != null)
					{
						populateFields(selectedHipster);
					}
					else
						
					{
						blankFields(true);
						
					}
					
				}
		
		showRandomButton.addActionListener(new ActionListener());
		
		
		selectedHipsterComboBox.addItemLister(new ItemLister()
		{
			public void itemStateChanged(itemEvent itemS)
			{ 
				int currentSelection = selectedHipsterComboBox.getSelectedIndex();
				if (currentSelection >= 0)
				{
					hipster selectedHipster = baseController.getSpecifiedHipster(currentSelection);
					if (selectedHipster != null)
					{ 
						populateFields(selectedHipsters);''
					}
					else
					{
						blankFields(true);
					}
				
				}
			
		}
		private void populateFields(Hipster CurrentHipster)
		
		{
			imageURL = getClass().getResource(name);
			
			nameField.setText(CurrentHipster.getName);
			typeField.setText(current.getHipsterType());
			phraseField.setText(CurrentHipster.getHipsterPhrase());
			booksArea.setText("");
			if (poorInput)
			{
				JOptionPane.showMessageDialog(this,"please use valid options");				
			}
			
		}
		private void sendHipsterInfoToController()
		{
			String[] books = booksArea.getText().split(",");
			baseController.addHipster(books, nameField.getText(), typeField.getText(), phraseField.getText());
			JOptionPane.showMessageDialog(this,"Hipster" + nameField.getText()+ "added to the array");
		}	
	
//		private void			
//		setupComboBox();
//		setupPanel();
//		setupLayout();
//		setupListeners();
		private String[] getNamesForComboBox()
		{
			
		}
		
		private void updateHipsterComboBox()
		{
			baseArray[0] = "me";
			baseArray[1] = "Myself";
			baseArray[2] = "I";
			
			selectedHipsterComboBox = new JComboBox(baseArray);
		}
		
{
	this.baseController = baseController;
			
		setupPanel();
		setupLayout();
		setupListeners();
}		

/**
 * Autogenerated layout information for the SpringLayout settings.
 */
private void setupLayout()
{
    baseLayout.putConstraint(SpringLayout.NORTH, showSelfButton, 65, SpringLayout.SOUTH, showRandomButton);
    baseLayout.putConstraint(SpringLayout.WEST, showSpecificButton, 263, SpringLayout.WEST, this);
    baseLayout.putConstraint(SpringLayout.SOUTH, showSpecificButton, -83, SpringLayout.SOUTH, this);
    baseLayout.putConstraint(SpringLayout.WEST, showSelfButton, 0, SpringLayout.WEST, nameLabel);
    baseLayout.putConstraint(SpringLayout.WEST, showRandomButton, 0, SpringLayout.WEST, nameLabel);
    baseLayout.putConstraint(SpringLayout.NORTH, addHipsterButton, 22, SpringLayout.SOUTH, booksArea);
    baseLayout.putConstraint(SpringLayout.WEST, addHipsterButton, 0, SpringLayout.WEST, nameLabel);
    baseLayout.putConstraint(SpringLayout.NORTH, selectedHipsterComboBox, 18, SpringLayout.SOUTH, showRandomButton);
    baseLayout.putConstraint(SpringLayout.WEST, selectedHipsterComboBox, 0, SpringLayout.WEST, addHipsterButton);
    baseLayout.putConstraint(SpringLayout.NORTH, booksLabel, 0, SpringLayout.NORTH, booksArea);
    baseLayout.putConstraint(SpringLayout.WEST, booksLabel, 0, SpringLayout.WEST, nameLabel);
    baseLayout.putConstraint(SpringLayout.NORTH, nameField, 22, SpringLayout.NORTH, this);
    baseLayout.putConstraint(SpringLayout.NORTH, nameLabel, 6, SpringLayout.NORTH, nameField);
    baseLayout.putConstraint(SpringLayout.WEST, nameLabel, 0, SpringLayout.WEST, phraseLabel);
    baseLayout.putConstraint(SpringLayout.NORTH, typeLabel, 6, SpringLayout.NORTH, typeField);
    baseLayout.putConstraint(SpringLayout.WEST, typeLabel, 0, SpringLayout.WEST, phraseLabel);
    baseLayout.putConstraint(SpringLayout.NORTH, phraseLabel, 6, SpringLayout.NORTH, phraseField);
    baseLayout.putConstraint(SpringLayout.WEST, phraseLabel, 10, SpringLayout.WEST, this);
    baseLayout.putConstraint(SpringLayout.NORTH, booksArea, 18, SpringLayout.SOUTH, phraseField);
    baseLayout.putConstraint(SpringLayout.WEST, booksArea, 0, SpringLayout.WEST, nameField);
    baseLayout.putConstraint(SpringLayout.NORTH, phraseField, 17, SpringLayout.SOUTH, typeField);
    baseLayout.putConstraint(SpringLayout.NORTH, typeField, 11, SpringLayout.SOUTH, nameField);
    baseLayout.putConstraint(SpringLayout.WEST, typeField, 0, SpringLayout.WEST, nameField);
    baseLayout.putConstraint(SpringLayout.WEST, phraseField, 0, SpringLayout.WEST, nameField);
    baseLayout.putConstraint(SpringLayout.WEST, nameField, 175, SpringLayout.WEST, this);
    baseLayout.putConstraint(SpringLayout.NORTH, picturePanel, -220, SpringLayout.SOUTH, this);
    baseLayout.putConstraint(SpringLayout.WEST, picturePanel, -200, SpringLayout.EAST, this);
    baseLayout.putConstraint(SpringLayout.SOUTH, picturePanel, -20, SpringLayout.SOUTH, this);
    baseLayout.putConstraint(SpringLayout.EAST, picturePanel, -20, SpringLayout.EAST, this);
    baseLayout.putConstraint(SpringLayout.NORTH, showRandomButton, 18, SpringLayout.SOUTH, addHipsterButton);
}

	 private void setupPanel()
	 {
		this.setLayout(baseLayout);
		this.add(addHipsterButton);
		this.add(showRandomButton);
		this.add(showSpecificButton);
		this.add(showSelfButton);
		this.add(nameLabel);
		this.add(phraseLabel);
		this.add(typeLabel);
		this.add(nameField);
		this.add(typeField);
		this.add(phaseField);
		this.add(booksArea);
		this.add(picturePAnel);
		this.add(selectedHipsterComboBox);
		
		this.setBackground(new Color(130, 100, 50));
		this.setSize(1000, 450);
		booksArea.setWrapStyleWord(true);
		booksArea.setLineWrap(true);}}]
	 
	  
