package Main;
import Actions.AddResource;
import Astronaut.Astronaut;
import WindowManagment.MakeWindow;

public class SpaceExplorer
{
	public static void main(String[] args) {
		Global.Set_Debug(5);
		
		Astronaut chris = new Astronaut("Chris");
		AddResource chrisadd = new AddResource(chris);
		
		MakeWindow<Astronaut> newWin = new MakeWindow<Astronaut>();
		newWin.Get_ActionClass(chris);
		newWin.StartWindow();
		//newWin.AddText(10,10);
		//newWin.AddText(1,10);
		newWin.AddText(10,chris);
		newWin.AddButton("Testing",chrisadd);
		newWin.UpdateWindow();
		System.out.println("test");

	}
}
