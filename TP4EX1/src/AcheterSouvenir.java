
public class AcheterSouvenir implements Visitor{

	@Override
	public void visit(Ville v) {
		System.out.println("J�ach�te un souvenir du ville !");
		
	}

	@Override
	public void visit(Muse m) {
		System.out.println("J�ach�te un souvenir du mus� !");
		
	}

	@Override
	public void visit(Parc p) {
		System.out.println("J�ach�te un souvenir du parc !");
		
	}

}
