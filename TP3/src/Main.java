
public class Main {
	
	public static void main(String [] args) {
		Forme f1 = new FormePrimitive();
		f1.ajouteCouleur("rouge");
		
		Forme f2 = new FormePrimitive();
		f2.ajouteCouleur("noir");
		
		Forme f3 = new FormeComplexe();
		f3.ajouteCouleur("blanc");
		f3.ajouteForme(f1);
		f3.ajouteForme(f2);
		
		System.out.println("Couleur : "+f3.afficherCouleur());
		System.out.println("Surface : " +f3.calculerSurface());
	}

}
