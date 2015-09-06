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
    private int cantidadProducto;
    
    public double calcularSubtotal(){
        return cantidadProducto * precioUnitario;
    }
    
    public void actualizarStock(){
        unProducto.setStock(unProducto.getStock() - cantidadProducto);
    }
    
    public Producto getUnProducto() {
        return unProducto;
    }

    public void setUnProducto(Producto unProducto) {
        this.unProducto = unProducto;
    }

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
     * @return the cantidadProducto
     */
    public int getCantidadProducto() {
        return cantidadProducto;
    }

    /**
     * @param cantidadProducto the cantidadProducto to set
     */
    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    @Override
    public String toString() {
        return "\n" + unProducto.getCodigo() + "\t" + unProducto.getNombre() + "\t\t" + precioUnitario + "\t" + cantidadProducto + "\t\t" + calcularSubtotal();
    }   
}