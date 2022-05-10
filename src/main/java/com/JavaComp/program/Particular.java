package com.JavaComp.program;

import java.io.Serializable;

public class Particular extends Cliente implements Serializable{
    private String dni;
    
    public Particular(String nombre, String correo, String clave, Direccion direccion, String telefono, String dni) {
        super(nombre, correo, clave, direccion, telefono);
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
