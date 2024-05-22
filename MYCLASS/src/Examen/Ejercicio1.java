package Examen;

import java.util.Scanner;

public class Ejercicio1 {
	
	public static void main(String[] arg) {
		
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Introduce el salario mensual del empleado: ");
		double salarioMensual = ent.nextDouble();
		double salarioAnual = salarioMensual * 14;
		double impuesto = 0;
		
		  if(salarioAnual < 15000) {
		      impuesto = salarioAnual * 0.09;
		  }else if (salarioAnual >= 15000 && salarioAnual < 25000) {
		      impuesto = salarioAnual * 0.12;
		  }else if (salarioAnual >= 25000 && salarioAnual < 50000) {
		      impuesto = salarioAnual * 0.20;
		  }else if (salarioAnual >= 50000) {
		      impuesto = salarioAnual * 0.25;
		  }

		      System.out.println("El IRPF a pagar es: " + impuesto + "€");	
	}

}
