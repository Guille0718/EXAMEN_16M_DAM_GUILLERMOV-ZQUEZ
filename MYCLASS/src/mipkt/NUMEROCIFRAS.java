package mipkt;

public class NUMEROCIFRAS {

	public static void main(String[] arg) {
		/*
		 * EJEMPLO DE BUCLE DO-WHILE Y WHILE EL ALGORITOMO CALCULA EL NÚMERO DE CIFRAS
		 * DE UN NÚMERO DIVIDIENDO EN CADA INTERACCIÓN POR 10
		 */

//      long numero = 1234567;
//		int digitos=0;

//		do {
//			numero = numero / 10;
//			digitos++;
//		}while(numero > 0);

//		System.out.println("Tiene" + digitos + "cifras");

		// MISMO EJEMPLO CON BUCLE WHILE

//		while(numero > 0) {
//		numero /= 10;
//		digitos++;
//		}
//		System.out.println("Tiene" + digitos + "cifras");

		// EJERCICIO BUCLE NUMERO DE VECES QUE DICE CUALQUIER COSA
		int numRepeticiones = 5, numEjecuciones = 1;

//		do {
//		System.out.println("Hola");
//		numEjecuciones++;

//	    }while(numEjecuciones < numRepeticiones);
		// HACER ESTE MISMO CON WHILE

		while (numEjecuciones < numRepeticiones) {
			System.out.println("Caracola");
			numEjecuciones++; // MISMO EJERCICIO PERO HECHO CON WHILE
		}
	}
}
