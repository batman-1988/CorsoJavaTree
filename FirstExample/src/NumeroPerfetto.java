import java.util.Scanner;

public class NumeroPerfetto {

    public static void main(String[] args) {

        System.out.println("Inserisci un numero di cui si vuole ottenere il numero perfetto: ");

        Scanner in = new Scanner(System.in);

        int num= in.nextInt();

       boolean  ok =checkPerfectNumber(num);

        System.out.println(ok);


    }

    private static boolean checkPerfectNumber(int num) {


        for(int i=1; i<num; i++)
        {
            int sum=0;

            for(int j=1; j<=i; j++)
            {
                if(i%j==0)
                   sum=sum+j;

            }
              if(sum==(2*i))
                  System.out.println(i);
                  return true;


        }
         return false;
    }
}
