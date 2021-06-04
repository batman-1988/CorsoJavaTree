
public class RemoveDuplicateSortedArray {

	public static void main(String[] args) {
	
		
		   int[] nums = new int[] { 2, 2, 2, 4, 5, 5 ,5 ,7, 9, 10 };
		   
		    int nuovaLength = removeDuplicates(nums);

		    System.out.println("Lunghezza array dopo eliminazione duplicati = " + nuovaLength);

		    System.out.print("Array senza duplicazioni ");
		    for (int i = 0; i < nuovaLength; i++) {
		      System.out.print(nums[i] + " ");
		    }
		    System.out.println();
		  }
	
	
	private static int removeDuplicates(int[] nums) {
		
	    int n = nums.length;

	    /*
	     Questo indice si sposterà solo quando modifichiamo l'array sul posto per includere un nuovo
	     elemento non duplicato.
	    */
	    
	    int j = 0;

	    for (int i = 0; i < n; i++) {
	     
	    	/*
	    	 Se l'elemento corrente è uguale all'elemento successivo, salta l'elemento corrente
	    	 elemento perché è un duplicato.
	    	*/
	    	
	      if (i < n - 1 && nums[i] == nums[i + 1]) {
	        continue;
	      }

	      nums[j++] = nums[i];
	    }

	    return j;
	  }
	
	
	
}

	
	
	
	


