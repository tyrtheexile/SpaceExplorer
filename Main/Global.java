package Main;

public class Global {
	
	//Debug Variable
	// Debug 0 - No Debug
	// Debug 1 - Text Mode, No Window, Output basic text
	// Debug 3 - Moderate Debug
	// Debug 5 - Verbose Debug
	// Debug 6 - Verbose Debug Text Mode
	private static int debug=0;
	private static int timeIncrement=10;
	
	public static void Set_Debug(int i) {debug=i;}
	public static int Get_Debug() {return debug;}
	
	public static void DebugMSG(int lvl,String str)
	{
		if (debug>=lvl) System.out.println(str);
	}
	public static int getTimeIncrement() {
		return timeIncrement;
	}
	public static void TextDisp(String str) 
	{
		if (debug==1 || debug==6)
			System.out.println("\n"+str);
	}

}
