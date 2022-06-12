public class VueProduit {
    protected String description;

    public VueProduit(String description) {
        this.description = description;
    }

    public void dessine() {
        System.out.print(description);
    }

}
