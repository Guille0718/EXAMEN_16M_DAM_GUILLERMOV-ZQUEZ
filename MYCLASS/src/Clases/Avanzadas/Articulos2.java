package Clases.Avanzadas;

public class Articulos2 {
		  
		  private String nombre;
		  private float precio;
		  public static int numArticulos2 = 0;
		  private float totalPrecios;
		  
		  //Sin parametros(vacio)
		  public Articulos2() {
			  this.nombre = "Sin definir";
			  this.precio = 0.00f;
			  numArticulos2++;
		  }
		  
		  //Con parametros
		  public Articulos2(String nombre, float precio) {
			  this.nombre = nombre;
			  this.precio = precio;
			  numArticulos2++;
			  totalPrecios = precio;
		  }
		  
		  public void setPrecio(float precio) {
			  
			  this.precio = precio;
			  totalPrecios = (totalPrecios - this.precio) + precio;
			  
		  }

}
