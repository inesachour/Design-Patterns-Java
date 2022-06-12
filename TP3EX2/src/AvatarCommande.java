import java.util.ArrayList;
import java.util.List;

public class AvatarCommande {

	List<Float> prix = new ArrayList<>();
	List<SuperPouvoirAvatar> SPA = new ArrayList<>();
	
	void afficheSuperPouvoir() {
		for(int i=0;i< SPA.size();i++) {
			System.out.println(SPA.get(i).nom + " Prix: "+ prix.get(i));
		}
	}
	
	void ajouterSuperPouvoir(FabriqueSuperPouvoir fabrique,float prixA,String nom) {
		SuperPouvoirAvatar A = fabrique.getSuperPouvoir(nom);
		SPA.add(A);
		prix.add(prixA);
	}
}
