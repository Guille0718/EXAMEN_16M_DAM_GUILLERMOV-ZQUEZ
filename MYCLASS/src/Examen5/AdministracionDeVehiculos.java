package Examen5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class AdministracionDeVehiculos {
	
//	public static List<Vehiculo> CargarVehiculosDeCSV(String fileName)  {
//		List<Vehiculo> vehiculo = new ArrayList<>();
//		DateTimeFormatter DTF = DateTimeFormatter.ofPattern("HH:mm");
//		
//		try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
//			String linea;
//			while((linea = br.readLine()) !=null) {
//				 String[] datos = linea.split(",");
//				 String Marca = datos[0];
//	             String Modelo = datos[1];
//	             String Matricula = datos[2];
//	             LocalTime HoraDeSalida = LocalTime.parse(datos[3], DTF);
//	             LocalTime HoraDeEntrada = LocalTime.parse(datos[4], DTF);
//	             
//	        if(datos.length == 6) {	        	
//	           int NumeroDePuertas = Integer.parseInt(datos[5]);
//	           Vehiculo.add(new Coche(Marca, Modelo, Matricula, HoraDeEntrada, HoraDeSalida, NumeroDePuertas));
//			}else {
//				double CapacidadDeCarga = Double.parseDouble(datos[5]);
//				Vehiculo.add(new Camion(Marca, Modelo, Matricula, HoraDeEntrada, HoraDeSalida, CapacidadDeCarga));
//			}
//		}
//			
//			
//		}catch(IOException excep) {
//			System.out.println("No se puede leer/escribir  el fichero");
//		}
//		
//		return vehiculo;
//			
//		}
//	
//    public static double CalcularCosteDeCombustible(List<Vehiculo> vehiculo) {
//        double CosteTotal = 0;
//
//        for(Vehiculo Vehiculo : vehiculo) {
//        	
//        	if(vehiculo instanceof Coche) {
//                CosteTotal += ((Coche) vehiculo).CalcularCosteDeCombustible();
//        }	else if(vehiculo instanceof Camion){
//        		CosteTotal += ((Camion) vehiculo).CalcularCosteDeCombustible();
//        }
//    }
//		return CosteTotal;		
//}
    
}

