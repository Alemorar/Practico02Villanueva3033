/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto06.B;

/**
 *
 * @author alejandro
 */
public class Cliente {
    private String nombre;
    private OrdenCompra unaOrden;

    public Cliente() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public OrdenCompra getUnaOrden() {
        return unaOrden;
    }

    public void setUnaOrden(OrdenCompra unaOrden) {
        this.unaOrden = unaOrden;
    }
}
