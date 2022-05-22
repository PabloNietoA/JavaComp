/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.JavaComp.program;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Slend
 */
public class Pedido {
    private ArrayList<Producto> carrito;
    private Cliente cliente;
    private LocalDate fechaPedido;

    public Pedido(Cliente cliente, LocalDate fechaPedido) {
        this.cliente = cliente;
        this.fechaPedido = fechaPedido;
    }

    public ArrayList<Producto> getCarrito() {
        return carrito;
    }

    public void setCarrito(ArrayList<Producto> carrito) {
        this.carrito = carrito;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
    }
    
    
}
