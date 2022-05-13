package com.JavaComp.program;

import java.io.Serializable;

public class Empresa extends Cliente implements Serializable{
        private String cif;
        private String web;

    public Empresa(String nombre, String correo, String clave, Direccion direccion, String telefono, String cif, String web) {
        super(nombre, correo, clave, direccion, telefono);
        this.cif = cif;
        this.web = web;
        this.isParticular = false;
    }
    
    public static void CrearEmpresa(String nombre, String correo, String clave,
            String telefono, String cif, String web, String titularTarj, 
            String codTarj, String fechTarj, String calleDir, String numDir, 
            String cpDir, String ciudadDir){
        Direccion dir = new Direccion(calleDir, numDir, cpDir, ciudadDir);
        Empresa cliente = new Empresa(nombre, correo, clave, dir, telefono, cif, web);
        TarjetaCredito tarjeta = new TarjetaCredito(titularTarj, codTarj, fechTarj);
        cliente.setTarjeta(tarjeta);
        MainClass.clientes.add(cliente);
        MainClass.clienteActual = cliente;
    }
    
    public static void ModificarEmpresa(String nombre, String correo, String clave,
            String telefono, String cif, String web, String titularTarj, 
            String codTarj, String fechTarj, String calleDir, String numDir, 
            String cpDir, String ciudadDir){
        Direccion dir = new Direccion(calleDir, numDir, cpDir, ciudadDir);
        Empresa cliente = new Empresa(nombre, correo, clave, dir, telefono, cif, web);
        TarjetaCredito tarjeta = new TarjetaCredito(titularTarj, codTarj, fechTarj);
        cliente.setTarjeta(tarjeta);
        int i = 0;
        while (!(MainClass.clientes.get(i).equals(MainClass.clienteActual))){
            i++;
        }
        MainClass.clientes.set(i, cliente);
        MainClass.clienteActual = cliente;
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
