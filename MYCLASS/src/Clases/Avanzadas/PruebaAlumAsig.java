package Clases.Avanzadas;

public class PruebaAlumAsig {
	
	public static void main(String[] arg) {
		
		Asignaturas[] listaAsignaturas = {
				new Asignaturas("Programacion", 0),
				new Asignaturas("BBDD", 0),
				new Asignaturas("FOL", 0),
				new Asignaturas("LMSGI", 0),
				new Asignaturas("S.I", 0),
				new Asignaturas("E.D", 0)
		};
		
		Alumno Guille = new Alumno("Guillermo Vázquez Catalán", " 1º DAM", listaAsignaturas );
		
		System.out.println(Guille);
		
	}

}
