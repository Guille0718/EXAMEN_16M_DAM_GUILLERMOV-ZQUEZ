package mipkt;

import java.util.Scanner;

public class Repaso1 {

	public static void main(String[] arg) {

		// DECLARAMOS VARIABLE Y OBJETOS
		Scanner ent = new Scanner(System.in);
		int numVentas = 0, unidades = 0;
		double total = 0.0, precio = 0.0;

		System.out.println("Introduce un número de artículos");
		numVentas = Integer.parseInt(ent.nextLine());

		// EMPEZAMOS A PEDIR IMPORTES
		for(int i = 1; i <= numVentas; i++) {
//			System.out.println("Introduce el precio del articulo: " + i);
//			precio = Double.parseDouble(ent.nextLine().replace( ',', '.'));
//			total += precio;
			System.out.println("¿Cuántas unidades del articulo " + i + " llevas?");
			unidades = Integer.parseInt(ent.nextLine());
			System.out.println("¿Precio unitario del producto?");
			precio = Double.parseDouble(ent.nextLine().replace(',', '.'));

			total += total + (unidades * precio);
		}

		System.out.println("Total -> " + total);

		System.out.println("Fin del programa");

	}

}
