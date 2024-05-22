package miHospital;

public class Enfermero extends PersonalMedico {
	
	public Enfermero(String nombre, String puesto) {
		super(nombre, puesto);
	}
	
	public String administrar() {
		return "Administrando medicamento";
	}

}
