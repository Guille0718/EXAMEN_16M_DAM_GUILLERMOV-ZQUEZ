package metodos;

import java.util.Scanner;

public class MisAreas {
	
	public static void main(String[] arg) {
		
		Scanner ent = new Scanner(System.in);
		int opcion = 0;
		
		do {
			
			System.out.println("Menú de areas: \n " + "1) Cuadrado \n " + "2) Rectangulo \n" + " 3) Triangulo \n " + "4) Circulo \n" + " 0) Salir \n");
			
			opcion = Integer.parseInt(ent.nextLine());
			
			switch(opcion) {
				case 1: areaCuadrado(ent);
					break;
				case 2: areaRect(ent);
					break;
				case 3: areaTriangulo(ent);
					break;
				case 4: areaCirculo(ent);
					break;
				case 0: System.out.println("Adiós");
					break;
				default: System.out.println("Opción no válida");
			}
			
		}while(opcion != 0);
		
	}
	
	public static void areaRect(Scanner ent) {
		
		int base = 0, altura = 0;
		
		System.out.println("Introduce la altura del rectangulo");
		altura = Integer.parseInt(ent.nextLine());
				
		System.out.println("Introduce la base del rectangulo");
		base = Integer.parseInt(ent.nextLine());
		
		System.out.println("El area es " + (base*altura));		
		
	}
	
	public static void areaCuadrado(Scanner ent) {
		
		int lado = 0;
		
		System.out.println("¿Cuanto mide el lado?"); 
		
		lado = Integer.parseInt(ent.nextLine());
		
		System.out.println("El area es " + (lado*lado));
	}
	
	public static void areaTriangulo(Scanner ent) {
		
		int base = 0, altura = 0;
		
		System.out.println("Introduce la altura del triangulo");
		altura = Integer.parseInt(ent.nextLine());
				
		System.out.println("Introduce la base del triangulo");
		base = Integer.parseInt(ent.nextLine());
				
		System.out.println("El area es " + (base*altura));
	}
		
	public static void areaCirculo(Scanner ent) {
		
		double radio = 0.0f;
		
		System.out.println("Introduce el radio del circulo");
		radio = Double.parseDouble(ent.nextLine());
		
		System.out.println("El area del circulo es " + (Math.PI * radio));		
	}		

}
