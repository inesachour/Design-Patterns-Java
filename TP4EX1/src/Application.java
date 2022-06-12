
public class Application {
	
	public static void main(String[] args) {
		
		Ville v = new Ville();
		Parc p = new Parc();
		Muse m = new Muse();
		

		
		VisiterPourLaPremiereFois vpf = new VisiterPourLaPremiereFois();
		AcheterSouvenir as = new AcheterSouvenir();
		v.accept(vpf);
		m.accept(as);
		p.accept(vpf);
		
	}

}
