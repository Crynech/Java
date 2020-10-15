import java.util.ArrayList;

public class ShoppingCart {

    private ArrayList<Item> liste;
    public static int next=0;
    private int id;

    private final long MAX_W=10000;

    public ShoppingCart() {

        this.liste=new ArrayList<>();
        next++;
        this.id=next;

    }

    public int getId()
    {
        return this.id;
    }


    private boolean check(long w)
    {
        return this.totalWeigth()+w<=MAX_W;
    }

    private long totalWeigth()
    {
        long w=0;
        for(Item i:this.liste){
            w+=i.getWeigth();
        }
        return w;
    }

   public void addItem(Item e)
   {
       if(this.check(e.getWeigth())){
        this.liste.add(e);
       }
       else System.out.println("Impossible d'ajouter cet Item");
       
   }

   public boolean removeItem(Item e)
   {
       return this.liste.remove(e);
   }

   public long totalPrice()
   {
       long t=0;
       for( Item i: this.liste) t+=i.getPrice();
       return t;
   }

   public int itemCount(){
       return this.liste.size();
   }



    @Override
    public String toString() {
        String str="Panier "+this.getId()+" ["+this.itemCount()+" articles]\r\n";
        for(Item i:this.liste){
            str+=i.toString()+"\r\n";
        }
        return str;
    }
    
}
