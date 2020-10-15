
public class PointNom extends Point {
	private String nom;

	public PointNom( int x, int y, String nom) {
		super(x,y);
		this.nom = nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void AffCoordNom () {
		System.out.println("Le point " + nom + " se trouve en : (" + x + ";" + y + ")");
	}
}
