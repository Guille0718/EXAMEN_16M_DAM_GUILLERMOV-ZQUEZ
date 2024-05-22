package E.D;

import java.util.Scanner;

public class Programa2 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Ingrese un número: ");
	        try {
	            int userInput = scanner.nextInt();
	            int result = calculateSquare(userInput);
	            System.out.println("El cuadrado del número es: " + result);
	        } catch (Exception e) {
	            System.out.println("Error: " + e.getMessage());
	        } finally {
	            scanner.close();
	        }
	    }
	    public static int calculateSquare(int input) {
	        if (input < 0) {
	            throw new IllegalArgumentException("No se puede calcular el cuadrado de un número negativo.");
	        }
	        // Aquí hay un error en la lógica: debería ser input * input en lugar de input + input
	        return input * input;
	    }
}
