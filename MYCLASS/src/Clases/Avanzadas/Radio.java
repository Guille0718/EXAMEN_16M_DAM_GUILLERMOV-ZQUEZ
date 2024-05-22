package Clases.Avanzadas;

//public class Radio {

//	    private double frecuencia;
//	    private int volumen;
//	    private String canal;
//	    private final String FM = "FM", AM = "AM";
//	    private final int limMinFM = 30, limVminFM = 0, limMinAM = 10, limVminAM = 3;
//	    private final int limMaxFM = 80, limVmaxFM = 20, limMaxAM = 40, limVmaxAM = 10;
//	    //Saltos AM y FM
//	    private int saltoFM = 5, saltoAM = 3, saltoVolFM = 5, saltoVolAM = 2;
//
//	    public Radio() {
//	    	this.canal = CanalesRadio.FM.toString();
//	    	this.frecuencia = limMinFM;
//	    	this.volumen = limVminFM;
//	        reset(); //un método reset(); que pone los atributos a valores por defecto.
//	    }
//	    
//	    Radio.subirfrecuencia(3); //Incrementa la frecuencia en 3
//	    
//	    public void subirFrecuencia() {
//	        double stepSize;
//
//	        if(canal.equals("FM")) {
//	            if(frecuencia < 40) {
//	                stepSize = 1;
//	            } else if(frecuencia < 60) {
//	                stepSize = 2;
//	            } else {
//	                stepSize = 5;
//	            }
//	        } else {
//	            if(frecuencia < 20) {
//	                stepSize = 1;
//	            } else if(frecuencia < 30) {
//	                stepSize = 2;
//	            } else {
//	                stepSize = 5;
//	            }
//	        }
//
//	        frecuencia += stepSize;
//
//	        if(canal.equals("FM")) {
//	            if(frecuencia > 80) {
//	                frecuencia = 80;
//	            }
//	        } else {
//	            if(frecuencia > 40) {
//	                frecuencia = 40;
//	            }
//	        }
//	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    

//	    public void subirFrecuencia() {
//	        if (canal.equals("FM")) {
//	            frecuencia += 5;
//	            if (frecuencia > 80) {
//	                frecuencia = 30;
//	            }
//	        } else {
//	            frecuencia += 3;
//	            if (frecuencia > 40) {
//	                frecuencia = 10;
//	            }
//	        }
//	    }
//
//	    public void bajarFrecuencia() {
//	        if (canal.equals("FM")) {
//	            frecuencia -= 5;
//	            if (frecuencia < 30) {
//	                frecuencia = 80;
//	            }
//	        } else {
//	            frecuencia -= 3;
//	            if (frecuencia < 10) {
//	                frecuencia = 40;
//	            }
//	        }
//	    }
//
//	    public void subirVolumen() {
//	        volumen += 1;
//	        if (volumen > 20) {
//	            volumen = 0;
//	        }
//	    }
//
//	    public void bajarVolumen() {
//	        volumen -= 1;
//	        if (volumen < 0) {
//	            volumen = 20;
//	        }
//	    }
//
//	    public void cambiarCanal() {
//	        if (canal.equals("FM")) {
//	            canal = "AM";
//	            frecuencia = 10;
//	            volumen = 3;
//	        } else {
//	            canal = "FM";
//	            frecuencia = 30;
//	            volumen = 0;
//	        }
//	    }
//
//	    public void reset() {
//	        canal = "FM";
//	        frecuencia = 30;
//	        volumen = 0;
//	    }

//	    public String toString() {
//	        return "Canal: " + this.canal + "Frecuencia: \n" + this.frecuencia + "Mhz" + "Volumen: \n" + this.volumen + "dB";
//	    }
//}


