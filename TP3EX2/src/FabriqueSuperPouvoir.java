import java.util.HashMap;

public class FabriqueSuperPouvoir {
	HashMap<String,SuperPouvoirAvatar> superPouvoir = new HashMap<>();
	
	SuperPouvoirAvatar getSuperPouvoir(String nom) {
		if(superPouvoir.get(nom)!=null) {
			return superPouvoir.get(nom);
		}
		else {
			superPouvoir.put(nom, new SuperPouvoirAvatar(nom,"Description"));
			return superPouvoir.get(nom);
		}
	}

}
