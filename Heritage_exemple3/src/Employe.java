
public class Employe {
	private static double coeffSalaire;

	private String nom;
	private int matricule;
	private double indice_salarial;

	public Employe(String nom, int matricule, int indice_salarial) {
		this.nom = nom;
		this.matricule = matricule;
		this.indice_salarial = indice_salarial;
	}

	public String toString() {
		return this.nom;
		}
	
	public static double getCoeffSalaire() {
		return coeffSalaire;
	}

	public static void setCoeffSalaire(double coeffSalaire) {
		Employe.coeffSalaire = coeffSalaire;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getMatricule() {
		return matricule;
	}

	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}

	public double getIndice_salarial() {
		return indice_salarial;
	}

	public void setIndice_salarial(int indice_salarial) {
		this.indice_salarial = indice_salarial;
	}

}
