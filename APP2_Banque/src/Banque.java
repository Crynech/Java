import java.util.Scanner;


public class Banque {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choix;
		
		Compte premierCompte = new Compte("Arthur", 1000, 300);
		
		/*
		System.out.println(premierCompte.getClient());
		System.out.println(premierCompte.getSolde());
		System.out.println(premierCompte.getPlafond());
		System.out.println(premierCompte.getNumeroCompte());
		

	
	
		
		System.out.print("Quel est le montant du dépôt ?\n >>> ");
		premierCompte.setSolde(premierCompte.getSolde() + scan.nextFloat());
		System.out.println(premierCompte.getSolde()); 
		*/
		
		System.out.println("Que faire ? \n 1 créer un compte \n 2 opération sur un compte");
		
		
		System.out.println("Que faire ? \n 1 dépôt \n 2 retrait \n 3 afficher solde");
		choix = scan.nextInt();
		switch(choix) {
			case 1:  //dépôt
				System.out.print("Quel est le montant du dépôt ?\n >>> ");
				premierCompte.setSolde(premierCompte.getSolde() + scan.nextFloat());
				break;
			case 2:  //retrait
				System.out.print("Quel est le montant du retrait ?\n >>> ");
				premierCompte.setSolde(premierCompte.getSolde() - scan.nextFloat());
				break;
			case 3:  //afficher le solde
				System.out.println(premierCompte.getSolde());
				break;
		}
	
	
	
	
	}

}
