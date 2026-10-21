package controle.pratique;

public class Commande {
	private String numero;
	private String destination;

	public Commande(String numero, String destination) {
		this.numero = numero;
		this.destination = destination;
	}

	@Override
	public String toString() {
		return "Commande [numero=" + numero + ", destination=" + destination + "]";
	}

}
