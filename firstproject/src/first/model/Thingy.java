package first.model;

public class Thingy
{
	/**
	 * Thingy name
	 */
  //declaration section
	private String name;
	/**
	 * Thingy favorite food
	 */
	private String food;
	/**
	 * Thingy favorite food
	 */
	private String movie;
	/**
	 * Thingy favorite movie
	 */
	public Thingy()
	
	{
		name= "Potato Head";
		food = "hamburgers";
		movie = "lots of plot";
	}
		public void setFood(String food)
	{
		this.food = food;
	}
	
	public void setMovie(String movie)
	{
		this.movie = movie;
	}
	
     public void setName(String name)
  {
	 this.name = name;
	
}
      public String getMovie()
   {
	   return movie;
   }

     public String getName()
    {
	 return name;
    }
     
     public String getFood()
    {
	 return food;
    }



}