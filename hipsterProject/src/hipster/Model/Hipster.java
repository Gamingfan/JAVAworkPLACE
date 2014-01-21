package hipster.Model;

/**
 * creates the Hipster object.
 * 
 * @author mveg2475
 * 11/20/13 added getter/setters, overloaded constructor for
 *          additional Hipsters
 */

public class Hipster
{
	private String name;
	private String hipsterType;
	private String hipsterPhrase;
	private String amStudent;
	private String[] hipsterBooks;

	public Hipster()
	{
		hipsterBooks = new String[5];
		amStudent = "MEEEE";
		name = "manuel";
		hipsterType = "gamer";
		hipsterPhrase = "eh";

		fillTheBooks();

	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getHipsterType()
	{
		return hipsterType;
	}

	public void setHipsterType(String hipsterType)
	{
		this.hipsterType = hipsterType;
	}

	public String getHipsterPhrase()
	{
		return hipsterPhrase;
	}

	public void setHipsterPhrase(String hipsterPhrase)
	{
		this.hipsterPhrase = hipsterPhrase;
	}

	public String[] getHipsterBooks()
	{
		return hipsterBooks;
	}

	public void setHipsterBooks(String[] hipsterBooks)
	{
		this.hipsterBooks = hipsterBooks;
	}

	private void fillTheBooks()
	{
		hipsterBooks[0] = " World war hulk";
		hipsterBooks[1] = "Superman doomsday";
		hipsterBooks[2] = "V for Vendetta";
		hipsterBooks[3] = "Night";
		hipsterBooks[4] = "Pokemon red manga";
	}

	/**
	 * @param fills
	 *            theBookList
	 */

	public Hipster(String name, String hipsterType, String hipsterPhrase, String[] hipsterBooks)
	{
		this.name = name;
		this.hipsterBooks = hipsterBooks;
		this.hipsterPhrase = hipsterPhrase;
		this.hipsterType = hipsterType;
	}
	/**
	 * fill the Strings that handle personal information of teh hipsters
	 * 
	 * @param name
	 * @param hipsterType
	 * @param hipsterPhrase
	 * @param hipsterBooks
	 */
}
