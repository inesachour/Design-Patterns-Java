

public class Cafe extends Boisson {

    public static final Cafe SINGLETON = new Cafe();
    private String variet�;


    Cafe(String variet�) {
        this.variet� = variet�;
    }
    Cafe() {}

    public void setVariet�(String variet�) {
        this.variet� = variet�;
    }

 
    public float cout() {
        return 1.5f;
    }

    
    public String description() {
        return "caf� "+ variet�+ " ";
    }
}