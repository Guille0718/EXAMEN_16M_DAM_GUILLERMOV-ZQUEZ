package mipkt;

import java.util.Scanner;

public class Repaso4 {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);
		System.out.println("Introduzca una frase: ");
//        String frase = ent.nextLine();
		String frase = "", palabras = "";
		char separador = ' ';
		frase = ent.nextLine();

		// CODIGO HECHO CON .SPLIT

//        String[] palabras = frase.split(" "); //EL .SPLIT DEVUELVE STRING[]

//        for(String palabra: palabras) {
//            System.out.println(palabra);
//        }
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == separador) {
				System.out.println(palabras);
				palabras = "";
			} else {
				palabras += frase.charAt(i);
			}
		}
		System.out.println(palabras);
	}

}
