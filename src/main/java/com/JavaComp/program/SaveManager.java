/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.JavaComp.program;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Slend
 */
public class SaveManager {
    
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
        ArrayList<Cliente> i = new ArrayList();
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
}
