/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author kamil
 */
public class Alquiler {

    private String nombreCliente;
    private String documentoCliente;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private int posicionAmarre;
    private Barco barco;

    public Alquiler(String nombreCliente, String documentoCliente, LocalDate fechaAlquiler, LocalDate fechaDevolucion, int posicionAmarre, Barco barco) {
        this.nombreCliente = nombreCliente;
        this.documentoCliente = documentoCliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public double calcularPrecioFinal() {
        long diasOcupacion = ChronoUnit.DAYS.between(fechaAlquiler, fechaDevolucion);
        double moduloBarco = barco.calcularModulo();
        if (barco instanceof Velero) {
            Velero velero = (Velero) barco;
            moduloBarco += velero.getNumeroMastiles();
        } else if (barco instanceof BarcoMotor) {
            BarcoMotor barcoMotor = (BarcoMotor) barco;
            moduloBarco += barcoMotor.getPotenciaCV();
        } else if (barco instanceof Yate) {
            Yate yate = (Yate) barco;
            moduloBarco += yate.getPotenciaCV() + yate.getNumeroCamarotes();
        }
        return diasOcupacion * moduloBarco;
    }
}


