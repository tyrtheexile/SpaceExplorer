package Astronaut;

import Items.*;
import Main.Global;

public class Astronaut {
	
	private String name;
	private int air;
	private int water;
	private int food;
	private int hunger;
	private int airMax;
	private int waterMax;
	private int foodMax;
	private int hungerMax;
	private int airRate;
	private int waterRate;
	
	Item[] items = new Item[20];

	public Astronaut(String name) {
		setName(name);
		createAstronaut();
	}
	private void createAstronaut() {
		this.air = 100;
		this.water = 100;
		this.food = 100;
		this.hunger = 1;
		this.airMax=100;
		this.waterMax=100;
		this.foodMax=100;
		this.hungerMax=100;
		this.airRate=3;
		this.waterRate=2;
		
		Global.DebugMSG(5, "\nAstronaut: "+name+" has been created with default stats");
	}
	
	public void timePulse()
	{
		Global.DebugMSG(5, "\nTimePulse for: "+getName());
		addAir(-getAirRate());
		addWater(-getWaterRate());
		addFood(-getHunger());
		if (getAir()>getAirMax()) setAir(100);
		if (getWater()>getWaterMax()) setWater(100);
		if (getFood()>getFoodMax()) setFood(100);
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
	
	
	public String getStatusString()
	{
		String str;
		str = "\nStatus of: "+getName()+"\n Air: "+getAir()+"\n Water: "+getWater()+"\n Food: "+getFood()+"\n Hunger: "+getHunger();
		return str;
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
	public int getAirMax() {
		return airMax;
	}
	public int getWaterMax() {
		return waterMax;
	}
	public int getFoodMax() {
		return foodMax;
	}
	public int getHungerMax() {
		return hungerMax;
	}
	public void setAirMax(int airMax) {
		this.airMax = airMax;
	}
	public void setWaterMax(int waterMax) {
		this.waterMax = waterMax;
	}
	public void setFoodMax(int foodMax) {
		this.foodMax = foodMax;
	}
	public void setHungerMax(int hungerMax) {
		this.hungerMax = hungerMax;
	}
	public int getAirRate() {
		return airRate;
	}
	public int getWaterRate() {
		return waterRate;
	}
	public void setAirRate(int airRate) {
		this.airRate = airRate;
	}
	public void setWaterRate(int waterRate) {
		this.waterRate = waterRate;
	}


}
