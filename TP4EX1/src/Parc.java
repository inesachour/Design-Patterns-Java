
public class Parc extends ZoneTouristique {

void accept(Visitor v) {
	System.out.println("Le parc a accept� votre visite.");
	v.visit(this);
	}
}
