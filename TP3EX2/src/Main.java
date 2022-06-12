
public class Main {
	
	public static void main(String args[]) {
		
		FabriqueSuperPouvoir f = new FabriqueSuperPouvoir();
		
		AvatarCommande Clown = new AvatarCommande();
		Clown.ajouterSuperPouvoir(f, 5, "Voler");
		Clown.ajouterSuperPouvoir(f, 3, "Eau");
		
		AvatarCommande Musclé = new AvatarCommande();
		Musclé.ajouterSuperPouvoir(f, 4, "Voler");
		Musclé.ajouterSuperPouvoir(f, 2, "Feu");
		
		System.out.println("Clown : ");
		Clown.afficheSuperPouvoir();
		System.out.println("Musclé : ");
		Musclé.afficheSuperPouvoir();
	}
}
