package examen2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
	
	 public static void main(String[] arg) {		

	     Scanner ent = new Scanner(System.in);
	     String frase;
	     String FraseLarga = "";
	     int FraseLargaCuentaPalabras = 0;
	     
	     while(true) {
 
	         System.out.println("Ingrese una frase:");
	                frase = ent.nextLine(); //ent.nextLine devuelve un String

	                if(frase.equalsIgnoreCase("Terminar")) {
	                    break;
	                }	                
	                int contador = CuentaPalabras(frase);
	                
	                if(contador > FraseLargaCuentaPalabras) {
	                    FraseLarga = frase;
	                    FraseLargaCuentaPalabras = contador;
	                }
	            }
	     
	     System.out.println("La frase con la mayor cantidad de palabras es: " + FraseLarga);
	}

	public static int CuentaPalabras(String entrada) {
	        	
	    String[] palabras = entrada.split("\\s"); //El método split("\\s") en Java se utiliza para dividir una cadena en subcadenas utilizando un espacio en blanco como separador. El método devuelve un array de subcadenas. Por ejemplo, si tenemos la cadena “Hola mundo” y aplicamos el método split("\\s"), obtendremos un array con dos elementos: “Hola” y “mundo”. En el caso de la cadena “Hola-mundo”, si aplicamos el método split("\\s"), obtendremos un array con un solo elemento: “Hola-mundo”, ya que no hay espacios en blanco en la cadena.
	    System.out.println("Array: \n" + Arrays.toString(palabras)); //El metodo.split("\\s") se utiliza para separar palabras cuando hay espacio en blanco en la frase ejemplo(mi arbol es maron y verde) = "mi" "arbol" "es"... esto es lo que devolvería
	            
	    return palabras.length; //Return se utiliza cuando queremos devolver un dato o si nos pide el ejercicio que tenemos que devolver un dato     
	    }		
}


