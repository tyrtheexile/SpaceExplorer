package Actions;

import Astronaut.Astronaut;

public class ActionAddWater extends Action {

	public ActionAddWater(Astronaut astro) {
		super(astro);
		setTime(15);
		setActionName("Drink Water");
	}

	@Override
	public void doAction() {
		astro.addWater(100);

	}

}
