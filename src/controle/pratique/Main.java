package controle.pratique;

public class Main {
	public static void main(String[] args) {
		// LivreurMoto
		LivreurMoto m1 = new LivreurMoto("1-C-1", "yassine", 10.0, 4);
		LivreurMoto m2 = new LivreurMoto("1-C-2", "no idea", 8.0, 2);

		// LivreurCamion
		LivreurCamion c1 = new LivreurCamion("2-B-3", "this", 15.0, 0.20);
		LivreurCamion c2 = new LivreurCamion("2-B-3", "me", 12.0, 0.10);

		Livreur[] livreur = { m1, m2, c1, c2 };

		// COMMANDES
		Commande p1 = new Commande("P001", "Italy");
		Commande p2 = new Commande("P002", "nowhere");

		// hierarchy
		m2.setResponsable(m1);
		c1.setResponsable(m1);
		c2.setResponsable(c1);

		// afichage des employes
		System.out.println("LES Livreurs ");
		for (Livreur l : livreur) {
			l.afficherDetails();
			System.out.println();
		}
		// Mission
		Livraison d1 = new Livraison(30.0, m1, p2);
		Livraison d2 = new Livraison(20.0, m2, p2);
		Livraison d3 = new Livraison(40.0, c1, p1);
		Livraison d4 = new Livraison(50.0, c2, p1);

		Livraison[] livraison = { d1, d2, d3, d4 };

		for (Livraison d : livraison) {
			d.afficherRecapitulatif();
		}
		// total
		double total = 0;
		for (Livraison d : livraison) {
			total += d.calculerMontant();
		}
		System.out.println("MONTANT TOTAL DES LIVRAISON : " + total + " DH\n");

		// employees directly supervised by Livreur 1
		int nb = 0;
		for (Livreur l : livreur) {
			if (l.getResponsable() == m1) {
				nb++;
			}
		}
	}
}
