package pktFicheros;

import java.util.Arrays;

public class Profesor extends Persona{
	
	private String[] asignaturas;
	private float salario;

	public Profesor(String nombre, String apellidos, String dni, String[] asig,float salario) {
		super(nombre, apellidos, dni);
		this.asignaturas=asig;
		this.salario=salario;
	}

	@Override
	public String toString() {
		return "Profesor [asignaturas=" + Arrays.toString(asignaturas) + ", salario=" + salario + "]";
	}

}
