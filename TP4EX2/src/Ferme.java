
public class Ferme extends Etat {

	public Ferme(PorteDeGarage p) {
		super(p);
	
	}

	@Override
	void ouvrir() {
		
		p.setEtat(new EnCoursOuverture(this.p));
		System.out.println("Porte en train de s'ouvrir");
		p.ouvrir();
	}

	@Override
	void fermer() {
		System.out.println("Porte est fermée !");
		
	}

}
