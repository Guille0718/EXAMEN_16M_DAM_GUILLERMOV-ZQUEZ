package Clases.Avanzadas;

import java.util.Scanner;

public class PruebaArticulos {
	
	public static void main(String[] arg) {
		
//		Articulos comida = new Articulos();
//		Articulos tablet = new Articulos("Samsung", 150.00, 1); //Constructor con parametros
//		Articulos champu = new Articulos("H&S");
		

		
//		comida.nombre = "Hamburguesa";
//		comida.precio = 10.80;
//		
//		System.out.println("Nombre del articulo: " + comida.nombre);
//		System.out.println("Precio del articulo: " + comida.precio);
//		System.out.println("Nombre del articulo: " + tablet.nombre);
//		System.out.println("Precio del articulo: " + tablet.precio);
		
//		System.out.println("El articulo " + tablet.nombre + " con precio " + tablet.precio + " tiene " + tablet.cantidad + " de stock");
		
//		Articulos tablet = new Articulos();
//		Articulos colchon = new Articulos();
//		
//		
//		tablet.setnombre("Samsung");
//		String nombreArticulo = tablet.getnombre();
//		
//		tablet.setprecio(150.0);
//		double precioArticulo = tablet.getprecio();
//		
//		tablet.setcantidad(2);
//		int cantidadArticulo = tablet.getcantidad();
//		
//		System.out.println("El articulo " + tablet.getnombre() + " con precio " + tablet.getprecio() + " tiene " + tablet.getcantidad() + " de stock");
		
		Scanner ent = new Scanner(System.in);
		
		Articulos art1 = new Articulos();
		
		System.out.println("Introduce el nombre: ");
		art1.setnombre(ent.nextLine());
		
		System.out.println("Introduce el precio: ");
//		art1.setprecio = Double.parseDouble(ent.nextLine().replace(',', '.'));
		
		System.out.println("Introduce la cantidad: ");
		art1.setcantidad(Integer.parseInt(ent.nextLine()));
		
		System.out.println(art1);
	
	}
	
}	
