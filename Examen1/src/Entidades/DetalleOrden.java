/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author lauta
 */
public class DetalleOrden {
    
    private Notebook item;
    private float precioUnitario;
    private int cantidad;
    
    public DetalleOrden(Notebook item, float precioUnitario, int cantidad)
    {
        this.item=item;
        this.precioUnitario=precioUnitario;
        this.cantidad=cantidad;
    }
    
    public Notebook getItem()
    {
        return this.item;
    }
    
    public float getPrecioUnitario()
    {
        return this.precioUnitario;
    }
    
    public int getCantidad()
    {
        
        return this.cantidad;
    }
    
}
