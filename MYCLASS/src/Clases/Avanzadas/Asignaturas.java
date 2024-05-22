package Clases.Avanzadas;

public class Asignaturas {
	
	private String NomAsignatura;
	private double Nota;
	
	public Asignaturas(String NomAsignatura, double Nota) {
		
		this.NomAsignatura = NomAsignatura;
		this.Nota = Nota;
	}
	
	public String getNomAsignatura() {
		
		return NomAsignatura;
	}
	
	public double getNota() {
		
		return Nota;
	}
	
	public String getCalificacion() {
		
		String Calificacion = " ";
		
		if(Nota >= 9) {
			Calificacion = "Sobresaliente";
		}else if(Nota >= 9) {
			Calificacion = "Sobresaliente";
		}else if(Nota >= 9) {
			Calificacion = "Sobresaliente";
		}else if(Nota >= 9) {
			Calificacion = "Sobresaliente";
		}else if(Nota >= 9) {
			Calificacion = "Sobresaliente";
		}else if(Nota >= 9) {
			Calificacion = "Sobresaliente";
		}else if(Nota >= 9) {
			Calificacion = "Sobresaliente";
		}else if(Nota >= 9) {
			Calificacion = "Sobresaliente";
		}else if(Nota >= 9) {
			Calificacion = "Sobresaliente";
		
		return Calificacion;
	}
		return Calificacion;

	}
}
