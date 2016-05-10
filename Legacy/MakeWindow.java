package WindowManagment;

import java.awt.*;
import java.awt.event.*;
import Main.*;
import Actions.*;

public class MakeWindow<T> extends Frame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	
	Window newWindow;
	Button close;
	Button[] butts = new Button[25];
	TextField[] texts = new TextField[25];
	
	T actionClass;
	
	//Constructors
	//No Argument 500-425-New Window
	//Class Window takes it's properties
	//Arguments given to Window
	public MakeWindow()
	{
		newWindow = new Window (500,425,"New Window");
	}
	public MakeWindow(Window win)
	{
		newWindow = win;
	}
	public MakeWindow(int height, int width, String title)
	{
		newWindow = new Window(height,width,title);
	}
	public MakeWindow(T action)
	{
		actionClass = action;
	}
	
	//Getters and Setters
	public void Get_ActionClass(T action)
	{
		actionClass = action;
	}
	public void Get_Window(Window win)
	{
		newWindow=win;
	}
	
	//Creates the Window with Window class parameters may now add the following:
	public void StartWindow()
	{
		if (newWindow.Get_Layout()=="default")
		{
			setLayout(new FlowLayout());
		}
		
		setTitle(newWindow.Get_Title());
		setSize(newWindow.Get_Height(),newWindow.Get_Width());
		
		close = new Button("Close");
		close.addActionListener(this);
		add(close);
	}
	
	//Add texts with the variables
	public void AddText(int length, T num)
	{
		for(int i = 0; i < texts.length; i++)
		{
		    if(texts[i] == null)
		    {
		        //texts[i] = new TextField(""+num.getAir(),length);
		    	texts[i] = new TextField("Testing",length);
		        add(texts[i]);
		        break;
		    }
		}
		
	}
	public void AddButton(String name, ButAction action)
	{
		for(int i = 0; i < butts.length; i++)
		{
		    if(butts[i] == null)
		    {
		        butts[i] = new Button(name);
		        Global.DebugMSG(5, "\nButton Number "+i+" Created - Name: "+name);
		        if (action!=null) {butts[i].addActionListener(action);}
		        add(butts[i]);
		        break;
		    }
		}
		
	}
	
	public void UpdateWindow()
	{
		setVisible(newWindow.Get_Visible());
	}
	
	public void actionPerformed(ActionEvent evt)
	{
		newWindow.Set_Visible(false);
		System.exit(0);
	}
}
