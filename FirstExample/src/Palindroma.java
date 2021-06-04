import java.util.Scanner;

public class Palindroma {

	public static void main(String[] args){
	
	
		Scanner in= new Scanner(System.in);
		System.out.println("Inserire parola/frase/numeri da controllare se sia Palindroma:");
		String word = in.nextLine();
		boolean isPalindroma = isPalindroma(word);
		if(isPalindroma){
			System.out.println("La parola/frase/numeri '"+word+"' � Palindrima");			
		}else{
			System.out.println("La parola/frase/numeri '"+word+"' NON � Palindrima");		
		}
	}
	

	public static boolean isPalindroma(String word) {
		if(word == null) 
			return false;
		
		
		word = word.toLowerCase().replaceAll("\\s", "");
		
		//Se la parole � di un solo carattere allora sar� sicuemente palindroma
		if(word.length() < 2)  
		    return true;
		
		
		boolean palindroma = true;
		int startIndex = 0;
		int endIndex = word.length()-1;
		
	
		for(; startIndex < endIndex; startIndex++, endIndex-- ) {
			/* Ad ogni iterazione controllo i due valori che si 
			   trovano nelle posizioni puntate dai due indici.
			   Se sono diversi il contenuto di 'word' non sar� palindroma */
			if(word.charAt(startIndex) != word.charAt(endIndex)) {
				palindroma = false;
				break;
			}
		}
		
		return palindroma;
	}
		
}
