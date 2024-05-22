package Arrays;

import java.util.Scanner;

public class ArraysString {
	
	public static void main(String[] arg) {
		
		Scanner ent = new Scanner(System.in);
		
		String[] palabras = new String[5];
		
		for(int i = 0 ; i <palabras.length ; i++) {
			System.out.println("Introduce la frase " + (1+i));
			palabras[i] = ent.nextLine();
		}
		
		//Llamamos a un metodo para mostrar el contenido
		mostrar(palabras);
		
	}
	
	public static void mostrar(String[] otroArray) {
		
		for(String elementoIterador : otroArray) {
			System.out.println(elementoIterador);
		}
		
	}

}
