package monster;

public class Monster
{
	private String arms;
	private String legs;
	private String body;
	private boolean eyes;
	private String joints;
	
	public void setarms( String arms)
	{ 
		this.arms=arms;		
	}
	public void setlegs ( String legs)
	{
		this.legs=legs;
	}
	public void setbody(String body)
	{
		this.body=body;
	}
	
	public void seteyes (boolean eyes)
	{
	this.eyes=eyes;	
	}
	public void setjoints( String joints)
	{
		this.joints=joints;
	}




    public String getarms()
    {
	return arms;
    }
    public String getlegs()
    {
	return legs;
    }
    public String getbody()
    {
	return body;
    }
    public boolean eyes()
    {
	return eyes;
    }
    public String getjoints()
    {
    	return joints;
    }}




  