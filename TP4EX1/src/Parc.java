
public class Parc extends ZoneTouristique {

void accept(Visitor v) {
	System.out.println("Le parc a accepté votre visite.");
	v.visit(this);
	}
}
