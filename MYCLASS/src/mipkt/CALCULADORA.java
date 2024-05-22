package mipkt;

import java.util.Scanner;

public class CALCULADORA {

	public static void main(String[] arg) {

		// DECLARACIÓN DE VARIABLES Y OBJETOS
		double operador1 = 0.0, operador2 = 0.0;
		Scanner ent = new Scanner(System.in); // INSTANCIA
		int operacion = 0;

		System.out.println("Introduce el primer operador");
		operador1 = ent.nextDouble();

		System.out.println("Introduce la operacion: \n" + "1º) Suma \n" + "2º) Resta \n" + "3º) Multiplicaion \n"
				+ "4º) Division \n");

		operacion = ent.nextInt();

		if (operacion < 1 || operacion > 4) {
			System.out.println("Error, operacion no valida");
		} else {
			System.out.println("Introduce el segundo operador");
			operador2 = ent.nextDouble();

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

		}
		System.out.println("Fin del programa");
	}
}
