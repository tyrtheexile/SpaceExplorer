package Building;

import Astronaut.Astronaut;
import Main.Global;

public class BaseHub extends Building {

	public BaseHub(Astronaut astro, MainBase base) {
		super(astro, base);
		setConnections(true,true,true,true);
		setIndicator('H');
	}

	@Override
	public int cycleModifier() {
		Global.DebugMSG(6, "BaseHub Cycle Modifier Connections- N:"+getNConnection()+" S:"+getSConnection()+" E:"+getEConnection()+" W:"+getWConnection());
		base.getGrid().drawBaseMap();
		return 0;
	}

}
