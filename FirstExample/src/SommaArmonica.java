import java.util.Scanner;

public class SommaArmonica {

	public static void main(String[] args) {
	
		
		double sommaSerie=0;
		
		int numTerm;
		Scanner lett = new Scanner(System.in);
		
		System.out.print("inserisci il numero di termini: ");
		numTerm = lett.nextInt();

		
		int i=1;
		
		while(i<= numTerm)
		{
			sommaSerie = sommaSerie + ((double) 1)/i;
			i++;
		}
		System.out.println("la somma dei primi "+numTerm+" e' "+sommaSerie);
	}

	}


