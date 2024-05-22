package mipkt;

import java.util.Scanner;

public class Repaso2 {

	public static void main(String[] args) {

		// Definir la contraseña
		String contraseña = "POLLOFRITO";

		// Inicializar el número de intentos
		int intentos = 3;

		// Crear un objeto Scanner para leer la entrada del usuario
		Scanner ent = new Scanner(System.in);

		// Solicitar la contraseña al usuario
		for (int i = 0; i < intentos; i++) {
			System.out.print("Introduzca la contraseña: ");
			String password = ent.nextLine();// EN VEZ DE PONER PASSWORD PUEDO PONER CUALQUIER COSa. NO ES NECESARIO
												// PONER EL INPUT YA QUE EN JAVA "INPUT" ES EL SCANNER

			// Comprobar si la contraseña es correcta
			if (password.equals(contraseña)) {
				System.out.println("Enhorabuena");
				break;
			} else {
				System.out.println("Contraseña incorrecta. Le quedan " + (intentos - i - 1) + " intentos");
			}
		}

		// Cerrar el objeto Scanner
		ent.close();
	}
}
