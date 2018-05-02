import java.util.ArrayList;


class Kermis
{
	ArrayList<Attractie> attracties;
	//ArrayList<Voedselkraam> foodstuffs;
	private static int omzetTotaal = 0;
	
	
	public Kermis()
	{
		this.attracties = new ArrayList<Attractie>();
		//foodstuffs = new ArrayList<Voedselkraam>();
		
		this.attracties.add(new BotsAuto("Botsauto", 250));
		this.attracties.add(new Spin("Spin", 225));
		this.attracties.add(new SpiegelPalijs("Spiegelpalijs", 275));
		this.attracties.add(new Spookhuis("Spookhuis", 320));
		this.attracties.add(new Hawaii("Hawaii", 290));
		this.attracties.add(new LadderKlimmen("Ladderklimmen", 500));
		
	}
	
	public void run()
	{
		
		attracties.get(0).attractiedraaien();
		
		try
		{
			attracties.get(0).setPrijs(1);
		}
		catch(PrijsNegatiefException pne)
		{
			System.err.println("Prijs mag niet <= 0 zijn");
		}
		
		
	}
	
	
	
	
}