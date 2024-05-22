package mipkt;

public class CONDICIONALIF {

	public static void main(String[] arg) {

		int edad = 49;

		if (edad < 18 || edad >= 50) {
			System.out.println("No entras");
		} else {
			System.out.println("Entras");
		}

		if (edad >= 18 && edad < 50) {
			System.out.println("Entras");
		} else {
			System.out.println("No entras");
		}
		// SE PUEDE HACER DE AMBAS MANERAS

		// No dejamos a los menores y mayores de 50
//		if(edad >= 50) {
//			System.out.println("No puedes entrar");
//	}else if(edad < 18) {
//			System.out.println("No puedes entrar");
//		}else {
//			System.out.println("Puedes entrar");
//		}
		// EJERCICIO DE EJEMPLO QUE ESTA BIEN(QUITAR "//" SI QUIERES COMPROBAR)

	}

}
