package com.JavaComp.program;

import java.io.Serializable;
import java.time.LocalDate;
import javax.swing.JOptionPane;


public class TarjetaCredito implements Serializable{
    private String titular;
    private String codigo;
    private String caducidad;

    public TarjetaCredito(String titular, String codigo, String caducidad) {
        this.titular = titular;
        this.codigo = codigo;
        this.caducidad = caducidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(String caducidad) {
        this.caducidad = caducidad;
    }
    
    public static boolean[] comprobarFechaTarjeta (String fecha){
             boolean tarjetaCaducada=false;
             boolean mesInvalido=false;
             String [] partes = fecha.split("/");
             int mes = Integer.parseInt(partes[0]);
             int anno = Integer.parseInt(partes[1]);
             LocalDate fechaActual = LocalDate.now();
             if ((int)1>mes||mes>(int)12){
                mesInvalido=true;
             }
    
             if (anno<fechaActual.getYear()||(anno==fechaActual.getYear()&&mes<fechaActual.getMonthValue())){                 
            tarjetaCaducada=true;
             }
             boolean[] booleanArray = new boolean[2];
             booleanArray[0] = tarjetaCaducada;
             booleanArray[1] = mesInvalido;
             return (booleanArray);
    }
}
