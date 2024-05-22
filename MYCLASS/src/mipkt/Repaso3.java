package mipkt;

import java.util.Scanner;

public class Repaso3 {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);
//        int num1 = 0, num2 = 0, aux = 0;

		System.out.print("Introduzca el primer número: ");
		int num1 = ent.nextInt();

		System.out.print("Introduzca el segundo número: ");
		int num2 = ent.nextInt();

		System.out.println("Generando 10 números aleatorios entre " + num1 + " y " + num2 + ":");

		for (int i = 0; i < 10; i++) {
			int randomNum = num1 + (int) (Math.random() * (num2 - num1 + 1));// La función Math.random() genera un
																				// número double aleatorio entre 0 y 1.
																				// Multiplicamos este número por la
																				// diferencia entre el segundo número
																				// ingresado por el usuario y el
																				// primero, y luego sumamos el primero
																				// número. Finalmente, redondeamos el
																				// resultado a un entero usando el
																				// casting (int).
			System.out.println(randomNum);
		}

		// CODIGO PARA SABER QUE NÚMERO ES MAYOR Y MENOR
//        if(num1 > num2) {
//        	aux=num2;
//        	num2=num1;
//        	num1=aux;
//		}else if(num1 == num2) {
//        	System.out.println("Los números no pueden ser iguales");
//        }
		System.out.println("Aqui tiene los 10 numero aleatorios pedidos entre los número propuestos");
	}

}
