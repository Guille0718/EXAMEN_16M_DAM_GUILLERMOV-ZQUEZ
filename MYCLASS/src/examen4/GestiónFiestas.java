package examen4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class GestiónFiestas {
	
	private static ArrayList<Festivales> fiestas = new ArrayList<>();
	
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		int opcion;
		do {
			System.out.println("\n Menú de opciones:");
			System.out.println("1. Agregar fiestas");
            System.out.println("2. Mostrar información de las fiestas");
            System.out.println("3. Salir del Programa");
            System.out.print("Seleccione una opción: ");
            opcion = ent.nextInt();

            switch (opcion) {
                case 1:
                    AgregarFiestas(ent);
                    break;
                case 2:
                    MostrarFiestas();
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
			
		}while(opcion != 3);
		ent.close();
	}
		
	    private static void AgregarFiestas(Scanner ent) {
	    	
	        System.out.print("Nombre de la fiesta y localidad en la que se celebra: \n");
	        String nombre = ent.nextLine();
	        String localidad = ent.nextLine();
	        if(localidad.isBlank()) {
	        	System.out.println("Error, introduzca la localidad de la fiesta");
	        	return;
	        }

	       
        LocalDate FechaInicio;
        LocalDate FechaFin;
        
        try {
            System.out.print("Fecha de inicio (yy/MM/dd): ");
            FechaInicio = LocalDate.parse(ent.next());
            System.out.print("Fecha de fin (yy/MM/dd): ");
			FechaFin = LocalDate.parse(ent.next());
        } catch(Exception e) {
            System.out.println("Error: Formato de fecha incorrecto.");
            return;
        }
        
        if(FechaInicio.isAfter(FechaFin)) {
            System.out.println("Error: La fecha de inicio no puede ser posterior a la fecha de fin.");
            return;
        }

        fiestas.add(new Festivales(nombre, localidad, FechaInicio, FechaFin));
        System.out.println("Fiesta agregada correctamente.");
    }
		
    private static void MostrarFiestas() {
        if(fiestas.isEmpty()) {
            System.out.println("No hay fiestas para mostrar");
            return;
        }
        System.out.println("\n Lista de fiestas:");
        for(Festivales fiesta : fiestas) {
            System.out.println(fiesta);
        }
    }

}


