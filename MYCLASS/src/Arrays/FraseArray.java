package Arrays;

import java.util.Scanner;

public class FraseArray {
	
	public static void main(String[] arg) {	
		
		Scanner ent = new Scanner(System.in);
		String frase = "";
		String[] palabras;
		final char ESPACIO = (char)32;
		int size = 1;
		
		System.out.println("Introduce una frase");
		
		frase = ent.nextLine();
		
		if(frase.isBlank()) {
		
			for(int i = 0 ; i < frase.length() ; i++) {
				if(frase.charAt(i) == ESPACIO) {
					size ++;
				}
			}
		
		System.out.println("La frase tiene " + size + " palabras");
		
		palabras = new String[size];
		
		rellenarArray(frase, palabras);
		
		}else {
			System.out.println("La fase no tiene palabras");
		}
		
	}
	
	public static void rellenarArray(String cadena, String[] listaPalabras) {
		
		final char ESPACIO = (char)32;
		int posArray = 0, posUltimaPalabra = 0;
		
		for(int i = 0 ; i < cadena.length() ; i++) {
			if(cadena.charAt(i) == ESPACIO) {
				listaPalabras[posArray] = cadena.substring(0, i);
				posArray ++;
				posUltimaPalabra = i+1;
			}
		}
		
	}

}
