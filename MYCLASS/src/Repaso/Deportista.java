package Repaso;

public class Deportista {
	
	//Atributos
	protected String nombre;
	protected int edad;
	protected String pais;
	
	//COnstructor vacio(Constructor = metodo que se llama igual que la clase)
	public Deportista() {
		this.nombre = " ";
		this.edad = 0;
		this.pais = " ";		
	}
	
	//Constructor con parametros
	public Deportista(String nombre, int edad, String pais) {
		this.nombre = nombre;
		this.edad = edad;
		this.pais = pais;
	}
	
	//Constructor copia(se usa poco)
	public Deportista(Deportista dep) {
		this.nombre = dep.nombre;
		this.edad = dep.edad;
		this.pais = dep.pais;
	}

	public String getNombre() {
		return nombre;	
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;	
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getPais() {
		return pais;	
	}
	
	public void setPais(String pais) {
		this.pais = pais;
	}

	public String mostrar() {
		return "Atleta";
	}
	
	public int compareTo(Deportista o) {
//		return this.edad - o.getEdad();
		return this.nombre.compareTo(o.getNombre());
	}

}
