package first.view;

public class Friend
{
	private String name;
	private String humorStyle;
	private int age;
	private String interest;
	private boolean likesPineapple;
	private double weight;
	
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setHumorStyle(String humorStyle)
	{
		this.humorStyle= humorStyle;
	}
	public void setage(int age)
	{
		this.age=age;
	}
	public void setinterest(String interest)
	{
		this.interest=interest;
			}
	public void setlikesPinapple(boolean likesPinapple)
	{ 
		this.likesPineapple= likesPinapple;
	}
	public void setweight (double weight)
	{
		this.weight=weight;
	}
/////////////////////////////////////
	public String getName()
	{
		return name;
	}
	public String getHumorStyle()
	{
		return humorStyle;
			
	}
	public int getAge()
	{
		return age;
	}
	public String getInterest()
	{
		return interest;
	}
	
	public boolean getLikesPinapple()
	{
		return likesPineapple;
	}
	public double getWeight()
	{
		return weight;		
	}
	/**
	 * creates a default amfriend with bad values
	 */
	public Blue()
	{
		name= "nameless";
		humorStyle = "less than none";
		age = -10;
		interest = "absolutely nothing";
		likesPineapple = false;
		weight= 99.9746468764354;
	}
	
	public Red(Stringname, String humorstyle, int age, String interest, boolean likesPineapple, double weight)
	{
		this.name = name;
		this.humorStyle =humorStyle;
		setage(age);
		this.interest;
		this.likesPineapple= likesPineapple;
		this.weight= weight;
	}
}
