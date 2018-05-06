public class Main
{
	public static void main(String[] args)
	{
		Kermis k = new Kermis();
		try 
		{
			k.run();
		}
		catch (BadInputException e) 
		{
			System.out.println("Bad Input");
		}
	}

}
