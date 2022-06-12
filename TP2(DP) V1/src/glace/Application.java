package glace;

public class Application {

	public static void main(String[]args) {
		CoupeGlacee cp = TripleChocolat.SINGLETON;
		Topping ch = new Chocolat(cp);
		
		Commande c = new Commande();
		c.lesCoupes.add(cp);
		c.publieFacture();
	}
}
