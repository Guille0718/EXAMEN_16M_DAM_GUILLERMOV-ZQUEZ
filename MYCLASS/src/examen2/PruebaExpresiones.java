package examen2;

import java.util.Scanner;

public class PruebaExpresiones {
	
	public static void main(String[] arg) {	
		
		Scanner ent = new Scanner(System.in);
//		String patron = "[679][0-9]{8}";// {} número de veces que se repite un número
//		String tlf = "";
//		
//		int num = 9;
//		
//		System.out.println("Introduce el teléfono");
//		tlf = ent.nextLine();
//		
//		if(tlf.matches(patron)) {
//			System.out.println("Teléfono válido");
//		}else {
//			System.out.println("Teléfono inválido");
//		}
		
		String patronDNI = "[0-9]{8}[A-Z]", dni = "";
		
		do {
			System.out.println("Introduce el DNI");
			dni = ent.nextLine().toUpperCase();
			
		}while(!dni.matches(patronDNI));
		
		System.out.println("FIN");
		
	}

}
