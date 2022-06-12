import java.util.ArrayList;
import java.util.List;

public class Ville extends ZoneTouristique {
	List<ZoneTouristique> children = new ArrayList<ZoneTouristique>();

	void accept(Visitor v) {
		System.out.println("La ville a accepté votre visite.");
		v.visit(this);
		for(ZoneTouristique zt : children) {
			zt.accept(v);
		}
	}

	void addChild(ZoneTouristique zt) {
		children.add(zt);
	}
}
