package mipkt;

public class BUCLEFOR {
	public static void main(String[] arg) {
		// EJEMPLO
//		for(int i=1; i<=10; i++) {
//			System.out.println("El contador vale" + i);
//		}

		// EJERCICIO 1
//		int num = 1;

//		while(num <= 20) {
//			System.out.println(num);
//			num++;
//		}

//	    int num = 1;

//		 do {
//			System.out.println(num);
//			num++;
//		}while(num <= 20 );

//			for(int i=1; i<=20; i++) {
//				System.out.println(i);
//			}

		// EJERCICIO 2

//			int num = 20;

//			while(num >= 1) {
//				System.out.println(num);
//				num--;
//			}

		int num = 20;

		do {
			System.out.println(num);
			num--;
		} while (num >= 1);

//			for(int i=20; i>=1; i--) {
//				System.out.println(i);
//			}
		// EJERCICIO 3

		for (int i = 0; i <= 200; i += 5) {
			System.out.println(i);
		}

		// EJERCICIO 4

		int n = 1000;
		System.out.print("Los numeros pares del 1 al " + n + " son:");
		for (int i = 1; i <= n; i++) {
			// if number%2 == 0 significa que es un número par
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}

		// EJERCICIO 5

		for (int multiplicando = 1; multiplicando <= 10; multiplicando++) {
			for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {// numero multiplicando * numero
																				// multiplicador por eso se hacen dos
																				// "for"

				int producto = multiplicando * multiplicador;

				System.out.println(multiplicando + " x " + multiplicador + " = " + producto);
			}
		}
	}

}
