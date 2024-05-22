package examen4;

//public class Borrador {
//	
//	import java.time.LocalDate;
//	import java.time.temporal.ChronoUnit;
//	import java.util.ArrayList;
//	import java.util.InputMismatchException;
//	import java.util.Scanner;
//
//	public class FiestasPopulares {
//
//	    private static ArrayList<Festival> fiestas;
//
//	    public static void main(String[] args) {
//	        fiestas = new ArrayList<>();
//	        Scanner scanner = new Scanner(System.in);
//	        int opcion;
//	        do {
//	            System.out.println("\n1. Agregar fiestas");
//	            System.out.println("2. Mostrar información de las fiestas");
//	            System.out.println("3. Salir del Programa");
//	            System.out.print("Seleccione una opción: ");
//	            opcion = scanner.nextInt();
//	            scanner.nextLine(); // Limpiar el buffer
//	            switch (opcion) {
//	                case 1:
//	                    agregarFiesta(scanner);
//	                    break;
//	                case 2:
//	                    mostrarFiestas();
//	                    break;
//	                case 3:
//	                    System.out.println("Saliendo del programa...");
//	                    break;
//	                default:
//	                    System.out.println("Opción no válida");
//	            }
//	        } while (opcion != 3);
//	    }
//
//	    private static void agregarFiesta(Scanner scanner) {
//	        System.out.print("Nombre de la fiesta: ");
//	        String nombre = scanner.nextLine();
//	        if (nombre.isEmpty()) {
//	            System.out.println("Error: El nombre de la fiesta no puede estar vacío");
//	            return;
//	        }
//	        System.out.print("Localidad: ");
//	        String localidad = scanner.nextLine();
//	        if (localidad.isEmpty()) {
//	            System.out.println("Error: La localidad no puede estar vacía");
//	            return;
//	        }
//	        LocalDate fechaInicio;
//	        LocalDate fechaFin;
//	        try {
//	            System.out.print("Fecha de inicio (dd/mm/yy): ");
//	            fechaInicio = LocalDate.parse(scanner.nextLine(), Festival.FORMATO_FECHA);
//	            System.out.print("Fecha de fin (dd/mm/yy): ");
//	            fechaFin = LocalDate.parse(scanner.nextLine(), Festival.FORMATO_FECHA);
//	        } catch (Exception e) {
//	            System.out.println("Error: Formato de fecha incorrecto");
//	            return;
//	        }
//	        if (fechaInicio.isAfter(fechaFin)) {
//	            System.out.println("Error: La fecha de inicio no puede ser posterior a la fecha de fin");
//	            return;
//	        }
//	        fiestas.add(new Festival(nombre, localidad, fechaInicio, fechaFin));
//	        System.out.println("Fiesta agregada correctamente");
//	    }
//
//	    private static void mostrarFiestas() {
//	        if (fiestas.isEmpty()) {
//	            System.out.println("No hay fiestas para mostrar");
//	            return;
//	        }
//	        System.out.println("\nFiesta\t\tLocalidad\t\tDuración\t\tDía de la semana");
//	        for (Festival fiesta : fiestas) {
//	            System.out.println(fiesta);
//	        }
//	    }
//	}
//
//	class Festival {
//
//	    static final String FORMATO_FECHA = "dd/MM/yy";
//
//	    private String nombre;
//	    private String localidad;
//	    private LocalDate fechaInicio;
//	    private LocalDate fechaFin;
//
//	    public Festival(String nombre, String localidad, LocalDate fechaInicio, LocalDate fechaFin) {
//	        this.nombre = nombre;
//	        this.localidad = localidad;
//	        this.fechaInicio = fechaInicio;
//	        this.fechaFin = fechaFin;
//	    }
//
//	    @Override
//	    public String toString() {
//	        long dias = ChronoUnit.DAYS.between(fechaInicio, fechaFin);
//	        String diaSemana
//
//}
