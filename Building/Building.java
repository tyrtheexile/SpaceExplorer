package Building;

import Astronaut.Astronaut;

public abstract class Building {
	
	private Astronaut astro;
	private MainBase base;
	Boolean NConnExists;
	Boolean SConnExists;
	Boolean EConnExists;
	Boolean WConnExists;
	Building NConnection;
	Building SConnection;
	Building EConnection;
	Building WConneciton;
	
	public Building(Astronaut astro, MainBase base) {
		this.astro=astro;
		this.base=base;
	}
	
	protected void setConnections(Boolean north,Boolean south, Boolean east, Boolean west)
	{
		this.NConnExists=north;
		this.SConnExists=south;
		this.EConnExists=east;
		this.WConnExists=west;
	}

}
