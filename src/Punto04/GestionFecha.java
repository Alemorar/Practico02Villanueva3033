/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author alejandro
 */
public class GestionFecha {
    
    public Date devolverDate() {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat formatText = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = null;
        String textFecha = scanner.next();
        try {
            fecha = formatText.parse(textFecha);
        }catch (ParseException ex){
            ex.printStackTrace();
        }
        return fecha;
    }
    
    public String devolverString(String cadenaFecha){
        Date fecha= new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        cadenaFecha = formato.format(fecha);
        return cadenaFecha;
    }
    
    public Date sumarDias(Date unaFecha, int dia){
        Date suma;
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(unaFecha);
        calendar.add(Calendar.DAY_OF_MONTH, dia);
        suma = calendar.getTime();
        return suma;
    }
    
    public Date restarDias(Date unaFecha, int dia){
        Date suma;
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(unaFecha);
        calendar.add(Calendar.DAY_OF_MONTH, -(dia));
        suma = calendar.getTime();
        return suma;
    }
}
