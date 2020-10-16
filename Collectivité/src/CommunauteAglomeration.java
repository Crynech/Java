import java.util.ArrayList;

//import java.util.ArrayList;

public class CommunauteAglomeration extends CommunautesCommunes {

	public CommunauteAglomeration(String nom, ArrayList<Commune> listeCollectivite) {
		super(nom, listeCollectivite);
		try {

			

		} catch (Exception e) {
			
			if (temp)
			System.out.println("Population trop faible");
		}
	}
	public testPopulation() {
		int temp = 0;
		for (Commune i : listeCollectivite) {
			temp += i.getPopulation();
		}
	}
}
