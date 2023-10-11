/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author kamil
 */
public class Velero extends Barco {

    private int numeroMastiles;

    public Velero(int numeroMastiles, String matricula, double esloraMetros, int anoFabricacion) {
        super(matricula, esloraMetros, anoFabricacion);
        this.numeroMastiles = numeroMastiles;
    }
    
      public int getNumeroMastiles() {
        return numeroMastiles;
    }

    @Override
    public double calcularModulo() {
        return super.calcularModulo() + numeroMastiles;
    }
}
