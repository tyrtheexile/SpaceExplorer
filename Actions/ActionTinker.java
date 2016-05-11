package Actions;

import java.util.ArrayList;

import Astronaut.Astronaut;
import Astronaut.Choice;
import Building.MainBase;
import Items.*;
import Main.Global;

public class ActionTinker extends Action {
	
	MainBase base;
	ArrayList<Item> freeItems;
	ArrayList<Item> ownedItems;
	
	public ActionTinker(Astronaut astro, MainBase base) {
		super(astro);
		setTime(12);
		setActionName("Tinker");
		this.base=base;
		freeItems=base.getFreeItemArray();
		ownedItems=base.getOwnedItemArray();
	}

	@Override
	public void doAction() {
		Boolean buy=false;
		do
		{
			displayMenu();
			int choice = Choice.getInput();
			if (choice==0) {
				setTime(1);
				break;
			}
			//Error Check if More than 6 Items
			if (choice>6||choice<0)
			{
				Global.TextDisp("\n--------------\nBad Input Number - Try Again\n--------------");
				Global.DebugMSG(3, "\nNumber Free Items: "+freeItems.size()+" - Number entered: "+choice);
				continue;
			}
			//Buys the Item, if It can't be afforded repeats the loop
			if (buyItem(freeItems.get((choice-1)))==true)
				buy = true;
			else
				Global.TextDisp("\nCannot Affor that Item");			
		} while (buy==false);
	}
	
	public void displayMenu() 
	{
		Global.TextDisp("\nYou Can Build:  (Alloy,Carbon,Hydrogen)");
		Global.TextDisp("0. Cancel");
		int counter=1;
		for(Item i:freeItems)
		{
			Global.TextDisp((counter++)+". "+i.getName()+" ("+i.getAlloyCost()+","+i.getCarbonCost()+","+i.getHydrogenCost()+")");
			if (counter>6) break;
		}
	}
	
	public Boolean buyItem(Item item)
	{	
		if (base.payCost(item.getAlloyCost(), item.getCarbonCost(), item.getHydrogenCost(), item.getEnergyCost()))
		{
			item.aquisitionModifier();
			item.setOwned(true);
			base.moveItem2Owned(item);
			return true;
		}
		return false;
	}
}
