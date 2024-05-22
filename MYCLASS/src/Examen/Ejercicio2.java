package Examen;

public class Ejercicio2 {
	

	public static void main(String[] arg) {

		
		for (int i = 0; i <= 500; i += 50) {		
			double fahrenheit = (i - 273.15) * 9 / 5 + 32;
            System.out.println(i + "°K -> " + fahrenheit + "°F");
        }
		
		System.out.println("Conversión realizada");	
	}

}
