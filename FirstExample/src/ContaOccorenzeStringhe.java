
public class ContaOccorenzeStringhe {

	 public static void main(String[] args) {
		 
			char a = 'a';
			String frase = "casa";
			int n_volte = 0;

			for (int i=0; i < frase.length(); i++){
			    if (frase.charAt(i) == a){
			        n_volte ++;
		        }
		    }
				System.out.println(n_volte);

   }
}
