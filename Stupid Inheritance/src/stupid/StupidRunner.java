package stupid;

public class StupidRunner
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Dumb lloyd = new Dumb();
		Dumb harry = new Dumber();
		Dumbest george = new Dumbest();
		
		System.out.println("Lets test inheritance!");
		
		System.out.println("lloyd is dumb and his blerd is: " + lloyd.getBlerg());
		System.out.println(" harry is dumber and his blerg is: " + harry.getBlerg());
		System.out.println("Lets test inheritance!");
		harry.setBlerg(45);
		System.out.println("harry is dumber and his blerg is; " + harry.getBlerg());
		System.out.println("lloyd is dumb and his blerg is: " + lloyd.getBlerg());
		System.out.println("harry's car" + harry.getMyCar());
		System.out.println("george's car;"+ george.getMyCar());
		
	
	}

}
