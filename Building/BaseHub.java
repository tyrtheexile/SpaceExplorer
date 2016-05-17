package Building;

import Astronaut.Astronaut;

public class BaseHub extends Building {

	public BaseHub(Astronaut astro, MainBase base) {
		super(astro, base);
		setConnections(true,true,true,true);
	}

}
