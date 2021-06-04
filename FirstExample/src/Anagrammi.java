import java.util.Arrays;
import java.util.Scanner;

public class Anagrammi {

	public static void main(String[] args) {

	       Scanner sc=new Scanner(System.in);
	       
	        System.out.print("Enter string a:");
	        String a = sc.nextLine();
	        System.out.print("Enter string b:");
	        String b =sc.nextLine();
	        anagrams(a, b);

	}

	private static void anagrams(String a, String b) {
	
		 
        int n1 = a.length();
        int n2 = b.length();
  


        char[] str1=a.toCharArray();
        
        Arrays.sort(str1);
        
        
        char[] str2=b.toCharArray();
        
        Arrays.sort(str2);
        
     
        //converte di nuovo gli array di caratteri in stringhe
         
        String stringa1 = new String(str1);
        
        String stringa2= new String(str2);
        
    
        
      
      
     if(stringa1.equalsIgnoreCase(stringa2) ) {
    	 System.out.println("anagrammi");
     }
     else    
    	 
    	 //se la lunghezza delle stringhe e lo stesso
    	 //non sono anagrammi
     {
    	 System.out.println("non anagrammi");
     }
   
     
      

 
  }
	
}	
