package edu.eci.cvds.CVDSParcial1.model;

import java.util.ArrayList;

import main.java.edu.eci.cvds.CVDSParcial1.observers.AGENTE;
import main.java.edu.eci.cvds.CVDSParcial1.observers.AGENTE_ADVERTENCIA;
import main.java.edu.eci.cvds.CVDSParcial1.observers.AGENTE_LOG;

public class Product {

    private String nombre;
    private float precio;
    private int cantidad;
    private String categoria;
    private ArrayList<AGENTE> agentes;

    public Product () {
        this.agentes = new ArrayList<AGENTE>();
        this.agentes.add(new AGENTE_ADVERTENCIA());
        this.agentes.add(new AGENTE_LOG());

    }

    public void notificarAgentes(){
        for (int i=0;i<agentes.size();i++){
            agentes.get(i).update(this);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
        this.notificarAgentes();
    }

    public float getPrecio() {
        return this.precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
