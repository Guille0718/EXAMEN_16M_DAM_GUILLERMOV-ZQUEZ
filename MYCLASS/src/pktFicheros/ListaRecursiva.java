package pktFicheros;

import java.io.File;
import java.io.IOException;

public class ListaRecursiva {
	
	public static void main(String [] arg) {
		
		String ruta = "C:\\Users\\guill\\Downloads";
		File raiz = new File(ruta);
		
		EscanearDir(raiz);
		
	}
	
	private static void EscanearDir(File ruta) {
		
		try {
			
		System.out.println(ruta.getCanonicalPath());
		for(File archivo : ruta.listFiles()) {
			if(archivo.isDirectory()) {
				EscanearDir(archivo);
			}else {
				System.out.println("- " + archivo.getName());
			}				
		}
		
	}catch(IOException excep) {
		System.out.println("Error IO");
		}

	}
}
