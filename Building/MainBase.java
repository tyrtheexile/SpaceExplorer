package Building;

import java.util.ArrayList;

import Astronaut.Astronaut;
import Items.*;
import Main.Global;

public class MainBase {
	
	private String name;
	private int alloy;
	private int alloyMax;
	private int carbon;
	private int carbonMax;
	private int hydrogen;
	private int hydrogenMax;
	private int energy;
	private int energyMax;
	private ArrayList<Item> freeItems = new ArrayList<Item>();
	private ArrayList<Item> ownedItems = new ArrayList<Item>();
	private Astronaut astro;
	
		
	public MainBase(String name,Astronaut astro) {
		this.astro=astro;
		this.name=name;
		alloy=200;
		carbon=50;
		hydrogen=50;
		energy=1000;
		alloyMax=500;
		carbonMax=500;
		hydrogenMax=500;
		energyMax=5000;
		initItemArray();
	}
	
	public Boolean timePulse() 
	{
		Global.DebugMSG(5, "Time Pulse for: "+getName());
		for (Item item:ownedItems)
		{
			item.cycleModifier();
		}
		
		//Something about Structure Energy Drain
		
		setEnergy(getEnergy()-5);
		
		if (getAlloy()>getAlloyMax()) setAlloy(getAlloyMax());
		if (getCarbon()>getCarbonMax()) setCarbon(getCarbonMax());
		if (getHydrogen()>getHydrogenMax()) setHydrogen(getHydrogenMax());
		if (getEnergy()>getEnergyMax()) setEnergy(getEnergyMax());
		if (getAlloy()<=0) setAlloy(0);
		if (getCarbon()<=0) setCarbon(0);
		if (getHydrogen()<=0) setHydrogen(0);
		if (getEnergy()<=0) setEnergy(0);
		
		return true;
	}
	
	public String getStatusString()
	{
		String str,str1,str2,str3,str4;
		str1 = "\nStatus of: "+getName()+"\n Alloy: "+getAlloy()+"/"+getAlloyMax();
		str2 = "\n Carbon: "+getCarbon()+"/"+getCarbonMax();
		str3 = "\n Hydrogen: "+getHydrogen()+"/"+getHydrogenMax();
		str4 = "\n Energy: "+getEnergy()+"/"+getEnergyMax();
		str=str1+str2+str3+str4;
		return str;
	}
	
	public final void initItemArray()
	{
		addFreeItem(new Rebreather(astro,this));
		addFreeItem(new WaterTank(astro,this));
		addFreeItem(new CookTop(astro,this));
		addFreeItem(new PickAxe(astro,this));
		addFreeItem(new MiningBot(astro,this));
		addFreeItem(new SmallSolarPanel(astro,this));
		//addFreeItem(new MediumSolarPanel(astro,this));
	}
	
	public void moveItem2Owned(Item item)
	{
		if(item instanceof MultiItem)
		{
			if(ownedItems.contains(item)==false) ownedItems.add(item);
			((MultiItem) item).add2NumberOfThisItem(1);
			//freeItems.remove(item);
		} else {
			ownedItems.add(item);
			freeItems.remove(item);
		}
			
	}
	
	public Boolean payCost(int alloyCost, int carbonCost, int hydrogenCost, int energyCost)
	{
		if (alloyCost>getAlloy())
		{
			Global.TextDisp("\nAlloy cost too high");
			return false;
		}
		if (carbonCost>getCarbon())
		{
			Global.TextDisp("\nCarbon cost too high");
			return false;
		}
		if (hydrogenCost>getHydrogen())
		{
			Global.TextDisp("\nHydrogen cost too high");
			return false;
		}
		if (energyCost>getEnergy())
		{
			Global.TextDisp("\nEnergy cost too high");
			return false;
		}
		alloy-=alloyCost;
		carbon-=carbonCost;
		hydrogen-=hydrogenCost;
		energy-=energyCost;
		return true;
	}
	
	public Boolean validateCost(int alloyCost, int carbonCost, int hydrogenCost)
	{
		
		return true;
	}
	
	public String getItemStatusString()
	{
		int num;
		String str="\nItems in Base: ";
		if (ownedItems.isEmpty())
		{
			str = str + " None";
			return str;
		}
		for (Item i:ownedItems)
		{
			if (i instanceof MultiItem)
				num=((MultiItem) i).getNumberOfThisItem();
			else
				num=1;
			str=str+"\n  -"+num+"- "+i.getName()+"";
		}
		return str;
	}
	
	public int findFreeItemByName(String name)
	{
		for (int i=0;i<freeItems.size();i++)
		{
			if (name==freeItems.get(i).getName())
			{
				return i;
			}
		}
		
		Global.DebugMSG(6, "Cannot Find Item in FreeItems");
		return -1;
	}

	public void addFreeItem(Item item)
	{	
		Boolean flag=false;
		for (Item i:freeItems)
		{
			if (i.getName()!=item.getName()){
				continue;
			}else {
				Global.DebugMSG(6, "freeItems already contains" +item.getName());
				flag=true;
			}
		}
		if (flag==false)
		{
			freeItems.add(item);
		}
	}
	
	public void removeFreeItem(int num)
	{
		if (num>0)
		{
		freeItems.remove(num);
		} else {
			Global.DebugMSG(6, "Cannot remove item with index -1");
		}
	}
	
	public void addOwnedItem(Item item)
	{
		ownedItems.add(item);
	}
	
	public ArrayList<Item> getFreeItemArray()
	{
		return freeItems;
	}
	
	public ArrayList<Item> getOwnedItemArray()
	{
		return ownedItems;
	}
	
	public int getAlloy() {
		return alloy;
	}

	public int getCarbon() {
		return carbon;
	}

	public int getHydrogen() {
		return hydrogen;
	}

	public void setAlloy(int alloy) {
		this.alloy = alloy;
	}

	public void setCarbon(int carbon) {
		this.carbon = carbon;
	}

	public void setHydrogen(int hydrogen) {
		this.hydrogen = hydrogen;
	}

	public int getAlloyMax() {
		return alloyMax;
	}

	public int getCarbonMax() {
		return carbonMax;
	}

	public int getHydrogenMax() {
		return hydrogenMax;
	}

	public int getEnergy() {
		return energy;
	}

	public int getEnergyMax() {
		return energyMax;
	}

	public void setAlloyMax(int alloyMax) {
		this.alloyMax = alloyMax;
	}

	public void setCarbonMax(int carbonMax) {
		this.carbonMax = carbonMax;
	}

	public void setHydrogenMax(int hydrogenMax) {
		this.hydrogenMax = hydrogenMax;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	public void setEnergyMax(int energyMax) {
		this.energyMax = energyMax;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
