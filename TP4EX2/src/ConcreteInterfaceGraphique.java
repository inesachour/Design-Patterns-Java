
public class ConcreteInterfaceGraphique implements Observateur  {
	
	PorteDeGarage p ;
	
	ConcreteInterfaceGraphique(PorteDeGarage p){
		this.p =p;
	}
	@Override
	public void miseajour() {
		System.out.println("<<Interface>> : Nouveau Etat : " + p.etatCourant.getClass().getName());	
	}

}
