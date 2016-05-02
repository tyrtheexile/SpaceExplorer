package Legacy;


import java.awt.*;
import java.awt.event.*;

import Astronaut.Astronaut;

public class MyButton implements ActionListener
{
	private int time = 0;
	private String action = "NoAction";
	private int debug = 0;
	private Astronaut astro;
	
	public MyButton(int wait, String action) {this(wait,action,null,0);}
	public MyButton(int wait, String action,Astronaut astro)
	{
		this(wait,action,astro,0);
	}
	
	public MyButton(int wait, String action,Astronaut astro, int debug)
	{
		this.time=wait;
		this.action=action;
		this.debug=debug;
		this.astro=astro;
	}
	
	public void add_Astronaut(Astronaut A1) {astro=A1;}
	
	@Override
	public void actionPerformed(ActionEvent evt)
	{
		
		if (debug >=3){System.out.println("\nButton Action: "+this.action);}
		astro.Add_Air(50);
	}

}
