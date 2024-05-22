package metodos;

import java.util.Scanner;

public class MayusAMinus {
	
	public static void main(String[] arg) {
		
		Scanner ent = new Scanner(System.in);
		String cadena = "";
		
		System.out.println("Introduce una frase");
		cadena = ent.nextLine();
		
		System.out.println("La cadena original \"" + cadena + "\" a mayúsculas es " + cambiaMayusculas(cadena));
		
		System.out.println("La cadena tiene " + cuentaLetras(cadena) + " letras de " + cadena.length() + " caracteres");
		
	}			
	
	public static int cuentaLetras(String cadena) {
		
		int letras = 0;
		final char ESPACIO = ' ';
		
		for(int i=0 ; i < cadena.length() ; i++) {
			
			if(!Character.isDigit(cadena.charAt(i)) && cadena.charAt(i) != ESPACIO) {
				
				letras++;
			}
		}
		
		return letras;
	}
		
	public static String cambiaMayusculas(String cadena) {
			
		return cadena.toUpperCase();
		}
}
