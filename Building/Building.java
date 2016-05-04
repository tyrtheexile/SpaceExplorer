package Building;

import java.util.*;

public class Building
{
	private int Size=1;
	private int Visible=0;
	private int CostWood=0;
	private int CostStone=0;
	private int CostIron=0;
	private int debug=0;
	protected String Name="";
	
	public Building(String Name, int Size, int Wood, int Stone, int Iron)
	{
		this(Name,Size,Wood,Stone,Iron,0);
	}
	
	public Building(String Name, int Size, int Wood, int Stone, int Iron, int debug)
	{
		this.Name=Name;
		this.Size=Size;
		this.CostWood=Wood;
		this.CostStone=Stone;
		this.CostIron=Iron;
		this.debug=debug;
	}
	
	public String Get_Name() {return this.Name;}
	public int Get_Size() {return this.Size;}

	public int[] Get_Cost() 
	{
		int[] Cost={CostWood,CostStone,CostIron};
		return Cost;		
	}
}


class Platform extends Building
{
	
	Platform(String Name, int Size, int Wood, int Stone, int Iron)
	{
		super(Name,Size,Wood,Stone,Iron);
	}

	private int ExpansionSlots=3;
	private int FilledSlots=0;
	ArrayList<String> Attached = new ArrayList<String>();
	
	public int Get_Slots() {return (this.ExpansionSlots-this.FilledSlots);}

	//In the future Building will be a class, the name and num slots will be pulled from it.
	public int Fill_Slot(Building Build) 
	{
		if (!(Build instanceof Building)) {System.out.println("\nError Building filling slot Not a Building Class\n"); return 0;}
		Attached.add(Build.Get_Name());
		this.FilledSlots=this.FilledSlots+Build.Get_Size();
		return 0;
	}

	public void Status()
	{
		System.out.println("\nBuildings attached to "+this.Name+":  ");
		for (String s:this.Attached)
		{
			System.out.println(s);
		}
	}
}



class EmptyRoom extends Building
{
	EmptyRoom(String Name, int Size, int Wood, int Stone, int Iron)
	{
		super(Name,Size,Wood,Stone,Iron);
	}
	
	private String AttachedTo="";


}
