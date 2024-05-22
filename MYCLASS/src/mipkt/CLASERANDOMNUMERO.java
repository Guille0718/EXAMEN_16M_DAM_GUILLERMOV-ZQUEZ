package mipkt;

import java.util.Scanner;

public class CLASERANDOMNUMERO {

	public static void main(String[] arg) {

		// INT NUM ENTERO ENTRE 0-100 CON 10 INTENTOS Y ¿NUM A ADIVINAR? "ES MAYOR" O
		// "ES MENOR"

		// DECLRACION E INICIALIZACION
		int numero = 0, numAdivinar = 0, intentos = 10;
		Scanner ent = new Scanner(System.in);
		boolean ganado = false;

		// ALGORITMO PRINCIAL INTRODUCIMOS MANUALMENTE
//	System.out.println("Introduce un número entre 0 y 100");
//	numero = ent.nextInt();

		/*
		 * GENERAR UN NUMERO ALEATORIO ENTRE 0 Y 100 NUMERO RANDOM
		 */

		numero = (int) (Math.random() * 101);

		do {
			System.out.println("Introduce el número a adivinar");
			numAdivinar = ent.nextInt();

			if (numero > numAdivinar) {
				System.out.println("El número oculto es mayor");
			} else if (numero < numAdivinar) {
				System.out.println("El número oculto es menor");
			} else {
//			System.out.println("Has ganado");
				ganado = true;
			}
			intentos--;
//	}while((numero != numAdivinar) && (intentos > 0)); //PROGRAMA SIN BOOLEAN
		} while ((!ganado) && (intentos > 0)); // EXCLAMACIÓN = NEGACIÓN

		if (ganado) {
			System.out.println("Has ganado");
		} else {
			System.out.println("Has perdido, el numero era " + numero);
		}
//		System.out.println("El número era " + numero); //SIN BOOLEAN

	}// FIN MAIN
}// FIN CLASE