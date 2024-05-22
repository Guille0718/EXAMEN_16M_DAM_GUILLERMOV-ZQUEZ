package EjercicioAvanzado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
	
	class Habitacion {
	    String tipo;
	    String tipoVentana;
	    boolean disponible;
	    double precio;
	    int numero;
		public boolean ocupada;

	    public Habitacion(String tipo, String tipoVentana, double precio, int numero) {
	        this.tipo = tipo;
	        this.tipoVentana = tipoVentana;
	        this.precio = precio;
	        this.numero = numero;
	        this.disponible = true;
	    }

	    public String toString() {
	        return "Habitación " + numero + ": " + tipo + " - " + tipoVentana + " - Disponible: " + disponible;
	    }

		public boolean isReservada() {
			// TODO Auto-generated method stub
			return false;
		}
	}

	public class Hotel {
	    static List<Habitacion> habitaciones = new ArrayList<>();
	    static Scanner scanner = new Scanner(System.in);
		private static int numHabitacion;
		private static Habitacion habitacion;

	    public static void main(String[] args) {
	        for(int i = 1; i <= 6; i++) {
	            habitaciones.add(new Habitacion("Matrimonial", "Ventana", 30, i));
	            habitaciones.add(new Habitacion("Matrimonial", "Balcón", 40, i + 6));
	            habitaciones.add(new Habitacion("Individual", "Ventana", 20, i + 12));
	            habitaciones.add(new Habitacion("Individual", "Balcón", 25, i + 18));
	        }

	        while(true) {
	            System.out.println("\n Acciones disponibles: ");
	            System.out.println("1) Mostrar el listado de todas las habitaciones");
	            System.out.println("2) Reservar una habitación");
	            System.out.println("3) Devolver una habitación");
	            System.out.println("4) Salir de la aplicación");
	            System.out.print("Seleccione una opción: ");
	            int opcion = scanner.nextInt();

	            switch (opcion) {
	                case 1:
	                    mostrarHabitaciones();
	                    break;
	                case 2:
	                    reservarHabitacion();
	                    break;
	                case 3:
	                    devolverHabitacion();
	                    break;
	                case 4:
	                    System.exit(0);
	                    System.out.println("Hasta pronto!");
	                    break;
	                default:
	                    System.out.println("Opción no válida.");
	            }
	        }
	    }

		private static void mostrarHabitaciones() {
	        System.out.println("\nListado de habitaciones:");
	        for(Habitacion habitacion : habitaciones) {
	            System.out.println(habitacion);
	        }
	    }

	    private static void reservarHabitacion() {
	        List<Habitacion> habitacionesDisponibles = new ArrayList<>();
	        for(Habitacion habitacion : habitaciones) {
	            if(habitacion.disponible) {
	                habitacionesDisponibles.add(habitacion);
	            }
	        }

	        if(habitacionesDisponibles.isEmpty()) {
	            System.out.println("No hay habitaciones disponibles.");
	        } else{
	            System.out.println("\nListado de habitaciones disponibles:");
	            for(Habitacion habitacion : habitacionesDisponibles) {
	                System.out.println(habitacion);
	            }

	            System.out.print("Seleccione el número de habitación que desea reservar: ");
	            int numero = scanner.nextInt();
	            Habitacion habitacionSeleccionada = null;
	            for(Habitacion habitacion : habitacionesDisponibles) {
	                if(habitacion.numero == numero) {
	                    habitacionSeleccionada = habitacion;
	                    break;
	                }
	            }

	            if(habitacionSeleccionada != null) {
	                habitacionSeleccionada.disponible = false;
	                System.out.println("Habitación reservada con éxito.");
	            	}

	        	}
	    }
	    
	    private static void devolverHabitacion() {
	    	
	    	ArrayList<Habitacion> habitacionesReservadas = new ArrayList<>();
	        for(Habitacion habitacion : habitaciones) {
	            if(habitacion.isReservada()) {
	                habitacionesReservadas.add(habitacion);
	            }
	        }
	        if(habitacionesReservadas.isEmpty()) {
	            System.out.println("\n Lo sentimos, no hay habitaciones reservadas para devolver.");
	        } else{
	            mostrarHabitaciones(habitacionesReservadas);
	            System.out.print("\n Seleccione una habitación para devolver (ingrese el número de habitación): ");
	            numHabitacion = scanner.nextInt();
	            for(int i = 0; i < habitacionesReservadas.size(); i++) {
					habitacion = habitacionesReservadas.get(i);
				}
	        }
	    }

		private static void mostrarHabitaciones(ArrayList<Habitacion> habitacionesReservadas) {
			// TODO Auto-generated method stub
			
		}
}
	
