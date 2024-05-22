package EjercicioAvanzado;

import java.time.Duration;
//import java.time.LocalDate;
import java.time.LocalTime;
//import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class PruebaFecha2 {
	
public static void main(String[] arg) {
			
	Scanner ent = new Scanner(System.in);
	
	LocalTime entrada = LocalTime.parse("08:00");
	LocalTime ahora = LocalTime.now();
	
	Duration duracion = Duration.between(entrada, ahora);
	
	System.out.println("Tiempo efectivo de clase " + duracion.toMinutes());
	System.out.println("Tiempo efectivo de clase " + duracion.toHours());
	
//	LocalDate fecha = null;
//	
//	try {
//		System.out.println("Dame una fecha cualquiera");
//		fecha = LocalDate.parse(ent.nextLine());
//		
//		switch(fecha.getMonth()) {
//		case december, january, february
//		}
//		
//	}catch(DateTimeParseException excep) {
//		
//	}
	
	}	
}
