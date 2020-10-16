import java.util.ArrayList;

public class entreprise {


   
    public static void main(String[] args) {
        
        ArrayList<employe> empl=new ArrayList<>();

        employe e=new employe("toto", 100);
        employe e1=new employe("totsdf", 107);
        responsable r=new responsable("resp", 120);
        commercial c=new commercial("titi", 100, 2000);
        c.setNb_vente_du_mois(200);
        c.setTx_variable(0.03);

        empl.add(e);
        empl.add(e1);
        empl.add(r);
        empl.add(c);

        r.add(e);
        r.add(e1);

        double st=0;
        for (employe es : empl){
            st+=es.salaire();
        }

        System.out.println(e);

        System.out.println(r);

        System.out.println("la masse salariale de l'entreprise est de "+st);

    }
}
