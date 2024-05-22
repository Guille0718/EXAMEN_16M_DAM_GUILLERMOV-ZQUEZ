package pktFicheros;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class PruebaSerializacion {
	
	public static void main(String[] arg) {
		
		File archivo = new File("salida");
		
		ArrayList<Articulo> lista = new ArrayList<Articulo>();
		
		lista.add(new Articulo("leche", "marca", 1, 12, 5));
		lista.add(new Articulo("pan", "bimbo", 2, 11, 10));
		
		try {
			//Escritura utilizando serialización
		FileOutputStream fos = new FileOutputStream(archivo);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(lista);
		
		fos.close();
		oos.close();
		
		}catch(FileNotFoundException excep) {
			System.out.println("Fichero no encontrado");
		}catch(IOException excep) {
			excep.printStackTrace();
			System.out.println("Error de E/S");
		}
		
		System.out.println("Fin escitura");
		
		
		
		ArrayList<Articulo> listaNueva = null;
		
		try {
		FileInputStream fis = new FileInputStream(archivo);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		listaNueva = (ArrayList<Articulo>)ois.readObject();
		
		ois.close();
		fis.close();
		
		}catch(FileNotFoundException excep) {
			System.out.println("Fichero no encontrado");
		}catch(IOException excep) {
			System.out.println("Error de E/S");
		}catch(ClassNotFoundException excep) {
			System.out.println("Clase no encontrada");
		}
		
		for(Articulo art : listaNueva) {
			System.out.println("Articulo 1" + art);
		}
		
	}

}
