public abstract class Forme {
	protected static double surface = 55.0;
	protected String couleur;

	public void ajouteCouleur(String couleur) {
		this.couleur = couleur;
	}

	public abstract double calculerSurface();

	public abstract String afficherCouleur();

	public abstract boolean ajouteForme(Forme f);
}
