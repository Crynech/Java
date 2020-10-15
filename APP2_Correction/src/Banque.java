public class Banque {

    public static void main(String[] args) {
        Client c=new Client("Lemarche","Ernest");
        Compte c1=new Compte(c,1000,500);
        System.out.println(c1.toString());
        c1.credit(200);
        System.out.println(c1.toString());
        //c1.credit(3000);
        c1.debit(200);
        System.out.println(c1.toString());
        c1.debit(200);
        System.out.println(c1.toString());
        c1.debit(30000);
        System.out.println(c1.toString());
    }
    
}
