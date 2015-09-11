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
public class EmpleadoPartTime extends Empleado{
    private Date diaTrabaja;

    public EmpleadoPartTime() {
    }

    public Date getDiaTrabaja() {
        return diaTrabaja;
    }

    public void setDiaTrabaja(Date diaTrabaja) {
        this.diaTrabaja = diaTrabaja;
    }
    
}
