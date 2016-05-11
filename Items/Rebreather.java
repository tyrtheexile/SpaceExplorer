package Items;

import Astronaut.Astronaut;
import Building.MainBase;

public class Rebreather extends Item {

	public Rebreather(Astronaut astro, MainBase base)
	{
		super(astro,base);
		setAlloyCost(20);
		setName("Rebreather");
		
	}

	@Override
	public int cycleModifier() {
		//None
		return 0;
	}

	@Override
	public int aquisitionModifier() {
		astro.setAirRate(astro.getAir()-2);
		return 0;
	}

}
