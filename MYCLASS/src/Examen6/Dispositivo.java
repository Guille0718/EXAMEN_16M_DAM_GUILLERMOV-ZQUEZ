package Examen6;

public class Dispositivo {
	
	String marca;
    String modelo;
    String codigoSerie;

    public Dispositivo(String marca, String modelo, String codigoSerie) {
        this.marca = marca;
        this.modelo = modelo;
        this.codigoSerie = codigoSerie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCodigoSerie() {
        return codigoSerie;
    }
    
    public void setCodigoSerie(String codigoSerie) {
    	this.codigoSerie = codigoSerie;
    }
    
    public String toString() {
    	
    
    	return "Nombre de la marca" + marca + " nombre del modelo " + modelo + " codigo de serie del dispositivo " + codigoSerie;
    	
    }

}
