package pktFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LecturaFicheros {
	
	public static void main(String [] arg) {
		
		String fichero = "C:\\Users\\guill\\Downloads";
		File aLeer = new File(fichero);
		
		try {
	
		FileReader fr = new FileReader(new File(fichero));
		BufferedReader br = new BufferedReader(fr);
		
		while(br.ready()) {
		System.out.println("Linea ->" + br.readLine());
		}
		
		}catch(FileNotFoundException excep) {
			
			System.out.println("Fichero no encontrado");
			
		}catch(IOException excep) {
			System.out.println("Error de Lectura/Escritura");
		}
		
		
	}

}
