package glace;

public class Chocolat extends Topping{

	protected CoupeGlacee cg;
	public Chocolat(CoupeGlacee cg) {
		super();
		this.cg = cg;
	}
	
	public float cout() {
		return 0.7f ;
	}
	
	public String description() {
		return "et sa délicieuse sauce chocolat";
	}
}
