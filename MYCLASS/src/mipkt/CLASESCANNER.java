package mipkt;

import java.util.Scanner;

public class CLASESCANNER {

	public static void main(String[] arg) {

		Scanner entrada; // DECLARACIÓN DE UN OBJETO
		entrada = new Scanner(System.in); // INSTANCIA DE UN OBJETO

		System.out.println("Introduce un número entero");
		int num = entrada.nextInt();

		entrada.nextLine(); // ESTO SE PONE PARA "TRAMPEAR" Y QUE DEJE SEGUIR ESCRIBIENDO

		System.out.println("El nombre");
		String nombre = entrada.nextLine();

		System.out.println("Num: " + num + " Nombre: " + nombre);

		// EJERCICIO VER SI FLOAT ES MAYOR MENOR O IGUAL QUE 100

//	System.out.println("Introduce un número");
//	float numero = entrada.nextFloat();

//	if(numero < 100) {
//		System.out.println("Menor");
//	}else if(numero > 100) {
//		System.out.println("Mayor");
//	}else {
//		System.out.println("Igual");
//	}

//	System.out.println("Introduce un número entero");
//	int numero = entrada.nextInt();

//	if(numero % 2 == 0) {
//		System.out.println("El numero: " + numero + " es par");
//	}else {
//		System.out.println("El numero: " + numero + " es impar"); //CODIGO PARA COMPROBAR SI UN NUMERO ES PAR O IMPAR
//	}

//	System.out.println("Introduce tu nombre");
//	String nombre = entrada.nextLine();//ENTRADA.NEXTLINE ES LECTOR DE TECLADO

//	System.out.println("Tu apellido");
//	String apellidos = entrada.next();

//	System.out.println("Hola " + nombre + " " + apellidos);	

	}

}
