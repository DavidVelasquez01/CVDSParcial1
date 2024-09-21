package main.java.edu.eci.cvds.CVDSParcial1.observers;

import edu.eci.cvds.CVDSParcial1.model.Product;

public class AGENTE_LOG implements AGENTE{

    public void update(Product prod) {
        System.out.println("Prodcto: "+ prod.getNombre() +"-> "+((String)prod.getCantidad())+" unidades disponibles");
        
    }
}