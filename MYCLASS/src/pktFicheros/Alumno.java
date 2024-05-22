package pktFicheros;

public class Alumno extends Persona{
	
	private String ciclo;
	private float notaMedia;
	
	public Alumno(String nombre, String apellidos, String dni, String ciclo, float notaMedia) {
		super(nombre, apellidos, dni);
		this.ciclo = ciclo;
		this.notaMedia = notaMedia;
	}
	
public String toString() {
	return super.toString()+" " + ciclo+ " nota: "+notaMedia;
}

}
