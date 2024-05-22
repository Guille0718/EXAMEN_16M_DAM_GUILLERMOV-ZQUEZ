package Examen6;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Tienda {
	
	    private ArrayList<Dispositivo> articulos;

	    public Tienda() {
	        this.articulos = new ArrayList<>();
	    }

	    public void agregarDispositivo(Dispositivo articulo) {
	        articulos.add(articulo);
	    }

	    public Dispositivo buscarDispositivoPorCodigoSerie(String codigoSerie) {
	        for (Dispositivo dispositivo : articulos) {
	            if (dispositivo.getCodigoSerie().equals(codigoSerie)) {
	                return dispositivo;
	            }
	        }
	        return null;
	    }

	    public void eliminarDispositivoPorCodigoSerie(String codigoSerie) {
	        articulos.removeIf(dispositivo -> dispositivo.getCodigoSerie().equals(codigoSerie));
	    }

	    public void listarDispositivos() {
	        for (Dispositivo dispositivo : articulos) {
	            System.out.println(dispositivo.toString());
	        }
	    }

	    public void guardarTienda(String archivo) {
	        try(FileWriter writer = new FileWriter(archivo)) {
	            for(Dispositivo dispositivo : articulos) {
	                writer.write(dispositivo.toString() + "\n");
	            }
	        } catch (IOException e) {
	            System.out.println("Error al guardar la tienda: " + e.getMessage());
	        }
	    }

	    public void cargarTienda(String archivo) {
	    	try(FileReader fr = new FileReader(archivo)) {
	            for(Dispositivo dispositivo : articulos) {
	                fr.read();
	            }
	        } catch (IOException e) {
	            System.out.println("Error al encontar fichero");
	        }

	    }
	}