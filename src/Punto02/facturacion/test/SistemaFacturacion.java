/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto02.facturacion.test;

import Punto02.facturacion.dominio.DetalleProducto;
import Punto02.facturacion.dominio.Stock;
import Punto02.facturacion.dominio.Factura;
import Punto02.facturacion.dominio.Producto;
import java.util.Date;

/**
 *
 * @author alejandro
 */
public class SistemaFacturacion {
    
    public static void main(String[] args){
        Factura unaFactura = new Factura();
        unaFactura.setNumFactura(1);
        unaFactura.setFecha(new Date());
        
        DetalleProducto primerDetalle = new DetalleProducto();
        DetalleProducto segundoDetalle = new DetalleProducto();
        
        Stock ds = new Stock();
        
        
        Producto primerProducto = new Producto();
        primerProducto.setCodigo(1);
        primerProducto.setNombre("aaa");
        primerProducto.setPrecio(100.0);
        primerProducto.setStock(3);
        ds.agregarProducto(primerProducto);
        
        Producto segundoProducto = new Producto();
        segundoProducto.setCodigo(2);
        segundoProducto.setNombre("bbb");
        segundoProducto.setPrecio(50.0);
        segundoProducto.setStock(80);
        ds.agregarProducto(segundoProducto);
        
        System.out.println(ds);
        //DetalleProducto primerDetalle = new DetalleProducto();
        primerDetalle.setCantidadProducto(2);
        primerDetalle.setPrecioUnitario(primerProducto.getPrecio());
        primerDetalle.setUnProducto(primerProducto);
        primerDetalle.actualizarStock();
        
        unaFactura.agregarDetalle(primerDetalle);//Agregamos el primer detalla con el primer producto
        
        //DetalleProducto segundoDetalle = new DetalleProducto();
        segundoDetalle.setCantidadProducto(50);
        segundoDetalle.setPrecioUnitario(segundoProducto.getPrecio());
        segundoDetalle.setUnProducto(segundoProducto);
        segundoDetalle.actualizarStock();
        
        unaFactura.agregarDetalle(segundoDetalle);//Agregamos el segundo detalle con el segundo producto
        
        System.out.println(unaFactura);
        System.out.println(ds);

//        System.out.println("El total de la factura " + unaFactura.calcularTotal());   
    }
}