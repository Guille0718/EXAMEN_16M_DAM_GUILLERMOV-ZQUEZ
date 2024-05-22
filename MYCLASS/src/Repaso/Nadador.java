package Repaso;

public class Nadador extends Deportista{
	
	protected String estilo;
	protected int marca;

	public Nadador(String nombre, int edad, String pais, String estilo, int marca) {
		super(nombre, edad, pais);
		this.estilo = estilo;
		this.marca = marca;
	}
}
