/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto01;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author nahuel
 */
public class Calculadora {
    private int[] arregloInt;
    private double[] arregloDouble;
    private Integer[] arregloWrap;
    
    public void crearArreglo(int[] arreglo){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arreglo.length; i++){
            System.out.println("Ingrese valor pos: " + i);
            arreglo[i] = scanner.nextInt();
        }
        visualizarArreglo(arreglo);
    }
    
    public void crearArreglo(double[] arreglo){
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);//areconoce .(punto) como decimal en lugar de ,(coma)
        for (int i = 0; i < arreglo.length; i++){
            System.out.println("Ingrese valor pos: " + i);
            arreglo[i] = scanner.nextDouble();
        }
        visualizarArreglo(arreglo);
    }
    
    public void visualizarArreglo(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++){
            System.out.println("posicion: " + i + " valor: "+ arreglo[i]);
        }
    }
    
    public void visualizarArreglo(double[] arreglo){
        for (int i = 0; i < arreglo.length; i++){
            System.out.println("posicion: " + i + " valor: "+ arreglo[i]);
        }
    }
    
    public void calcularMayor(int[] arreglo){
        int resultado = 0;
        for(int i = 0; i < arreglo.length; i++){ 
            if(arreglo[i] > resultado){
            resultado = arreglo[i];
            }
        }
        System.out.println("El mayor es: " + resultado);
    }
    
    public void calcularMayor(double[] arreglo){//Agregado Punto08 a)
        double resultado = 0.0;
        for(int i = 0; i < arreglo.length; i++){ 
            if((double)arreglo[i] > resultado){
            resultado = (double)arreglo[i];
            }
        }
        System.out.println("El mayor es: " + resultado);
    }
    
    public void calcularMenor(int[] arreglo){
        int resultado = 0; 
        for(int i = 0; i < arreglo.length; i++){ 
            if(arreglo[i] < resultado){
                resultado = arreglo[i];
            }
        }
        System.out.println("El mayor es: " + resultado);
    }
    
    public void calcularMenor(double[] arreglo){
        double resultado = 0.0; 
        for(int i = 0; i < arreglo.length; i++){ 
            if(arreglo[i] < resultado){
                resultado = arreglo[i];
            }
        }
        System.out.println("El mayor es: " + resultado);
    }
    
    public void promediarArreglo(int[] arreglo){
        double sumador = 0.0;
        double promedio;
        for (int i = 0; i < arreglo.length; i++){
            sumador = sumador + arreglo[i];
        }
        promedio = sumador / arreglo.length;
        System.out.println("El mayor es: " + promedio);
    }
    
    public void promediarArreglo(double[] arreglo){
        double sumador = 0.0;
        double promedio;
        for (int i = 0; i < arreglo.length; i++){
            sumador = sumador + arreglo[i];
        }
        promedio = sumador / arreglo.length;
        System.out.println("El mayor es: " + promedio);
    }
    
    public void ordenarArreglo(int[] arreglo){
        int aux;
        for (int i = 0; i < arreglo.length -1 ; i++){
            for(int j = i + 1; j < arreglo.length; j++){
                if(arreglo[j] < arreglo[i]){ // Si el elemento j es menor que el menor:
                    aux = arreglo[i]; // Se intercambian los elementos
                    arreglo[i] = arreglo[j]; // de las posiciones i y menor
                    arreglo[j] = aux; // usando una variable auxiliar. 
                }   
            }
        }
        visualizarArreglo(arreglo);
    }
    
    public void ordenarArreglo(double[] arreglo){
        double aux;
        for (int i = 0; i < arreglo.length -1 ; i++){
            for(int j = i + 1; j < arreglo.length; j++){
                if(arreglo[j] < arreglo[i]){ // Si el elemento j es menor que el menor:
                    aux = arreglo[i]; // Se intercambian los elementos
                    arreglo[i] = arreglo[j]; // de las posiciones i y menor
                    arreglo[j] = aux; // usando una variable auxiliar. 
                }   
            }
        }
        visualizarArreglo(arreglo);
    }
    
    public void calcularMediana(int[] arreglo){
        double mediana;
        int[] arr = new int[arreglo.length];
        for (int x = 0; x < arreglo.length; x++){
            arr[x] = arreglo[x];
        }
        ordenarArreglo(arr);
        if (arr.length % 2 != 0){
            mediana = arr[Math.abs(arr.length / 2)];
        }else{
            mediana = (double)(arr[Math.abs(arr.length / 2) - 1] + arr[Math.abs(arr.length / 2)]) / 2;
        }
        System.out.println("La mediana es: " + mediana);
    }
    
    public void calcularMediana(double[] arreglo){
        double mediana;
        double[] arr = new double[arreglo.length];
        for (int x = 0; x < arreglo.length; x++){
            arr[x] = arreglo[x];
        }
        ordenarArreglo(arr);
        if (arr.length % 2 != 0){
            mediana = arr[Math.abs(arr.length / 2)];
        }else{
            mediana = (double)(arr[Math.abs(arr.length / 2) - 1] + arr[Math.abs(arr.length / 2)]) / 2;
        }
        System.out.println("La mediana es: " + mediana);
    }
    
    public int calcularFactorial(int num){
        int resultado = 1;
        for (int i = num; i != 0; i--){
            resultado = resultado * i;
        }
        return resultado;        
    }
    
    public void mostrarPrimos(){
        int cant = 0;
        for (int i = 0; i < arregloInt.length; i++){
            if (arregloInt[i] == 1){
                System.out.println(arregloInt[i]);
            }else{
                for (int j = arregloInt[i]; j > 0; j--){
                    if (arregloInt[i] % j == 0){
                    cant = cant + 1;
                    }
                }
            }
            if (cant == 2){
                System.out.println("Es primo: " + arregloInt[i]);
                cant = 0;
            }
        }
    }
        
    public void administrarOpciones(){
        int opcion;
        do{
            System.out.println("********Menu Calculadora**********");
            System.out.println("Seleccione el Calculo que desee realizar: ");
            System.out.println("1) Factorial");
            System.out.println("2) Mayor");
            System.out.println("21) Mayor double");
            System.out.println("3) Menor");
            System.out.println("31) Menor double");
            System.out.println("4) Promedio");
            System.out.println("41) Promedio double");
            System.out.println("5) Mediana");
            System.out.println("51) Mediana double");
            System.out.println("6) Mostrar primos");
            System.out.println("7) Eliminar arreglo");
            System.out.println("8) Visualizar arreglo");
            System.out.println("9) Ordenar arreglo");
            System.out.println("0) Salir de Calculadora.....");
            Scanner scanner = new Scanner(System.in);
            opcion = scanner.nextInt();
            if ((opcion == 2 || opcion == 3 || opcion == 4 || opcion == 5 || opcion == 6) && arregloInt == null){
                System.out.println("Cantidad de numeros a analizar:");
                int tamaño = scanner.nextInt();
                arregloInt = new int[tamaño];
                crearArreglo(arregloInt);                           
            }else if ((opcion == 21 || opcion == 31 || opcion == 41 || opcion == 51) && arregloDouble == null){
                System.out.println("Cantidad de numeros a analizar:");
                int tamaño = scanner.nextInt();
                arregloDouble = new double[tamaño];
                crearArreglo(arregloDouble);
            }
            switch (opcion){
                case 1:{
                    int recalc;
                    do{
                        System.out.println("Ingrese numero: ");
                        int num = scanner.nextInt();
                        System.out.println("El factorial de " + num + " es " + calcularFactorial(num) + ". Desea calcular otro? 1=SI");
                        recalc = scanner.nextInt();
                    }while (recalc == 1);
                }break;
                case 2:{
                    calcularMayor(arregloInt);
                }break;
                case 21:{
                    calcularMayor(arregloDouble);
                }break;
                case 3:{
                    calcularMenor(arregloInt);
                }break;
                case 31:{
                    calcularMenor(arregloDouble);
                }break;
                case 4:{
                    promediarArreglo(arregloInt);
                }break;
                case 41:{
                    promediarArreglo(arregloDouble);
                }break;
                case 5:{
                    calcularMediana(arregloInt);
                }break;
                case 51:{
                    calcularMediana(arregloDouble);
                }break;
                case 6:{
                    mostrarPrimos();
                }break;
                case 7:{
                    arregloInt = null;
                    arregloDouble = null;
                }break;
                case 8:{
                    if (arregloInt != null){
                        visualizarArreglo(arregloInt);
                    }else if (arregloDouble != null){
                        visualizarArreglo(arregloDouble);
                    }
                }break;
                case 9:{
                    if (arregloInt != null){
                        ordenarArreglo(arregloInt);
                    }else if (arregloDouble != null){
                        ordenarArreglo(arregloDouble);
                    }else{
                        System.out.println("Debe crear un arreglo");
                    }
                }break;
                case 10:{
                    arregloInt = new int[5];
                    arregloInt[0] = 2;
                    arregloInt[1] = 3;
                    arregloInt[2] = 7;
                    arregloInt[3] = 17;
                    arregloInt[4] = 23;
                }break;
                case 11:{
                    arregloInt = new int [3];
                    arregloInt[0] = 1;
                    arregloInt[1] = 3;
                    arregloInt[2] = 7;
                }break;
                case 12:{
                    arregloDouble = new double [3];
                    arregloDouble[0] = 3.65;
                    arregloDouble[1] = 1.23;
                    arregloDouble[2] = 7.5;
                }break;
                default:{
                    System.out.println("Saliendo del system.....");
                }
            }
        }while (opcion != 0);
    }
    
    public int[] getArregloInt() {
        return arregloInt;
    }

    public void setArregloInt(int[] arregloInt) {
        this.arregloInt = arregloInt;
    }
    
    public double[] getArregloDouble() {
        return arregloDouble;
    }

    public void setArregloDouble(double[] arregloDouble) {
        this.arregloDouble = arregloDouble;
    }
}