/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto07.Caso1;

/**
 *
 * @author Alumno
 */
public class Circulo extends Figura{
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * (Math.pow(radio,2));
    }
    
    @Override
    public double calcularPerimetro() {
        return Math.PI * radio * 2;
    }
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }    
}
