package Repaso;

public class Atleta extends Deportista{
	
	protected String especialidad;
	protected int marca;
	
	public Atleta(String nombre, int edad, String pais, String especialidad, int marca) {
		super(nombre, edad, pais);
		this.especialidad = especialidad;
		this.marca = marca;
	}

}
