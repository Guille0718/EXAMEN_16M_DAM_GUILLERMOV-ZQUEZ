package Examen;

import java.util.Scanner;

public class Corrección1 {

	public static void main(String[] arg) {
		
		Scanner ent = new Scanner(System.in);
		float salario=0.0f, salAnual=0.0f;
		final int MENSUALIDADES=14, SALARIO1=15000, SALARIO2=25000, SALARIO3=50000;
		
		System.out.println("Introduce tu salario: ");
		salario = Float.parseFloat(ent.nextLine().replace(',','.'));
		
		 if(salario < SALARIO1) {
		      System.out.println("Tu IRPF es de 9%");
		 }else if (salario >= SALARIO1 && salario < SALARIO2) {
			 System.out.println("Tu IRPF es de 12%");
		 }else if (salario >= SALARIO2 && salario < SALARIO3) {
			 System.out.println("Tu IRPF es de 20%");
		 }else if (salario >= SALARIO3) {
			 System.out.println("Tu IRPF es de 25%");
		 }
	}
}
