package com.JavaComp.program;

public class Empresa extends Cliente{
        private String cif;
        private String web;

    public Empresa(String nombre, String correo, String clave, Direccion direccion, String telefono, String cif, String web) {
        super(nombre, correo, clave, direccion, telefono);
        this.cif = cif;
        this.web = web;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }
}
