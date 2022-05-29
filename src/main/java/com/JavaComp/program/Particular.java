package com.JavaComp.program;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Pablo
 * @author Karín
 */
public class Particular extends Cliente implements Serializable{
    private String dni;
    
    /**
     * Instancia un cliente de tipo particular
     * @param nombre
     * @param correo
     * @param clave
     * @param direccion
     * @param telefono
     * @param numPedidos
     * @param dni
     */
    public Particular(String nombre, String correo, String clave, Direccion direccion, String telefono, int numPedidos, String dni) {
        super(nombre, correo, clave, direccion, telefono, numPedidos);
        this.dni=dni;        
    }
    
    /**
     * Crea un cliente particular y lo introduce en la lista de clientes de DataManager
     * @param nombre
     * @param correo
     * @param clave
     * @param telefono
     * @param dni
     * @param titularTarj
     * @param codTarj
     * @param fechTarj
     * @param calleDir
     * @param numDir
     * @param cpDir
     * @param ciudadDir
     */
    public static void CrearParticular(String nombre, String correo, String clave,
            String telefono, String dni, String titularTarj, String codTarj, 
            String fechTarj, String calleDir, String numDir, 
            String cpDir, String ciudadDir){
        int numPedidos =  0;
        Direccion dir = new Direccion(calleDir, numDir, cpDir, ciudadDir);
        Particular cliente = new Particular(nombre, correo, clave, dir, telefono, numPedidos, dni);
        
        TarjetaCredito tarjeta = new TarjetaCredito(titularTarj, codTarj, fechTarj);
        cliente.setTarjeta(tarjeta);
        ArrayList<Cliente> clientes = DataManager.getClientes();
        clientes.add(cliente);
        DataManager.setClientes(clientes);
        DataManager.setClienteActual(cliente);
    }

    /**
     * Modifica el cienteActual de DataManager y lo reintroduce en la lista de clientes
     * @param nombre
     * @param correo
     * @param clave
     * @param telefono
     * @param dni
     * @param titularTarj
     * @param codTarj
     * @param fechTarj
     * @param calleDir
     * @param numDir
     * @param cpDir
     * @param ciudadDir
     */
    public static void ModificarParticular(String nombre, String correo, String clave,
            String telefono, String dni, String titularTarj, String codTarj, 
            String fechTarj, String calleDir, String numDir, 
            String cpDir, String ciudadDir){
        int numPedidos =  DataManager.getClienteActual().getNumPedidos();
        Direccion dir = new Direccion(calleDir, numDir, cpDir, ciudadDir);
        Particular cliente = new Particular(nombre, correo, clave, dir, telefono, numPedidos, dni);
        TarjetaCredito tarjeta = new TarjetaCredito(titularTarj, codTarj, fechTarj);
        cliente.setTarjeta(tarjeta);
        int i = 0;
        while (!(DataManager.getClientes().get(i).equals(DataManager.getClienteActual()))){
            i++;
        }
        ArrayList<Cliente> clientes = DataManager.getClientes(); 
        clientes.set(i,cliente);
        DataManager.setClientes(clientes);
        DataManager.setClienteActual(cliente);
    }
    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
