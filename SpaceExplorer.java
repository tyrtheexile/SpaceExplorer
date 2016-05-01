import WindowManagment.MakeWindow;

public class SpaceExplorer
{
	public static void main(String[] args) {
		MakeWindow newWin = new MakeWindow();
		newWin.StartWindow();
		newWin.AddText(10,10);
		newWin.AddText(1,100);
		newWin.AddText(67,1);
		newWin.UpdateWindow();
	}
}
