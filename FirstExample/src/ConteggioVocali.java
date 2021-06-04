import java.util.Scanner;

public class ConteggioVocali {
	
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		
		String stringa=sc.nextLine();
		
		
		// conteggia
		contaVocaliConsonanti(stringa);
		
		
		
}
	
public static void contaVocaliConsonanti(String stringa) {
		
		int count_Vocali=0;
		
		int count_Consonanti=0;
		
		
		for(int i=0;i<stringa.length();i++){
			
		
   	        switch(stringa.charAt(i)){
		
		     case 'a': count_Vocali++;
		      break;
		
	         case 'e': count_Vocali++;
	         break;
		
	      	case 'i': count_Vocali++;
	      	break;
		
		    case 'o': count_Vocali++;
		    break;
		
		   case 'u':count_Vocali++;
		   break;

		   default: count_Consonanti++;
		
	
		    }
		 }
		
		
		System.out.println("il numero di vocali sono "+ count_Vocali + "e il numero di consonanti sono "+ count_Consonanti);
		
   }
}
