/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.JavaComp.program;

import java.util.ArrayList;
import com.JavaComp.interf.*;

/**
 *
 * @author Slend
 */

public class MainClass {
    
    public static ArrayList<Cliente> clientes = new ArrayList();
    public static ArrayList<Producto> productos = new ArrayList();
    public static void main(String[] args) {
        clientes = SaveManager.downloadSave("saveClientes.dat");
        productos = SaveManager.downloadSave("saveProductos.dat");
        for (int i=0; i<clientes.size();i++){
            System.out.print(clientes.get(i).getCorreo() + " ; " + clientes.get(i).getClave() + "\n");
        }
        MainMenu main = new MainMenu();
        main.setLocationRelativeTo(null);
        main.setVisible(true);
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            public void run() {
                SaveManager.uploadSave(clientes, "saveClientes.dat");
                SaveManager.uploadSave(productos, "saveClientes.dat");
                for (int i=0; i<clientes.size();i++){
                    System.out.print(clientes.get(i).getCorreo() + " : " + clientes.get(i).getClave() +"\n");
                }
            }
        }));
        
    }
    
}
