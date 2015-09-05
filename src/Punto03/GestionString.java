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
        int op = 0;
        do{
            System.out.println("Ingrese palabra.....");
            determinarPalindrome(scanner.next());
            System.out.println("desea ingresar otra? Press '1' ");
            op = scanner.nextInt();
        }while (op == 1);
        System.out.println("Saliendo del system.......");
    }   
}