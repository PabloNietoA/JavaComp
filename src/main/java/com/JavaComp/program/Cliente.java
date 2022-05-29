package com.JavaComp.program;

import java.io.Serializable;

/**
 *
 * @author Pablo
 * @author Karín
 */
public abstract class Cliente implements Serializable{
    private String nombre;
    private String correo;
    private String clave;
    private Direccion direccion;
    private TarjetaCredito tarjeta;
    private String telefono;
    private boolean isParticular;
    private int numPedidos;

    /**
     * Instancia un cliente con todos sus datos
     * @param nombre
     * @param correo
     * @param clave
     * @param direccion
     * @param telefono
     * @param numPedidos
     */
    public Cliente(String nombre, String correo, String clave, Direccion direccion, String telefono, int numPedidos) {
        this.nombre = nombre;
        this.correo = correo;
        this.clave = clave;
        this.direccion = direccion;
        this.telefono = telefono;
        this.numPedidos = numPedidos;
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
    
    /**
     * Busca al cliente por correo y clave
     * @param correo el correo que se va a comparar
     * @param clave la clave que se va a comparar
     * @return devuelve la posición del cliente en el arrayList Clientes de DataManager, si  no existe devuelve la longitud del arraylist
     */
    public static int EncontrarCliente(String correo, String clave){
        int i = 0;
        while ( i < DataManager.getClientes().size() && !(DataManager.getClientes().get(i).getCorreo().equals(correo)
                && DataManager.getClientes().get(i).getClave().equals(clave)) && i < (DataManager.getClientes().size())){
                i++;
            }
        return i;
    }
    
    /**
     * Loggea al cliente en la aplicación y lo setea en datamanager como clienteActual
     * @param correo correo del cliente que se va a loggear
     * @param clave clave del cliente que se va a loggear
     * @return true si el cliente existe y se ha loggeado con éxito
     */
    public static boolean LoggearCliente(String correo, String clave){
        int i = EncontrarCliente(correo, clave);
        boolean isLogged = false;
        if (i < (DataManager.getClientes().size())){
                DataManager.setClienteActual(DataManager.getClientes().get(i));
                isLogged = true;
            }
        return isLogged;
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
    
    public boolean isParticular(){
        return isParticular;
    }
    
    public void setIsParticular(boolean isParticular){
        this.isParticular = isParticular();
    }
    
    public int getNumPedidos() {
        return numPedidos;
    }
    
    public void setNumPedidos(int numPedidos){
    this.numPedidos= numPedidos;
    }
}
