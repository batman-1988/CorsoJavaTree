
public class NumeroPrimo {

	public static void main(String[] args) {
	
        int number = 0;
        System.out.println(isPrime(number));
        number = 1;
        System.out.println(isPrime(number));
        number = 2;
        System.out.println(isPrime(number));
        number = 17;
        System.out.println(isPrime(number));
        number = 631;
        System.out.println(isPrime(number));
        number = 634;
        System.out.println(!isPrime(number));
        number = 999;
        System.out.println(!isPrime(number));
        number = 997;
        System.out.println(isPrime(number));
		
		
	}
	
	 static boolean isPrime(int n)
	    {
	 
	        // se n è minore di 1
	        if (n <= 1)
	            return false;
	 
	        // se n è uguale a 2
	        else if (n == 2)
	            return true;
	 
	        // if n è multiplo di 2 
	        else if (n % 2 == 0)
	            return false;
	 
	        // altrimenti
	        for (int i = 3; i <= Math.sqrt(n); i += 2)
	        {
	            if (n % i == 0)
	                return false;
	        }
	        return true;
	    }
	
	

}
