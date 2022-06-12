import java.util.List;

public class VersionNonAgeeCatalogue extends VersionAgeeCatalogue {
    
	public void dessine(List<VueProduit> produit) {
        System.out.println("--Version non agée--");
        for (VueProduit vueProduit : produit) {
            vueProduit.dessine();
            System.out.print(" ");
        }
        System.out.println();
    }
}
