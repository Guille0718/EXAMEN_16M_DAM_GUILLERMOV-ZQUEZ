package mipkt;

import java.util.Scanner;

public class ParesImpares {

	public static void main(String[] arg) {

		// DECLARACIÓN DE VARIABLES
		Scanner ent = new Scanner(System.in);
		int totalPares = 0, totalImpares = 0, numero = 0;

		while (numero != -1) {

			// PEDIRMOS EL NÚMERO
			System.out.println("Introduce un número");
			numero = ent.nextInt();

			// CONTAMOS LOS PARES E IMPARES
			if (numero % 2 == 1) {
				
				totalPares++;
			} else if (numero % 2 != -1) {
				totalImpares++;
			}

		}
		System.out.println("Pares: " + totalPares);
		System.out.println("Impares: " + totalImpares);
	}

}
