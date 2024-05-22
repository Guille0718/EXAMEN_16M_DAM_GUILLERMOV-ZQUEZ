package E.D.TRABAJO;

//import java.util.ArrayList;
//import java.util.Scanner;

public class Chuchería{

	    private String nombre;
	    private int cantidad;

	    public Chuchería(String nombre, int cantidad) {
	        this.nombre = nombre;
	        this.cantidad = cantidad;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public int getCantidad() {
	        return cantidad;
	    }

	    public void agregarChuches(int cantidad) {
	        this.cantidad += cantidad;
	    }

	    public void eliminarChuches(int cantidad) {
	        if (this.cantidad >= cantidad) {
	            this.cantidad -= cantidad;
	        } else {
	            System.out.println("No hay suficientes chuches para eliminar.");
	        }
	    }

	    public void actualizarChuches(int nuevaCantidad) {
	        this.cantidad = nuevaCantidad;
	    }

	    public void venderChuches(int cantidad) {
	        if (this.cantidad >= cantidad) {
	            this.cantidad -= cantidad;
	            System.out.println("Venta realizada. ¡Disfruta tus chuches!");
	        } else {
	            System.out.println("No hay suficientes chuches para vender.");
	      }
	 }
}
	
