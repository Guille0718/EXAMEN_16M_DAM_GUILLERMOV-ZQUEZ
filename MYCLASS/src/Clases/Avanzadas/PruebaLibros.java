package Clases.Avanzadas;

public class PruebaLibros {
	
	 public static void main(String[] args) {
	        Libros libro1 = new Libros("Libro de prueba 1", "Autor de prueba 1", 2000, 5);
	        System.out.println(Libros.numTotalCopias);
	        Libros libro2 = new Libros("Libro de prueba 2", "Autor de prueba 2", 2010, 10);
	        System.out.println(Libros.numTotalCopias);

	        libro1.mostrarInfo();
	        libro1.prestarLibro(3);
	        libro1.mostrarInfo();
	        libro1.devolverLibro(2);
	        libro1.mostrarInfo();

	        libro2.mostrarInfo();
	        libro2.prestarLibro(6);
	        libro2.mostrarInfo();
	        libro2.devolverLibro(5);
	        libro2.mostrarInfo();
	    }

}
