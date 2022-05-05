package com.JavaComp.program;

public class Cliente {
    private String nombre;
    private String correo;
    private String clave;
    private Direccion direccion;
    private TarjetaCredito tarjeta;
    private String telefono;

    public Cliente(String nombre, String correo, String clave, Direccion direccion, String telefono) {
        this.nombre = nombre;
        this.correo = correo;
        this.clave = clave;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public TarjetaCredito getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(TarjetaCredito tarjeta) {
        this.tarjeta = tarjeta;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
   
}
