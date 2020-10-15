
public class Compte {
	static int nbrCompte = 0;
	private String client;
	private int numeroCompte;
	private float solde;
	private int retraitmax;
	
	public Compte(String client, float solde, int retrait) {
		super();
		nbrCompte++;
		this.client = client;
		this.numeroCompte = nbrCompte;
		this.solde = solde;
		this.retraitmax = retrait;
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}

	public int getRetraitmax() {
		return retraitmax;
	}

	public void setRetraitmax(int plafond) {
		this.retraitmax = plafond;
	}

	public String getClient() {
		return client;
	}

	public int getNumeroCompte() {
		return numeroCompte;
	}
	
	
	
}
