
public class Parfum {
	public static Parfum CASSIS;
	public static Parfum CHOCOBLAN;
	public static Parfum CHOCOLAIT;
	public static Parfum CHOCONOIR ;
	public static Parfum FRAISE;
	public static Parfum FRAMBOISE;
	private String name;
	
	private Parfum(String s) {
		name = s ;
	}
	
	public String toString() {
		return name;
	}

}
