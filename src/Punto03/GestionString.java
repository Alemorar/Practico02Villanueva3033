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
    
    public int contarCaracteres(String cadena){
        int caracteres = 0;
        caracteres = cadena.length();
        return caracteres;
    }
    
    public int contarMinusculas(String cadena){
        int minusculas = 0;
        for (int i = 0; i < cadena.length(); i++){
            if (cadena.charAt(i) == cadena.toLowerCase().charAt(i)){
                minusculas = minusculas + 1;
            }
        }
        return minusculas;
    }
    
    public int contarMayusculas(String cadena){
        int mayusculas = 0;
        for (int i = 0; i < cadena.length(); i++){
            if (cadena.charAt(i) == cadena.toUpperCase().charAt(i)){
                mayusculas = mayusculas + 1;
            }
        }
        return mayusculas;
    }
    
    public int contarOcurrencias(String cadena, char letra){
        int ocurrencia = 0;
        for (int i = 0; i < cadena.length(); i++){
            if (cadena.charAt(i) == letra){
                ocurrencia = ocurrencia + 1;
            }
        }
        return ocurrencia;
    }
    
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
    
    public String invertirLetras(String cadena){
        for (int i = 0; i < cadena.length(); i++){
            if (cadena.charAt(i) == Character.toUpperCase(cadena.charAt(i))){
                //cadena.charAt(i) = Character.toLowerCase(cadena.charAt(i));
            }else if (cadena.charAt(i) == cadena.toLowerCase().charAt(i)){
                cadena.substring(i, i).toUpperCase();
            }
        }
        return cadena;
    }
    
    public void controlarMetodo(){
        Scanner scanner = new Scanner(System.in);
        String palindromiar;
        do{
            System.out.println("Ingrese una opcion");
            System.out.println("1) Contar letras");
            System.out.println("2) Contar minusculas");
            System.out.println("3) Contar mayusculas");
            System.out.println("4) Contar ocurrencia de letra");
            System.out.println("5) Determinar palindrome");
            System.out.println("6) Invertir letras");
            System.out.println("Salir 'S'");
            
            
                    
            System.out.println("Ingrese palabra. 'S'alir");
            palindromiar = scanner.next();
            System.out.println(contarCaracteres(palindromiar));
            System.out.println(contarMinusculas(palindromiar));
            System.out.println(contarMayusculas(palindromiar));

            determinarPalindrome(palindromiar);
            System.out.println(invertirLetras(palindromiar));
        }while (!"s".equals(palindromiar));
        System.out.println("Saliendo del system.......");
    }
}
