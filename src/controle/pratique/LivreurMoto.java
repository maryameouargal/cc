package controle.pratique;

public class LivreurMoto extends Livreur {
	private int anciennete;

	public LivreurMoto(String identifiant, String nom, double tarifKm, int anciennete) {
		super(identifiant, nom, tarifKm);
		this.anciennete = anciennete;
	}

//  methode 
	public double calculerFrais(double distance) {
		double cout = tarifKm * distance;
		if (anciennete >= 3) {
			return (tarifKm + 20) * distance;
		} else {
			return cout;
		}
	}

	public void afficherDetails() {
		super.afficherDetails();
		System.out.println("  anciennete=" + anciennete);
	}

}
