import java.util.ArrayList;
import java.util.List;

public class FormeComplexe extends Forme {

	
	List<Forme> formes = new ArrayList<>();
	@Override
	public double calculerSurface() {
		float s = 0;
		for(Forme f : formes) {
			s += f.calculerSurface();
		}
		return s;
	}

	@Override
	public String afficherCouleur() {
		for(Forme f : formes) {
			couleur += " " + f.afficherCouleur();
		}
		return couleur;
	}

	@Override
	public boolean ajouteForme(Forme f) {
		formes.add(f);
		return true;
	}

}
