package recursionController;

public class RecursionController
{
	private int facorial(int currentNumber)
	{
		int factValue = 0;
		if(currentNumber >=0)
		{
			if(currentNumber <= 1)
			{
				return 1;
			}
			else
			{
				return facorial(currentNumber - 1) * currentNumber;
				
			}
			
		}
		return factValue;
	}
	public void start()
	{
		for(int count = 0; count< 80; count++)
		{
			System.out.println(facorial(count));
		}
		System.out.println(facorial(5));
	}

}
