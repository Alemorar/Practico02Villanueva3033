/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto02.facturacion.test;

import Punto02.facturacion.dominio.DetalleProducto;
import Punto02.facturacion.dominio.Factura;
import Punto02.facturacion.dominio.Producto;


/**
 *
 * @author alejandro
 */
public class SistemaFacturacion {
    
    public static void main(String[] args){
        Factura unaFactura = new Factura();
        Producto primerProducto = new Producto();
        primerProducto.setCodigo(01);
        primerProducto.setNombre("aaa");
        primerProducto.setPrecio(100.0);
        primerProducto.setStock(3);
        
        Producto segundoProducto = new Producto();
        segundoProducto.setCodigo(02);
        segundoProducto.setNombre("bbb");
        segundoProducto.setPrecio(50.0);
        segundoProducto.setStock(80);
        
        DetalleProducto primerDetalle = new DetalleProducto();
        primerDetalle.setCantidadProduco(1);
        primerDetalle.setPrecioUnitario(primerProducto.getPrecio());
        primerDetalle.setUnProducto(primerProducto);
        
        unaFactura.agrearDetalle(primerDetalle);//Agregamos el primer detalla con el primer producto
        
        DetalleProducto segundoDetalle = new DetalleProducto();
        segundoDetalle.setCantidadProduco(50);
        segundoDetalle.setPrecioUnitario(segundoProducto.getPrecio());
        segundoDetalle.setUnProducto(segundoProducto);
        
        unaFactura.agrearDetalle(segundoDetalle);//Agregamos el segundo detalle con el segundo producto
        
        System.out.println(unaFactura);
//        System.out.println("El total de la factura " + unaFactura.calcularTotal());
        
    }
    
}
