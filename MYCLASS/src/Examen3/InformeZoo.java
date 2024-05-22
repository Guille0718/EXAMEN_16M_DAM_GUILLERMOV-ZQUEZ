package Examen3;

public class InformeZoo {

	public static void main(String[] arg) {
		
		Zoo[]InformeAnimales = {
				
			new Zoo(101, "Oso", "Tierra", "Carne", 4),
			new Zoo(102, "Leon", "Tierra", "Carne", 4),
			new Zoo(103, "Girafa", "Tierra", "Pienso", 6),
			new Zoo(104, "Halcon", "Aire", "Carne", 1),
			new Zoo(105, "Aguila", "Aire", "Carne", 1),
			new Zoo(106, "Guacamayo", "Aire", "Carne", 1),
			new Zoo(107, "Foca", "Agua", "Pescado", 5),
			new Zoo(108, "Morsa", "Agua", "Pescado", 7)	
			
		};
		  
		Zoo.generarInforme();
	}
	
}
