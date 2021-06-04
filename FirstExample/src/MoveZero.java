
public class MoveZero {

	public static void main(String[] args) {
   
		int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
      
        pushZerosToEnd(arr);
        
        System.out.println("Array dopo aver spostato i zero alla fine: ");
        for (int i=0; i<arr.length; i++)
            System.out.print(arr[i]+" ");

	}

	private static void pushZerosToEnd(int[] arr) {
		
		int n= arr.length;

		//conta i numeri di zero
		
		int countZero=0;
		
	    for (int i = 0; i < n; i++) {
            if (arr[i]!= 0)
            	
            	//incrementa count
                arr[countZero++] = arr[i]; 
	    }
		
	    //muovi gli elementi diversi da zero in avanti 
	    //l'indice count viene impostato al primo 0
	    //conta gli elementi 0 fino alla fine
	    

	    while (countZero < n)
            arr[countZero++] = 0;
	    
		
	}

}
