package EjercicioAvanzado;

public class Empleado {
	
		//Atributos
		private int idEmpleado;
		private String nombre;
		private String dni;
		private int aniosEmpresa;
		private float sueldoBase;
		private String puesto;
		
		public static int id = 0;
		
		public Empleado(String nombre, String dni, 
						int aniosEmpresa, float sueldoBase, String puesto){
			
			this.nombre = nombre;
			this.dni = dni;
			this.aniosEmpresa = aniosEmpresa;
			this.sueldoBase = sueldoBase;
			this.puesto = puesto;
			this.idEmpleado = ++id;
			
		}	
		
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getDni() {
			return dni;
		}

		public void setDni(String dni) {
			this.dni = dni;
		}

		public int getAniosEmpresa() {
			return aniosEmpresa;
		}

		public void setAniosEmpresa(int aniosEmpresa) {
			this.aniosEmpresa = aniosEmpresa;
		}

		public float getSueldoBase() {
			return sueldoBase;
		}

		public void setSueldoBase(float sueldoBase) {
			this.sueldoBase = sueldoBase;
		}

		public String getPuesto() {
			return puesto;
		}

		public void setPuesto(String puesto) {
			this.puesto = puesto;
		}

		public String toString() {
			
			return "Datos del empleado: \n" + this.nombre + " " + this.dni + " " 
					+ this.aniosEmpresa + " " + getSueldoTotal() + " " + this.puesto ;
		}
		
		public float getSueldoTotal() {
			
			final int suplemento=100, anioTrienio=3;				
			int trienio = aniosEmpresa / anioTrienio;
			
			return sueldoBase + (suplemento *trienio);
		}

}
