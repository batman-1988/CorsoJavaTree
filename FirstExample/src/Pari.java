import java.util.Scanner;

public class Pari {
	
	

	public static void main(String[] args) {

     System.out.println("inserisci un numero:");
     
     Scanner sc= new Scanner(System.in);

      int numero=sc.nextInt();
        
           
 	System.out.println("Il numero " + numero + " è pari? " + ePari(numero));
 	
	}
	
	
	// calcola se il numero è pari
 	public static boolean ePari(int numero) {
 		if ((numero % 2) == 0) {
 			return true;
 		} else {
 			return false;
 		}
 	}

	}


