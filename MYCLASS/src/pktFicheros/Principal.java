package pktFicheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class Principal {
	
	public static void main(String[] args)  {
		ArrayList<Persona> lista = new ArrayList<Persona>();
		
		try {
			FileReader fr = new FileReader("ceinmark.csv");
			BufferedReader br = new BufferedReader(fr);
			String linea="";
			String []	datosLinea=null;
			while(br.ready()) {
				linea =br.readLine();
//				System.out.println(linea);
				datosLinea= linea.split(";");
				if(datosLinea[0].equalsIgnoreCase("A")) {
					lista.add(new Alumno(datosLinea[1],datosLinea[2]+" "+ datosLinea[3],datosLinea[4],datosLinea[5],Float.parseFloat(datosLinea[6])));
				}else {
					lista.add(new Profesor(datosLinea[1],datosLinea[2]+" "+ datosLinea[3],datosLinea[4],datosLinea[5].split("/"),Float.parseFloat(datosLinea[6])));
				}
			}
			imprimirLista(lista);
		}catch(FileNotFoundException ex) {
			System.out.println("Fichero no encontrado");
		}catch(IOException ex) {
			System.out.println("No se puede leer/escribir  el fichero");
		}
	}

	private static void imprimirLista(ArrayList<Persona> l) {
		for(Persona p:l) {
			System.out.println(p);
		}
	}

}
