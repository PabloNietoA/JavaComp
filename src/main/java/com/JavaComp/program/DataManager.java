/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.JavaComp.program;

import com.JavaComp.interf.DisplayProdCarro;
import com.JavaComp.interf.DisplayProducto;
import com.JavaComp.interf.InterfCarro;
import static com.JavaComp.program.Producto.crearPanel;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JPanel;

public class DataManager {
    
    private static Cliente clienteActual = null;
    private static ArrayList<Cliente> clientes = new ArrayList();
    private static ArrayList<Producto> productos = new ArrayList();
    private static ArrayList<Producto> carritoActual = new ArrayList();

    public static Cliente getClienteActual() {
        return clienteActual;
    }
    
    public static ArrayList busquedaProducto(String busqueda){
        ArrayList<Producto> filtrado = new ArrayList();
        for (Producto prod: productos){
            boolean encontrado = false;
            if (prod.getCaracteristicas().contains(busqueda) || prod.getTitulo().contains(busqueda) || prod.getCategoria().contains(busqueda)){
                filtrado.add(prod);
                encontrado = true;
            }
            else{
                for(Opinion op: prod.getOpiniones()){
                    if(op.getComentario().contains(busqueda) && !encontrado){
                        filtrado.add(prod);
                        encontrado = false;
                    }
                }
            }
        }
        return filtrado;
    }
    
    public static void sortPrecio(boolean reverse, ArrayList<Producto> array){
        if(!reverse){
            array.sort(new Comparator<Producto>() {
                @Override
                public int compare(Producto p1, Producto p2) {
                    return Double.compare(p1.getPvp(), p2.getPvp());
                }
            }.reversed());
        }
        else {
            array.sort(new Comparator<Producto>() {
                @Override
                public int compare(Producto p1, Producto p2) {
                    return Double.compare(p1.getPvp(), p2.getPvp());
                }
            });
        }
        
    }
    
    public static void sortTitulo(ArrayList<Producto> array){
        array.sort(new Comparator<Producto>(){
            @Override
            public int compare(Producto p1, Producto p2){
                return p1.getTitulo().compareTo(p2.getTitulo());
            }
        });
    }
    
    public static void sortRelevancia(ArrayList<Producto> array) {
        array.sort(new Comparator<Producto>(){
            @Override
            public int compare(Producto p1, Producto p2){
                return Float.compare(p1.getMidRating(), p2.getMidRating());
            }
        }.reversed());
    }
    
    public static void meterAlCarro(Producto prod){
        carritoActual.add(prod);
    }
    
    public static void quitarDeCarro(Producto prod){
        int i = 0;
        while(!carritoActual.get(i).equals(prod)) i++;
        carritoActual.remove(i);
    }
    
    public static ArrayList filtrarCategoria(String categoria, ArrayList<Producto> array){
        ArrayList listaFiltrada = new ArrayList();
        if(!categoria.equals("Todos")){
            for(Producto prod : array){
                if (prod.getCategoria().equals(categoria)){
                    listaFiltrada.add(prod);
                }
            }
            return listaFiltrada;
        }
        else return array;
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
    
    public static void displayCarrito(JPanel panel, InterfCarro interfaz){
        panel.removeAll();
        for (int i = 0; i < carritoActual.size(); i++){
            DisplayProdCarro display = Producto.crearPanelCarro(carritoActual.get(i));
            display.setParent(interfaz);
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

    public static ArrayList<Producto> getCarritoActual() {
        return carritoActual;
    }

    public static void setCarritoActual(ArrayList<Producto> carrito) {
        DataManager.carritoActual = carrito;
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
