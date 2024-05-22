package E.D;

import java.util.Scanner;

public class CalculadoraBasica {
	
	Scanner ent = new Scanner(System.in);
	
    public static double calcularResultado(double a, double b, char operacion) {
    	
        double resultado = 0.0;

        switch (operacion) {
            case '+':
                resultado = a + b;
                System.out.printf("%.2f + %.2f = %.2f%n", a, b, resultado);
                break;
            case '-':
                resultado = a - b;
                System.out.printf("%.2f - %.2f = %.2f%n", a, b, resultado);
                break;
            case 'x':
            case '*':
                resultado = a * b;
                System.out.printf("%.2f x %.2f = %.2f%n", a, b, resultado);
                break;
            case '/':
                if (b != 0) {
                    resultado = a / b;
                    System.out.printf("%.2f / %.2f = %.2f%n", a, b, resultado);
                } else {
                    System.out.println("División por cero no permitida");
                }
                break;
            default:
                System.out.println("Caracter no reconocido");
        }

        return resultado;
    }

}