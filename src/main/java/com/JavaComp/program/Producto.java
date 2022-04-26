package com.JavaComp.program;

import javax.imageio.ImageIO;
import java.time.LocalDate;
import java.util.ArrayList;

public class Producto {
    private String titulo;
    private String Caracteristicas;
    private String Categoría;
    private double pvp;
    private ImageIO imagen;
    private int stock;
    private LocalDate fechaEntrada;
    private ArrayList<Opinion> opiniones;

    public Producto(String titulo, String caracteristicas, String categoría, double pvp, ImageIO imagen, int stock, LocalDate fechaEntrada, ArrayList<Opinion> opiniones) {
        this.titulo = titulo;
        Caracteristicas = caracteristicas;
        Categoría = categoría;
        this.pvp = pvp;
        this.imagen = imagen;
        this.stock = stock;
        this.fechaEntrada = fechaEntrada;
        this.opiniones = opiniones;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCaracteristicas() {
        return Caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        Caracteristicas = caracteristicas;
    }

    public String getCategoría() {
        return Categoría;
    }

    public void setCategoría(String categoría) {
        Categoría = categoría;
    }

    public double getPvp() {
        return pvp;
    }

    public void setPvp(double pvp) {
        this.pvp = pvp;
    }

    public ImageIO getImagen() {
        return imagen;
    }

    public void setImagen(ImageIO imagen) {
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
