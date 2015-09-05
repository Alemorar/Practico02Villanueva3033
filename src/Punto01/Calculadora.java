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
        visualizarArreglo();
    }
    
    public void visualizarArreglo(){
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
        float promedio = 0.0f;
        for (int i = 0; i < arreglo.length; i++){
            sumador = sumador + arreglo[i];
        }
        promedio = sumador / arreglo.length;
        return promedio;
    }
    
    public float calcularMediana(){
        float sumador = 0.0f;
        float mediana = 0.0f;
        for (int i = 0; i < arreglo.length; i++){
            sumador = sumador + arreglo[i];
        }
        mediana = sumador / 2;
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
        for (int i = 2; i == arreglo.length / 2; i++){//ciclo desde i=2, hasta i=n/2 
            int contador = 0;
            if (arreglo[i] % i == 0){//if n es divisible por i 
                contador = contador + 1;//contador = contador+1 
            }
            if (contador > 0){//si contador>0 entonces 
                //no es primo
            }
        }    
    }
    
    public boolean esPrimo(int numero){
        int contador = 2;
        boolean primo=true;
        while ((primo) && (contador!=numero)){
            if (numero % contador == 0)
                primo = false;
            contador++;
        }
        return primo;
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
            System.out.println("7) Crear arreglo nuevo");
            System.out.println("8) Visualizar arreglo");
            System.out.println("0) Salir de Calculadora.....");
            Scanner scanner = new Scanner(System.in);
            opcion = scanner.nextInt();
            if ((opcion == 2 || opcion == 3 || opcion == 4 || opcion == 5) && arreglo == null){
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
                        visualizarArreglo();
                    }
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