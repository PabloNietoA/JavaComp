package com.JavaComp.program;

import java.io.Serializable;

public class Particular extends Cliente implements Serializable{
    private String dni;
    
    public Particular(String nombre, String correo, String clave, Direccion direccion, String telefono, String dni) {
        super(nombre, correo, clave, direccion, telefono);
        this.dni = dni;
        this.isParticular = true;
        
    }
    
    public static void CrearParticular(String nombre, String correo, String clave,
            String telefono, String dni, String titularTarj, String codTarj, 
            String fechTarj, String calleDir, String numDir, 
            String cpDir, String ciudadDir){
        Direccion dir = new Direccion(calleDir, numDir, cpDir, ciudadDir);
        Particular cliente = new Particular(nombre, correo, clave, dir, telefono, dni);
        TarjetaCredito tarjeta = new TarjetaCredito(titularTarj, codTarj, fechTarj);
        cliente.setTarjeta(tarjeta);
        MainClass.clientes.add(cliente);
        MainClass.clienteActual = cliente;
    }

    public static void ModificarParticular(String nombre, String correo, String clave,
            String telefono, String dni, String titularTarj, String codTarj, 
            String fechTarj, String calleDir, String numDir, 
            String cpDir, String ciudadDir){
        Direccion dir = new Direccion(calleDir, numDir, cpDir, ciudadDir);
        Particular cliente = new Particular(nombre, correo, clave, dir, telefono, dni);
        TarjetaCredito tarjeta = new TarjetaCredito(titularTarj, codTarj, fechTarj);
        cliente.setTarjeta(tarjeta);
        int i = 0;
        while (!(MainClass.clientes.get(i).equals(MainClass.clienteActual))){
            i++;
        }
        MainClass.clientes.set(i, cliente);
        MainClass.clienteActual = cliente;
    }
    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
