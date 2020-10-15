//String.format("%d.%02d", 100, 1) produit la chaîne "100.01"

public class Item{
    private String name;
    private long price;
    private long weigth;

    public Item(String name, long price, long w) {
        this.name = name;
        this.price = price;
        this.weigth=w;
    }

    public long getWeigth()
    {
        return this.weigth;
    }


    public String getName() {
        return this.name;
    }

    public long getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return this.name+" : "+ String.format("%d.%02d", this.price/100, this.price%100);
    }





}