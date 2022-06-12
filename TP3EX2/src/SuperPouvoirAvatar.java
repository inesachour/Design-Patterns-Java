
public class SuperPouvoirAvatar {

	protected String nom;
	protected String description;
	
	public SuperPouvoirAvatar(String nom, String description) {
		this.nom = nom;
		this.description= description;
	}
	
	void affiche(float prix) {
		System.out.println(nom + " " +description +" "+ prix);
	}
}
