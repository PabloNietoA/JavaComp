package com.JavaComp.program;

import java.awt.image.BufferedImage;
import java.time.LocalDate;
import java.util.ArrayList;

public class Producto {
    private String titulo;
    private String caracteristicas;
    private String categoria;
    private double pvp;
    private BufferedImage imagen;
    private int stock;
    private LocalDate fechaEntrada;
    private ArrayList<Opinion> opiniones;

    public Producto(String titulo, String caracteristicas, String categoria, double pvp, BufferedImage imagen, int stock, LocalDate fechaEntrada, ArrayList<Opinion> opiniones) {
        this.titulo = titulo;
        this.caracteristicas = caracteristicas;
        this.categoria = categoria;
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
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String getCategoría() {
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

    public BufferedImage getImagen() {
        return imagen;
    }

    public void setImagen(BufferedImage imagen) {
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
