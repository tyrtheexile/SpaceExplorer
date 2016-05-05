package Astronaut;

import Main.Global;

public class Astronaut {
	
	private String name;
	private int air;
	private int water;
	private int food;
	private int hunger;

	public Astronaut(String name) {
		setName(name);
		createAstronaut();
	}
	private void createAstronaut() {
		this.air = 100;
		this.water = 100;
		this.food = 100;
		this.hunger = 100;
		Global.DebugMSG(5, "\nAstronaut: "+name+" has been created with default stats");
	}
	
	public Boolean isAlive()
	{
		if (air<=0 || water <=0 || food<=0)
		{
			System.out.println("\nAstronaut " +this.name+ " is dead. Game Over");
			return false;
		} else {
			return true;
		}
	}
	


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAir(){
		return air;
	}

	public int getWater() {
		return water;
	}

	public void setWater(int water) {
		this.water = water;
	}

	public int getFood() {
		return food;
	}

	public void setFood(int food) {
		this.food = food;
	}

	public int getHunger() {
		return hunger;
	}

	public void setHunger(int hunger) {
		this.hunger = hunger;
	}

	public void setAir(int air) {
		this.air = air;
	}
	public void addAir(int air) {
		this.air+=air;
	}
	public void addWater(int water) {
		this.water+=water;
	}
	public void addFood(int food){
		this.food+=food;
	}
	public void addHunger(int hunger){
		this.hunger+=hunger;
	}


}
