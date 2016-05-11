package Items;

import Astronaut.Astronaut;
import Building.MainBase;

public abstract class Item {
	
	private String name;
	private int ID;
	private int alloyCost=0;
	private int carbonCost=0;
	private int hydrogenCost=0;
	protected Astronaut astro;
	protected MainBase base;
	protected Boolean owned=false;
	
	public Item(Astronaut astro, MainBase base)
	{
		this.astro=astro;
		this.base=base;
	}
	
	public abstract int cycleModifier();
	public abstract int aquisitionModifier();
	
	public String getName() {
		return name;
	}
	public int getID() {
		return ID;
	}
	public int getAlloyCost() {
		return alloyCost;
	}
	public void setName(String namee) {
		this.name = namee;
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
