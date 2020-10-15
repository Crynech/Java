
public class Item {
	private String name;
	private long price;
	private int poids;

	public Item(String name, long price, int poids) {
		this.name = name;
		this.price = price;
		this.poids = poids;
	}
	public String toString() {
		   return this.name + ":" + this.price/100 + "." + 0.00 + (this.price%100) + "€";
		}
	public String getName() {
		return name;
	}

	public long getPrice() {
		return price;
	}
	public int getPoids() {
		return poids;
	}
	
	
}
