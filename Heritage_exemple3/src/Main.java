
public class Main {

	public static void main(String[] args) {
		Employe e1 = new Employe("france", 1, 10);
		Employe e2 = new Employe("marc", 2, 8);

		//System.out.println(e1);
		Responsable resp1 = new Responsable("Patrick", 3, 12, e1);
		System.out.println(resp1.getSubord());
		//resp1.addSub(e2);
		//System.out.println(resp1.getSubord());
	}

}
