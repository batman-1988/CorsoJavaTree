import java.util.Scanner;

public class PrimoProgramma {

	public static void main(String[] args) {
		
		
			
		Scanner scan= new Scanner(System.in);

	
	
		System.out.println("Enter a:");
		
		int num1=scan.nextInt();
		
	 	
		System.out.println("Enter b:");
		
	     int num2=scan.nextInt();	
	     
	     System.out.println("Scegli l'operazione da eseguire ");
	     
	    
	     // scegli tipo di operazione e restituisci il risultato stampandolo sulla console
	     
	     String op=scan.next();
	     
	    int risultato= calcolaOperazione(num1, num2, op);
	 
	    System.out.println("Il risultato e:"+ risultato);
	     
	     
	}	
	

	private static int calcolaOperazione(int n1, int n2, String op) {
		
		int result = 0;
		

		switch(op) {
		  case "+":
			  
			  result=somma( n1,  n2);
		    
		    break;
		    
		  case "-":
			  
			  result=sottrazione( n1,  n2);
			  
		    break;
		    
		  case "*":   
			  
			  result=moltiplicazione( n1,  n2);
              
			 break; 
			 
		  case "/":
			  
			  result=divisone( n1,  n2);
			 
			  break;
		}
		
		return result;


	}

	private static int divisone(int num1, int num2) {
		
		return num1/num2  ;
	}

	private static int moltiplicazione(int num1, int num2) {
	
		return num1 * num2;
	}

	private static int sottrazione(int num1, int num2) {
	
		return num1 - num2;
	}

	private static int somma(int num1, int num2) {
	
		return num1+num2;
	}
	
	
	


	    
	 	
		
		
	
	
}
