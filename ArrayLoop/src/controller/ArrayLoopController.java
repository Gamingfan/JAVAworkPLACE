package controller;

import model.Hipster;

import java.util.Arrays;

import view.ArrayLoopView;

public class ArrayLoopController
{
//	consoleView=new ArrayLoopView();	
	private int[][] myPeopleAges;
	private String[][] myPeopleNameList;
	private Hipster[][] myHipster;

	public ArrayLoopController()
	{
		myHipster=new Hipster[2][2];
		myPeopleAges = new int[3][3];
		myPeopleNameList = new String[4][4];
//		consoleView = new ArrayLoopView();
	}
	private void fillHipster()
	{
		myHipster[0][0]=new Hipster();
		myHipster[0][1]=new Hipster();
		myHipster[0][2]=new Hipster();
		
		myHipster[1][0]=new Hipster();
		myHipster[1][2]=new Hipster();
		myHipster[1][3]=new Hipster();
		
		
		
	}

	private void FillAges()
	{
		myPeopleAges[0][0]=56;
		myPeopleAges[0][1]=44;
		myPeopleAges[0][2]=19;
		myPeopleAges[0][3]=27;
		
		myPeopleAges[1][0]=76;
		myPeopleAges[1][1]=42;
		myPeopleAges[1][2]=16;
		myPeopleAges[1][3]=44;
		
		myPeopleAges[2][0]=17;
		myPeopleAges[2][1]=46;
		myPeopleAges[2][2]=66;
		myPeopleAges[2][3]=99;
		
		myPeopleAges[3][0]=77;
		myPeopleAges[3][1]=16;
		myPeopleAges[3][2]=12;
		myPeopleAges[3][3]=9;	

	}
	private void fillPeopleNameList()
	{
		myPeopleNameList[0][0]=("Thor");
		myPeopleNameList[0][1]=("Spiderman");
		myPeopleNameList[0][2]=("Wolverine");
		myPeopleNameList[0][3]=("Hulk");
		myPeopleNameList[0][4]=("ScareCrow");
		
		myPeopleNameList[1][0]=("Nova Prime");
		myPeopleNameList[1][1]=("Ghost Rider");
		myPeopleNameList[1][2]=("zaranthos");
		myPeopleNameList[1][3]=("sabertooth");
		myPeopleNameList[1][4]=("Spawn");
	
		myPeopleNameList[2][0]=("Green latern");
		myPeopleNameList[2][1]=("Green arrow");
		myPeopleNameList[2][2]=("deathstroke");
		myPeopleNameList[2][3]=("nightwing");
		myPeopleNameList[2][4]=("antiVenom");
		
		myPeopleNameList[3][0]=("Goku");
		myPeopleNameList[3][1]=("Asura");
		myPeopleNameList[3][2]=("Carnage");
		myPeopleNameList[3][3]=("deadpool");
		myPeopleNameList[3][4]=("galactis");
		
		myPeopleNameList[4][0]=("silver surfer");
		myPeopleNameList[4][1]=("Johnny blaze");
		myPeopleNameList[4][2]=("Joker");
		myPeopleNameList[4][3]=("Black panther");
		myPeopleNameList[4][4]=("nick fury");
		
		
		
	}

	public void start()
	{
//		ArrayLoopView = new ArrayLoopView();
		FillAges();
//		myArrayLoopView.printStringInfo();
		fillHipster();
//		myArrayLoopView.printHipsterinfo(myHipster);

	}


}
