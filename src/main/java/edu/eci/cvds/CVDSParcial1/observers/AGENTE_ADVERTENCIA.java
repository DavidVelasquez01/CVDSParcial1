package main.java.edu.eci.cvds.CVDSParcial1.observers;

import edu.eci.cvds.CVDSParcial1.model.Product;

public class AGENTE_ADVERTENCIA implements AGENTE{

    public void update(Product prod) {
        if(prod.getCantidad()<5){
            System.out.println("ALERTA!!! El stock del Producto: "+prod.getNombre()+" es muy bajo, solo quedan "+((String)prod.getCantidad())+" unidades.");
        }
    }
}