package Clases.Avanzadas;

//import java.util.ArrayList;
//import java.util.List;

public class Libros {

	    private String titulo;
	    private String autor;
	    private int añoPublicacion;
	    private int numCopiasDisponibles;
	    private int numCopiasPrestadas;
	    public static int numTotalCopias = 0;
	    
	    
		public Libros(String string, String string2, int i, int j) {
			// TODO Auto-generated constructor stub
		}
		
		//Constructor con parametros
		public void Libro(String titulo, String autor, int añoPublicacion, int numCopiasDisponibles, int numCopiasPrestadas) {
	        this.titulo = titulo;
	        this.autor = autor;
	        this.añoPublicacion = añoPublicacion;
	        this.numCopiasDisponibles = numCopiasDisponibles;
	        this.numCopiasPrestadas = numCopiasPrestadas;
	        numTotalCopias += numCopiasDisponibles + numCopiasPrestadas;
	    }

	    public void prestarLibro(int numCopias) {
	        if(numCopias <= numCopiasDisponibles) {
	            numCopiasDisponibles -= numCopias;
	            numCopiasPrestadas += numCopias;
	        }else {
	            System.out.println("No hay suficientes copias disponibles para prestar.");
	        }
	    }

	    public void devolverLibro(int numCopias) {
	        if(numCopias <= numCopiasPrestadas) {
	            numCopiasDisponibles += numCopias;
	            numCopiasPrestadas -= numCopias;
	        }else {
	            System.out.println("No se han prestado tantas copias.");
	        }
	    }

	    public void mostrarInfo() {
	        System.out.println("Título: " + titulo);
	        System.out.println("Autor: " + autor);
	        System.out.println("Año de publicación: " + añoPublicacion);
	        System.out.println("Copias disponibles: " + numCopiasDisponibles);
	        System.out.println("Copias prestadas: " + numCopiasPrestadas);
	        System.out.println("Número total de copias: " + numTotalCopias);
	    }
	    
}
