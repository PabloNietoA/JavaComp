/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.JavaComp.program;

import com.JavaComp.interf.DisplayProducto;
import static com.JavaComp.program.Producto.crearPanel;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JPanel;

public class DataManager {
    
    private static Cliente clienteActual = null;
    private static ArrayList<Cliente> clientes = new ArrayList();
    private static ArrayList<Producto> productos = new ArrayList();

    public static Cliente getClienteActual() {
        return clienteActual;
    }
    
    public static ArrayList filtrarCategoria(String categoria){
        ArrayList listaFiltrada = new ArrayList();
        for(Producto prod : productos){
            System.out.print(prod.getCategoria());
            if (prod.getCategoria().equals(categoria)){
                listaFiltrada.add(prod);
            }
        }
        return listaFiltrada;
    }
    
    public static void displayList(ArrayList<Producto> lista, JPanel panel){
        panel.removeAll();
        for (int i = 0; i < lista.size(); i++){
            DisplayProducto display = crearPanel(lista.get(i));
            display.setVisible(true);
            panel.add(display);
            
        }
        panel.repaint();
        panel.revalidate();
    }
    
    public static void setClienteActual(Cliente clienteActual) {
        DataManager.clienteActual = clienteActual;
    }
    
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
