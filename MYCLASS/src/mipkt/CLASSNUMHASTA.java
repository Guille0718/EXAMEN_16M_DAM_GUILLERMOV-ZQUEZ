package mipkt;

import java.util.Scanner;

public class CLASSNUMHASTA {

	public static void main(String[] arg) {

		Scanner ent = new Scanner(System.in);// EJERCICIO PARA SOLICITAR X NUMERO HASTA -1
		double totalSuma = 0.0, introducido = 0.0;

		do {
			System.out.println("introduce un número entero, -1 para salir");
			introducido = ent.nextDouble();

			if (introducido != -1) {
				totalSuma += introducido;
			}

		} while (introducido != -1);
		System.out.println("Totales= " + totalSuma);

		System.out.println("Saliste del bucle");
	}

}
