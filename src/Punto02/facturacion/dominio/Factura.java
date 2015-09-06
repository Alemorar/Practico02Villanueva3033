/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto02.facturacion.dominio;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author alejandro
 */
public class Factura {
    private int numFactura;
    private Date fecha;
    private ArrayList<DetalleProducto> detalle;//inicializamos el "array = new ArrayList<DetalleProducto>()"

    public Factura() {
        detalle = new ArrayList<DetalleProducto>();//o lo inicializamos aqui, ambas son validas
    }
    
    public void agrearDetalle(DetalleProducto dp){
        detalle.add(dp);
    }
    
    public double calcularTotal(){
        double total = 0.0;
        for (DetalleProducto dp: detalle){
            total = total + dp.calcularSubtotal();
        }
        return total; 
    }

    /**
     * @return the numFactura
     */
    public int getNumFactura() {
        return numFactura;
    }

    /**
     * @param numFactura the numFactura to set
     */
    public void setNumFactura(int numFactura) {
        this.numFactura = numFactura;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the detalle
     */
    public ArrayList<DetalleProducto> getDetalle() {
        return detalle;
    }

    /**
     * @param detalle the detalle to set
     */
    public void setDetalle(ArrayList<DetalleProducto> detalle) {
        this.detalle = detalle;
    }

    @Override
    public String toString() {
        String salida = "";
        salida = "Numero Factura: " + numFactura + "\n";
        salida = salida + "Fecha: " + fecha + "\n";
        salida = salida + "\nCodigo" + "\tDescripcion" + "\tPrecio" + "\tCantidad" + "\tSubTotal";
        for (DetalleProducto dp:detalle){
            salida = salida + dp.toString();
        }
        salida = salida + "\nTotal:\t\t\t\t\t\t" + calcularTotal();
        return salida;
    } 
}
