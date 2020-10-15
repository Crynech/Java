

import java.util.ArrayList;

public class Client {

    private String nom, prenom;
    private int num_client;
    public static int next_client=0;
    private ArrayList<Compte> comptes;



    public Client(String nom, String prenom) {
        this.nom=nom;
        this.prenom=prenom;
        next_client++;
        this.num_client=next_client;
        this.comptes = new ArrayList<>();
    }


    public String getNom() {
        return this.nom;
    }


    public String getPrenom() {
        return this.prenom;
    }
    

    public int getNum_client() {
        return this.num_client;
    }

    public void ajouter_compte(Compte c)
    {
        this.comptes.add(c);
    }



    
}
