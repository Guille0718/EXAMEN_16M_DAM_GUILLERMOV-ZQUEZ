package metodos;

import java.util.Scanner;

public class Saudos {
	
	public static void main(String[] arg) {
		
		String nombre = "";
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Indica tu nombre");
		nombre = ent.nextLine();
		saludar(nombre); //Información para que el string de abajo sepa leer el nombre
		System.out.println("Fin del programa");
		
		
	}
	
	public static void saludar(String variableNombre) {
		
		System.out.println("Bienvenido " + variableNombre);
	}

}
