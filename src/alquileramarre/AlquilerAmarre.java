/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquileramarre;

import Entidades.Alquiler;
import Entidades.Barco;
import Entidades.BarcoMotor;
import Entidades.Velero;
import Entidades.Yate;
import java.time.LocalDate;

/**
 *
 * @author kamil
 */
public class AlquilerAmarre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear algunos barcos
     
        Barco velero = new Velero(2,"V01", 10.5, 2010);
        Barco barcoMotor = new BarcoMotor("BM01", 15.0, 2015, 200);
        Barco yate = new Yate("Y01", 20.0, 2018, 300, 3);

        // Crear algunos alquileres
        Alquiler alquiler1 = new Alquiler("Anderson Rodriguez", "12345678A", LocalDate.of(2023, 9, 13), LocalDate.of(2023, 9, 15), 1, velero);
        Alquiler alquiler2 = new Alquiler("María Pava", "87654321B", LocalDate.of(2023, 9, 13), LocalDate.of(2023, 9, 16), 2, barcoMotor);
        Alquiler alquiler3 = new Alquiler("Nammi Pava", "23456789C", LocalDate.of(2023, 9, 13), LocalDate.of(2023, 9, 17), 3, yate);

        // Calcular el precio final de cada alquiler
        double precioFinal1 = alquiler1.calcularPrecioFinal();
        double precioFinal2 = alquiler2.calcularPrecioFinal();
        double precioFinal3 = alquiler3.calcularPrecioFinal();

        // Mostrar los precios finales de los alquileres
        System.out.println("Precio final del alquiler 1: " + precioFinal1);
        System.out.println("Precio final del alquiler 2: " + precioFinal2);
        System.out.println("Precio final del alquiler 3: " + precioFinal3);
    }
}


