
public class EnCoursOuverture extends Etat{

	public EnCoursOuverture(PorteDeGarage p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	@Override
	void ouvrir() {
		p.setEtat(new Ouvert(this.p));	
		p.ouvrir();
	}

	@Override
	void fermer() {
		System.out.println("Demande de fermeture");
		
	}

}
