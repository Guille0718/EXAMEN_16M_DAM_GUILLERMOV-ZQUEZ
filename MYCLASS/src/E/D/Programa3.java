package E.D;

import java.util.Scanner;

public class Programa3 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Ingrese un número: ");
	        try {
	            int userInput = scanner.nextInt();
	            int result = calculateResult(userInput);
	            System.out.println("El resultado es: " + result);
	        } catch (Exception e) {
	            System.out.println("Error: " + e.getMessage());
	        } finally {
	            scanner.close();
	        }
	    }
	    public static int calculateResult(int input) {
	        if (input < 0) {
	            throw new IllegalArgumentException("El número no puede ser negativo.");
	        }
	        int[] numbers = new int[input];
	        int sum = 0;
	        for (int i = 0; i < input; i++) { 
	            numbers[i] = i + 1; 
	            sum += numbers[i];
	        }
	        return sum;
	    }
}
