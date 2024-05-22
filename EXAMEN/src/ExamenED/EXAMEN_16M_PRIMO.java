package ExamenED;

import java.util.Scanner;

public class EXAMEN_16M_PRIMO {
	
	public static void main(String[] args) {
		
        Scanner ent = new Scanner(System.in);
        System.out.print("Por favor, ingresa un número entero positivo: ");
        int numero = ent.nextInt();

        if (numero > 0) {
            if (esPrimo(numero)) {
                System.out.println(numero + " es un número primo.");
            } else {
                System.out.println(numero + " no es un número primo.");
            }
        } else {
            System.out.println("El número debe ser entero positivo.");
        }
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
