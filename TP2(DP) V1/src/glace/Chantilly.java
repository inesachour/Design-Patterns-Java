package glace;

public class Chantilly extends Topping{
	
	protected CoupeGlacee cg;
	public Chantilly(CoupeGlacee cg) {
		super(cg);
		
	}
	public float cout() {
		return 0.5f;
	}
	
	public String description() {
		return cg.description()+"chantilly";
	}

}
