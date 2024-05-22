package Examen3;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	
	private int IDanimal;
	private String Raza;
	private String Habitat;
	private String Comida;
	private double KgComida;
	
	public static final int DIF = 101;
	public static final String generarInforme = null;
	private static final List<Zoo> AnimalesPorHabitat = null;
	
	public Zoo(int IDanimal, String Raza, String Habitat, String Comida, double KgComida) {
		
		this.IDanimal = IDanimal;
		this.Raza = Raza;
		this.Habitat = Habitat;
		this.Comida = Comida;
		this.KgComida = KgComida;
		
	}
	
	private List<Zoo> animales;
	
	 public Zoo() {
		 animales = new ArrayList<>();
	    }
	
	public void addAnimal(Zoo animal) {
		animales.add(animal);
    }
	
	public String getComida() {
		
		return Comida;
		
	}

	public void CosteMantenimiento() {
		
		double TerrestreCoste = 15 * Habitat("tierra");
		double JaulasCoste = 20 * Habitat("aire");
		double EstanqueCoste = 45 * Habitat("agua");
	
		System.out.println("Costes de mantenimiento diario:");
		System.out.println("Habitat terrestres: " + TerrestreCoste + " €");
		System.out.println("Jaulas de aves: " + JaulasCoste + " €");
		System.out.println("Estanques: " + EstanqueCoste + " €");
	}
	
	private int Habitat(String string) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void ComidaSemanal( double KgComida) {
		
		double CarneSemanal = 11 * 7;
		double PiensoSemanal = 6 * 7;
		double PescadoSemanal = 12 * 7;
		
		System.out.println("Costes de comida semanal:");
		System.out.println("Carne: " + CarneSemanal + " €");
		System.out.println("Pienso: " + PiensoSemanal + " €");
		System.out.println("Pescado: " + PescadoSemanal + " €");
		
	}

	public void mostrarInfo() {
        System.out.println("Identificación del animal: " + IDanimal);
        System.out.println("Especie: " + Raza);
        System.out.println("Tipo de habitat: " + Habitat);
        System.out.println("Comida que consume: " + Comida);
        System.out.println("Cantidad de comida que consume diaria: " + KgComida);
    }

	public static void generarInforme() {
		// TODO Auto-generated method stub
		
	}
	
}
