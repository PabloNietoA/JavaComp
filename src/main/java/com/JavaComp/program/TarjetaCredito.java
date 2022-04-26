package com.JavaComp.program;

import java.time.LocalDate;

public class TarjetaCredito {
    private String titular;
    private String codigo;
    private LocalDate caducidad;

    public TarjetaCredito(String titular, String codigo, LocalDate caducidad) {
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

    public LocalDate getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(LocalDate caducidad) {
        this.caducidad = caducidad;
    }
}
