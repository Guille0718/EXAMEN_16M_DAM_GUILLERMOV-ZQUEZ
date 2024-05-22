package Examen;

public class Ejercicio3 {

	public static void main(String[] arg) {
			
		//DECLARACIÓN DE VARIABLES
		int menor = Integer.MAX_VALUE;
		
		//COMIENZO EL BUCLE
		for(int i = 0; i < 100; i++) {
            int randomNum = (int)(Math.random() * 50) +1;
            System.out.println(randomNum);
             
		}
		System.out.println("El menor número aleatorio es: " + menor);	
		
		System.out.println("Aqui tiene los 100 numero aleatorios pedidos entre los número propuestos y el número más bajo entre ellos");
		
	} //FIN MAIN
} //FIN CLASE