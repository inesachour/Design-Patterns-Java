
public class Muse extends ZoneTouristique{

	void accept(Visitor v) {
		System.out.println("Le muse a accept� votre visite.");
		v.visit(this);
	}
}
