
public class supermarche {
    
    public static void main(String[] args) {
        ShoppingCart c1 = new ShoppingCart(); 
        System.out.println(c1.getId()); // affiche: 1 
        Item item1 = new Item("corn flakes", 501, 1000); 
        c1.addItem(item1);
        Item item2 = new Item("caviar", 50000, 500); 
        c1.addItem(item2);
       
        System.out.println(c1);

    }
}
