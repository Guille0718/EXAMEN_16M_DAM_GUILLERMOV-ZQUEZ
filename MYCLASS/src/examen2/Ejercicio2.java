package examen2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
		
	public static void main(String[] arg) {
		
		Scanner ent = new Scanner(System.in);
		System.out.println("Introduzca una frase: ");
		String frase = ent.nextLine().toLowerCase();

		int[] vocales = new int[5];
		
		for(int i = 0 ; i < frase.length() ; i++) { //Se pone parentesis cuando es un método por ejemplo(.length())
			
			char letra = frase.charAt(i);
			
			if(letra == 'a') {
				vocales[0]++;				
				} else if(letra == 'e') {				
					vocales[1]++;
				} else if(letra == 'i') {
					vocales[2]++;
				} else if(letra == 'o') {
					vocales[3]++;
				} else if(letra == 'u') {
					vocales[4]++;
				}		
			} //Se puede hacer con switch
			
			System.out.println("Array: \n" + Arrays.toString(vocales));
			
			System.out.println("Recuento: ");
			System.out.println("A: " + vocales[0]);
			System.out.println("E: " + vocales[1]);
        	System.out.println("I: " + vocales[2]);
        	System.out.println("O: " + vocales[3]);
        	System.out.println("U: " + vocales[4]);
    	}		
}


