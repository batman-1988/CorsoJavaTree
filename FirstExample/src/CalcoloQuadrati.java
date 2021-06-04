import java.util.Scanner;

public class CalcoloQuadrati {

	public static void main(String[] args) {
		
		
	     System.out.println("inserisci un numero:");
	     
	     Scanner sc= new Scanner(System.in);
	     
	     int number=sc.nextInt();
	     

	     
	     System.out.println(square(number));

	}

	private static int square(int number) {
	
		int somma_dispari=0;
		
		for(int i=1; i<number; i++) {
			
			if((i % 2) != 0) //se e dispari aggiungi alla somma
			{
			    
	            somma_dispari+=i;
	            // System.out.println(somma_dispari);
	       
			} 
			
		
		}

		return somma_dispari;

	}

}
