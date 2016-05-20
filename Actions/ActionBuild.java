package Actions;

import Astronaut.Astronaut;
import Building.*;
import Main.Global;

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
		
		if (!base.isOwned("Fabricator"))
		{
			Global.TextDisp("You don't have a Fabricator!\nHow did you get here?");
		}
		
		grid.drawBaseMap();
		
		Boolean success=false;
		do{
			success=grid.constructBuilding(new Corridor(astro,base), base.getGrid().getBuilding(6,6), "N");
		} while (success==false);
		grid.drawBaseMap();
		
		
	}

}
