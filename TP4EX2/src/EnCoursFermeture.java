
public class EnCoursFermeture extends Etat{

	public EnCoursFermeture(PorteDeGarage p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	@Override
	void ouvrir() {
		p.setEtat(new EnCoursOuverture(this.p));
		System.out.println("Demande de ouvrir");
		p.ouvrir();
	}

	@Override
	void fermer() {
		p.setEtat(new Ferme(this.p));
		p.fermer();
	}

}
