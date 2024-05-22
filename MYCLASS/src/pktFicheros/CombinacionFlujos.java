package pktFicheros;

import java.io.IOException;
import java.io.InputStreamReader;

public class CombinacionFlujos {
	
	public static void main(String [] arg) {
		
		InputStreamReader input = new InputStreamReader(System.in);
//		BufferReadder br = new BufferReader(input);
		String nombre = " ";
		System.out.println("Introduce tu nombre");
		
		try {
			nombre = String.valueOf(input.read());
			
		}catch(IOException excep) {
			System.out.println("Error");
		}
		
		
	}

}
