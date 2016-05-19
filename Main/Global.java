package Main;

public class Global {
	
	//Debug Variable
	// Debug 0 - No Debug
	// Debug 1 - Text Mode, No Window, Output basic text
	// Debug 3 - Moderate Debug
	// Debug 5 - Verbose Debug
	// Debug 6 - Verbose Debug Text Mode
	private static int debug=0;
	private static int timeIncrement=1000;
	private static boolean immortal=false;
	private static int basesize=20;
	
	public static void set_Debug(int i) {debug=i;}
	public static int get_Debug() {return debug;}
	
	public static void DebugMSG(int lvl,String str)
	{
		if (debug>=lvl) System.out.println(str);
	}
	public static int getTimeIncrement() {
		return timeIncrement;
	}
	public static void setTimeIncrement(int i) {
		timeIncrement = i;
	}
	public static void TextDisp(String str) 
	{
		if (debug==1 || debug==6)
			System.out.println("\n"+str);
	}
	
	public static void setImmortal(Boolean i) {immortal=i;}
	public static Boolean getImmortal() {return immortal;}
	public static int getBasesize() {
		return basesize;
	}
	public static void setBasesize(int basesize) {
		Global.basesize = basesize;
	}
}
