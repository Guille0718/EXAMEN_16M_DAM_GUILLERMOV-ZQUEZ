package mipkt;

import java.util.Scanner;

public class ClaseCadenas {

	public static void main(String[] arg) {

		// EJEMPLO DE STRINGS

//		String cadena = "Hola";

//		char letra = cadena.charAt(3); //SE EMPIEZA A CONTAR DESDE 0 NO DESDE 1

		// EJEMPLO CONCATENACIÓN
//		String cadena2 = cadena.concat(" Mundo"); //DECLARAR OTRA STRING DIFERENTE PARA QUE CONCATENE
//		String cadena3 = cadena + " Mundo"; //EL + SUSTITUYE AL MÉTODO CONCAT

//		System.out.println(cadena.concat(" Mundo"));
//		System.out.println(cadena2);
//		System.out.println(cadena3);

		// EJEMPLO DE LONGITUD DE UNA CADENA

//		System.out.println("Número de caracteres " + cadena.length());

		// ESCRIBIR UNA CADENA CUALQUIERA Y MOSTRAR CADA CARACTER EN UNA LÍNEA

//		System.out.println("Introduce texto ");

//		String cadena = ent.nextLine();
//		System.out.println("Tiene " + cadena.length() + " caracteres");

//		String mayusculas = cadena.toUpperCase(); //PARA PONER EN MAYUSCULAS

//		System.out.println(cadena + " - " + mayusculas);

//		for(int i=0 ; i < cadena.length() ; i++) {	
//			System.out.println("Posicion: " + i + " ->" + cadena.charAt(i));
//		}	

		// OTRO EJERCICIO

//		System.out.println("Introducir un decimal");
//		String cadena = ent.nextLine();

//		cadena = cadena.replace(",", ".");
		// CADENA = 3,14f
//		float num = Float.parseFloat(cadena);
//		System.out.println(num);

		// COMPARACIÓN DE CADENA DE CARACTERES

//		Scanner ent = new Scanner(System.in);

//		String miCadena = "Hola";

//		System.out.println("Introduce la palabra \"Hola\"");

//		String entrada = ent.nextLine();

		// COMPARACION CASE SENSITIVE

//		if(miCadena == entrada) {
//		if(miCadena.equals(entrada)) {
//			System.out.println("Todo bien");
//		}else {
//			System.out.println("Algo ha fallado");
//		}

		// COMPARACIÓN NO SENSIBLE A MAY Y MIN.

//		if(miCadena.equalsIgnoreCase(entrada)) {
//			System.out.println("Todo bien ignore");
//		}else {
//			System.out.println("Algo ha fallado ignore");
//		}

		// INTRODUCIR UNA FRASE Y MOSTRAR EL TOTAL DE VOCALES y NÚMERO DE "A", "E",
		// ETC... Y EL TOTAL DE CADA UNA

		Scanner ent = new Scanner(System.in);
		String frase = "";
		final char letraA = 'a', letraE = 'e', letraI = 'i', letraO = 'o', letraU = 'u';
//		int numVocales = 0;
		int numA = 0, numE = 0, numI = 0, numO = 0, numU = 0;

		System.out.println("Introduce una frase");
		frase = ent.nextLine().toLowerCase().replace('á', letraA); // REPLACE PARA QUE CUENTE TAMBIÉN LAS VOCALES
																	// ACENTUADAS FALTA HACERLO CON EL RESTO DE VOCALES

		// CONTADOR DE VOCALES TOTALES

		for (int i = 0; i < frase.length(); i++) {
			switch (frase.charAt(i)) {

			case letraA:
				numA++;
				break;
			case letraE:
				numE++;
				break;
			case letraI:
				numI++;
				break;
			case letraO:
				numO++;
				break;
			case letraU:
				numU++;
				break;
			}
		}

		System.out.println("La frase tiene: \n" + "\t " + numA + " de a \n" + "\t " + numE + " de e \n" + "\t " + numI
				+ " de i \n" + "\t " + numO + " de o \n" + "\t " + numU + " de u \n");
		// EL \T ES PARA LA TABULACIÓN Y EL \N PARA LOS ESPACIOS

//		for(int index = 0 ; index < frase.length() ; index++) { //RECORDAR ESTO. ES IMPORTANTE PARA SABER LA LONGITUD O EL NUMERO DE LETRAS DE UNA PALABRA 
//			System.out.println("Posición: " + index + " ->" + frase.charAt(index)); //ESTO SE PUEDE HACER Y ESTA BIEN
//			if(frase.charAt(index) == letraA || frase.charAt(index) == letraE || frase.charAt(index) == letraI || frase.charAt(index) == letraO || frase.charAt(index) == letraU) {

//				numVocales++;
//			}
//		}

//		System.out.println("Hay " + numVocales + " vocales"); //SE PONE AQUI PORQUE NO QUEREMOS QUE SE REPITA DENTO DEL BUCLE

	}
}
