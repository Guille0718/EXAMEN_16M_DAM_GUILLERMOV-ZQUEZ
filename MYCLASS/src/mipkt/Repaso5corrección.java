package mipkt;

import java.util.Scanner;

public class Repaso5corrección {

	public static void main(String[] arg) {

		Scanner ent = new Scanner(System.in);
		int num = 0, total = 0, tPos = 0, tNeg = 0;
		int mayor = 0, menor = 0, contador = 0;
		double media = 0.0;

		// VAMOS PIDIENDO NÚMEROS
		do {
			System.out.println("Introduce un número");
			num = Integer.parseInt(ent.nextLine());

			// DISCRIMINO EL NÚMERO DE PARADA
			if (num != -1) {
				if (contador == 0) {
					mayor = num;
					menor = num;
				}

				// INCREMENTAMOS EL CONTADOR
				contador++;

				total += num;
				if (num >= 0) {
					tPos += num;
				} else {
					tNeg += num;
				}

				// COMPARAMOS CON EL MAYOR
				if (num > mayor) {
					mayor = num;
					// COMPARAMOS CON EL NÚMERO MENOR
				} else if (num < menor) {
					menor = num;
				}
			}

		} while (num != -1);

		// MEDIA
		if (contador == 0) {
			System.out.println("Adiós");
		} else {
			media = (double) total / contador;// FUNCIONA ASÍ PORQUE SE CASTEA LA MEDIA COMO DOUBLE QUE ES PARA USAR
												// DECIMALES
			System.out.println("El mayor número introducido es: " + mayor);
			System.out.println("El menor número introducido es: " + menor);
			System.out.println("La suma de todos los números es: " + total);
			System.out.println("La suma de los números positivos es: " + tPos);
			System.out.println("La suma de los números negativos es: " + tNeg);
			System.out.println("La media de la suma es: " + media);

		}
	}

}
