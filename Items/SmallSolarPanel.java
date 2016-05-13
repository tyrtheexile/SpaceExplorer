package Items;

import Astronaut.Astronaut;
import Building.MainBase;
import Main.Global;

public class SmallSolarPanel extends MultiItem {

	public SmallSolarPanel(Astronaut astro, MainBase base) {
		super(astro, base);
		setName("Small Solar Panel");
		setDescription("Gathers 1 Energy a Turn");
		setAlloyCost(15);
	}

	@Override
	public int cycleModifierOnce() {
		Global.TextDisp("Solar Panel Gathers 1 Energy");
		base.setEnergy(base.getEnergy()+1);
		return 0;
	}

}
