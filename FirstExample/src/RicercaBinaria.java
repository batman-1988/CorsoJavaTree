import java.util.Scanner;

public class RicercaBinaria {

    public static void main(String[] args) {

        int[] a = {1, 7, 2, 3, 4, 5, 10, 40};

        int n = a.length;

        System.out.println("Inserisci il numero da cercare: ");

        Scanner sc=new Scanner(System.in);

        int elem= sc.nextInt();


        int result = binarySerach(a, elem);

        System.out.println(result);
    }

    private static int binarySerach(int[] arr, int elem) {

        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

              //controla se elem e presente in mezzo
            if (arr[m] == elem)
                return m;

             //controlla se elem è magggiore, ignora la parte destra
            if (arr[m] < elem)
                l = m + 1;

             //altrimenti se elem è minore, ignora la parte sinistra
            else
                r = m - 1;
        }


        return -1;
    }


}
