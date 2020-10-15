import java.util.ArrayList;

public class ShoppingCart {
	private static int nbrCart;
	
	private ArrayList<Item> itemList;	
	private long totalPrice;
	private int poidsTotal;
	private int id;

	public ShoppingCart() {
		this.itemList = new ArrayList<Item>();
		this.totalPrice = 0;
		this.poidsTotal = 0;
		nbrCart++;
		this.id = nbrCart;
	}


	private boolean ajoutPossible (Item article) {
		int temp = 0;
		for (Item i : this.itemList) {
			temp += i.getPoids();
		}
		this.poidsTotal = temp;
		return poidsTotal + article.getPoids()  <= 10000;
	}


	public void addItem(Item item) {
		if(ajoutPossible(item)) {
		this.itemList.add(item);
		}
	}


	public void removeItem(Item item) {
		this.itemList.remove(item);
	}


	public int itemCount() {
		return this.itemList.size();
	}


	public long getTotalPrice() {
		long temp = 0;
		for (Item i : this.itemList) {
			temp += i.getPrice();
		}
		this.totalPrice = temp;
		return this.totalPrice;
	}


	public int getId() {
		return id;
	}


	public String toString() {
		String temp = "";
		for (Item i : this.itemList) {
			temp += i.getName() + " : " + i.getPrice()/100 + 0.00 + (i.getPrice()%100) + "€"+ "\r\n";
		}
		return "Panier " + this.id + " [" + this.itemCount() + "]" + "\r\n" + temp ;
		}
}




