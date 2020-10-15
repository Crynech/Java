import java.util.ArrayList;

public class Responsable extends Employe {
	private ArrayList<Employe> subord = new ArrayList<>();

	public Responsable(String nom, int matricule, int indice_salarial, Employe subord) {
		super(nom, matricule, indice_salarial);
		this.subord.add(subord);
	}
	
	public void addSub(Employe sub) {
		this.subord.add(sub);
	}

	public ArrayList<Employe> getSubord() {
		return subord;
	}

	

}
