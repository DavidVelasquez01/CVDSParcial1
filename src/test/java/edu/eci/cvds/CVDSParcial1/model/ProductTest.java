package test.java.edu.eci.cvds.CVDSParcial1.model;

import org.junit.jupiter.api.Test;

import edu.eci.cvds.CVDSParcial1.model.Product;

import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

  @Test
  public void testGetAndSetNombreProducto() {
    Product product = new Product();
    product.setNombre("Producto1");
    assertEquals("Producto1", product.getNombre());
  }

  @Test
  public void testGetAndSetCantidadProducto() {
    Product product = new Product();
    product.setCantidad(5);
    assertEquals(5, product.getCantidad());
  }

  @Test
  public void testIsAndSetCategoriaProducto() {
    Product product = new Product();
    product.setCategoria("Cat 1");
    assertEquals("Cat 1", product.getCategoria());
    
  }

  @Test
  public void testGetAndSetPrecioProducto() {
    Product product = new Product();
    product.setPrecio(Float.parseFloat(3.5));
    assertEquals(3.5, product.getPrecio());
  }
}