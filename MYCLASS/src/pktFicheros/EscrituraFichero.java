package pktFicheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.*; //Se utiliza para importar java.io. entero

public class EscrituraFichero {
	
	public static void main(String [] arg) {
		
		String fichero = "C:\\Users\\guill\\Downloads";
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		
		try {
			FileWriter fw = new FileWriter(new File(fichero), false);
			BufferedWriter bw = new BufferedWriter(fw);
			
			System.out.println("Introduzca un número entero");
			int num = Integer.parseInt(br.readLine());
			
			for(int i = 1 ; i<= 10 ; i++) {
				bw.write(num + " X " + i + " = " + (num*i));
				bw.newLine();
			}
			
			br.close();
			bw.close();
			fw.close();
			
//			bw.write("Hola mundo");
			
//			bw.close();
			
			//Poner bw.flush(); si tenemos que seguir actualizando el fichero y finalmente poner bw.close(); cuando queramos cerrarlo.
			
		}catch(IOException excep) {
			System.out.println("Error E/S");
		}catch(NumberFormatException excep) {
			System.out.println("Número no válido");
		}
		
	}

}
