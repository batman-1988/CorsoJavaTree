
public class SommaRicorsiva {

	public static void main(String[] args) {
	
	    int [] a= {1,2,3,4};
		
	   int dim=a.length;
		  
	  int sum=sommaRic(a, dim );
	  
	  System.out.println(sum);
		
	}
	
 public static int sommaRic(int [] array , int n) {
				
		if(n==0) {
			return 0;
		}
		
		return array[n-1] + sommaRic(array,n-1);
	}

	

}
