package Clases.Avanzadas;

import java.text.DecimalFormat;

public class Alumno {
	
	//Atributos
	private String Nombre;
	private String Ciclo;
	private Asignaturas[] Asignaturas; //Se pone asi porque es un objeto
	
	//Constructor con parametros
	public Alumno(String Nombre, String Ciclo, Asignaturas[] Asignaturas) {
		
		this.Nombre = Nombre;
		this.Ciclo = Ciclo;
		this.Asignaturas = Asignaturas;
	}
	
	public String toString() {
		
		String salida = "Alumno " + Nombre + " del curso" + Ciclo + "\n Notas: \n";
		
		for(Asignaturas Asig : Asignaturas) {
			salida += "\t" + Asig.getNomAsignatura() + " " + Asig.getNota() + "\n";
		}
		
		DecimalFormat df = new DecimalFormat("#.##");
		
//		salida += "Nota media " + df.format(getMedia());
		
		return salida;
	}
	
	
	
	

}
