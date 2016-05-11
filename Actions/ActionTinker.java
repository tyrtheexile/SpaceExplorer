package Actions;

import java.util.ArrayList;

import Astronaut.Astronaut;
import Building.MainBase;
import Items.*;
import Main.Global;

public class ActionTinker extends Action {
	
	MainBase base;
	ArrayList<Item> items;
	
	public ActionTinker(Astronaut astro, MainBase base) {
		super(astro);
		setTime(12);
		setActionName("Tinker");
		this.base=base;
	}

	@Override
	public void doAction() {
		displayMenu();
	}
	
	public void displayMenu() 
	{
		Global.TextDisp("\nYou Can Build:  (Alloy,Carbon,Hydrogen)");
		int counter=1;
		for(Item i:items)
		{
			Global.TextDisp("\n"+(counter++)+". "+i.getName()+" ("+i.getAlloyCost()+","+i.getCarbonCost()+","+i.getHydrogenCost()+")");
		}
	}
}
