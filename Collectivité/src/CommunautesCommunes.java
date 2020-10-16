import java.util.ArrayList;

public class CommunautesCommunes extends CollectiviteLocale {
	ArrayList<Commune> listeCollectivite;

	public CommunautesCommunes(String nom, ArrayList<Commune> listeCollectivite) {
		super(nom, 0, 0);
		this.listeCollectivite = listeCollectivite;
	}
}
