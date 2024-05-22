package Clases.Avanzadas;

//import java.util.ArrayList;
import java.util.Scanner;

public class GestionEmpleado {
	
//	private static float totalSueldos;
	

	public static void main(String[] arg) {
		
		Scanner entScanner = new Scanner(System.in);
		
		int num = 0;
		
		try {
			
			System.out.println("Introduce un número");
			num = Integer.parseInt(entScanner.nextLine());
			
			if(num > 0) {
				System.out.println("Todo correcto");				
			}else {
				
				throw new NumberFormatException();
			}
			
		} catch(NumberFormatException excep) {
			
			System.out.println(excep);
			
		}
		
//		ArrayList<Empleado> lista = new ArrayList<Empleado>();
//		lista.add(new Empleado("David", "11", 2, 1200, "Junior"));
//		lista.add(new Empleado("Nacho", "22", 3, 1250, "Junior"));
//		lista.add(new Empleado("Hugo", "33", 6, 1350, "Programador"));
//		lista.add(new Empleado("Ricardo", "44", 8, 1350, "Programador"));
//		lista.add(new Empleado("Erji", "55", 16, 1850, "Analista"));
//		
//		for(int i = 0 ; i < lista.size(); i++) {
//			
//			totalSueldos = lista.get(i).getSueldoTotal();
//			
//			}
//		
//		char[] totalSueldos = null;
//		System.out.println(totalSueldos);
//		
//		for(Empleado emp : lista) {
//			if(emp.getPuesto().equalsIgnoreCase("Junior")) {
//				emp.setPuesto("becario");
//				System.out.println("Cambiamos el puesto a " + emp.getNombre());
//			}
//		}
//		
//		Empleado nuevo = new Empleado("Jefazo", "55", 23, 2200, "CEO");
//		
//		for(Empleado empleado : lista) {
//			
//			int i = 0;
//			if(lista.get(i).getDni().equalsIgnoreCase("44")) {
//				lista.set(i, nuevo);
//			}
//			System.out.println(empleado);
//		
//	}

		
		
//		Scanner ent =new Scanner(System.in);
//		
//		System.out.println("Número de empleados: ");
//		int numEmpleados = Integer.parseInt(ent.nextLine());
		
		
//		Empleado[] listaEmpleados = new Empleado[5];
//		
//		ArrayList<Empleado> lista2;
//		ArrayList<String> palabras;
//		ArrayList<Double> numeros;
//		
//		//Decalración e instancia de un ArrayList.
//		
//		ArrayList<Empleado> lista = new ArrayList<Empleado>();
//		
//		Empleado empleado = new Empleado("Guille", "999999999W", 2, 1500, "CTO");
//		
//		//Añadimos en la primera posición libre, en este caso la 0.
//		
//		lista.add(empleado);
//		
//		System.out.println("Tamaño " + lista.size());
//		
//		empleado = new Empleado("Paco", "999999999P", 2, 1500, "CTO");
//		
//		lista.add(empleado);
//		
//		System.out.println("Tamaño2 " + lista.size());
//		
//		System.out.println(lista.get(0).getNombre() + lista.get(0).getSueldoTotal());
//		
//		for(int i = 0 ; i < lista.size() ; i++) {
//			
//			if(lista.get(i).getNombre().equalsIgnoreCase("Guille")) {
//				
//				lista.remove(i);
//			}
//			
//		System.out.println("For " + lista.get(i));
//		
//		}
//		
//		System.out.println("FOREACH");
//		
//		for(Empleado emp : lista) {
//			
//			if(emp.getNombre().equalsIgnoreCase("Guille")) {
//				
//				lista.remove(emp);
//			}
//			System.out.println("ForEach " + emp);			
//		}
//		
//		Empleado bkEmpleado = lista.get(0);
//		
//		lista.set(0, new Empleado("Jose", "999999999J", 2, 1500, "CTO"));
//		
//		lista.add(bkEmpleado);
//		
//		for(Empleado emp : lista) {
//			
//			System.out.println("ForEach " + emp);
//			
//		}

	}
	
//	private static Empleado nuevoEmpleado(Scanner ent) {
//		
//		String nombre = " ", dni = " ", puesto = " ";
//		float sueldo = 0.00f;
//		int aniosEmpresa = 0;
//	}

}
