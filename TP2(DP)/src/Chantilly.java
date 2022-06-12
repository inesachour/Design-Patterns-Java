
public class Chantilly extends Topping{

    public Chantilly(Snacks snack) {
        super(snack);
    }

    public String description() {
        return super.description() + " chantilly";
    }

    public float cout() {
        return 0.5f;
    }
}
