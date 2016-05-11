package Main;

import Astronaut.Astronaut;
import Building.MainBase;


public class SpaceExplorer
{
	public static void main(String[] args) {
		Global.Set_Debug(1);
		
		Astronaut chris = new Astronaut("Chris");
		MainBase alpha = new MainBase();
		
		GameTimer mainGame = new GameTimer(chris,alpha);
		mainGame.StartGame();
		
		
		/*MakeWindow<Astronaut> newWin = new MakeWindow<Astronaut>();
		newWin.Get_ActionClass(chris);
		newWin.StartWindow();
		//newWin.AddText(10,10);
		//newWin.AddText(1,10);
		newWin.AddText(10,chris);
		newWin.AddButton("Testing",chrisadd);
		newWin.UpdateWindow();
		System.out.println("test"); */

	}
}
