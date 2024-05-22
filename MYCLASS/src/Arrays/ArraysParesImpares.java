package Arrays;

import java.util.Scanner;

public class ArraysParesImpares {
	
	public static void main(String[] arg) {		
		
		Scanner ent = new Scanner(System.in);
		
		int[] numero = new int[10];
			
		rellenar(numero);
			
		contar(numero);
		
	}
	
	public static void rellenar(int[] numero) {
		
		for(int i = 0 ; i < numero.length ; i++) {
			numero[i] = (int)(Math.random() * 10) + 1;
		}
		
	}
	
	public static void contar(int[] numero) {
		
		int numPares = 0;
		int numImpares = 0; 
		
		for(int num : numero) {
			if(num % 2 == 0) {
				numPares++;
			}else {
				numImpares++;
			}
		}
		
	}

}
