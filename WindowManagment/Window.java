package WindowManagment;

public class Window {
	private int height;
	private int width;
	private Boolean visible=true;
	private String layout="default";
	private String title="Untitled Window";
	
	//Setter Functions
	public void Set_Height(int val) {height=val;}
	public void Set_Width(int val) {width=val;}
	public void Set_Visible(Boolean val) {visible=val;}
	public void Set_Layout(String val) {layout=val;}
	public void Set_Title(String val) {title=val;}
	
	//Getter Functions
	public int Get_Height() {return height;}
	public int Get_Width() {return width;}
	public Boolean Get_Visible() {return visible;}
	public String Get_Layout() {return layout;}
	public String Get_Title() {return title;}
	
	//Constructors (height,width,"title") / (height,width,"title",visible,layout)
	public Window(int height, int width, String title)
	{
		this.height = height;
		this.width  = width;
		this.title  = title;
	}
	public Window(int height, int width, String title,Boolean visible, String layout)
	{
		this(height, width, title);
		this.visible = visible;
		this.layout  = layout;
	}
}
