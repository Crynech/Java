import java.util.ArrayList;

public class employe {

    public static int next = 1;
    private int matricule;
    private String nom;
    private int indice;
  

    private static double taux = 1.2;

    public employe(String nom, int indice) {
        this.matricule = next++;
        this.nom = nom;
        this.indice = indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public int getMatricule() {
        return this.matricule;
    }

    public String getNom() {
        return this.nom;
    }

    public int getIndice() {
        return this.indice;
    }

    public double salaire() {
        return this.indice * taux;
    }

    @Override
    public String toString() {
        return "{" + " matricule='" + matricule + "'" + ", nom='" + nom + "'" + ", indice='" + indice + "'" + "}";
    }

}
