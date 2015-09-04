/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto01;

import java.util.Scanner;

/**
 *
 * @author alejandro
 */
public class Calculadora {
    private int[] arreglo;
    
    public int calcularFactorial(int num){
        int resultado = 1;
        for (int i = num; i != 0; i--){
            resultado = resultado * i;
        }
        return resultado;
    }
    
    private void crearArreglo(int tamaño){
        arreglo = new int[tamaño];
    }
    
    public void cargarArreglo(){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arreglo.length; i++){
            System.out.println("ingrese valor posicion " + i);
            arreglo[i] = scanner.nextInt();
        }
    }
    
    private void visualizarArreglo(){
        
        for (int i = 0; i < arreglo.length; i++){
        System.out.println("posicion: " + i + " valor: " + arreglo[i]);
        }
    }

    public float calcularPromedio(){
        int sumador = 0;
        float promedio = 0.0f;
        for (int i = 0; i < arreglo.length; i++){
            sumador = sumador + arreglo[i];
        }
        promedio = sumador / arreglo.length;
        return promedio;
    }
}
