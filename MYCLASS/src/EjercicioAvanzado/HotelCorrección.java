package EjercicioAvanzado;

public class HotelCorrección {
	
	//Atributos
	private int numHabitacion;
	private String tipoCama;
	private String tipoVistas;
	private float precioDia;
	private boolean libre;
	
	//Variable estática y final para relacionar en num de habitaciones con la posición del objeto en el el array.
	public static final int DIF = 101; //Es final porque es una constante que no se puede modificar.
	
	//Constructor con parámetros
	public HotelCorrección(int numHabitacion, String tipoCama, String tipoVistas, float precioDia, boolean libre) {
		
		this.numHabitacion = numHabitacion;
		this.tipoCama = tipoCama;
		this.tipoVistas = tipoVistas;
		this.precioDia = precioDia;
		this.libre = libre;
		
	}
	
	public boolean getLibre() {
		return libre;
	}
	
	public void setLibre(boolean reserva) {
		this.libre = reserva;
	}
	
	public String devolver() {
		
		int diasOcupacion = (int)(Math.random() * 5) + 1;
		float precioTotal = diasOcupacion * this.precioDia;
		
		this.libre = true;
		
		return "La habitacion " + numHabitacion + " se ha ocupado " + diasOcupacion + " días con un precio de " + precioDia + "\n Total a pagar: " + precioTotal;
	}
	
	public String toString() {
		return "Habitacion: " + numHabitacion + " con " + tipoCama + " y " + tipoVistas + "\n tiene un precio de " + precioDia + " al día. (ESTADO " + ((libre) ? "disponible":"ocupada") + ").";
	}

	public int getNumHabitacion() {
		return numHabitacion;
	}

}
