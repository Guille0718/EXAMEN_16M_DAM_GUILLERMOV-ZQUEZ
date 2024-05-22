package metodos;

import java.util.Scanner;

public class CuentaVocal {
	
	public static void main(String[] arg) {
		
		Scanner ent = new Scanner(System.in);
		String cadena = "";
		
		System.out.println("Introduce una frase");
		cadena = ent.nextLine();
		
		System.out.println("La cadena tiene " + ContarVocales(cadena) + " vocales");
		
		ContarVocales(cadena);
	}
	
	public static int ContarVocales(String cadena) {
		
		int numVocales = 0;
		
		cadena = cadena.toLowerCase();
		
		for (int i = 0; i < cadena.length(); i++ ) {
			if(cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o' || cadena.charAt(i) == 'u') {
				
				numVocales++;
				
			}
		}
		
		return numVocales;
		
		//HACER EJERCICO PARA PASAR TODA LA FRASE A MAYUSCULAS  Y OTRO A MINISCULAS
	}

}
