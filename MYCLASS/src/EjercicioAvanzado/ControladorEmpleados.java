package EjercicioAvanzado;

//import java.util.ArrayList;
//import java.util.Scanner;

//import Utilidades.ValidarDatos;

public class ControladorEmpleados {
	
//public static ArrayList<Empleado> lista = new ArrayList<Empleado>();
//	
//	public static void nuevoEmpleado(){
//		Scanner ent = new Scanner(System.in);
//		String nombre="",dni="",puesto="";
//		float sueldo=0.0f;
//		int aniosEmpresa=-1;
//		
//		//pedimos datos del empleado
//		
//		while(!ValidarDatos.validarNombre(nombre)) {
//			System.out.println("Introduce nombre del empleado");
//			nombre = ent.nextLine();
//		}
//		
//		while (!ValidarDatos.validarDNI(dni)){
//			System.out.println("Introduce dni del empleado");
//			dni = ent.nextLine();
//		}
//		
//		while(!ValidarDatos.validarNombre(puesto)) {
//			System.out.println("Introduce el puesto del empleado");
//			puesto = ent.nextLine();
//		}
//		
//		while(!ValidarDatos.validarSueldo(sueldo)) {
//			System.out.println("Introduzca un salario para el empleado");
//			try {
//				sueldo = Float.parseFloat(ent.nextLine());
//			}catch(NumberFormatException ex) {
//				System.out.println("El sueldo ha de ser mayor que cero");
//				sueldo=0.0f;
//			}
//		}
//		
//		while (!ValidarDatos.validarPositivo(aniosEmpresa)) {
//			System.out.println("Introduce años en la Empresa");
//			try {
//				aniosEmpresa = Integer.parseInt(ent.nextLine());
//			}catch(NumberFormatException ex) {
//				System.out.println("Los años en la empresa han de ser 0 o mayor");
//				aniosEmpresa=0;
//			}			
//		}
//		
//		System.out.println("¿Desea añadir el empleado a la empresa S/N");
//		String respuesta = ent.nextLine().toUpperCase();
//		if(respuesta.length() > 0 && respuesta.charAt(0)=='S') {
//			lista.add(new Empleado(nombre, dni, 
//					aniosEmpresa, sueldo, puesto));
//			System.out.println("Empleado añadido. Empleados totales " +
//					lista.size());
//		}else {
//			System.out.println("Alta cancelada");
//		}		
//	}
//
//	public static void mostrarLista() {
//		
//		System.out.println("Existen: " + lista.size()+" empleados\n");
//		for(Empleado empleado : lista) {
//			System.out.println(empleado);
//		}
//	}
//	
//	public static void actualizarEmpleado() {
//		
//		Scanner ent = new Scanner(System.in);
//		int id = 0;
//		
//		mostrarLista();
//		System.out.println("Introduzca el ID del empleado");
//		
//		try {
//			id = Integer.parseInt(ent.nextLine());
//			//Hacer un bucle para modificar varios a la vez
//			System.out.println("¿Qué daato desea madificar?: \n " + "1-Nombre 2-DNI 3-Años 4-Salario 5-Puesto");
//			//TO-DO
//			
//		}catch(NumberFormatException excep) {
//			System.out.println("ID inválido");
//		}
//				
//	}

}
