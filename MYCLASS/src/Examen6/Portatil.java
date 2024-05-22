package Examen6;

public class Portatil extends Dispositivo {	

	    private float peso;

	    public Portatil(String marca, String modelo, String codigoSerie, float peso) {
	        super(marca, modelo, codigoSerie);
	        this.peso = peso;
	    }

	    public float getPeso() {
	        return peso;
	    }

	    public void setPeso(float peso) {
	        this.peso = peso;
	    }

	    public String toString() {
	        return "Portatil { " + " marca='" + getMarca() + '\'' + ", modelo='" + getModelo() + '\'' + ", codigoSerie='" + getCodigoSerie() + '\'' + ", peso=" + peso +'}';
	    }
}


