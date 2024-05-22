package mipkt;

import java.util.Random;
import java.util.Scanner;

public class Repaso6 {

	public static void main(String[] args) {

		Random random = new Random();
		int numeroGenerado = random.nextInt(100) + 1;
		Scanner ent = new Scanner(System.in);
		int intentos = 0;
		boolean adivinado = false;

		while (intentos < 5 && !adivinado) {
			System.out.println("Introduzca un número entre 1 y 100: ");
			int numeroIntroducido = ent.nextInt();
			intentos++;

			if (numeroIntroducido == numeroGenerado) {
				adivinado = true;
				System.out.println("¡Felicidades! Has adivinado el número correctamente.");
			} else if (numeroIntroducido > numeroGenerado) {
				System.out.println("Te has pasado porque has introducido un número mayor que el generado.");
			} else {
				System.out.println("Te has quedado corto porque has introducido un número menor que el generado.");
			}
		}

		if (!adivinado) {
			System.out.println(
					"Lo siento, se te han agotado los intentos. El número generado era " + numeroGenerado + ".");
		}
	}

}
