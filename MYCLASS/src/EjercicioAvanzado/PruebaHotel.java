package EjercicioAvanzado;

import java.util.Scanner;

public class PruebaHotel {
	
	public static void main(String[] arg) {

		Scanner ent = new Scanner(System.in);
		boolean run = true;
		int opcion = 0;
		
//		HotelCorrección[] listaHabitaciones = new HotelCorrección[6];
//		listaHabitaciones[0] = new HotelCorrección(101, "Matrimonio", "balcon", 40.00f, true);
//		listaHabitaciones[1] = new HotelCorrección(102, "Matrimonio", "ventana", 30.00f, true);
//		listaHabitaciones[2] = new HotelCorrección(103, "Matrimonio", "ventana", 30.00f, true);
//		listaHabitaciones[3] = new HotelCorrección(104, "Individual", "balcon", 25.00f, true);
//		listaHabitaciones[4] = new HotelCorrección(105, "Individual", "ventana", 20.00f, true);
//		listaHabitaciones[5] = new HotelCorrección(106, "Individual", "ventana", 20.00f, true);
		
		HotelCorrección[] listaHabitaciones = {
				new HotelCorrección(101, "Matrimonio", "balcon", 40.00f, true),
				new HotelCorrección(102, "Matrimonio", "ventana", 30.00f, true),
				new HotelCorrección(103, "Matrimonio", "ventana", 30.00f, true),
				new HotelCorrección(104, "Individual", "balcon", 25.00f, true),
				new HotelCorrección(105, "Individual", "ventana", 20.00f, true),
				new HotelCorrección(106, "Individual", "ventana", 20.00f, true)
		};
		
		
		while(run) {
			
			System.out.println("Menú del Hotel: \n" + "1) Lista habitaciones \n" + "2) Reservar habitación \n" + "3) Devolver habitación \n" + "0) Salir \n");
			
			opcion = Integer.parseInt(ent.nextLine());
			
			switch(opcion) {
			
			case 1:
				listaHabitaciones(listaHabitaciones);
                break;
            case 2:
				reservarHabitaciones(listaHabitaciones);
                break;
            case 3:
            	devolverHabitacion(listaHabitaciones);
                break;
            case 0:
                System.out.println("Hasta pronto!");
                run = false;
                break;
            default:
                System.out.println("Opción no válida.");
			}
		}
		
	}
	
	private static void listaHabitaciones(HotelCorrección[] listaHabitaciones) {
		
		System.out.println("Listado de todas las habitaciones");
		for(HotelCorrección hab: listaHabitaciones) {
			System.out.println(hab);
		}	
		
	}
	
	private static void reservarHabitaciones(HotelCorrección[] lisHabitaciones) {
		
		Scanner entScanner = new Scanner(System.in);
		int numHabitacion = 0, posHabitacion;
		
		System.out.println("Habitaciones disponibles");
		
		for(HotelCorrección hab: lisHabitaciones) {
			if(hab.getLibre()) {
				System.out.println(hab);
			}
		}
		
		System.out.println("¿Qué habitación quiere?");
		numHabitacion = Integer.parseInt(entScanner.nextLine());
		posHabitacion = numHabitacion - HotelCorrección.DIF;
		
		if(lisHabitaciones[posHabitacion].getLibre()){
			lisHabitaciones[posHabitacion].setLibre(false);
			System.out.println("Habitacion reservada");
			
		}else {
			System.out.println("La habitación " + numHabitacion + " no esta disponible");
		}
	}
	
	private static void devolverHabitacion(HotelCorrección[] lisHabitaciones) {
		
		Scanner ent = new Scanner(System.in);
		int numHabitacion = 0, posHabitacion = 0;
		
		System.out.println("Habitaciones ocupadas");
		
		for(int i = 0 ; i < lisHabitaciones.length ; i ++) {
			if(!lisHabitaciones[i].getLibre()) {
				System.out.println(lisHabitaciones[i].getNumHabitacion());
			}
		}
		
		System.out.println("¿Qué habitacion quiere devolver?");
		numHabitacion = Integer.parseInt(ent.nextLine());
		posHabitacion = numHabitacion - HotelCorrección.DIF;
		
		if(!lisHabitaciones[posHabitacion].getLibre()){
			System.out.println(lisHabitaciones[posHabitacion].devolver());		
		}else {
			System.out.println("La habitación " + numHabitacion + " no esta ocupada");
		}
		
	}

}
