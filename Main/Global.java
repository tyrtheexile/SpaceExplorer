package Main;

public class Global {
	
	private static int debug=0;
	
	public static void Set_Debug(int i) {debug=i;}
	public static int Get_Debug() {return debug;}
	
	public static void DebugMSG(int lvl,String str)
	{
		if (debug>=lvl) System.out.println(str);
	}

}
