package Items;

import Astronaut.Astronaut;
import Building.MainBase;
import Main.Global;

public class CookTop extends Item {

	public CookTop(Astronaut astro, MainBase base) {
		super(astro, base);
		setAlloyCost(50);
		setCarbonCost(20);
		setHydrogenCost(10);
		setName("CookTop");
	}

	@Override
	public int cycleModifier() {
		Global.DebugMSG(5, "Cooktop takes 1 energy to make 2 Food");
		base.setEnergy(base.getEnergy()-1);
		astro.setFood(astro.getFood()+2);
		return 0;
	}

	@Override
	public int aquisitionModifier() {
		// TODO Auto-generated method stub
		return 0;
	}

}
