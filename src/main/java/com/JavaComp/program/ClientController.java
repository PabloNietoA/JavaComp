/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.JavaComp.program;

import java.util.ArrayList;

/**
 *
 * @author Slend
 */
public class ClientController {
    private ArrayList<Cliente> clientes;
    public void newParticular(String nombre, String correo, String clave, Direccion dir, TarjetaCredito tarj, int tel, String dni){
        Particular i = new Particular(nombre, correo, clave, dir, tarj, tel, dni);
        clientes.add(i);
    }
    public void newEmpresa(String nom, String corr, String pass, Direccion dir, TarjetaCredito tarj, int tel, String cif, String web){
        clientes.add(new Empresa(nom, corr, pass, dir, tarj, tel, cif, web));
    }
    public String saveClientes(){
        
    }
}
