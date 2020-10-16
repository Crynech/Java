
public abstract class CollectiviteLocale {
	protected String nom;
	protected int population;
	protected double superficie;
	
	public CollectiviteLocale(String nom, int population, double superficie) {
		this.nom = nom;
		this.population = population;
		this.superficie = superficie;
	}
	public String getNom() {
		return nom;
	}
	public int getPopulation() {
		return population;
	}
	public double getSuperficie() {
		return superficie;
	}
	
	public double getDensite() {
		return this.population / this.superficie;
	}
	
}
