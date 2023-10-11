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
public class Barco {
    private String matricula;
    private double esloraMetros;
    private int anoFabricacion;

    public Barco(String matricula, double esloraMetros, int anoFabricacion) {
        this.matricula = matricula;
        this.esloraMetros = esloraMetros;
        this.anoFabricacion = anoFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getEsloraMetros() {
        return esloraMetros;
    }

    public void setEsloraMetros(double esloraMetros) {
        this.esloraMetros = esloraMetros;
    }

    public int getAnoFabricacion() {
        return anoFabricacion;
    }

    public void setAnoFabricacion(int anoFabricacion) {
        this.anoFabricacion = anoFabricacion;
    }

    public double calcularModulo() {
        return esloraMetros * 10;
    }
}
