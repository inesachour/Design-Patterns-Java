
public abstract class Etat {

	public PorteDeGarage p;
	
	public Etat(PorteDeGarage p) {
		this.p = p;
	}
	abstract void ouvrir();
	abstract void fermer();
	
}
