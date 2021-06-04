import java.util.Scanner;

public class ComparaStringhe {

	public static void main(String[] args) {
		
		String a = "Hello";
		
		String b = "World";
		
		String c = "abcnd";
		
		
         //se A==B e A==C stampa  il valore 3   
		if (a.equalsIgnoreCase(b) && a.equalsIgnoreCase(c)) 
		{
			System.out.println(3);
		
	    //se A==B oppure A==C oppure B==C stampa il valore 2
		} else if(a.equalsIgnoreCase(b) || a.equalsIgnoreCase(c) || b.equalsIgnoreCase(c))
		{
			
			System.out.println(2);
			
		// se non sono verificate le condizioni precedenti	
		}else 
		{
			System.out.println("le Stringhe sono diverse!!"+a +b +c);
		}
	}

		
		

}
