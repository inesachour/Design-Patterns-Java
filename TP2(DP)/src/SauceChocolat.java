

public class SauceChocolat extends Topping{
    public SauceChocolat(Snacks snack) {
        super(snack);
    }

    public String description() {
        return  super.description()+" et sa délicieuse sauce chocolat";
    }
   
    public float cout() {
        return 0.7f;
    }
}
