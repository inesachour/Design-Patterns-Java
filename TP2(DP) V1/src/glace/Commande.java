package glace;

import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

public class Commande {
	public List lesCoupes;

	public void publieFacture() {
		float total = 0;
		for (Iterator it = this.lesCoupes.iterator(); it.hasNext();) {
			CoupeGlacee coupe = (CoupeGlacee) it.next();
			System.out.println(coupe.description() + " + " + coupe.cout());
			total = total + coupe.cout();
		}
		System.out.println(" TOTAL : " + total);
	}
}