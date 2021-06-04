import java.util.Scanner;

public class CifrarioCesare {
	
	public static void main(String[] args)
	{
   
		System.out.println("Inserire la stringa da crittare");
		
		Scanner sc= new Scanner(System.in);
		
		String parola= sc.next();
		
		
		int key=3;
		
		
		
		String textCrypt=critta(parola, key);
		
		System.out.println(textCrypt);
		
		          
		

}

	

	private static String critta(String parola, int key) {
		
		final String ALFABETO="ABCDEFGHIJKLMNOPQRSTUVWXYZhh";
		
		parola=parola.toUpperCase();
		
		String testoCifrato="";
		
		for(int i=0; i<parola.length(); i++)
		{
			
			int charPosition=ALFABETO.indexOf(parola.charAt(i));
			
			int keyVal= (key + charPosition ) % 26;
			
			char replaceVal= ALFABETO.charAt(keyVal);
			
			testoCifrato +=replaceVal; 
			
		}
		
		return testoCifrato;
		
		
		
		
	}
}