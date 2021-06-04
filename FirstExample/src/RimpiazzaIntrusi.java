
public class RimpiazzaIntrusi {

	public static void main(String[] args) {
		
		String a = "a";
		String b = "b";
		String c = "a abc d";
	
	
		//divide la stringa c in immetendo piu spazi
		String[] parti = c.split(" ");
		
		String part1 = parti[0];
		
		String part2 = parti[1];
		
		String part3 = parti[2];
	
		// rimpiazza il carattere a con b
		String nuova = part2.replaceAll("a" ,"b");
		System.out.println("la nuova parte: " + nuova);
		
		//concatena la stringa rimpiazzata con la nuova 
		String str3= part1.concat(" " + nuova + " " + part3);
		System.out.println("la nuova stringa :" + str3);
		
	}


	}


