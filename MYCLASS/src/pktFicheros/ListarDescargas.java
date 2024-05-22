package pktFicheros;

import java.io.File;

public class ListarDescargas {
	
	public static void main(String [] arg) {
		
		String ruta = "C\\:Users\\Clase\\Downloads";
		File raiz = new File(ruta);
		int totalDir = 0, totalArch = 0;
		String listaA = "", listaD = "";
		
		if(raiz.isDirectory()) {
			System.out.println("Total archivos: " + raiz.list().length);
			for(File archivo: raiz.listFiles()){
				if(!archivo.isFile()) {
					totalDir++;
					listaD = archivo.getName() + "\n"; 
				}else {
					totalArch ++;	
				listaA = archivo.getName() + "\n";
				}
				
			}
		}else {
			System.out.println("No es un escritorio");
		}
		System.out.println("Directorios -> " + totalDir + "\n" + listaD);
		System.out.println("Directorios -> " + totalDir + "\n" + listaA);
		
	}

}
