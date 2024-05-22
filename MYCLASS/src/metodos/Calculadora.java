package metodos;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] arg) {
		
		Scanner ent = new Scanner(System.in);
		int num1 = 0, num2 = 0;
				
		System.out.println("Inicio");
		System.out.println("Introduce dos números enteros");
		num1 = Integer.parseInt(ent.nextLine());
		num2 = Integer.parseInt(ent.nextLine());

//		int res = sumar(num1, num2);
		
//		System.out.println("RESULTADO " + res);
		
		System.out.println("RESULTADO " + sumar(num1,num2));
		
		System.out.println("Fin del programa");
	
		
	}
	public static int sumar(int numero1, int numero2) {

//		int res = numero1 + numero2;
		
//		return res;
		
		return numero1 + numero2;
		
		
	}

}
