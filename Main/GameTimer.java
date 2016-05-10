package Main;

import Astronaut.*;

public class GameTimer {
	
	private Boolean endGameHard=false;
	private int actionTimer=10;
	
	private Astronaut defaultAstro;
	
	
	//Initialize the Gameplay loop with a default Astronaut
	public GameTimer(Astronaut astro) 
	{
		this.defaultAstro=astro;
	}
	
	//Starts the Actual gameplay loop
	public void StartGame()
	{
		this.StartGame(this.defaultAstro);
	}
	public void StartGame(Astronaut givenastro) 
	{
		Astronaut astro= givenastro;
		Choice choice =new Choice(astro);
		
		//Loop endGameHard!=true
		while (endGameHard!=true)
		{
			//Pause for 1 second on loop start
			try {
			    Thread.sleep(10);
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
			
			//Update Window
			Global.TextDisp(astro.getStatusString());
			
			//Timer countdown
			actionTimer--;
			Global.DebugMSG(5, "Action Timer Countdown: "+actionTimer);
			
			//Reduce given Parameters
			astro.timePulse();
			
			//Check if astro is alive everyloop
			if (astro.isAlive()!=true)
			{
				Global.TextDisp(astro.getStatusString());
				System.out.println("\n\nGame Over!");
				endGameHard=true;
				System.exit(0);
			}
			
			//if Timer <=0
			if (actionTimer<=0)
			{
				//if debug >3, Display Action time
				Global.DebugMSG(3,"\nAction Timer at 0");
				
				//Give choice, pause game, returns wait time
				
				actionTimer=choice.giveChoice();
			}
		
		}
	}

}
