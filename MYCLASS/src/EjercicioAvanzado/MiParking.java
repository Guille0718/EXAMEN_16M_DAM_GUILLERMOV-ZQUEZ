package EjercicioAvanzado;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class MiParking {


	public static void main(String[] args) {
	    	
	        Scanner scanner = new Scanner(System.in);
	        
	    	final float Precio = 0.15f, PrecioDespuesDe24 = 0.10f, PrecioDia = 20.0f;
	    	
	        DateTimeFormatter df = DateTimeFormatter.ofPattern(" ddMM/yy HH:mm");
	        
	        LocalDateTime HoraEntrada = null;
	        Duration dur = null;
	        final int HoraTope = 2;
	        
	        while(HoraEntrada == null) {
	        	System.out.println("Introduzca el mometo de entrada" + "(dd/mm/yy hh:mm");
	        	
	        try {
	        	HoraEntrada = LocalDateTime.parse(scanner.nextLine(), df);
	        	if(HoraEntrada.isAfter(LocalDateTime.now())) {
	        		throw new DateTimeParseException("Error", "Error", 0);
	        	}
	        	
	        	long dias = ChronoUnit.DAYS.between(HoraEntrada, LocalDateTime.now());
	        	if(dias > 0) {
					System.out.println("Precio total x dias("+dias+"): " + dias * PrecioDia);
	        	}else {
	        		Duration duracion = Duration.between(HoraEntrada, LocalDateTime.now());
	        		if(duracion.toHours() >= HoraTope) {
	        			System.out.println("Precio total: " + duracion.toMinutes() * PrecioDespuesDe24 + " por " + duracion.toHours() + " horas");
	        		}else {
	        			System.out.println("Precio total: " + duracion.toMinutes() * Precio + " por " + duracion.toMinutes() + " minutos");
	        		}
	        	}
	
	        }catch(Exception excep) {
	        	System.out.println("Hora no válida");
	        }
	    }
	}

}
