/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto08.util;

import Punto08.modelo.Producto;
import java.util.ArrayList;

/**
 *
 * @author casas
 */
public class ProductoListUtil {
    
    private ArrayList<Producto> productos = new ArrayList<Producto>(); 
    
    public void agregarProducto(Producto producto){
        productos.add(producto);
    }
    public void removerProducto(Producto producto){
        productos.remove(producto);
    }
    public void mostrarProductos(){
        for(Producto p: productos){
            System.out.println(p.toString());
        }
    }
    public void buscarProducto(int codigo){
        for(Producto p:getProductos()){
            if (p.getCodigo() == codigo){
                System.out.println("Producto encontrado: " + p.toString());
                break;
            }
            else
            {
                System.out.println("Producto no encontrado");
            }
        }
    }

    /**
     * @return the productos
     */
    public ArrayList<Producto> getProductos() {
        return productos;
    }

    /**
     * @param productos the productos to set
     */
    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
}
