package Arrays;

public class PrimerArray {
	
	public static void main(String[] arg) {
			
		int size = 10;
		
		int[] miLista = new int[size]; //Ddecalración e instancia del array
		
		System.out.println(miLista.length + " elementos");
		
		miLista[6] = 123;
		
		for(int i = 0 ; i < miLista.length ; i++) {
			System.out.println("Posición del array " + i + " contiene " + miLista[i]);
			
			miLista[i] = (int)(Math.random() *10) + 1;
		}
			
		//foreach para demostrar los elementos del array
		for (int elementoIterador : miLista) {
			
			System.out.println("Valor " + elementoIterador);
			
		}
		
	}

}
