import java.util.Scanner;

public class InvertiStringa {

	public static void main(String[] args) {
	
		System.out.println("Inserisci una stringa da invetire: ");
		
		Scanner in = new Scanner(System.in);
		
		String a= in.nextLine();
		
		reverseString(a);
		
		
	}

	private static void reverseString(String a) {
		
		char[] ch = a.toCharArray();
	    int begin = 0;
	    int end = ch.length-1;
	    char temp;
	    while(end > begin){
	        temp = ch[begin];
	        ch[begin] = ch[end];
	        ch[end] = temp;
	        end--;
	        begin++;
	    }
	    a = new String(ch);
	    System.out.println(a);
	}

	}
		
	

