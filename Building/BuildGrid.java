package Building;

import Astronaut.Astronaut;
import Main.Global;

public class BuildGrid {
	private Astronaut astro;
	private MainBase base;
	private int size=25;
	private Building[][] buildings;
	
	public BuildGrid(Astronaut astro, MainBase base,int size) {
		this.astro=astro;
		this.base=base;
		this.size=size;
		buildings = new Building[size][size];
		placeBaseHub();
	}
	
	public int constructBuilding(Building newBuilding, Building oldBuilding, String side)
	{
		if(!oldBuilding.isSideEmpty(side)) {return 0;}
		
		
		return 1;
	}
	

	public void cycleBuildings()
	{
		for(Building[] i:buildings)
		{
			for(Building j:i)
			{
				if (j!=null)
					j.cycleModifier();
			}
		}
	}
	
	private void placeBaseHub()
	{
		int mid=size/2;
		buildings[mid][mid]=new BaseHub(astro,base);
		Global.DebugMSG(3, "Base hub Placed at: "+mid+","+mid);
	}
	
	public void drawBaseMap()
	{
		Global.TextDisp("Base Map:");
		Global.TextDisp("-------------------------------");
		char letter='a';
		String str=(letter++)+" ";
		String linestr="  ";
		String toplin="  ";
		for(int i=1;i<=buildings[0].length;i++)
		{
			toplin=toplin+i+"|";
		}
		Global.TextDisp(toplin);
		for(Building[] i:buildings)
		{
			for(Building j:i)
			{
				if (j==null)
					{str=str+"-";}
				else
					{str=str+j.getIndicator();}
				linestr=linestr+"--";
				str=str+"|";
			}
			Global.TextDisp(str);
			Global.TextDisp(linestr);
			str=(letter++)+" ";
			linestr="  ";
		}
	}

}
