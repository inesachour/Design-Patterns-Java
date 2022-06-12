
public class Fraise extends Topping{
    public Fraise(Snacks snack) {
        super(snack);
    }

    public String description() {
        return super.description() + "au colis de fraises fraiches";
    }

    public float cout() {
        return 1;
    }
}
