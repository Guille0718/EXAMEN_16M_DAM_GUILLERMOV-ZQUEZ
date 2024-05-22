package E.D;

import java.util.Scanner;

public class Sucio1 {
	
	 public static void main(String[] args) {
		 
	        Scanner scanner = new Scanner(System.in);
	        String userResponse;

	        do {
	            System.out.print("Enter a number: ");
	            int number = scanner.nextInt();

	            if (isPrime(number)) {
	                System.out.println(number + " is prime.");
	            } else {
	                System.out.println(number + " is not prime.");
	            }

	            System.out.print("Do you want to check another number? (s/n): ");
	            userResponse = scanner.next();

	        } while (userResponse.equalsIgnoreCase("s"));

	        scanner.close();
	    }

	    private static boolean isPrime(int number) {
	        if (number <= 1) {
	            return false;
	        }

	        for (int i = 2; i < number; i++) {
	            if (number % i == 0) {
	                return false;
	            }
	        }

	        return true;
	    }

}
