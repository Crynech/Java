
public class ChargeDeProd extends Employe {
	private int uniteProduite;

	public ChargeDeProd(String nom, String prenom, String tel, String dNaissance, String dEmbauche, int uniteProduite) {
		super(nom, prenom, tel, dNaissance, dEmbauche);
		this.uniteProduite = uniteProduite;
	}

	public double salaire() {
		return 4 * this.uniteProduite;
	}

	public int getUniteProduite() {
		return uniteProduite;
	}

	public void setUniteProduite(int uniteProduite) {
		this.uniteProduite = uniteProduite;
	}

}
