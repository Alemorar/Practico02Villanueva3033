/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto06.C;

import java.util.Date;

/**
 *
 * @author alejandro
 */
public class EmpleadoFullTime extends Empleado {
    private String turno;

    public EmpleadoFullTime() {
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    
}
