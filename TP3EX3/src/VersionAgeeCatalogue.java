import java.util.List;

public class VersionAgeeCatalogue {

	public void dessine(List<VueProduit> produit) {
		System.out.println("--Version agée--");
		for (VueProduit vueProduit : produit) {
			vueProduit.dessine();
			System.out.println();
		}

		System.out.println();
	}
}
