
public class VisiterPourLaPremiereFois implements Visitor{

	@Override
	public void visit(Ville v) {
		System.out.println("Je visite pour la premi�re fois la ville !");
		
	}

	@Override
	public void visit(Muse m) {
		System.out.println("Je visite pour la premi�re fois le muse !");
		
	}

	@Override
	public void visit(Parc p) {
		System.out.println("Je visite pour la premi�re fois le parc !");
		
	}
	
	

}
