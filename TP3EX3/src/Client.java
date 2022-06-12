
public class Client {
    public static void main(String[] args) {
        VersionNonAgeeCatalogue versionA = new VersionNonAgeeCatalogue();
        VersionAgeeCatalogue versionB = new VersionAgeeCatalogue();
        VueCatalogueProduits vue1 = new VueCatalogueProduits(versionA);
        VueCatalogueProduits vue2 = new VueCatalogueProduits(versionB);
        vue1.dessine();
        System.out.println();
        vue2.dessine();
    }
}