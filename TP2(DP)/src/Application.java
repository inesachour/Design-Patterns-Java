import java.io.FileNotFoundException;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        TripleChocolat glace = TripleChocolat.SINGLETON;
        Topping toppingChantillyGlace = new Chantilly(glace);
        Topping toppingSauce = new SauceChocolat(glace);

        Cafe cafe = Cafe.SINGLETON;
        cafe.setVarieté("Arabica");
        Topping toppingChantillyCafe = new Chantilly(cafe);

        List<Snacks> cg = List.of(glace, toppingSauce, toppingChantillyGlace, cafe , toppingChantillyCafe);

        Commande cmd = new Commande(cg);
        cmd.publieFacture();
    }
}
