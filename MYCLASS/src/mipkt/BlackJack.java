package mipkt;

import java.util.Scanner;

public class BlackJack {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);
		boolean JuegoActivo = true;
		int PuntUsuario = 0;
		int PuntBanca = 0;

		while (JuegoActivo) {
			// Repartir carta al jugador
			PuntUsuario += (int)(Math.random() * 10) + 1;
			// Repatir carta a la banca
			PuntBanca += (int)(Math.random() * 10) + 1;

			// Mostrar las cartas de la banca y del jugador
			System.out.println("Tus cartas: " + PuntUsuario);
			System.out.println("Cartas de la banca: " + PuntBanca);

			// Si la banca o el jugador hacen 21 o más, el juego termina
			if (PuntUsuario >= 21 || PuntBanca >= 21) {
				JuegoActivo = false;
			}
		}

		// Determina el ganador
		if (PuntUsuario > PuntBanca && PuntUsuario <= 21) {
			System.out.println("Tú ganas!");
		} else if (PuntBanca > PuntUsuario && PuntBanca <= 21) {
			System.out.println("La banca gana!");
		} else {
			System.out.println("Empate!");
		}
	}
}
