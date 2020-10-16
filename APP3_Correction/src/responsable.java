import java.util.ArrayList;

public class responsable extends employe {

    ArrayList<employe> under;

    public responsable(String nom, int indice)  {
        super(nom,indice);
        under=new ArrayList<>();
    }

    public void add(employe u)
    {
        this.under.add(u);
    }


private String getUnder()
{
    String str="";
    for( employe e:this.under)
    {
        str+=e.getNom()+",";
    }
    return str;
}

    @Override
    public String toString() {
        
        return super.toString()+"\r\n{" +
            " inférieur hiérarchique='" + getUnder() + "'" +
            "}";
    }


    
}
