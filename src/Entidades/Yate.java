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
public class Yate extends BarcoMotor{
    
     private int numeroCamarotes;

    public Yate(String matricula, double esloraMetros, int anoFabricacion, int potenciaCV, int numeroCamarotes) {
        super(matricula, esloraMetros, anoFabricacion, potenciaCV);
        this.numeroCamarotes = numeroCamarotes;
    }

    public int getNumeroCamarotes() {
        return numeroCamarotes;
    }

    @Override
    public double calcularModulo() {
        return super.calcularModulo() + potenciaCV + numeroCamarotes;
    }
    
}
