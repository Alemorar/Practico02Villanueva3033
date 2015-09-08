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
            mediana = (double)((arr[Math.abs(arr.length / 2) - 1] + arr[Math.abs(arr.length / 2)]) / 2);
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
    
    public void mostrarPrimo(int numero){
        for (int i = 0; i < arreglo.length; i++){
            if (!(arreglo[i] % 2 == 0)){
                System.out.println(arreglo[i]);
            }        
        }
    }
        
    public void menuOpciones(){
        int opcion;
        do{
            System.out.println("********Menu Calculadora**********");
            System.out.println("Seleccione el Calculo que desee realizar:");
            System.out.println("1) Factorial");
            System.out.println("2) Mayor");
            System.out.println("3) Menor");
            System.out.println("4) Promedio");
            System.out.println("5) Mediana");
            System.out.println("6) Mostrar primos");
            System.out.println("7) Nuevo arreglo");
            System.out.println("8) Visualizar arreglo");
            System.out.println("9) ....");
            System.out.println("10) Ordenar arreglo");
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
                    System.out.println("procesando numero primos............. " );
                    
                }break;
                case 7:{
                    System.out.println("Cantidad de numeros a analizar:");
                    crearArreglo(scanner.nextInt());
                }break;
                case 8:{
                    if (arreglo == null){
                        System.out.println("Cantidad de numeros a analizar:");
                        crearArreglo(scanner.nextInt());
                    }else{
                        visualizarArreglo(arreglo);
                    }
                }break;
                case 10:{
                    ordenarArreglo(arreglo);
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