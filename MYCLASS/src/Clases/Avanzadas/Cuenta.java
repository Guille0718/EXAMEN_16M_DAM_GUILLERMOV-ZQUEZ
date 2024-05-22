package Clases.Avanzadas;

public class Cuenta {
	
	private String titular;
    private double cantidad;

    //Constructor 1: Titular obligatorio, cantidad opcional
    public Cuenta(String titular) {
    	
        this.titular = titular;
        this.cantidad = 0.0;
    }

    //Constructor 2: Titular obligatorio, cantidad opcional
    public Cuenta(String titular, double cantidad) {
    	
        this.titular = titular;
        this.cantidad = cantidad;
    }
    
    //Getter y Setter
    public String getTitular() {
        return titular;
    }
    
    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public double getCantidad() {
        return cantidad;
    }
    

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    //Métodos ingresar y retirar
    public void ingresar(double cantidad) {
        if(cantidad > 0) {
            this.cantidad += cantidad;
        }
    }

    public void retirar(double cantidad) {
        if(cantidad > 0 && cantidad <= this.cantidad) {
            this.cantidad -= cantidad;
        }
    }
    
    public String toString() {
        return "Cuenta de " + titular + " con saldo de " + cantidad + " euros";
    }
    
}
