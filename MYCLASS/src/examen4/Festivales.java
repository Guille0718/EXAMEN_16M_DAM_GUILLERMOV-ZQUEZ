package examen4;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Festivales {
	
    private String nombre;
    private String localidad;
    private LocalDate FechaInicio;
    private LocalDate FechaFin;

    public Festivales(String nombre, String localidad, LocalDate fechaInicio, LocalDate fechaFin) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.FechaInicio = fechaInicio;
        this.FechaFin = fechaFin;
    }
    
    public String toString() {
        long Dias = ChronoUnit.DAYS.between(FechaInicio, FechaFin);
        String DiaFin = FechaFin.getDayOfWeek().toString();
        return "Nombre de la fiesta y localidad: " + nombre + localidad + " Fecha de inicio de la fiesta: " + FechaInicio + " Fecha de fin de la fiesta: " + FechaFin + " Día: " + Dias + " Día Fin: " + DiaFin;
    }
}
