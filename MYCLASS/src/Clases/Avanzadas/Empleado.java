package Clases.Avanzadas;

public class Empleado {
	
	private String nombre;
	private String dni;
	private int aniosEmpresa;
	private float sueldoBase;
	private String puesto;
	
	public Empleado(String nombre, String dni, int aniosEmpresa, float sueldoBase, String puesto) {
		
		this.nombre = nombre;
		this.dni = dni;
		this.aniosEmpresa = aniosEmpresa;
		this.sueldoBase = sueldoBase;
		this.puesto = puesto;
		
	}
	
	public float getSueldoTotal() {
		
		final int suplemento = 100, anioTrienio = 3;
		
		return anioTrienio;
		
		
	}
	
	public String toString() {
		
		return "Datos del empleado: " + this.nombre + " " + this.dni + " " + this.aniosEmpresa + " " + this.sueldoBase + " " + this.puesto;
		
	}

	public String getNombre() {
		
		return nombre;
		
	}

	public String getPuesto() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setPuesto(String string) {
		// TODO Auto-generated method stub
		
	}

	public String getDni() {
		// TODO Auto-generated method stub
		return null;
	}

//	public float getSueldoTotal() {
//		
//		return 0;
//	}
	

}
