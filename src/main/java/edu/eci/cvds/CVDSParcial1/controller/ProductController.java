package edu.eci.cvds.CVDSParcial1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import edu.eci.cvds.CVDSParcial1.model.Product;
import main.java.edu.eci.cvds.CVDSParcial1.service.ProductService;
import netscape.javascript.JSObject;


@RestController
@RequestMapping("/products")
public class ProductController {

  @Autowired
  private ProductService productService;


  @PostMapping("/{nombre}/{cantidad}/{categoria}/{precio}")
  public String putProduct(@PathVariable String nombre, @PathVariable int cantidad, @PathVariable String categoria, @PathVariable float precio) {
    Product product = new Product();
    product.setNombre(nombre);
    product.setCategoria(categoria);
    product.setCantidad(cantidad);
    product.setPrecio(precio);
    return this.productService.addProduct(product);
}


  @PutMapping("/{nombre}/{caso}/{valor}")
  public String updateProduct(@PathVariable String nombre, @PathVariable String caso, @PathVariable String valor) {
    Product producto;
    try{
        producto = this.productService.getRepo().getProducto(nombre);
    }catch (Exception e){
        return "Hubo un error, revise los parametros.";
    }
    
    switch (caso) {
        case "nom":
            producto.setNombre(valor);
          
            break;
        
        case "cant":
        producto.setCantidad(Integer.parseInt(valor));
     
        break;
        case "cat":
        producto.setCategoria(valor);
      
        break;
        case "prec":
        producto.setPrecio(Float.parseFloat(valor));
     
        break;

        default:
            return "Hubo un error, revise los casos nom, cant, cat o prec";
          
    }



    return productService.editProduct(nombre, producto);
  }

}
