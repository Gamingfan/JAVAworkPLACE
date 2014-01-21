package controller;

import java.util.Objects;

import model.Shirts;



public class Controller
{

	int[][] myInts = new int [5][3];
	String[][] myStrings = new String[4][4];
	Shirts[][] myShirts = new Shirts[6][4];
	
	
	
	public void start() 
	{
//		 = new Controller();
	}
	
	
	private void fillInts()
	{
		for(int row = 0; row < myInts.length; row++)
		{
			for(int col = 0; col < myInts[0].length; col++)
			{
				myInts[row][col] = row + 4 * 3 + col;
				
			}
		}
	}
	
	private void fillShirts()
	{
		String color = "purple";
		for(int row = 0; row < myShirts.length; row++)
		{
			for(int col = 0; col < myShirts[0].length; col++)
			{
				myShirts[row][col] = new Shirts(color);
			}
		}
	}
	
	private void fillStrings()
	{
		myStrings [0][1] ="red";
		myStrings [0][2] ="blue";
		myStrings [0][3] ="purple";
		myStrings [0][4] ="green";
	}
	
}
