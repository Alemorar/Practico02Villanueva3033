/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto05;

/**
 *
 * @author alejandro
 */
public class SumatoriaProductoria{
    
    public double resolverSumatoriaA(int n){
        double resultado = 0.0;
        for (int i = 1;i <= n; i++){
            resultado = resultado + (Math.pow(2, i) / (3 + 2 * i));
        }
        return resultado;
    }
}
