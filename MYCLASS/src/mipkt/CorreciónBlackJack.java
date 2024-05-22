package mipkt;

import java.util.Scanner;

public class CorreciónBlackJack {
	
	public static void main(String[] args) {
		
		final int LIMITEBANCA = 16, LIMITEJUEGO = 21;
		int puntosBanca = 0, puntosJugador = 0, carta = 0;
		Scanner ent = new Scanner(System.in);
		String respuesta = "";
		boolean turnoJ = true, finJ = false, finB = false; // Con boolean, se pueden crear condiciones que permitan ejecutar diferentes bloques de código dependiendo de si se cumple o no una determinada condición
		
		do {
			carta = (int) (Math.random()*10)+1;
			
			
			if(turnoJ && !finJ) {
				System.out.println("El jugador obtiene un " + carta);
				puntosJugador += carta;
				System.out.println("Total jugador " + puntosJugador);
				
				if(puntosJugador < LIMITEJUEGO) {
					System.out.println("¿Desea continuar S/N?");
					respuesta = ent.nextLine();
					
					if(respuesta.equalsIgnoreCase("no")) {
						finJ = true;
					}
				}else {
					finJ = true;					
				}
				
			}else if(!turnoJ && !finB) {
				System.out.println("La banca obtiene un " + carta);
				puntosBanca += carta;
				System.out.println("Total banca " + puntosBanca);
				if(puntosBanca >= 16) {
					finB = true;
				}
			}
			
			turnoJ = !turnoJ;
						
		}while(!finJ || !finB); //Condicional para dar cartas
		
		if (puntosJugador > puntosBanca && puntosJugador < 21) {
			System.out.println("Tú ganas!");
		} else if (puntosBanca > puntosJugador && puntosBanca < 21) {
			System.out.println("La banca gana!");
		} else {
			System.out.println("Empate!");
		}
	}

}
