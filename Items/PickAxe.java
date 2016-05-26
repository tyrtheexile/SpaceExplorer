package Items;

import Astronaut.Astronaut;
import Building.MainBase;
import Main.Global;

public class PickAxe extends Item {

	public PickAxe(Astronaut astro, MainBase base) {
		super(astro, base);
		setName("Pickaxe");
		setAlloyCost(10);
		setCarbonCost(20);
	}

	@Override
	public int cycleModifier() {
		if (astro.payCost(0, 0, 2))
		{
			base.setAlloy(base.getAlloy()+5);
			Global.TextDisp("Pickaxe Mining is Hard Work - Lose 2 Food - Gain 5 Alloy");
		}
		else
			Global.TextDisp("Can't Afford to Pickaxe this Turn");
		return 0;
	}

	@Override
	public int aquisitionModifier() {
		Global.DebugMSG(5, "\nPickAxe Bought");
		//Testing only
		base.dualRequirement("LifeSupport", new WaterTank(astro,base));
		return 0;
	}

}
