/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto07.Caso1;

/**
 *
 * @author Alumno
 */
public class TestFigura{
    public static void main(String[]args){
        GestorDeFiguras gestorDeFiguras = new GestorDeFiguras();
        
        Figura circulo = new Circulo(24.5);
        gestorDeFiguras.calcularArea(circulo);
        gestorDeFiguras.calcularPerimetro(circulo);
        
        Figura cuadrado = new Cuadrado(18);
        gestorDeFiguras.calcularArea(cuadrado);
        gestorDeFiguras.calcularPerimetro(cuadrado);
        
        Figura rectangulo = new Rectangulo(2.5, 6.8);
        gestorDeFiguras.calcularArea(rectangulo);
        gestorDeFiguras.calcularPerimetro(rectangulo);
    }
}


    
        
        
        
