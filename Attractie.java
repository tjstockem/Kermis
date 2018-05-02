public abstract class Attractie
{
	private final String naam;
	private int prijs, omzet;
	private static int omzetAttracties = 0;
	
	public abstract void draaien();
	
	public Attractie(String naam, int prijs)
	{
		this.naam = naam;
		this.prijs = prijs;
		this.omzet = 0;
	}
	
	public String getNaam()
	{
		return this.naam;
	}
	
	public int getOmzet()
	{
		return this.omzet;
	}
		
	public void setPrijs(int prijs) throws PrijsNegatiefException
	{
		if(prijs <= 0)
			throw new PrijsNegatiefException();
		this.prijs = prijs;
	}
	
	
}


class BotsAuto extends Attractie
{
	
	public BotsAuto(String naam, int prijs)
	{
		super(naam, prijs);
	}
	
	public void draaien()
	{
		System.out.println("BOTSBOTSBOTS");
	}
}

class Spin extends Attractie
{
	public Spin(String naam, int prijs)
	{
		super(naam, prijs);
	}
	
	public void draaien()
	{
		System.out.println("SPINSPINSPIN");
	}	
}

class SpiegelPaleis extends Attractie
{
	public SpiegelPaleis(String naam, int prijs)
	{
		super(naam, prijs);
	}
	
	public void draaien()
	{
		System.out.println("REFLECT");
	}	
}

class SpookHuis extends Attractie
{
	public SpookHuis(String naam, int prijs)
	{
		super(naam, prijs);
	}
	
	public void draaien()
	{
		System.out.println("SPOOPY");
	}	
}

class Hawaii extends Attractie
{
	public Hawaii(String naam, int prijs)
	{
		super(naam, prijs);
	}
	
	public void draaien()
	{
		System.out.println("SPINSPINSPIN");
	}	
}

class LadderKlimmen extends Attractie
{
	public LadderKlimmen(String naam, int prijs)
	{
		super(naam, prijs);
	}
	
	public void draaien()
	{
		System.out.println("SPINSPINSPIN");
	}	
}

class PrijsNegatiefException extends Exception
{
	
}
