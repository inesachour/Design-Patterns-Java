
public class Application {
	
	public static void main(String[] args) {
		
		PorteDeGarage p = new PorteDeGarage();
		ConcreteInterfaceGraphique i = new ConcreteInterfaceGraphique(p);
		p.ajouter(i);
		
		p.ouvrir();
		p.fermer();
		
	}

}
