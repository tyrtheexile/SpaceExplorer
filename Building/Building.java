package Building;

import Astronaut.Astronaut;

public abstract class Building {
	
	private Astronaut astro;
	private MainBase base;
	private Boolean NConnExists;
	private Boolean SConnExists;
	private Boolean EConnExists;
	private Boolean WConnExists;
	private Building NConnection=null;
	private Building SConnection=null;
	private Building EConnection=null;
	private Building WConnection=null;
	
	public Building(Astronaut astro, MainBase base) {
		this.astro=astro;
		this.base=base;
	}
	
	public Building(Astronaut astro, MainBase base,String dir, Building build) {
		this.astro=astro;
		this.base=base;
		if (dir=="N") {NConnection=build;}
		if (dir=="S") {SConnection=build;}
		if (dir=="E") {EConnection=build;}
		if (dir=="W") {WConnection=build;}
	}
	
	protected void setConnections(Boolean north,Boolean south, Boolean east, Boolean west)
	{
		this.NConnExists=north;
		this.SConnExists=south;
		this.EConnExists=east;
		this.WConnExists=west;
	}
	
	public Boolean isSideEmpty(String dir)
	{
		if (dir=="N" && NConnExists==true && NConnection==null) {return true;}
		if (dir=="S" && SConnExists==true && SConnection==null) {return true;}
		if (dir=="E" && EConnExists==true && EConnection==null) {return true;}
		if (dir=="W" && WConnExists==true && WConnection==null) {return true;}
		return false;
	}
	
	public abstract int cycleModifier();

	public Boolean getNConnExists() {
		return NConnExists;
	}

	public Boolean getSConnExists() {
		return SConnExists;
	}

	public Boolean getEConnExists() {
		return EConnExists;
	}

	public Boolean getWConnExists() {
		return WConnExists;
	}

	public Building getNConnection() {
		return NConnection;
	}

	public Building getSConnection() {
		return SConnection;
	}

	public Building getEConnection() {
		return EConnection;
	}

	public Building getWConnection() {
		return WConnection;
	}

	public void setNConnExists(Boolean nConnExists) {
		NConnExists = nConnExists;
	}

	public void setSConnExists(Boolean sConnExists) {
		SConnExists = sConnExists;
	}

	public void setEConnExists(Boolean eConnExists) {
		EConnExists = eConnExists;
	}

	public void setWConnExists(Boolean wConnExists) {
		WConnExists = wConnExists;
	}

	public void setNConnection(Building nConnection) {
		NConnection = nConnection;
	}

	public void setSConnection(Building sConnection) {
		SConnection = sConnection;
	}

	public void setEConnection(Building eConnection) {
		EConnection = eConnection;
	}

	public void setWConnection(Building wConnection) {
		WConnection = wConnection;
	}

}
