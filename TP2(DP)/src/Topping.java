
public class Topping implements Snacks {
    Snacks snack;

    public Topping(Snacks snack) {
        this.snack = snack;
    }

    public String description() {
        return snack.description();
    }

    public float cout() {
        return snack.cout();
    }
}
