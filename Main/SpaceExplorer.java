package Main;

import Astronaut.Astronaut;
import Building.MainBase;


public class SpaceExplorer
{
	public static void main(String[] args) {
		Global.Set_Debug(1);
		
		Astronaut chris = new Astronaut("Chris");
		MainBase alpha = new MainBase("Alpha",chris);
		
		GameTimer mainGame = new GameTimer(chris,alpha);
		mainGame.StartGame();

	}
}
