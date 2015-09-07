/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto02.facturacion.dominio;

import Punto02.facturacion.dominio.Producto;
import java.util.ArrayList;

/**
 *
 * @author nahuel
 */
public class Stock {
    private ArrayList<Producto> stockProducto;

    public Stock() {
        stockProducto = new ArrayList<Producto>();
    }
    
    public void agregarProducto(Producto producto){
        stockProducto.add(producto);
    }
    
    public void mostrarStock(){
        for (Producto ds:stockProducto){
            System.out.println(ds.toString());
                    
        }
    }

    @Override
    public String toString() {
        String salida = "";
        salida = "\nStock Disponible:";
        salida = salida + "\ncodigo" + "\tnombre" + "\tprecio" + "\tstock";
        for (Producto p:stockProducto){
            salida = salida + p.toString();
        }
        return salida;
    }
    
    

}
