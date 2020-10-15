
public class Main {

	public static void main(String[] args) {
		/* //1)
		Item item = new Item("corn flakes", 500);
		System.out.println(item.getPrice()); // affiche: 500
		System.out.println(item.getName()); // affiche: corn flakes
		*/
		
		/* //2)
		Item item = new Item("corn flakes", 500);
		System.out.println(item); // affiche: corn flakes: 5.00 €

		Item chewingGum = new Item("chewing gum",403);
		System.out.println(chewingGum); // affiche: chewinggum: 4.03 €
		*/
		
		/* //3)
		Item item1 = new Item("corn flakes", 500);
		Item item2 = new Item("caviar", 50000);
		Item item3 = new Item("water", 101);
		
		ShoppingCart cart = new ShoppingCart();
		
		cart.addItem(item1);
		cart.addItem(item2);
		cart.addItem(item3);
		
		System.out.println("Vous avez : " + cart.itemCount() + " article(s).");
		System.out.println("Prix total : " + cart.getTotalPrice());
		cart.removeItem(item1);
		System.out.println("Prix total : " + cart.getTotalPrice());
		*/
		
		ShoppingCart c1 = new ShoppingCart();
		System.out.println(c1.getId()); // affiche: 1
		Item item1 = new Item("corn flakes", 501, 1000);
		c1.addItem(item1);
		Item item2 = new Item("caviar", 50000, 500);
		c1.addItem(item2);
		System.out.println(c1.getId()); // affiche: 1
		ShoppingCart c2 = new ShoppingCart();
		ShoppingCart c3 = new ShoppingCart();
		Item item3 = new Item("water", 500, 5000);
		c3.addItem(item3);
		System.out.println(c2.getId()); // affiche: 2
		System.out.println(c3.getId()); // affiche: 3

		System.out.println(c1);
		

	}

}
