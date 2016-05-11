package Items;

import Astronaut.Astronaut;
import Building.MainBase;

public abstract class Item {
	
	private static String name;
	private int ID;
	private int alloyCost=0;
	private int carbonCost=0;
	private int hydrogenCost=0;
	protected Astronaut astro;
	private MainBase base;
	protected Boolean owned=false;
	
	public Item(Astronaut astro, MainBase base)
	{
		this.astro=astro;
		this.base=base;
	}
	
	public abstract int cycleModifier();
	public abstract int aquisitionModifier();
	public int buyItem()
	{	
		if (base.validateCost(alloyCost, carbonCost, hydrogenCost))
		{
			base.payCost(alloyCost,carbonCost,hydrogenCost);
			aquisitionModifier();
			return 1;
		}
		return 0;
	}
	
	public static String getName() {
		return name;
	}
	public int getID() {
		return ID;
	}
	public int getAlloyCost() {
		return alloyCost;
	}
	public static void setName(String namee) {
		name = namee;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public void setAlloyCost(int cost) {
		this.alloyCost = cost;
	}

	public int getCarbonCost() {
		return carbonCost;
	}

	public int getHydrogenCost() {
		return hydrogenCost;
	}

	public Boolean getOwned() {
		return owned;
	}

	public void setCarbonCost(int carbonCost) {
		this.carbonCost = carbonCost;
	}

	public void setHydrogenCost(int hydrogenCost) {
		this.hydrogenCost = hydrogenCost;
	}

	public void setOwned(Boolean owned) {
		this.owned = owned;
	}
	
}
