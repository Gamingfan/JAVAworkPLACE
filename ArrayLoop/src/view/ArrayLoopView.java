package view;

import model.Hipster;

public class ArrayLoopView
//{
//	public void printHipsterInformation(Hipster[][] currentArray)
//	System.out.println("");
//	for(int[] currentRow:currentNumber:currentRow)
//	{
//		System.out.println();
//		
//	}
//	
//	System.out.println("for printing");
//	{
//		for(int row =0; row <currentArray.length; row++)
//		{
//			for(int col=0; col< currentArray[0].length;col++)
//			{
//				System.out.print(row +","col+","+currentArray)(row)(col);
//			}
//		}
//		System.out.println();
//		
//		public void printStringInformation(String[][] currentArray)
//		(System.out.println("");
//		for(int[] currentRow:currentNumber:currentRow)
//		{
//			System.out.println();
//			
//		}
//		
//		System.out.println("for printing");
//		{
//			for(int row =0; row <currentArray.length; row++)
//			{
//				for(int col=0; col< currentArray[0].length;col++)
//				{
//					System.out.print(row+","+col+","+currentArray)(row)(col);
//				}
//			}
//			System.out.println();
//			
//		}
//	}
//	
//}

	public void printIntInformation(Hipster [][] currentArray)
	{
		System.out.println("");
		for(Hipster [] currentRow: currentArray)
		{
			for(Hipster currentNumber : currentRow)
			{
				System.out.println(currentNumber +"\t)");
				
			}
			System.out.println();
			
		}
		System.out.println();}

		public void printHipsterInforMation(Hipster[][]currentArray)
		{
			System.out.println("for printing");
		
			for(int row = 0; row < currentArray.length; row++)
		{
			for(int col = 0; col < currentArray[0].length; col++)
			{
				System.out.print(row+","+ col + ": "+ currentArray[row][col].getHipster()+ "\t");
				
			}
			System.out.println();
				
		}
		

	
	}
}
