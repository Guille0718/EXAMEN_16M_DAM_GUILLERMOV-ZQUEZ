package mipkt;

import java.util.Scanner;

public class CalseEnvolvernte {

	public static void main(String[] args) {

//		System.out.println("Valor mínimo: " + Integer.MIN_VALUE); //System.out.println("Máximo y mínimo valor para un tipo de dato int:");
//		System.out.println("Valor máximo: " + Integer.MAX_VALUE); //ESTA EN MAYUSCULAS Y AZUL PORQUE ES UNA CONSTANTE

//		int numero = 2147483647;

		// Ejemplo de uso de la clase Character: programa que lee un texto por teclado
		// muestra cuántos dígitos y letras contiene.

//		Scanner sc = new Scanner(System.in);

//		String texto;

//		int cuentaCifras = 0, cuentaLetras = 0;

//		System.out.println("Introduce texto ");

//		texto = sc.nextLine();

//		for (int i = 0; i < texto.length(); i++) {

//		if (Character.isDigit(texto.charAt(i))) {

//		cuentaCifras++;

//		} else if (Character.isLetter(texto.charAt(i))) {

//		cuentaLetras++;

//		}

//		}

//		System.out.println("El texto contiene " + cuentaCifras + " dígitos");

//		System.out.println("El texto contiene " + cuentaLetras + " letras");

		Scanner ent = new Scanner(System.in);

		System.out.println("Introduzca un número");
//		int num = ent.nextInt();
//		ent.nextLine(); //SE AÑADE PARA QUE DEJE ESCRIBIR CUANDO PIDA UN DATO NUMÉRICO

		String entradaTeclado = ent.nextLine();
		int num = Integer.parseInt(entradaTeclado); // STRING CONVERTIDO A PARSEINT

		System.out.println("Introduce tu nombre");
		String nombre = ent.nextLine();

		System.out.println("Nombre: " + nombre + " ,Número: " + num);

	}

}
