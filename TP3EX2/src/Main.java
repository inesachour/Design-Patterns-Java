
public class Main {
	
	public static void main(String args[]) {
		
		FabriqueSuperPouvoir f = new FabriqueSuperPouvoir();
		
		AvatarCommande Clown = new AvatarCommande();
		Clown.ajouterSuperPouvoir(f, 5, "Voler");
		Clown.ajouterSuperPouvoir(f, 3, "Eau");
		
		AvatarCommande Muscl� = new AvatarCommande();
		Muscl�.ajouterSuperPouvoir(f, 4, "Voler");
		Muscl�.ajouterSuperPouvoir(f, 2, "Feu");
		
		System.out.println("Clown : ");
		Clown.afficheSuperPouvoir();
		System.out.println("Muscl� : ");
		Muscl�.afficheSuperPouvoir();
	}
}
