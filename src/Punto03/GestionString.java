/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto03;

import java.util.Scanner;

/**
 *
 * @author nahuel
 */
public class GestionString {

    public void determinarPalindrome(String cadena){
        boolean band = false;
        for (int i = 0; i < cadena.length() / 2; i++){
            if (cadena.charAt(i) == cadena.charAt(cadena.length() - 1 - i)){
                band = true;
            }else{
                band = false;
                System.out.println("no es palindrome....");
                break;
            }
        }
        if (band){
            System.out.println("es palindrome");
        }
    }
    
    public void controlarMetodo(){
        Scanner scanner = new Scanner(System.in);
        String palindromiar;
        do{
            System.out.println("Ingrese palabra. 'S'alir");
            palindromiar = scanner.next();
            determinarPalindrome(palindromiar);
        }while (!"s".equals(palindromiar));
        System.out.println("Saliendo del system.......");
    }   
}