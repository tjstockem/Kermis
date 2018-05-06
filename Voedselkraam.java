public abstract class Voedselkraam
{
	private final String naam;
	protected int prijs;
	protected int omzet;
	protected int aantalConsumpties;
	public static int omzetKraampjes = 0, consumptiesTotaal = 0;
	
	public abstract void verkopen();
	
	public Voedselkraam(String naam, int prijs)
	{
		this.naam = naam;
		this.prijs = prijs;
		this.omzet = 0;
		this.aantalConsumpties = 0;
	}
	
	
	public String getNaam()
	{
		return this.naam;
	}
	
	public double getOmzet()
	{
		return this.omzet;
	}
	
	public int getAantalConsumpties()
	{
		return this.aantalConsumpties;
	}
	
	public void setPrijs(int prijs) throws PrijsNegatiefException
	{
		if(prijs <= 0)
			throw new PrijsNegatiefException();
		this.prijs = prijs;
	}

}

class Oliebol extends Voedselkraam
{
	public Oliebol(String naam, int prijs)
	{
		super(naam, prijs);
	}
	
	public void verkopen()
	{
		System.out.println("OLIEBOL");
		Voedselkraam.omzetKraampjes += this.prijs;
		this.omzet += this.prijs;
		Kermis.omzetTotaal += this.prijs;
		++this.aantalConsumpties;
		++Voedselkraam.consumptiesTotaal;
	}
}

class Friet extends Voedselkraam
{
		public Friet(String naam, int prijs)
	{
		super(naam, prijs);
	}
	
	public void verkopen()
	{
		System.out.println("FRIET");
		Voedselkraam.omzetKraampjes += this.prijs;
		this.omzet += this.prijs;
		Kermis.omzetTotaal += this.prijs;
		++this.aantalConsumpties;
		++Voedselkraam.consumptiesTotaal;
	}
}

class Muesli extends Voedselkraam
{
		public Muesli(String naam, int prijs)
	{
		super(naam, prijs);
	}
	
	public void verkopen()
	{
		System.out.println("MUESLI");
		Voedselkraam.omzetKraampjes += this.prijs;
		this.omzet += this.prijs;
		Kermis.omzetTotaal += this.prijs;
		++this.aantalConsumpties;
		++Voedselkraam.consumptiesTotaal;
	}
}

class Shoarma extends Voedselkraam
{
		public Shoarma(String naam, int prijs)
	{
		super(naam, prijs);
	}
	
	public void verkopen()
	{
		System.out.println("SHOARMA");
		Voedselkraam.omzetKraampjes += this.prijs;
		this.omzet += this.prijs;
		Kermis.omzetTotaal += this.prijs;
		++this.aantalConsumpties;
		++Voedselkraam.consumptiesTotaal;
	}
}