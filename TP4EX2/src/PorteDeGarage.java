import java.util.ArrayList;
import java.util.List;

public class PorteDeGarage extends Sujet {
	
	Etat etatCourant = new Ferme(this);
	
	
	void setEtat(Etat e) {
		etatCourant = e;
		notifier();
	}
	
	void ouvrir() {
		etatCourant.ouvrir();
	}
	
	void fermer() {
		etatCourant.fermer();
	}
	
}
