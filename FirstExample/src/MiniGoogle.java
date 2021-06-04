import java.util.Scanner;

public class MiniGoogle {

	public static void main(String [] args) {
		
		   System.out.println("inserisci al dimensione dell' array: ");
		     
		     Scanner sc= new Scanner(System.in);

		      int D=sc.nextInt();
		     
	   
		      PrendiInput(D);
		      	         
		     
	}

	private static void PrendiInput(int dimensione) {
		
	      int [] numbers= new int[dimensione];
		 
	      
	      for(int i=0; i<numbers.length; i++) 
	      {
	    	  System.out.println("Inserire un numero:");
	    	  
	    	  Scanner s= new Scanner(System.in);
	    	  
	    	  numbers[i]=s.nextInt();
	    	          
	      }
	      
	      
	      // stampa l'array con i valori inseriti
	        printArray(numbers);
	        
	        
	       if( ricercaNumero(numbers)) {
	    	   
	    	   System.out.println("Elemento trovato!");
	       }
	       else
	       {
	    	 System.out.println(" Elemento non trovato");   
	       }
	        
	        
	        
	}

	private static void printArray(int[] numbers) {

		System.out.println("I numeri inseriti sono :");
		
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}

	
	private static boolean ricercaNumero(int[] array) {
		
		System.out.println("Inserire un numero da ricercare:");
		
		Scanner s= new Scanner(System.in);
		
		 int number =s.nextInt();
		
		for(int i=0; i<array.length; i++) {
			
			if(number==array[i]) {
				return true;
			}
			
		}
		return false;
		
		
	}
	
	

	
}
