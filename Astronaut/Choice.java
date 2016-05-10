package Astronaut;

import java.util.Scanner;
import Actions.*;
import Main.Global;

public class Choice {
	
	private Astronaut astro;
	public static Scanner inputStream = new Scanner(System.in);
	
	Action act1=null;
	Action act2=null;
	Action selectedAct;
	
	public Choice(Astronaut astro) {
		this.astro=astro;
	}
	
	//Asks for and returns a int
	public static int getInput()
	{
		System.out.println("\nWhat is your choice?: ");
		int choicenum=inputStream.nextInt();

		return choicenum;
	}
		
	public int giveChoice()
	{
		int wait=10;
		Boolean temp=true;
		act1=null;
		act2=null;
		
		//Display Choices
		choiceLogic();
		//Global.DebugMSG(6, "\nAction 1: "+act1.getActionName()+"\nAction 2: "+act2.getActionName());
		
		System.out.println("\nYou may either:");
		System.out.println("1. "+act1.getActionName()+" ("+act1.getTime()+")");
		System.out.println("2. "+act2.getActionName()+" ("+act2.getTime()+")");
		
		//Get Input
		while (temp==true)
		{
			int input=getInput();
			if (input==1){
				selectedAct=act1;
				temp=false;
			}
			else if (input==2){
				selectedAct=act2;
				temp=false;
			}
			else {
				System.out.println("\nInvalid Selection");
			}
		}
		
		//Send back input time
		wait=selectedAct.getTime();
		
		selectedAct.doAction();
		
		return wait;
	}
	
	//Checks if act1 or act should be set with the given action
	private void setActions(Action act)
	{
		//Takes a new Action
		if (act1!=null) 			//If Action1 is full
		{
			if(act2!=null)			//If Action2 is Also Full
				Global.DebugMSG(5, "\nToo many Actions- Failed to add: "+act.getActionName());
			else					//Otherwise
				act2=act;   		//Give Act to Action2
		}
		else 						//
			act1=act;
	}
	
	private void choiceLogic()
	{
		//Low Air, Air Action
		Global.DebugMSG(5, "\nAir Threshold: "+((int)(.2*astro.getAirMax()))+"");
		if (astro.getAir()<((int)(.4*astro.getAirMax())))
		{
			setActions(new ActionAddAir(astro));
		}
		
		//Low Water, Drink Action
		if (astro.getWater()<((int)(.3*astro.getWaterMax())))
		{
			setActions(new ActionAddWater(astro));
		}
		
		//Low Food, Eat Action
		if (astro.getFood()<((int)(.3*astro.getFoodMax())))
		{
			setActions(new ActionAddFood(astro));
		}
		
		//Both Actions Still Empty
		if (act1==null && act2==null)
		{
			setActions(new ActionTinker(astro));
			setActions(new ActionWait(astro));
		}
		//One Action Still Empty
		if (act1==null || act2==null)
		{
			setActions(new ActionAddAir(astro));
		}
	}
}
