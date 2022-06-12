
import java.util.ArrayList;
import java.util.List;

public class VueCatalogueProduits {
    protected List<VueProduit> produit = new ArrayList<VueProduit>();
    protected VersionAgeeCatalogue version;

    public VueCatalogueProduits(VersionAgeeCatalogue version) {
        produit.add(new VueProduit("Produit1"));
        produit.add(new VueProduit("Produit2"));
        produit.add(new VueProduit("Produit3"));
        this.version = version;
    }

    public void dessine() {
        version.dessine(produit);
    }
}
