package Actions;

import Astronaut.Astronaut;

public class ActionTinker extends Action {

	public ActionTinker(Astronaut astro) {
		super(astro);
		setTime(12);
		setActionName("Tinker");
	}

	@Override
	public void doAction() {
		displayMenu();
	}
	
	public void displayMenu() 
	{
		//This is will list Items that can be built
		System.out.println("\nItems will Go Here");
	}
}
