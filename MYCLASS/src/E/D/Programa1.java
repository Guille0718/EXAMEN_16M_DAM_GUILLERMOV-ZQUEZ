package E.D;

public class Programa1 {
	
	 public static void main(String[] args) {
		 		 
	    int[] numbers = {1, 2, 3, 4, 5};
	        
	    for (int i = 0; i < numbers.length; i++) {
	    	        	
	       int divisor = 0;
	       try {
	    	   
	          int result = divideNumbers(numbers[i], divisor);
	                System.out.println("Resultado: " + result);
	          } catch (ArithmeticException e) {
	                System.out.println("Error: División por cero");
	          } catch (ArrayIndexOutOfBoundsException e) {
	                System.out.println("Error: Índice fuera de rango");
	          }
	       }
	    }

	    public static int divideNumbers(int a, int b) {
	        return a / b;
	    }
}
