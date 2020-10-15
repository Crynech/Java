package exo;

import java.util.Scanner;

public class exo2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Entrez 1 si vous voulez convertir litre>gallon \nEntrez 2 si vous voulez vonvertir gallon>litre ");
		

	    int unit = scan.nextInt();  // Read user input
	    
	    if (unit == 1 ) 
	    {
	    	 System.out.println("Valeur à convertir: " );	
	    	 float valeur = scan.nextFloat();
	    	
	    	 System.out.println(valeur + " litre(s)  = " + valeur * 3.78541  + " gallon(s)");
	    }
	    
	    
	    if (unit == 2 ) 
	    {
	    	 System.out.println("Valeur à convertir: " );	
	    	 float valeur = scan.nextFloat();
	    	
	    	 System.out.println( valeur + " gallon(s) =" + valeur * 0.264172   +  "  litre(s)");
	    }
	    
	    
		
		
		
		

	}

}
