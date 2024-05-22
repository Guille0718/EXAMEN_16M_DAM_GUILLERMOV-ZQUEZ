package Clases.Avanzadas;

public class Articulos {
	
	//Atributos de la clase
//	public String nombre;
//	public double precio;
//	public int cantidad;
	
	private String nombre;
	private double precio;
	private int cantidad;
	
	public Articulos() {
		
		nombre = "Sin definir";
		precio = 0.01;
		cantidad = 0;
		
	}
	
	public Articulos(String nombre, double precio, int cantidad) {
		
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
		
	}
	
//	public Articulos(String nombre) {
//	
//	this.nombre = nombre;
//}
	
	//Getter y Setter	
	public String getnombre() {
		return this.nombre;
	}
	
	public void setnombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getprecio() {
		return this.precio;
	}
	
	public void setprecio(double precio) {
		this.precio = precio;
	}
	
	public int getcantidad() {
		return this.cantidad;
	}
	
	public void setcantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
	
//	public String toString() {
//		return "Articulos: " + getnombre + "cantidad: " + getcantidad + "precio: " + getprecio;
//	}
	
}
