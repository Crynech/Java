

public class Compte {

    private int numero;
    public static int next_compte=1000;
    private Client client;
    private int valeur_max_autorise;
    private int decouvert_max;
    private int solde;
    private int nb_operation;

    public Compte(Client client, int max, int decouvert_max) {
        next_compte++;
        this.solde=0;
        this.nb_operation=0;
        this.numero = next_compte;
        this.client = client;
        this.valeur_max_autorise=max;
        this.decouvert_max=decouvert_max;
    }

    public int getNumero() {
        return this.numero;
    }

    public Client getClient() {
        return this.client;
    }

    public boolean credit_possible(int montant)
    {
        return montant<=this.valeur_max_autorise;
    }

    public boolean debit_possible(int montant)
    {
        return this.solde-montant>=-1*this.decouvert_max;
    }

    public void credit(int montant)
    {
        if(credit_possible(montant)) {
            this.solde+=montant;
            this.nb_operation++;
        }
        else {
            System.out.println("operation impossible : votre depot est trop important");
        }

    }

    public void debit(int montant)
    {
        if(debit_possible(montant)) {
            this.solde-=montant;
            this.nb_operation++;
        }
        else {
            System.out.println("operation impossible");
        }
    }

    //virement de ce compte vers le compte c
    public void virement(Compte c, int montant )
    {
        if(this.debit_possible(montant) && c.credit_possible(montant))
        {
            this.debit(montant);
            c.credit(montant);
        }
    }

    public String toString()
    {
        String str= "compte detenu par "+this.client.getNom()+" "+this.client.getPrenom();
        str+="\r\n";
        str+="Solde : "+this.solde;
        str+="\r\n";
        str+="nombre operations sur ce compte : "+this.nb_operation;
        return str;

    }



   
}
