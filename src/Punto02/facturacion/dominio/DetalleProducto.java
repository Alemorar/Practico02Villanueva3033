/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto02.facturacion.dominio;

/**
 *
 * @author alejandro
 */
public class DetalleProducto {
    private Producto unProducto;
    private double precioUnitario;
    private int cantidadProduco;
    
    public double calcularSubtotal(){
        return cantidadProduco * precioUnitario;
    }
    
    /**
     * @return the unProducto
     */
    public Producto getUnProducto() {
        return unProducto;
    }

    /**
     * @param unProducto the unProducto to set
     */
    public void setUnProducto(Producto unProducto) {
        this.unProducto = unProducto;
    }

    /**
     * @return the precioUnitario
     */
    public double getPrecioUnitario() {
        return precioUnitario;
    }

    /**
     * @param precioUnitario the precioUnitario to set
     */
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    /**
     * @return the cantidadProduco
     */
    public int getCantidadProduco() {
        return cantidadProduco;
    }

    /**
     * @param cantidadProduco the cantidadProduco to set
     */
    public void setCantidadProduco(int cantidadProduco) {
        this.cantidadProduco = cantidadProduco;
    }
    
}
