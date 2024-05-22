package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAlturas {
	
	public static void main(String[] arg) {	
				
		Scanner ent = new Scanner(System.in);
		
		int personas = 0;
		
		float[] alturas;
		
		System.out.println("¿Cuántas personas son?");
		personas = Integer.parseInt(ent.nextLine());
		alturas = new float[personas];
		
//		float media = rellenar(ent, alturas);
		
		
		float media = rellenar(ent, alturas);
		System.out.println("Array: \n" + Arrays.toString(alturas));
		System.out.println("La altura media es " + media);
		mostrar(alturas, media);
		mostrarOrdenado(alturas);
		
		
	}
	
	public static float rellenar(Scanner ent, float[] alturas) {
		
		float total = 0.0f;
				
		for(int i = 0 ; i < alturas.length ; i++) {
			System.out.println("Introduce la altura de la " + (i+1) + " persona");
			alturas[i] = Float.parseFloat(ent.nextLine().replace(',', '.'));
			total += alturas[i];
		}
		
		return total/alturas.length;
		
	}
	
	public static void mostrar(float[] alturas, float media) {
		
//		System.out.println("La altura media es " + rellenar(ent, alturas));
		
		int num = 0;
		
		//Foreach
		for(float altura : alturas) {
			if(altura > media) {
				num++;
			}
			
		}
	}
		
		public static void mostrarOrdenado(float[] alturas) {
			
			 float aux = 0.0f;
			
			//Ejecutamos la ordenación para todos los elementos
			for(int i = 0 ; i < alturas.length - 1 ; i++) {	
				//Recorremos con J los elementos para ordenar
				for(int j = 0 ; j < alturas.length - 1 ; j++) {
					
					if(alturas[j] > alturas[j + 1]) {
						aux = alturas[j];
						alturas[j] = alturas[j + 1];
						alturas[j + i] = aux;
					}				
			}
			
		}
			
			 System.out.println("Ordenado " + Arrays.toString(alturas));
		
	}

}
