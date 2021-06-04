import java.util.Scanner;

public class SommaDiagonaleMatrice {

	public static void main(String[] args) {
	
		
	  int [][] matrix= new int[][] {
		                            {1,7, 0,-1},
		                            {-1,3,8,5},
		                            {2,0,-2,4},
		                            {6,1,5,9} };	
		                            
		
		System.out.println("Che somma vuoi effettuare? ");
	
		Scanner sc= new Scanner(System.in);
		
		 boolean scelta=sc.nextBoolean();
		
		                            
		                            
    // stampa tutti gli elementi della matrice                      
	    printMatrix(matrix);
	 
	    
	   if(scelta==true)
	   {	   
	    
	 // somma degli elementi sulla diagonale da sinistra a destra   
	    sommaDiagonaleSxDx(matrix);
	   }else
		   
	   {
	 // somma degli elementi sulla diagonale da destra a sinistra   
	    sommaDiagonaleDxSx(matrix);
	    
	   }
	    
	    

	}

	
	private static void sommaDiagonaleDxSx(int[][] matrix) {
		
	
		int sommaDiagDxSx = 0;
		
		int k = matrix.length-1;
		
		for(int i=0; i<matrix.length; i++)
		{
			sommaDiagDxSx = sommaDiagDxSx + matrix[i][k];
			k--;
		}
		System.out.println("La somma della diagonale secondaria e' "+sommaDiagDxSx);
		}
		
		
		
	

 
	private static void sommaDiagonaleSxDx(int[][] matrix) {
	  
		
	 
				int sommaDiagSxDx = 0;
				
				for(int i=0; i<matrix.length; i++)
				{
					sommaDiagSxDx = sommaDiagSxDx + matrix[i][i];
				}
				System.out.println("La somma della diagonale principale e' "+sommaDiagSxDx);
				
		
		
	}

	private static void printMatrix(int [][] matrice) {
	
	
				for(int i=0; i<matrice.length; i++)
				{
					for(int j=0; j<matrice[i].length; j++)
					{
						System.out.print("\t"+matrice[i][j]);
					}
					System.out.println();
				}
				
		
		
	}

}
