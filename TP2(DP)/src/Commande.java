import java.util.Iterator;
import java.util.List;

public class Commande {

    List<Snacks> lesCoupes;

    public Commande(List<Snacks> lesCoupes) {
        this.lesCoupes = lesCoupes;
    }

    public void publieFacture() {
        float total = 0;
        for (Iterator it = this.lesCoupes.iterator(); it.hasNext(); ) {
            Snacks snack = (Snacks) it.next();
            System.out.println(snack.description() + " + " + snack.cout());
            total = total + snack.cout();
        }
        System.out.println(" TOTAL : " + total);

    }

}