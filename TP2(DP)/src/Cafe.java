

public class Cafe extends Boisson {

    public static final Cafe SINGLETON = new Cafe();
    private String varieté;


    Cafe(String varieté) {
        this.varieté = varieté;
    }
    Cafe() {}

    public void setVarieté(String varieté) {
        this.varieté = varieté;
    }

 
    public float cout() {
        return 1.5f;
    }

    
    public String description() {
        return "café "+ varieté+ " ";
    }
}