
public class Ouvert extends Etat{

	
	public Ouvert(PorteDeGarage p) {
		super(p);
		// TODO Auto-generated constructor stub
	}


	@Override
	void ouvrir() {
		System.out.println("Porte est ouverte !");
	}

	@Override
	void fermer() {
		
		p.setEtat(new EnCoursFermeture(this.p));
		System.out.println("Porte en train de se fermer");
		p.fermer();
	}

}
