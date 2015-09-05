/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto08.principal;

import Punto08.util.ProductoListUtil;
import Punto08.modelo.Producto;

/**
 *
 * @author casas
 */
public class Principal {
    
    public static void main (String[] arg){
        ProductoListUtil productoListUtil = new ProductoListUtil();
        Producto p1 = new Producto("lapicera", 13.3, 4, 222);
        Producto p2 = new Producto("borrador", 44.3, 4, 225);
        
        productoListUtil.agregarProducto(p1);
        productoListUtil.agregarProducto(p2);
       
        productoListUtil.mostrarProductos();
        
        productoListUtil.buscarProducto(222);
        
    }
    
}
