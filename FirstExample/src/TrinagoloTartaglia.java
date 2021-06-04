import java.util.Scanner;

public class TrinagoloTartaglia {

 public static void main(String [] args){


     System.out.println("Inserire l'altezza del triangolo di tartaglia: ");

     Scanner in= new Scanner(System.in);

      int altezza_tr =in.nextInt();

     tartaglia(1, altezza_tr);


    }


   private  static int tartaglia(int start, int end)
    {
        if(start>=end)
            return 0;
        int number = 1;
        System.out.format("%"+(end-start)*2+ "s","");
        tartaglia2(start,number,0);
        System.out.println();
        return tartaglia(start+1,end);
    }

    private static int tartaglia2(int start, int number,int end)
    {
        if(end>start)
            return 1;
        System.out.format("%4d",number);
        return tartaglia2(start,number * (start - end) / (end + 1),end+1);
    }


}
