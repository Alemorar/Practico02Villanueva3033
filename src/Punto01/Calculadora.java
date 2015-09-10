/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto01;
import java.util.Scanner;
/**
 *
 * @author nahuel
 */
public class Calculadora {
    private int[] arreglo;
    
    public void crearArreglo(int tamaño){
        arreglo = new int[tamaño];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arreglo.length; i++){
            System.out.println("Ingrese valor pos: " + i);
            arreglo[i] = scanner.nextInt();
        }
        visualizarArreglo(arreglo);
    }
    
    public void visualizarArreglo(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++){
            System.out.println("posicion: " + i + " valor: "+ arreglo[i]);
        }
    }
    
    public int calcularMayor(){
        int resultado = arreglo[0]; 
        for(int i = 0; i < arreglo.length; i++){ 
            if(arreglo[i] > resultado){
            resultado = arreglo[i];
            }
        }
        return resultado;
    }
    
    public int calcularMenor(){
        int resultado = arreglo[0]; 
        for(int i = 0; i < arreglo.length; i++){ 
            if(arreglo[i] < resultado){
                resultado = arreglo[i];
            }
        }
        return resultado;
    }
    
    public float promediarArreglo(){
        float sumador = 0.0f;
        float promedio;
        for (int i = 0; i < arreglo.length; i++){
            sumador = sumador + arreglo[i];
        }
        promedio = sumador / arreglo.length;
        return promedio;
    }
    
    public int[] ordenarArreglo(int[] arreglo){
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
        return arreglo;
    }
    
    public double calcularMediana(){
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
        return mediana;
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
        for (int i = 0; i < arreglo.length; i++){
            if (arreglo[i] == 1){
                System.out.println(arreglo[i]);
            }else{
                for (int j = arreglo[i]; j > 0; j--){
                    if (arreglo[i] % j == 0){
                    cant = cant + 1;
                    }
                }
            }
            if (cant == 2){
                System.out.println("Es primo: " + arreglo[i]);
                cant = 0;
            }
        }
    }
        
    public void administrarOpciones(){
        int opcion;
        do{
            System.out.println("********Menu Calculadora**********");
            System.out.println("Seleccione el Calculo que desee realizar: 10) carga arreglo test");
            System.out.println("1) Factorial");
            System.out.println("2) Mayor");
            System.out.println("3) Menor");
            System.out.println("4) Promedio");
            System.out.println("5) Mediana");
            System.out.println("6) Mostrar primos");
            System.out.println("7) Eliminar arreglo");
            System.out.println("8) Visualizar arreglo");
            System.out.println("9) Ordenar arreglo");
            System.out.println("0) Salir de Calculadora.....");
            Scanner scanner = new Scanner(System.in);
            opcion = scanner.nextInt();
            if ((opcion == 2 || opcion == 3 || opcion == 4 || opcion == 5 || opcion == 6) && arreglo == null){
                System.out.println("Cantidad de numeros a analizar:");
                crearArreglo(scanner.nextInt());                            
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
                    System.out.println("El mayor es: " + calcularMayor());
                }break;
                case 3:{
                    System.out.println("El menor es: " + calcularMenor());
                }break;
                case 4:{
                    System.out.println("El promedio es: " + promediarArreglo());
                }break;
                case 5:{
                    System.out.println("La mediana es: " + calcularMediana());
                }break;
                case 6:{
                    mostrarPrimos();
                }break;
                case 7:{
                    arreglo = null;
                }break;
                case 8:{
                    if (arreglo == null){
                        System.out.println("Cantidad de numeros a analizar:");
                        crearArreglo(scanner.nextInt());
                    }else{
                        visualizarArreglo(arreglo);
                    }
                }break;
                case 9:{
                    ordenarArreglo(arreglo);
                }break;
                case 10:{
                    arreglo = new int[5];
                    arreglo[0] = 2;
                    arreglo[1] = 3;
                    arreglo[2] = 7;
                    arreglo[3] = 17;
                    arreglo[4] = 23;
                }break;
                case 11:{
                    arreglo = new int [3];
                    arreglo[0] = 1;
                    arreglo[1] = 3;
                    arreglo[2] = 7;
                }break;
                default:{
                    System.out.println("Saliendo del system.....");
                }
            }
        }while (opcion != 0);
    }
    
    public int[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(int[] arreglo) {
        this.arreglo = arreglo;
    }
}