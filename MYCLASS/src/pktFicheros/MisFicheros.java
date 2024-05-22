package pktFicheros;

import java.io.File;

public class MisFicheros {
	
	public static void main(String [] arg) {
		
		String ruta = "C\\:Users\\Clase\\Downloads";
		String ruta2 = "C\\:Users\\Clase\\Downloads\\montaje.csv";
		String ruta3 = ".\\";
		
		File archivo = new File(ruta);
		File archivo2 = new File(ruta, "montaje.csv");
		File archivo3 = new File(ruta, "montaje.csv");
		
		System.out.println(archivo.getAbsolutePath());
		System.out.println(archivo2.length());
		
		
		
		
	}

}
