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
public class BarcoMotor extends Barco {
    
    int potenciaCV;

    public BarcoMotor(String matricula, double esloraMetros, int anoFabricacion, int potenciaCV) {
        super(matricula, esloraMetros, anoFabricacion);
        this.potenciaCV = potenciaCV;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    @Override
    public double calcularModulo() {
        return super.calcularModulo() + potenciaCV;
    }
    
}
