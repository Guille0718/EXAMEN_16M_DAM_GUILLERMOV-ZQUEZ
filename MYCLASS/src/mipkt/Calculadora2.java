package mipkt;

import java.util.Scanner;

public class Calculadora2 {

	public static void main(String[] arg) {

		// DECLARACIÓN DE VARIABLES
		float operador1 = 0.0f, operador2 = 0.0f;
		int operacion = 0;
		Scanner ent = new Scanner(System.in); // ENTRADA DE DATOS

		do {
//			System.out.println("Introduce el primer operador"); //ESTO TAMBIEN ES VALIDO
//			operador1 = ent.nextFloat();

			System.out.println("Introduce la operacion: \n" + "1º) Suma \n" + "2º) Resta \n" + "3º) Multiplicaion \n"
					+ "4º) Division \n" + "0) Salir");

			operacion = ent.nextInt();

			if (operacion >= 1 && operacion <= 4) {
				System.out.println("Introduce el primer operador");
				operador1 = ent.nextFloat();
				System.out.println("Introduce el segundo operador");
				operador2 = ent.nextFloat();

				switch (operacion) {
				case 1:
					System.out.println(operador1 + " + " + operador2 + " = " + (operador1 + operador2));
					break;

				case 2:
					System.out.println(operador1 + " - " + operador2 + " = " + (operador1 - operador2));
					break;

				case 3:
					System.out.println(operador1 + " * " + operador2 + " = " + (operador1 * operador2));
					break;

				case 4:
					System.out.println(operador1 + " / " + operador2 + " = " + (operador1 / operador2));
					break;

				}

			} else if (operacion != 0) {
				System.out.println("Error, operción no valida");
			} else {
				System.out.println("Adios");
			}

		} while (operacion != 0); // SALIMOS CON LA OPCIÓN 0

		System.out.println("Fin");
	}

}
