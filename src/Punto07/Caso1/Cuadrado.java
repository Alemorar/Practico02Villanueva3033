/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto07.Caso1;

/**
 *
 * @author Alumno
 */
public class Cuadrado extends Figura{
    
    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }  
    
    @Override
    public double calcularArea() {
        return Math.pow(lado, 2);
    }
    
    @Override
    public double calcularPerimetro(){
        return lado * 4;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }   
}
