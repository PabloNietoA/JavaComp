/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.JavaComp.program;

import java.io.*;
import java.util.ArrayList;

public class DataManager {
    
    private static Cliente clienteActual = null;
    private static ArrayList<Cliente> clientes = new ArrayList();

    public static Cliente getClienteActual() {
        return clienteActual;
    }

    public static void setClienteActual(Cliente clienteActual) {
        DataManager.clienteActual = clienteActual;
    }
    private static ArrayList<Producto> productos = new ArrayList();
    
    public static void uploadSave(ArrayList i, String saveDir){
        try{
            FileOutputStream oStream = new FileOutputStream(saveDir);
            ObjectOutputStream ooStream = new ObjectOutputStream(oStream);
            ooStream.writeObject(i);
            oStream.close();
        }
        catch (IOException ioe){
            System.out.println("Error de I/O: " + ioe.getMessage());
        }
        catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
    }
    public static ArrayList downloadSave(String saveDir){
        ArrayList i = new ArrayList();
        try{
            FileInputStream iStream = new FileInputStream(saveDir);
            ObjectInputStream oiStream = new ObjectInputStream(iStream);
            i = (ArrayList) oiStream.readObject();
            iStream.close();
        }
        catch (IOException ioe){
            System.out.println("Error de I/O: " + ioe.getMessage());
        }
        catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return i;
    }

    public static ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public static void setClientes(ArrayList<Cliente> clientes) {
        DataManager.clientes = clientes;
    }

    public static ArrayList<Producto> getProductos() {
        return productos;
    }

    public static void setProductos(ArrayList<Producto> productos) {
        DataManager.productos = productos;
    }
}