//	public class Hotel {
//
//	    public static void main(String[] args) {
//	        Scanner scanner = new Scanner(System.in);
//	        Hotel hotel = new Hotel();
//	        boolean running = true;
//	        while (running) {
//	            System.out.println("Seleccione una opción:");
//	            System.out.println("1. Mostrar listado de habitaciones");
//	            System.out.println("2. Reservar habitación");
//	            System.out.println("3. Devolver habitación");
//	            System.out.println("4. Salir");
//	            int option = scanner.nextInt();
//	            switch (option) {
//	                case 1:
//	                    hotel.mostrarHabitaciones();
//	                    break;
//	                case 2:
//	                    hotel.reservarHabitacion();
//	                    break;
//	                case 3:
//	                    hotel.devolverHabitacion();
//	                    break;
//	                case 4:
//	                    running = false;
//	                    break;
//	                default:
//	                    System.out.println("Opción no válida.");
//	                    break;
//	            }
//	        }
//	    }
//
//	    private ArrayList<Habitacion> habitaciones;
//
//	    public Hotel() {
//	        habitaciones = new ArrayList<>();
//	        habitaciones.add(new HabitacionMatrimonio("301", 30, TipoVentana.VENTANA));
//	        habitaciones.add(new HabitacionMatrimonio("302", 40, TipoVentana.BALCON));
//	        habitaciones.add(new HabitacionMatrimonio("303", 30, TipoVentana.VENTANA));
//	        habitaciones.add(new HabitacionDoble("201", 20, TipoVentana.VENTANA));
//	        habitaciones.add(new HabitacionDoble("202", 25, TipoVentana.BALCON));
//	        habitaciones.add(new HabitacionDoble("203", 20, TipoVentana.VENTANA));
//	    }
//
//	    public void mostrarHabitaciones() {
//	        for (Habitacion habitacion : habitaciones) {
//	            System.out.println(habitacion);
//	        }
//	    }
//
//	    public void reservarHabitacion() {
//	        for (Habitacion habitacion : habitaciones) {
//	            if (!habitacion.isReservada()) {
//	                habitacion.setReservada(true);
//	                System.out.println("Habitación reservada: " + habitacion);
//	                return;
//	            }
//	        }
//	        System.out.println("No hay habitaciones disponibles.");
//	    }
//
//	    public void devolverHabitacion() {
//	        for (Habitacion habitacion : habitaciones) {
//	            if (habitacion.isReservada()) {
//	                habitacion.setReservada(false);
//	                int dias = new Random().nextInt(5 - 1 + 1) + 1;
//	                int precio = habitacion.getPrecio() * dias;
//	                System.out.println("Habitación devuelta: " + habitacion);
//	                System.out.println("Precio por día: " + habitacion.getPrecio() + "€");
//	                System.out.println("Días de ocupación: " + dias);
//	                System.out.println("Total a pagar: " + precio + "€");
//	                return;
//	            }
//	        }
//	        System.out.println("No hay habitaciones reservadas.");
//	    }
//	}
//
//	class Habitacion {
//
//	    private String numero;
//	    private int precio;
//	    private boolean reservada;
//
//	    public Habitacion(String numero, int precio) {
//	        this.numero = numero;
//	        this.precio = precio;
//	        this.reservada = false;
//	    }
//
//	    public String getNumero() {
//	        return numero;
//	    }
//
//	    public int getPrecio() {
//	        return precio;
//	    }
	
