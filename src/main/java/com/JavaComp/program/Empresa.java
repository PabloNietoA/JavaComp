package com.JavaComp.program;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Pablo
 * @author Karín
 */
public class Empresa extends Cliente implements Serializable{
        private String cif;
        private String web;

    /**
     * Instancia un cliente de tipo empresa con todos sus datos
     * @param nombre
     * @param correo
     * @param clave
     * @param direccion
     * @param telefono
     * @param numPedidos
     * @param cif
     * @param web
     */
    public Empresa(String nombre, String correo, String clave, Direccion direccion, String telefono, int numPedidos, String cif, String web) {
        super(nombre, correo, clave, direccion, telefono, numPedidos);
        this.cif = cif;
        this.web = web;
        
    }
    
    /**
     * Crea una empresa con todos los datos y la añade a la lista de clientes de DataManager
     * @param nombre
     * @param correo
     * @param clave
     * @param telefono
     * @param cif
     * @param web
     * @param titularTarj
     * @param codTarj
     * @param fechTarj
     * @param calleDir
     * @param numDir
     * @param cpDir
     * @param ciudadDir
     */
    public static void CrearEmpresa(String nombre, String correo, String clave,
            String telefono, String cif, String web, String titularTarj, 
            String codTarj, String fechTarj, String calleDir, String numDir, 
            String cpDir, String ciudadDir){
        int numPedidos = 0;
        Direccion dir = new Direccion(calleDir, numDir, cpDir, ciudadDir);
        Empresa cliente = new Empresa(nombre, correo, clave, dir, telefono, numPedidos, cif, web);
        TarjetaCredito tarjeta = new TarjetaCredito(titularTarj, codTarj, fechTarj);
        cliente.setTarjeta(tarjeta);
        ArrayList<Cliente> clientes = DataManager.getClientes();
        clientes.add(cliente);
        DataManager.setClientes(clientes);
        DataManager.setClienteActual(cliente);
    }
    
    /**
     * Modifica los datos de clienteActual y lo reemplaza en la lista de clientes de DataManager
     * @param nombre
     * @param correo
     * @param clave
     * @param telefono
     * @param cif
     * @param web
     * @param titularTarj
     * @param codTarj
     * @param fechTarj
     * @param calleDir
     * @param numDir
     * @param cpDir
     * @param ciudadDir
     */
    public static void ModificarEmpresa(String nombre, String correo, String clave,
            String telefono, String cif, String web, String titularTarj, 
            String codTarj, String fechTarj, String calleDir, String numDir, 
            String cpDir, String ciudadDir){
        int numPedidos = DataManager.getClienteActual().getNumPedidos();
        Direccion dir = new Direccion(calleDir, numDir, cpDir, ciudadDir);
        Empresa cliente = new Empresa(nombre, correo, clave, dir, telefono, numPedidos, cif, web);
        TarjetaCredito tarjeta = new TarjetaCredito(titularTarj, codTarj, fechTarj);
        cliente.setTarjeta(tarjeta);
        int i = 0;
        while (!(DataManager.getClientes().get(i).equals(DataManager.getClienteActual()))){
            i++;
        }
        ArrayList<Cliente> clientes = DataManager.getClientes();
        clientes.set(i , cliente);
        DataManager.setClientes(clientes);
        DataManager.setClienteActual(cliente);
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
