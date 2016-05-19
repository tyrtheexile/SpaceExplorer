package Building;

import Astronaut.Astronaut;

public class Corridor extends Building {

	public Corridor(Astronaut astro, MainBase base) {
		super(astro, base);
		setName("Corridor");
		setAlloyCost(50);
		setDescription("Connects Buildings in the Station - 1 Energy to Maintain");
		setIndicator('+');
		setConnections(true,true,true,true);
	}

	@Override
	public int cycleModifier() {
		base.setEnergy(base.getEnergy()-1);
		return 0;
	}

}
