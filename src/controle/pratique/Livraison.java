package controle.pratique;

public class Livraison {
	private double distance;
	private Livreur livreur;
	private Commande commande;

	public Livraison(double distance, Livreur livreur, Commande commande) {
		this.distance = distance;
		this.livreur = livreur;
		this.commande = commande;
	}

	public double calculerMontant() {
		return livreur.calculerFrais(distance);
	}

	public void afficherRecapitulatif() {
		System.out.println("Livraison ");
		System.out.println("livreur :");
		livreur.afficherDetails();
		System.out.println("Commande  : " + commande);
		System.out.println("distance=" + distance + " km");
		System.out.println("Montant : " + calculerMontant() + " DH");
		System.out.println();

	}

}
