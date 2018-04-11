/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author lauta
 */
public class Orden {
    private List<DetalleOrden> items;
    private int id;
    private Date creacion;
    private Date envio;
    
    public Orden(int id,Date creacion)
    {
        this.id=id;
        this.creacion=creacion;
        items= new ArrayList<>();
    }
    
    public int getNroItems()
    {
        return this.id;
    }
    
    public void setEnvio(Date envio)
    {
        this.envio=envio;
    }
    
    public void agregarItem(DetalleOrden detalle)
    {
        items.add(detalle);
    }
    
    public float calcularTotalORden()
    {   float total=0;
        for (int i = 0; i < this.items.size(); i++) {
            for (int j = 0; j < items.get(i).getCantidad(); j++) {
                total=total+this.items.get(i).getPrecioUnitario();
            }
        }
        
        return total;
    }
}
