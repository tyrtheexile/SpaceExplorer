package Main;

import Astronaut.Astronaut;
import Building.MainBase;


public class SpaceExplorer
{
	public static void main(String[] args) {
		Global.set_Debug(1);
		Global.setImmortal(true);
		Global.setTimeIncrement(10);
		
		Astronaut chris = new Astronaut("Chris");
		MainBase alpha = new MainBase("Alpha",chris);
		
		GameTimer mainGame = new GameTimer(chris,alpha);
		mainGame.StartGame();

	}
}
