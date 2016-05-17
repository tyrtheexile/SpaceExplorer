package Items;

import java.util.ArrayList;
import Astronaut.Astronaut;
import Building.MainBase;

public class InitItemArray {
	
	public InitItemArray() {
		
	}
	
	public static ArrayList<Item> StarterList(Astronaut astro,MainBase base)
	{
		ArrayList<Item> freeItems=new ArrayList<Item>();
		freeItems.add(new Rebreather(astro,base));
		freeItems.add(new WaterTank(astro,base));
		freeItems.add(new CookTop(astro,base));
		freeItems.add(new PickAxe(astro,base));
		freeItems.add(new MiningBot(astro,base));
		freeItems.add(new SmallSolarPanel(astro,base));
		//freeItems.add(new MediumSolarPanel(astro,this));
		return freeItems;
		
	}

}
