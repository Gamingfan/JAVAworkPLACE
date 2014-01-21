package io.controller;

import io.model.Game;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import io.model.Game;
import io.view.IOFrame;

public class IOController
{
	private IOFrame appFrame;

	private ArrayList<Game> projectGames;

	public ArrayList<Game> getProjectGames()
	{
		return projectGames;
	}

	public void setProjectGames(ArrayList<Game> projectGames)
	{
		this.projectGames = projectGames;
	}

	public IOController()
	{
		projectGames = new ArrayList<Game>();
	}

	public void start()

	{
		appFrame = new IOFrame(this);

	}

	public Game readGameInformation()
	{
		String fileName = "saveFile.txt";
		File currentSaveFile = new File(fileName);
		Scanner fileReader;
		Game currentGame = null;
		int gameRanking;
		String gameTitle;
		ArrayList<String> gameRules = new ArrayList<String>();

		try

		{
			fileReader = new Scanner(currentSaveFile);
			gameTitle = fileReader.nextLine();
			gameRanking = fileReader.nextInt();

			while (fileReader.hasNext())
			{
				gameRules.add(fileReader.nextLine());
			}

			currentGame = new Game(gameRules, gameRanking, gameTitle);
			fileReader.close();
		}
		/**
		 * Major Scanner Methods!!! .next() - the next String separated by
		 * whitespace so if the file has "twas brillia and the slithey..."
		 * .next() would return twas .nextline() returns an entire line of text
		 * .nextInt() - returns the next integer value .nextBoolean() - returns
		 * the next boolean vzaLue .nextDouble() - the next double value
		 * 
		 */
		catch (FileNotFoundException currentFileDoesnotExist)
		{
			JOptionPane.showMessageDialog(appFrame, currentFileDoesnotExist.getMessage());
		}
		return currentGame;

		
	}

	public String readAllGameInformation()
	{
		String fileContents = "";
		projectGames = new ArrayList<Game>();
		String fileName = "saveFile.txt";
		File currentSaveFile = new File(fileName);
		Scanner fileReader;

		try
		{
			fileReader = new Scanner(currentSaveFile);
			while (fileReader.hasNext())
			{
				fileContents += fileReader.nextLine();
			}
			fileReader.close();
		}

		catch (FileNotFoundException fileDoesNotExist)

		{
			JOptionPane.showMessageDialog(appFrame, fileDoesNotExist.getMessage());
		}

		return fileContents;
	}

	private void convertTextToGames(String currentInfo)
	{
		projectGames = new ArrayList<Game>();
		String[] gameChunks = currentInfo.split(",");
		for (String currentBlock : gameChunks)
		{
			int currentIndex = currentBlock.indexOf("\n");
			String title = currentBlock.substring(0, currentIndex);
			int nextIndex = currentBlock.indexOf("\n", currentIndex);
			String ranking = currentBlock.substring(currentIndex + 1, nextIndex);
			String rules = currentBlock.substring(nextIndex + 1);
			Game currentGame = makeGameFromInput(title, ranking, rules);
			projectGames.add(currentGame);
		}
	}

	public Game pickRandomGameFromSaveFile()
	{
		Game currentGame = null;

		String allinfo = readAllGameInformation();
		convertTextToGames(allinfo);
		int randomIndex = (int) (Math.random() * (double) projectGames.size());
		currentGame = projectGames.get(randomIndex);
		return currentGame;
	}

	public Game makeGameFromInput(String gameTitle, String gameRanking, String gameRules)
	{
		Game currentGame = new Game();
		currentGame.setGameTitle(gameTitle);

		if (checkNumberFormat(gameRanking))
		{
			currentGame.setFunRanking(Integer.parseInt(gameRanking));
		}
		else
		{
			return null;

		}
		
		String[] temp = gameRules.split("\n");
		ArrayList<String> tempRules = new ArrayList<String>();

		for (String tempWord : temp)
		{
			tempRules.add(tempWord);

			currentGame.setGameRules(tempRules);
		}
		return currentGame;
	}

	private boolean checkNumberFormat(String toBeParsed)
	{
		boolean isNumber = false;

		try

		{
			int valid = Integer.parseInt(toBeParsed);
			isNumber = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(appFrame, "please use a real number for the ranking.");
		}
		return isNumber;
	}

	public void saveGameInformation(Game currentGame)
	{
		PrintWriter gameWriter;
		String saveFile = "saveFile.txt";

		try

		{
			gameWriter = new PrintWriter(saveFile);

			gameWriter.println(currentGame.getGameTitle());
			gameWriter.println(currentGame.getFunRanking());
			for (int count = 0; count < currentGame.getGameRules().size(); count++)
			{
				gameWriter.println(",");
			}
			gameWriter.println(";");
			gameWriter.close();
		}
		catch (FileNotFoundException noFileExists)
		{
			JOptionPane.showMessageDialog(appFrame, "Could not make the save file");
			JOptionPane.showMessageDialog(appFrame, noFileExists.getMessage());
		}
	}

}
