import java.util.Arrays;
import java.util.Scanner;

public class MinimoMassimo {

	public static void main(String[] args) {
	
	    Scanner sc=new Scanner(System.in);
        System.out.print("Enter numbers (comma-separated):");
        String a = sc.nextLine(); 
        int[] values = parseNumbers(a);
       computeMinAndMax(values);
		
	}

	private static void computeMinAndMax(int[] values) {
		
		Arrays.sort(values);
		
	  	System.out.println(Arrays.toString(values));

		
	}

	private static int[] parseNumbers(String a) {
		
	
		   String [] strnumbers = a.split(",");
		   
		    int[] vint = new int[strnumbers.length];

		    for (int i = 0; i < strnumbers.length; i++)
		        vint[i] = Integer.parseInt (strnumbers[i]);

		    return vint;
	 
	
		
	
	}

}
