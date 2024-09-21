package main.java.edu.eci.cvds.CVDSParcial1.repository;

import java.util.HashMap;

import edu.eci.cvds.CVDSParcial1.model.Product;

public class ProductRepository {
    HashMap<String,Product> productos;

    public ProductRepository(){
        productos = new HashMap<String, Product>();
    }

    public addProduct(Product product){
        this.productos.put(product.getNombre(), product);
    }

    public editProduct(String nombreP, Product product){
        this.productos.replace(nombreP, product);
    }

    public HashMap<String,Product> getProducto(String nombre){
        return this.productos.get(nombre);
    }
}
