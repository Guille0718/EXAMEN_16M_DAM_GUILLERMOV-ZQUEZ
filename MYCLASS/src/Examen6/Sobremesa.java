package Examen6;

public class Sobremesa extends Dispositivo {
	
	    private int ventiladores;

	    public Sobremesa(String marca, String modelo, String codigoSerie, int ventiladores) {
	        super(marca, modelo, codigoSerie);
	        this.ventiladores = ventiladores;
	    }

	    public int getVentiladores() {
	        return ventiladores;
	    }

	    public void setVentiladores(int ventiladores) {
	        this.ventiladores = ventiladores;
	    }
	    
	    public String toString() {
	        return "Sobremesa { " + " marca= '" + getMarca() + '\'' + ", modelo= '" + getModelo() + '\'' + ", codigoSerie= '" + getCodigoSerie() + '\'' + ", ventiladores= " + ventiladores +'}';
	  }
}


