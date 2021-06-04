import java.util.Arrays;
import java.util.Scanner;

public class Fattoriale {

	public static void main(String[] args) {
		
		
		 Scanner sc=new Scanner(System.in);
		 
	        System.out.print("Enter index:");
	        
	        int number =sc.nextInt();
		   	        
		    fibonacci(number);
		   

	}
		
		   static void fibonacci (int n)
		    {
		      
		    int f[] = new int[n+2]; 
		    int i;
	  
		    // il primo e il secondo elemnto della serie sono 0 e 1 
		    f[0] = 0;
		    f[1] = 1;
		     
		    for (i = 2; i <= n; i++)
		    {
		      //somma  i due elementi della serie in posizione i-1 e i-2 
		        f[i] = f[i-1] + f[i-2];
		        
		        System.out.println(f[i]);  
		    }
		      
		 
		   }
		      
}

