package Clases.Avanzadas;

import java.util.Scanner;

public class PruebaCuentas {
	
	public static void main(String[] arg) {
		
		
//		Cuenta Guillermo = new Cuenta("Guillermo", 700.50);
//		
//		System.out.println(Guillermo);
//		
//		
//		Guillermo.ingresar(150.35);
//		
//		System.out.println("Despues de ingresar \n" + Guillermo);
//		
//				
//		Guillermo.retirar(70.65);
//		
//		System.out.println("Despues de retirar \n" + Guillermo);
		
		/* Menú de opciones de mi banco
		 * Crear cuenta(si no existe)
		 * Ingresar
		 * Retirar
		 * Ver saldo
		 */
		
		Scanner ent = new Scanner(System.in);
		
		Cuenta miCuenta = new Cuenta(" ");
		
		int opcion = 0;
		
		do {
			
			if(!miCuenta.getTitular().isBlank()) {
				
			System.out.println("Introduce la operacion que desea realizar: \n" + "1) Modificar titular \n" + "2) Ingresar dinero \n" + "3) Retirar dinero \n" + "4) Ver saldo \n" + "0) Salir");
			
			}else {
				System.out.println("Introduce la operación: \n" + "1) Crear cuenta \n" + "0) Salir");
			}
			
			opcion = Integer.parseInt(ent.nextLine());
			
			switch(opcion) {
			
				case 1: AltaTitular(miCuenta, ent); //Solo hace falta un método ya que podemos crear y modificar en el mismo metodo haciendo if else
					break;
					
				case 2: IngresarDinero(miCuenta, ent);
					break;
					
				case 3: RetirarDinero(miCuenta, ent);
					break;
					
				case 4: System.out.println(miCuenta); //No hace falta hacer un metodo ya que esta hecho previamente en la clase "Cuenta"(toString)
					break; //Se puede hacer así o poniendo miCuenta.toString();
					
				case 0: System.out.println("Adios");
					break;
				
				default: System.out.println("Opción no válida");
			
			}
			
		}while(opcion != 0);
	}
	
	public static void IngresarDinero(Cuenta cuenta, Scanner ent) {
		
		System.out.println("¿Cuánto dinero quiere ingresar?");
		double cantidad = Double.parseDouble(ent.nextLine().replace(",", "."));		
		cuenta.ingresar(cantidad);
		
	}
	
	public static void RetirarDinero(Cuenta cuenta, Scanner ent) {
		
		System.out.println("¿Cuánto dinero quiere retirar?");
		double cantidad = Double.parseDouble(ent.nextLine().replace(",", "."));	
		cuenta.retirar(cantidad);
		
	}
	
	public static void AltaTitular(Cuenta cuenta, Scanner ent) {
		
		boolean nuevo = false;
		
		//Crear una cuenta nueva
		if(cuenta.getTitular().isBlank()) {
			nuevo = true;
		}
			System.out.println("Introduce el nombre del titular");
			cuenta.setTitular(ent.nextLine());
			
		if(nuevo) {
			System.out.println("¿Desea añadir un saldo inicial? Si/No");
			if(ent.nextLine().equalsIgnoreCase("Si")) {
				System.out.println("¿Cuánta cantidad desea ingresar?");
				cuenta.setCantidad(Double.parseDouble(ent.nextLine().replace(",", ".")));
			}
		}

			
	}
	
}
