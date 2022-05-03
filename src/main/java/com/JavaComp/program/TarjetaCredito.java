package com.JavaComp.program;


public class TarjetaCredito {
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
}
