package Examen6;

import java.time.LocalDate;
import java.util.Scanner;


public class Principal {
	
	public static void main(String []arg) {
	
		Tienda tienda = new Tienda();
		Scanner ent = new Scanner(System.in);
		
		int opcion;
		do {
			System.out.println("\n Menú de opciones:");
			System.out.println("1. Agregar dispositivo");
            System.out.println("2. Buscar dispositivo");
            System.out.println("3. Eliminar dispositivo");
            System.out.println("4. Mostrar dispositivos");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = ent.nextInt();

            switch(opcion) {
                case 1:
                    AgregarDispositivo(ent);
                    break;
                case 2:
                    eliminarDispositivoPorCodigoSerie(ent);
                    break;
                case 3:
                	buscarDispositivoPorCodigoSerie(ent);
                    break;
                case 4:
                	listarDispositivos();
                	break;
                case 0:
                	System.out.println("Saliendo del programa...");
                	break;
                default:
                    System.out.println("Opción no válida");
            }
			
		}while(opcion != 0);
		ent.close();
		
	}


	private static void listarDispositivos() {
		System.out.println("Existen X dispositivos");
		
	}


	private static void buscarDispositivoPorCodigoSerie(Scanner ent) {
		String codigoSerie = ent.nextLine();
		System.out.println("Introduce el codigo de serie para buscar el dispositivo: ");
		
	}


	private static void eliminarDispositivoPorCodigoSerie(Scanner ent) {
		String codigoSerie = ent.nextLine();
		System.out.println("Introduce el codigo de serie para eliminar el dispositivo: ");
		
		
	}


	private static void AgregarDispositivo(Scanner ent) {
		
        System.out.print("Marca del dispositivo: \n");
        System.out.println("Modelo del dispositivo: ");
        String marca = ent.nextLine();
        String modelo = ent.nextLine();
        
        
        try {
            System.out.print("Codigo de serie del dispositivo: ");
            String codigoSerie = ent.nextLine();
            if(codigoSerie.isBlank()) {
            	System.out.println("Error, introduzca el codigo de serie del dispositivo");
            	return;
            }
        } catch(Exception e) {
            System.out.println("Error: Formato de fecha incorrecto.");
            return;
        }
        System.out.println("Dispositivo añadido correctamente");
		
	}

}
