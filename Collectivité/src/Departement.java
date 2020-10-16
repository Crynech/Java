import java.util.ArrayList;

public class Departement extends CollectiviteLocale {
	ArrayList<CommunautesCommunes> listeCommunautesCommunes;

	public Departement(String nom, ArrayList<CommunautesCommunes> listeCommunautesCommunes) {
		super(nom, 0, 0);
		this.listeCommunautesCommunes = listeCommunautesCommunes;
	}

}
