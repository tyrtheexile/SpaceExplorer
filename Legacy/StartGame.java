package Legacy;

import Astronaut.Astronaut;
import Building.Platform;

public class StartGame
{

	public static void main(String []args) 
	{
		
		System.out.println("Hello World"); // prints Hello World
    
		MyButton RefillO2=new MyButton(10,"Air(10)");
		
		
		Astronaut Chris=new Astronaut("Chris",3);
		Chris.Timecheck();
		System.out.println("\n"+Chris.Get_Name()+" is Created");
		
		Platform Pt1=new Platform("Platform1",1,1,0,2);
		EmptyRoom Rm1=new EmptyRoom("Room1",2,2,0,1);
		Pt1.Fill_Slot(Rm1);
		Pt1.Status();
		
		System.out.println("\n\n\n\nGAME TEST: \n\n");
		MainWindow mainwin = new MainWindow();
		mainwin.GetAstronaut(Chris);
		
		while (Chris.Is_Alive()==1)
		{
			Chris.Timecheck();
			mainwin.WindowUpdate();
			try{
				Thread.sleep(5000);
			} catch (InterruptedException error)
			{
				System.out.println("\n\nCould Not Sleep 5000 Error: \n"+error);
			}
		}
		
	}


}