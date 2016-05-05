package Astronaut;


public class Astronaut
{
	private int air=100;
	private int water=100;
	private int hunger=0;
	private int food=100;
	private int debug=0;
	private String name;
	
	public Astronaut(String name)
	{
		this(name,0);
	}	
	public Astronaut(String name,int debug)
	{
		this.debug=debug;
		this.name=name;
	}
	
	//Getters Block, Returns Astronaut Variables
	public String Get_Name() {return this.name;}
	public int Get_Air() {return this.air;}
	////////////////////////////////////////////
	public void Add_Air(int amt) {air=air+amt;}
	
	//Basic Functions
	
	//is_Alive will return 0 if any vital resource is out.
	public int Is_Alive()
	{
		if (air<=0 || water <=0 || food<=0)
		{
			System.out.println("\nAstronaut " +this.name+ " is dead. Game Over");
			return 0;
		} else {
			return 1;
		}
	}
	
	///////////////////////////////////////////

	//Timecheck will be excuted every in-game "tick" decrements every resource an astronaut needs
	public int Timecheck()
	{
		if (this.debug>=5)
		{
			System.out.println( "\nBegin TimeCheck");
			System.out.println( "\nAir: "+this.air+"\nWater :"+this.water+"\nFood: "+this.food+" ");
		}
		this.air=this.air-5;
		this.water=this.water-2;
		this.food=this.food-1-this.hunger;

		if (this.debug>=3)
		{
			System.out.println( "\nAir: "+this.air+"\nWater :"+this.water+"\nFood: "+this.food+" ");
			System.out.println( "\nEnd TimeCheck");	
		}
		
		return 0;
	}
	////////////////////////////////////////////////////////////////////////////////////////

	//Build will Check for the right amount of resources+ then change built bit to 1
	public int Build(int structureNum)
	{
		return 0;
	}
	////////////////////////////////////////////////////////////////////////////////////////

}