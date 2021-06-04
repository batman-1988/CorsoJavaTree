import java.util.Arrays;

/*
public class MergeSortArray {
    public static void mergeArrays(int[] arr1, int[] arr2, int n1,
                                int n2)
    {
    	
    	
        int i = 0, j = 0, k = 0;
     
        // visita entrambi gli array
        while (i<n1 && j <n2)
        {
            // controlla se l'elemento corrente del primo array 
            // e piu piccolo dell'elemnto corrente del secondo array
            // se e vero, allora memorizza il primo elemento e incrementa 
            // l'indice i, altrimneti fai la stessa cosa sul secondo array
         
            if (arr1[i] < arr2[j])
                temp[k++] = arr1[i++];
            else
                temp[k++] = arr2[j++];
        }
     
        // memorizza gli elementi rimanenti del primo array
        while (i < n1)
            temp[k++] = arr1[i++];
     
        // memorizza gli elementi rimanenti del secondo array
        while (j < n2)
            temp[k++] = arr2[j++];
    }
     
    public static void main (String[] args)
    {
    	
    
        int[] arr1 = {1, 3, 5, 7};
        int n1 = arr1.length;
     
        int[] arr2 = {2, 4, 6, 8};
        int n2 = arr2.length;
     
    	int[] arr3 = new int[n1+n2];
 
        mergeArrays(arr1, arr2, n1, n2);
     
        System.out.println("Array dopo la fusione");
        for (int i=0; i < n1+n2; i++)
            System.out.print(arr3[i] + " ");
    }
	
	
}
*/