package controle.pratique;

public class LivreurCamion extends Livreur {
	private double tauxMajoration;

	public LivreurCamion(String identifiant, String nom, double tarifKm, double tauxMajoration) {
		super(identifiant, nom, tarifKm);
		this.tauxMajoration = tauxMajoration;
	}

	// methode
	public double calculerFrais(double distance) {
		double montantBase = tarifKm * distance;
		double coût = montantBase * (1 + tauxMajoration);
		return coût;
	}

	public void afficherDetails() {
		super.afficherDetails();
		System.out.println(" tauxMajoration   : " + tauxMajoration);
	}
}
