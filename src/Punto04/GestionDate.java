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
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author alejandro
 */
public class GestionDate {
    private Date fecha1;
    private Date fecha2;

    public GestionDate() {
    }
    
    public String ingresarFecha(){
        Scanner scanner = new Scanner(System.in);
        String strFecha = "";
        System.out.println("Ingrese (dd/MM/yyyy)");
        strFecha = scanner.next();
        return strFecha;
    }
    
    public SimpleDateFormat instanciarSDF(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf;
    }
    
    public Date invertirStringDate(Date dtFecha){//realiza String a Date
        SimpleDateFormat sdf = instanciarSDF();
        if (dtFecha == null){//de String a Date
            try {
                dtFecha = sdf.parse(ingresarFecha());
            }catch (ParseException ex){
                ex.printStackTrace();
            }
        }
        return dtFecha;
    }
    
    public String invertirDateString(Date dtFecha){//realiza Date a String
        SimpleDateFormat sdf = instanciarSDF();
        if (dtFecha == null){
            dtFecha = invertirStringDate(dtFecha);
        }
        return sdf.format(dtFecha);
    }
    
    public Date agregarDias(Date dtFecha, int dia){
        if (dtFecha == null){
            dtFecha = invertirStringDate(dtFecha);
        }
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(dtFecha);
        calendar.add(Calendar.DAY_OF_MONTH, dia);
        return calendar.getTime();
    }
    
    public Date restarDias(Date dtFecha, int dia){
        if (dtFecha == null){
            dtFecha = invertirStringDate(dtFecha);
        }
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(dtFecha);
        calendar.add(Calendar.DAY_OF_MONTH, -(dia));
        return calendar.getTime();
    }
    
    private void compararFechas(Date dtFecha, Date dtFecha2){
        GregorianCalendar calDesde = new GregorianCalendar();
        if (dtFecha == null){
            System.out.println("Fecha1");
            dtFecha = invertirStringDate(dtFecha);
        }
        calDesde.setTime(dtFecha);
        GregorianCalendar calHasta = new GregorianCalendar();
        if (dtFecha2 == null){
            System.out.println("Fecha2");
            dtFecha2 = invertirStringDate(dtFecha2);
        }
        calHasta.setTime(dtFecha2);
        if (calDesde.after(calHasta)){
            //La fecha1 de calHastaes < que la fecha1 de calDesde
            System.out.println(calDesde + " es posterior a " + calHasta);
        }else if(calDesde.before(calHasta)){
            //La fecha1 de calHastaes > que la fecha1 de calDesde
            System.out.println(calHasta + " es posterior a " + calDesde);
        }else{
            System.out.println("Fecha1: " + calHasta + " es igual a " + "Fecha2: " + calDesde);
        }
    }
    
    public int extraerDia(Date dtFecha){
        if (dtFecha == null){
            dtFecha = invertirStringDate(dtFecha);
        }
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(dtFecha);
        return calendar.get(calendar.DAY_OF_MONTH);
    }
    
    public int extraerMes(Date dtFecha){
        if (dtFecha == null){
            dtFecha = invertirStringDate(dtFecha);
        }
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(fecha1);
        return calendar.get(calendar.MONTH);
    }
    
    public int extraerAnio(Date dtFecha){
        if (dtFecha == null){
            dtFecha = invertirStringDate(dtFecha);
        }
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(fecha1);
        return calendar.get(calendar.YEAR);
    }
    
    //Agregue un método que convierte una fecha1 de tipo java.util.Date a java.sql.Date
    public void convertirUtil_SQL(){
        java.util.Date utilDate = new java.util.Date();//fecha de sistema
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        System.out.println("utilDate:" + utilDate);
        System.out.println("sqlDate:" + sqlDate);
    }
    
    public void administrarOpciones(){
        int opcion;
        do{
            System.out.println("********Menu Gestor de Fechas**********");
            System.out.println("1) Invertir String a Date ");
            System.out.println("2) Invertir Date a String ");
            System.out.println("3) Agregar dias");
            System.out.println("4) Restar dias");
            System.out.println("5) Comparar fechas");
            System.out.println("6) Extraer dia");
            System.out.println("7) Extraer mes");
            System.out.println("8) Extraes anio");
            System.out.println("9) Conertir java.Util.Date en SQL.Date");
            System.out.println("0) Salir de Calculadora.....");
            Scanner scanner = new Scanner(System.in);
            opcion = scanner.nextInt();
            switch (opcion){
                case 1:{
                    SimpleDateFormat sdf = instanciarSDF();
                    System.out.println("El Date del String es: \n" + sdf.format(invertirStringDate(fecha1)));
                }break;
                case 2:{
                    System.out.println("El String del Date es:\n" + invertirDateString(fecha1));
                }break;    
                case 3:{
                    System.out.println("Ingrese dias para agregar: ");
                    int dia = scanner.nextInt();
                    SimpleDateFormat sdf = instanciarSDF();
                    System.out.println("Agregamos " + dia + " dias mas:\n" + sdf.format(agregarDias(fecha1, dia)));
                }break;
                case 4:{
                    System.out.println("Ingrese dias para restar: ");
                    int dia = scanner.nextInt();
                    SimpleDateFormat sdf = instanciarSDF();
                    System.out.println("Quitamos " + dia + " dias:\n" + sdf.format(restarDias(fecha1, dia)));
                }break;
                case 5:{
                    compararFechas(fecha1, fecha2);
                }break;
                case 6:{
                    System.out.println("El dia es: " + extraerDia(fecha1));
                }break;
                case 7:{
                    System.out.println("El mes es: " + extraerMes(fecha1));
                }break;
                case 8:{
                    System.out.println("El mes es: " + extraerAnio(fecha1));        
                }break;
                case 9:{
                    convertirUtil_SQL();
                }break;
                case 10:{//arreglos para test
                    SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd/MM/yyyy");
                    String unaFecha = ("12/10/1997");
                    fecha1 = new Date();
                    try{
                        fecha1 = formatoDelTexto.parse(unaFecha);
                    }catch (ParseException ex){
                        ex.printStackTrace();
                    }
                    System.out.println("Seteando fecha: " + unaFecha);
                    System.out.println("fecha1.toString(): " + fecha1.toString());
                }break;
                case 11:{
                    
                }break;
                case 12:{
                    
                }break;
                default:{
                    System.out.println("Saliendo del system.....");
                }
            }
        }while (opcion != 0);
    }

    public Date getFecha1() {
        return fecha1;
    }

    public void setFecha1(Date fecha1) {
        this.fecha1 = fecha1;
    }

    public Date getFecha2() {
        return fecha2;
    }

    public void setFecha2(Date fecha2) {
        this.fecha2 = fecha2;
    }

    @Override
    public String toString() {
        return "GestionDate{" + "fecha1=" + fecha1 + ", fecha2=" + fecha2 + '}';
    }
}
