package Clases.Avanzadas;

public class Personas {
	
	//Declaracion de atributos
	private String nombre;
	private String dni;
	private int tfno;
	
	//Constructor sin parámetros
	public Personas() {
		
		nombre = " ";
		dni = " ";
		tfno = 0;
		
	}
	
	//Constructor con parámetros
	public Personas(String nombre, String dni, int tfno) {
		
		this.nombre = nombre;
		this.dni = dni;
		this.tfno = tfno;
	}
	

}
