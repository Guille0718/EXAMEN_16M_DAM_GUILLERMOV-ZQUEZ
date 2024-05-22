package EjercicioAvanzado;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class PruebaFechaYHora {
	
	public static void main(String[] arg) {
		
		Scanner ent = new Scanner(System.in);
		
//		LocalDate fechaActual = LocalDate.now();
//		
//		LocalDate fechaFinDAM = LocalDate.of(2024, 6, 26);
//		
//		LocalDate fechaInicioDAM = LocalDate.parse("2023-09-18");
//		
//		System.out.println("Fecha actual " + fechaActual);
//		
//		System.out.println("Fecha fin de DAM " + fechaFinDAM);
//		
//		System.out.println("Fecha inicio de DAM " + fechaInicioDAM);
		
		LocalDate miNacimiento = null;
		try {
//			System.out.println("Dame la fecha de nacimiento");
//			miNacimiento = LocalDate.parse(ent.nextLine());	
//			
//			LocalDate nuevaDate = miNacimiento.plusDays(10);
//			LocalDate nuevaDate = LocalDate.now();
//			
//			System.out.println(miNacimiento.plusDays(10) + " 10 días " + nuevaDate);
//			
//			if(nuevaDate.isAfter(miNacimiento)) {
//				System.out.println("felicidades");
//			}else {
//				System.out.println("Aun no es tu cumpleaños");
//			}
			
			System.out.println(LocalDate.now().getDayOfWeek().getValue());
			
		}catch(DateTimeParseException excep) {			
			System.out.println("Fecha inválida");	
		}
		
		System.out.println("La fecha de nacimiento es " + miNacimiento);
				
	}

}
