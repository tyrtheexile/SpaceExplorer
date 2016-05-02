package Legacy;

import java.awt.*;
import java.awt.event.*;

import Astronaut.Astronaut;

public class MainWindow extends Frame implements ActionListener
{
	private Astronaut A1;
	private Label airLabel = new Label("Air: ");
	private TextField airReadout = new TextField(4);
	private Button airButton = new Button("Add Air");
	private MyButton airMyButton = new MyButton(5,"Air Button Pressed");

	
	public MainWindow()
	{
		setLayout(new FlowLayout());
		
		airReadout.setEditable(false);
		setVisible(true);

		
		setTitle("Resources");
		setSize(500,500);
		
		add(airLabel);
		add(airReadout);
		add(airButton);
		airButton.addActionListener(airMyButton);
		airButton.addActionListener(this);

	}

	public void GetAstronaut(Astronaut astro)
	{
		A1=astro;
		airMyButton.add_Astronaut(A1);
	}

	public void WindowUpdate()
	{
		airReadout.setText(A1.Get_Air()+"");
	}
	
	@Override
	public void actionPerformed(ActionEvent evt)
	{
		this.WindowUpdate();
	}

}


//////////////////////////////////////////////////////////////////////////////////////////////