package Building;

import java.util.ArrayList;

import Items.Item;
import Main.Global;

public class MainBase {
	
	private int alloy;
	private int carbon;
	private int hydrogen;
	private ArrayList<Item> items;
	
		
	public MainBase() {
		alloy=100;
		carbon=50;
		hydrogen=50;
	}
	
	public int payCost(int alloyCost, int carbonCost, int hydrogenCost)
	{
		alloy-=alloyCost;
		carbon-=carbonCost;
		hydrogen-=hydrogenCost;
		return 0;
	}
	
	public Boolean validateCost(int alloyCost, int carbonCost, int hydrogenCost)
	{
		if (alloyCost>getAlloy())
		{
			Global.DebugMSG(3, "\nAlloy cost too high");
			return false;
		}
		if (carbonCost>getCarbon())
		{
			Global.DebugMSG(3, "\nCarbon cost too high");
			return false;
		}
		if (hydrogenCost>getHydrogen())
		{
			Global.DebugMSG(3, "\nHydrogen cost too high");
			return false;
		}
		return true;
	}

	public void addItem(Item item)
	{
		items.add(item);
	}
	
	public ArrayList<Item> getItemArray()
	{
		return items;
	}
	
	public int getAlloy() {
		return alloy;
	}

	public int getCarbon() {
		return carbon;
	}

	public int getHydrogen() {
		return hydrogen;
	}

	public void setAlloy(int alloy) {
		this.alloy = alloy;
	}

	public void setCarbon(int carbon) {
		this.carbon = carbon;
	}

	public void setHydrogen(int hydrogen) {
		this.hydrogen = hydrogen;
	}

}
