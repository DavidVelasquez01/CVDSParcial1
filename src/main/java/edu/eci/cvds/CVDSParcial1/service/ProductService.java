package main.java.edu.eci.cvds.CVDSParcial1.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.java.edu.eci.cvds.CVDSParcial1.repository.ProductRepository;
import netscape.javascript.JSObject;
import edu.eci.cvds.CVDSParcial1.model.Product;


@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public String addProduct(Product product){
        
        this.productRepository.addProduct(product);
        return "Se añadio el producto";

    }

    public String editProduct(String nombre, Product product) {
        this.productRepository.editProduct(nombre, product);
        return "Se edito el producto";
    }

    public ProductRepository getRepo(){
        return this.productRepository;
    }

}
