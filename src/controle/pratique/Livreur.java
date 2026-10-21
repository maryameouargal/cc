package controle.pratique;

public abstract class Livreur {
	protected String identifiant;
	protected String nom;
	protected double tarifKm;
	protected Livreur responsable;

//	THE CONSTRUCTEUR USING SOURCE ONLY 
	public Livreur(String identifiant, String nom, double tarifKm) {
		this.identifiant = identifiant;
		this.nom = nom;
		this.tarifKm = tarifKm;
		this.responsable = null;
	}

//	GETTER 

	public String getIdentifiant() {
		return identifiant;
	}

	public String getNom() {
		return nom;
	}

//  Methode 
	public abstract double calculerFrais(double distance);

// GETTER and setters  for responsable 

	public Livreur getResponsable() {
		return responsable;
	}

	public void setResponsable(Livreur responsable) {
		if (responsable == this) {
			System.out.println(" Un livreur  ne peut pas être son propre responsable.");
			return;
		}
		this.responsable = responsable;
	}

	public void afficherDetails() {
		System.out.println("  identifiant=" + identifiant);
		System.out.println("  Nom       : " + nom);
		System.out.println("  tarifKm=" + tarifKm);
		if (responsable != null) {
			System.out.println("  responsable : " + responsable.nom);
		} else {
			System.out.println("  responsable : aucun");
		}

	}

}
