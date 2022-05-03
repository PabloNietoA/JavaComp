/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.JavaComp.program;

import java.util.ArrayList;

/**
 *
 * @author Slend
 */
public class MainClass {
    
    public static ArrayList<Cliente> clientes;
    public static void main(String[] args) {
        // TODO code application logic here
        SaveManager.downloadSave(clientes, "save.dat");
    }
    
}
