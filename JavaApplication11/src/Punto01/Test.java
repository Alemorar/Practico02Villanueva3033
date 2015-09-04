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
public class Test {
    
    public static void main(String[] args){
        int option;
        
        do{
            System.out.println("\\t**** MENU DE OPCIONES ****\\n");
            System.out.println("\t1) Calcular Factorial.");
            System.out.println("\t2) Cargar Vector.");
            System.out.println("\t3) Definir Tamanio del Vector.");
            System.out.println("\t9) Salir.");
            System.out.println("\tIngrese una opcion.");
            Scanner scanner = new Scanner(System.in);
            option = scanner.nextInt();
        switch (option){
            case 1:{
                    //Scanner scanner = new Scanner(System.in);
                    
                    int num = scanner.nextInt();
                    Calculadora unaCalculadora = new Calculadora();
                    System.out.println(unaCalculadora.calcularFactorial(num));
                }break;
            
            case 2:{
                    
                }break;
                
            case 3:{
                    
                }break;
                
            case 4:{
                    
                }break;
                
            case 9:{
                    System.out.println("Saliendo del sistema......");
                }break;
            default: System.out.println("OPCION INCORRECTA\\n");
            break;
        }
    }while (option != 9);
}
    
}
