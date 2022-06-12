package glace;

public class Fraise extends Topping{
	
	protected CoupeGlacee cg;
	public Fraise(CoupeGlacee cg) {
		super();
		this.cg = cg;
	}
	
	public float cout(){
		return 1;
	}
	
	public String description() {
		return "au colis de fraise fraiche";
	}

}
