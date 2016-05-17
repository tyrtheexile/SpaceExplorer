package Items;

import Astronaut.Astronaut;
import Building.MainBase;
import Main.Global;

public class MediumSolarPanel extends MultiItem {

	public MediumSolarPanel(Astronaut astro, MainBase base) {
		super(astro, base);
		setName("Medium Solar Panel");
		setDescription("Gathers 3 Energy a Turn");
		setAlloyCost(50);
	}

	@Override
	public int cycleModifierOnce() {
		Global.TextDisp("Solar Panel Gathers 1 Energy");
		base.setEnergy(base.getEnergy()+1);
		return 0;
	}

	@Override
	public int cycleMulti() {
		Global.TextDisp(numberOfThisItem+" Medium Solar Panels gather "+numberOfThisItem*3+" Energy");
		base.setEnergy(base.getEnergy()+numberOfThisItem*3);
		return 0;
	}

}
