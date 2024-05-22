package mipkt;

import java.util.Scanner;

public class RepasoFinal {

	public static void main(String[] arg) {

		Scanner scanner = new Scanner(System.in);
		int dia, mes, anio;
		boolean esValido;

		do {
			System.out.println("Introduce el día:");
			dia = scanner.nextInt();
			System.out.println("Introduce el mes:");
			mes = scanner.nextInt();
			System.out.println("Introduce el año:");
			anio = scanner.nextInt();

			esValido = validarFecha(dia, mes, anio);
			if (!esValido) {
				System.out.println("Fecha no válida, intente de nuevo.");
			}
		} while (!esValido);

		System.out.println("Fecha ingresada: " + dia + " de " + getMes(mes) + " de " + anio);
	}

	private static String getMes(int mes) {
		// TODO Auto-generated method stub
		return null;
	}

	public static boolean validarFecha(int dia, int mes, int anio) {
		if (anio < 1900) {
			return false;
		}

		if (mes < 1 || mes > 12) {
			return false;
		}

		int diasMes = getDiasMes(mes, anio);
		if (dia < 1 || dia > diasMes) {
			return false;
		}

		return true;
	}

	public static int getDiasMes(int mes, int anio) {
		switch (mes) {
		case 2:
			if (esBisiesto(anio)) {
				return 29;
			} else {
				return 28;
			}
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		default:
			return 31;

		}

	}

	private static boolean esBisiesto(int anio) {
		// TODO Auto-generated method stub
		return false;
	}
}
