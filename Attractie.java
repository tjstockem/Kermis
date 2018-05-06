public abstract class Attractie
{
	private final String naam;
	protected int prijs;
	protected int omzet;
	protected int aantalKaartjes;
	public static int omzetAttracties = 0, kaartjesTotaal = 0;
	
	public abstract void draaien();
	
	public Attractie(String naam, int prijs)
	{
		this.naam = naam;
		this.prijs = prijs;
		this.omzet = 0;
		this.aantalKaartjes = 0;
	}
	
	public String getNaam()
	{
		return this.naam;
	}
	
	public double getOmzet()
	{
		return this.omzet;
	}
	
	public int getAantalKaartjes()
	{
		return this.aantalKaartjes;
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
		System.out.println("BOTSAUTO");
		Attractie.omzetAttracties += this.prijs;
		this.omzet += this.prijs;
		Kermis.omzetTotaal += this.prijs;
		++this.aantalKaartjes;
		++Attractie.kaartjesTotaal;
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
		System.out.println("SPIN");
		Attractie.omzetAttracties += this.prijs;
		this.omzet += this.prijs;
		Kermis.omzetTotaal += this.prijs;
		++this.aantalKaartjes;
		++Attractie.kaartjesTotaal;
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
		System.out.println("SPIEGEL");
		Attractie.omzetAttracties += this.prijs;
		this.omzet += this.prijs;
		Kermis.omzetTotaal += this.prijs;
		++this.aantalKaartjes;
		++Attractie.kaartjesTotaal;
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
		System.out.println("SPOOKY");
		Attractie.omzetAttracties += this.prijs;
		this.omzet += this.prijs;
		Kermis.omzetTotaal += this.prijs;
		++this.aantalKaartjes;
		++Attractie.kaartjesTotaal;
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
		System.out.println("HAWAII");
		Attractie.omzetAttracties += this.prijs;
		this.omzet += this.prijs;
		Kermis.omzetTotaal += this.prijs;
		++this.aantalKaartjes;
		++Attractie.kaartjesTotaal;
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
		System.out.println("LADDER");
		Attractie.omzetAttracties += this.prijs;
		this.omzet += this.prijs;
		Kermis.omzetTotaal += this.prijs;
		++this.aantalKaartjes;
		++Attractie.kaartjesTotaal;
	}	
}
