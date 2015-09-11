package Punto06.A;

import java.util.ArrayList;

public class Supermercado {
    private String nombre;
    private Cliente unCliente;
    private ArrayList<Seccion> seccion;

    public Supermercado() {
        seccion = new ArrayList<Seccion>();
    }
    
    public void agregarSeccion(Seccion s){
        seccion.add(s);
    }
    
    public Supermercado(String nombre, Cliente unCliente) {
        this.nombre = nombre;
        this.unCliente = unCliente;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cliente getUnCliente() {
        return unCliente;
    }

    public void setUnCliente(Cliente unCliente) {
        this.unCliente = unCliente;
    }

    public ArrayList<Seccion> getSeccion() {
        return seccion;
    }

    public void setSeccion(ArrayList<Seccion> seccion) {
        this.seccion = seccion;
    }
    
    
}
