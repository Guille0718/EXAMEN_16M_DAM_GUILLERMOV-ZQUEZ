package examen2;

import java.util.Scanner;

public class Ejercicio1 {
	
	public static void main(String[] arg) {

	        Scanner ent = new Scanner(System.in);
	        
	        System.out.println("Introduce el precio del artículo: ");
	        double precio = Double.parseDouble(ent.nextLine().replace(',' , '.'));
	        System.out.println("Introduce la cantidad de artículos: ");
	        int cantidad = ent.nextInt();
	        System.out.println("Introduce el suplemento: ");
	        double suplemento = Double.parseDouble(ent.next().replace(',' , '.'));
	        
	        double importe = ImporteTotal(precio, cantidad, suplemento);
	        System.out.println("El importe es: " + importe);

	    }

	    public static double ImporteTotal(double precio, int cantidad, double suplemento) {

	        double importeTotal = (precio + suplemento) * cantidad;
	        return importeTotal;
	   }
}

