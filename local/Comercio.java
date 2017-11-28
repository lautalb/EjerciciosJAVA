/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package local;

import java.util.ArrayList;

/**
 *
 * @author lauta
 */
public class Comercio {
    private String _elDueño;
    ArrayList<Articulo> _articulos;
    ArrayList<Venta> _ventas;
    
    public Comercio(String nombre)
    {   
        this._elDueño=nombre;
    }
    
    public void VenderArticulo(Articulo articulo, int cantidad)
    {
        this._ventas= new ArrayList<>();
        
        
 
    }
    
    public void MostrarArticulos()
    {   
        this._articulos=new ArrayList<>();
        
    }
    
    public void MostrarVentas()
    {
        for (Venta listadoVentas : _ventas) {
            listadoVentas.MostrarVenta();
        }
    }
    
}
