import java.util.ArrayList;
import java.util.List;

public class Sujet {
	List<Observateur> subs = new ArrayList();
	
	void ajouter(Observateur o) {
		subs.add(o);
	}
	
	void supprimer(Observateur o) {
		subs.remove(o);
	}
	
	void notifier() {
		for(Observateur i : subs) {
			i.miseajour();
		}
	}
}
