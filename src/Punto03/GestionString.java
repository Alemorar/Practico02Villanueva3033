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
                //cadena.charAt(i) = cadena.charAt(i) + cadena.substring(i, cadena.length);
                System.out.println("devolver true");
            }else if (cadena.charAt(i) == Character.toLowerCase(cadena.charAt(i))){
//                cadena.substring(i, i).toUpperCase();
                System.out.println("devolver tambien true");
            }
        }
        return cadena;
    }
    
    public String quitarEspacio(String cadena){//scanner no esta tomando la palabra con espacio.
        String sinEspacios = null;
        sinEspacios = cadena.trim();
        return sinEspacios;
    }
    
    public String devolverSinSecuencia(String cadena){
        Scanner scanner = new Scanner(System.in);
        int in = 0;
        int out = 0;
        System.out.println("Subcadena desde");
        in = scanner.nextInt();
        if (in == 0){
            System.out.println("Subcadena hasta");
            out = scanner.nextInt();
        }else{
            out = cadena.length();
        }
        String devolver = null;
        if (in == 0){
            devolver = cadena.substring(out, cadena.length());
        }else{
            devolver = cadena.substring(0, in);
        }
        return devolver;
    }
    
    public void controlarMetodos(){
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        String palabra = null;
        do{
            System.out.println("Ingrese una opcion");
            System.out.println("1) Contar letras");
            System.out.println("2) Contar minusculas");
            System.out.println("3) Contar mayusculas");
            System.out.println("4) Contar ocurrencia de letra");
            System.out.println("5) Determinar palindrome");
            System.out.println("6) Invertir letras");
            System.out.println("7) Quitar espacios");
            System.out.println("8) Devolver sin secuencia");
            System.out.println("10 Ingresar nueva palabra");
            System.out.println("Salir '0'");
            System.out.println("Seleccionar Opcion");
            opcion = scanner.nextInt();
            if (palabra == null){
                System.out.println("Ingrese palabra");
                palabra = scanner.next();//error del trim(), problema del scanner.
            }
            switch (opcion){
                case 1:{
                    System.out.println(contarCaracteres(palabra));
                }break;
                case 2:{
                    System.out.println(contarMinusculas(palabra));
                }break;
                case 3:{
                    System.out.println(contarMayusculas(palabra));
                }break;
                case 4:{
                    determinarPalindrome(palabra);
                }break;
                case 5:{
                    System.out.println(invertirLetras(palabra));
                }break;
                case 7:{
                    System.out.println(quitarEspacio(palabra));
                }break;
                case 8:{
                    System.out.println(devolverSinSecuencia(palabra));
                }break;
                case 10:{
                    palabra = null;
                }break;
            }
        }while (!(opcion == 0));
        System.out.println("Saliendo del system.......");
    }
}