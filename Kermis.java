import java.util.ArrayList;
import java.util.Scanner;


class Kermis
{
	public static int omzetTotaal = 0;
	ArrayList<Attractie> attracties;
	ArrayList<Voedselkraam> foodstuffs;
	
	
	public Kermis()
	{
		this.attracties = new ArrayList<Attractie>();
		this.foodstuffs = new ArrayList<Voedselkraam>();
		
		this.attracties.add(new BotsAuto("Botsauto", 250));
		this.attracties.add(new Spin("Spin", 225));
		this.attracties.add(new SpiegelPaleis("Spiegelpaleis", 275));
		this.attracties.add(new SpookHuis("Spookhuis", 320));
		this.attracties.add(new Hawaii("Hawaii", 290));
		this.attracties.add(new LadderKlimmen("Ladderklimmen", 500));
		
		this.foodstuffs.add(new Oliebol("Oliebol",400));
		this.foodstuffs.add(new Friet("Friet",345));
		this.foodstuffs.add(new Muesli("Muesli",900));
		this.foodstuffs.add(new Shoarma("Shoarma",515));
	}
	
	public void run () throws BadInputException
	{
		boolean check = true;
		String tmp;
		int eval = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(check)
		{
			tmp = sc.nextLine();
			if(tmp.length()<1|| tmp.length()>2)
				throw new BadInputException();
			
			if(tmp.length() == 1)
				eval = tmp.charAt(0);
			else
			{
				try
				{
					eval = Integer.parseInt(tmp);
				}
				catch(NumberFormatException e)
				{
					System.err.println("Bad Input: Could not parse String of length 2 to Integer");
				}
			}
			
					
			switch(eval)
			{
				case '1':
					this.attracties.get(0).draaien();
					break;
				case '2':
					this.attracties.get(1).draaien();
					break;
				case '3':
					this.attracties.get(2).draaien();
					break;
				case '4':
					this.attracties.get(3).draaien();
					break;
				case '5':
					this.attracties.get(4).draaien();
					break;
				case '6':
					this.attracties.get(5).draaien();
					break;
				case 11:
					this.foodstuffs.get(0).verkopen();
					break;
				case 22:
					this.foodstuffs.get(1).verkopen();
					break;
				case 33:
					this.foodstuffs.get(2).verkopen();
					break;
				case 44:
					this.foodstuffs.get(3).verkopen();
					break;
				case 'o':
					displayOmzet();
					break;
				case 'k':
					displayKaartjes();
					break;
				case 'q':
					check = false;
					break;
				default:
					throw new BadInputException();
			
			}
			
			System.out.println(Kermis.omzetTotaal);
			System.out.println(Attractie.omzetAttracties);
		
		
		
		}
		
		
		
	}

	
	public void displayKaartjes()
	{
		System.out.println("Aantal verkochte kaartjes:");
		System.out.println("Totaal: " + Attractie.kaartjesTotaal);
		for(Attractie a : this.attracties)
		{
			System.out.println(a.getNaam() + ": " + a.getAantalKaartjes());
		}
		
		System.out.println("\nAantal Consumpties Voedselkraampjes:");
		System.out.println("Totaal: " + Voedselkraam.consumptiesTotaal);
		for(Voedselkraam a : this.foodstuffs)
		{
			System.out.println(a.getNaam() + ": " + a.getAantalConsumpties());
		}
	}


	public void displayOmzet()
	{
		System.out.println("Omzet:");
		System.out.println("Totaal: " + ((double)Kermis.omzetTotaal)/100);
		System.out.println("Totaal Attracties: " + ((double)Attractie.omzetAttracties)/100);
		System.out.println("Totaal Voedselkraampjes: " + ((double)Voedselkraam.omzetKraampjes)/100);
		System.out.println();
		for(Attractie a : this.attracties)
		{
			System.out.println(a.getNaam() + ": " + ((double)a.getOmzet())/100);
		}
		System.out.println();
		for(Voedselkraam a : this.foodstuffs)
		{
			System.out.println(a.getNaam() + ": " + ((double)a.getOmzet())/100);
		}
	}

}

