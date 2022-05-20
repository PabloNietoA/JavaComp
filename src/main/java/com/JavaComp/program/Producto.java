package com.JavaComp.program;

import com.JavaComp.interf.DisplayProducto;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JPanel;

public class Producto implements Serializable {
    private String titulo;
    private String caracteristicas;
    private String categoria;
    private double pvp;
    private String imagen;
    private int stock;
    private LocalDate fechaEntrada;
    private ArrayList<Opinion> opiniones;

    public Producto(String titulo, String caracteristicas, String categoria, double pvp, String imagen, int stock, LocalDate fechaEntrada) {
        this.titulo = titulo;
        this.caracteristicas = caracteristicas;
        this.categoria = categoria;
        this.pvp = pvp;
        this.imagen = imagen;
        this.stock = stock;
        this.fechaEntrada = fechaEntrada;
    }
    
    public static void showList(ArrayList<Producto> lista, JPanel panel){
        for (int i = 0; i < lista.size(); i++){
            /*javax.swing.JCheckBox newProd = new javax.swing.JCheckBox();
            String showTxt = lista.get(i).getTitulo() + " ;  " + lista.get(i).getCaracteristicas() + " ;  " + lista.get(i).getPvp() + "€";
            newProd.setText(showTxt);
            newProd.setVisible(true);
            panel.add(newProd);*/
            DisplayProducto display = crearPanel(lista.get(i));
            display.setVisible(true);
            panel.add(display);
            
        }
        panel.repaint();
        panel.revalidate();
    }
    public static DisplayProducto crearPanel(Producto producto){
        DisplayProducto display = new DisplayProducto();
        display.prod = producto;
        display.setParameters();
        return display;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPvp() {
        return pvp;
    }

    public void setPvp(double pvp) {
        this.pvp = pvp;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }  

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public ArrayList<Opinion> getOpiniones() {
        return opiniones;
    }

    public void setOpiniones(ArrayList<Opinion> opiniones) {
        this.opiniones = opiniones;
    }
}
