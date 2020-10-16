public class commercial extends employe{

    private int nb_vente_du_mois;
    private int salaire_fixe;
    private double tx_variable;


    public commercial(String nom,int indice, int salaire_fixe) {
        super(nom,indice);
        this.nb_vente_du_mois=0;
        this.salaire_fixe=salaire_fixe;
        this.tx_variable=0.02;
        
    }


    public int getNb_vente_du_mois() {
        return this.nb_vente_du_mois;
    }

    public void setNb_vente_du_mois(int nb_vente_du_mois) {
        this.nb_vente_du_mois = nb_vente_du_mois;
    }

    public int getSalaire_fixe() {
        return this.salaire_fixe;
    }

    public void setSalaire_fixe(int salaire_fixe) {
        this.salaire_fixe = salaire_fixe;
    }

    public double getTx_variable() {
        return this.tx_variable;
    }

    public void setTx_variable(double tx_variable) {
        this.tx_variable = tx_variable;
    }

    @Override
    public double salaire(){
        return this.salaire_fixe*this.getIndice()+this.nb_vente_du_mois*this.tx_variable;
    }

    
}
