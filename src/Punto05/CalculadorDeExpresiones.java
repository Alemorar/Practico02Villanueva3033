/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto05;

import Punto01.Calculadora;
import java.util.Scanner;

/**
 *
 * @author alejandro
 */
public class CalculadorDeExpresiones{
    
    public void resolverSumatoriaA(int n){
        double resultado = 0.0;
        for (int k = 1;k <= n; k++){
            resultado = resultado + (Math.pow(2, k) / (3 + 2 * k));
        }
        System.out.println("El resultado es " + resultado);
    }
    
    public void resolverProductoriaB(int n){
        Scanner scanner = new Scanner(System.in);
        double resultado = 1.0;
        double x = 0.0;
        double y = 0.0;
        System.out.println("Ingrese x: ");
        x = scanner.nextDouble();
        System.out.println("Ingrese y: ");
        y = scanner.nextDouble();
        for (int i = 1;i <= n; i++){
            resultado = resultado * ((Math.pow(x, i) + y) / i);
        }
        System.out.println("El resultado es " + resultado);
    }
    
    public void resolverSumatoriaC(int n){
        Calculadora unaCalcu = new Calculadora();
        Scanner scanner = new Scanner(System.in);
        double resultado = 0.0;
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;
        int indice = 0;
        System.out.println("Ingrese a: ");
        a = scanner.nextDouble();
        System.out.println("Ingrese b: ");
        b = scanner.nextDouble();
        System.out.println("Ingrese c: ");
        c = scanner.nextDouble();
        System.out.println("Ingrese indice: ");
        indice = scanner.nextInt();
        for (int i = indice; i <= n; i++){
            resultado = resultado + ((a * b + c) / unaCalcu.calcularFactorial(i));
        }
        System.out.println("El resultado es " + resultado);
    }
    
    public void administrarOpciones(){
        int opcion;
        do{
            System.out.println("********Menu Calculadora**********");
            System.out.println("Seleccione el Calculo que desee realizar:");
            System.out.println("1) Sumatoria A");
            System.out.println("2) Productoria B");
            System.out.println("3) Sumatoria C");
            System.out.println("0) Salir de CalculadorDeExpresiones.....");
            Scanner scanner = new Scanner(System.in);
            opcion = scanner.nextInt();
            switch (opcion){
                case 1:{
                    System.out.println("ingrese valor hasta");
                    int hasta = scanner.nextInt();
                    resolverSumatoriaA(hasta);
                }break;
                case 2:{
                    System.out.println("ingrese valor hasta");
                    int hasta = scanner.nextInt();
                    resolverProductoriaB(hasta);
                }break;
                case 3:{
                    System.out.println("ingrese valor hasta");
                    int hasta = scanner.nextInt();
                    resolverSumatoriaC(hasta);
                }break;
                default:{
                    System.out.println("Saliendo del system.....");
                }
            }
        }while (opcion != 0);
    }
}
