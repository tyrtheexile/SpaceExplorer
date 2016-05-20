package Actions;

import Astronaut.Astronaut;
import Building.*;

public class ActionBuild extends Action {
	
	MainBase base;
	BuildGrid grid;
	
	public ActionBuild(Astronaut astro,MainBase base) {
		super(astro);
		this.base=base;
		setTime(15);
		setActionName("Build...");
		grid=base.getGrid();
	}

	@Override
	public void doAction() {
		grid.drawBaseMap();
		
		grid.constructBuilding(new Corridor(astro,base), base.getGrid().getBuilding(6,6), "N");

	}

}
