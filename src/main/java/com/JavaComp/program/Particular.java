package com.JavaComp.program;

public class Particular extends Cliente{
    private String dni;

    public Particular(String nombre, String correo, String clave, Direccion direccion, TarjetaCredito tarjeta, String telefono, String dni) {
        super(nombre, correo, clave, direccion, tarjeta, telefono);
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
