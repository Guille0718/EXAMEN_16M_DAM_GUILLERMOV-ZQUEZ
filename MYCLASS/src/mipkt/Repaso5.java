package mipkt;

import java.util.Scanner;

public class Repaso5 {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);
		int num, total = 0, sumaPositivos = 0, sumaNegativos = 0, mayor = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
		double media;
		int contador = 0;
		boolean run = true;

		System.out.println("Introduzca números (teclea -1 para terminar): ");

		while (run) { // PARA METER EN UN WHILE EL VALOR TRUE HAY QUE CREAR UN BOOLEAN
			num = ent.nextInt();

			if (num == -1) {
				break;
			}

			total += num;
			contador++;

			if (num > mayor) {
				mayor = num;
			} else if (num < menor) {
				menor = num;
			} else if (num > 0) {
				sumaPositivos += num;
			} else if (num < 0) {
				sumaNegativos += num;
			}
		}

		media = (double) total / contador;

		System.out.println("El mayor número introducido es: " + mayor);
		System.out.println("El menor número introducido es: " + menor);
		System.out.println("La suma de todos los números es: " + total);
		System.out.println("La suma de los números positivos es: " + sumaPositivos);
		System.out.println("La suma de los números negativos es: " + sumaNegativos);
		System.out.println("La media de la suma es: " + media);
	}

}
