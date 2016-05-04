package Actions;

import java.awt.event.ActionEvent;
import Main.*;
import Astronaut.*;

public class AddResource implements ButAction {
	
	Astronaut person;
	
	public AddResource(Astronaut astro) {
		person = astro;
		Global.DebugMSG(5,"\nAddResource has been Added to " +person.Get_Name());
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		person.Add_Air(10);
		System.out.println(person.Get_Air());
		Global.DebugMSG(5,"\nInside AddResouce Action for: "+person.Get_Name());
	}

}
