package E.D;

public class Trabajo_parejas {
	
	public static void main(String[] arg) {
		
		        int numero = 5;
		        boolean Par = NumeroPar(numero);

		        if(Par) {
		            System.out.println(numero + " es par.");
		        } else {
		            System.out.println(numero + " es impar.");
		        }
		    }

		    public static boolean NumeroPar(int numero) {
		        return numero % 2 == 0;
		    }

}


//    public static void main(String[] arg) {
//        System.out.println("Hola mundo!");
//
//        int numero1 = 5;
//        int numero2 = 10;
//        int sum = numero1 + numero2;
//        (hay que poner sum += numero1 + numero2;)
//
//        System.out.println("La suma de " + numero1 + " y " + numero2 + " es " + sum);
//}

