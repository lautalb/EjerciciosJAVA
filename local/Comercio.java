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
    ArrayList<Articulo> _misArticulos;
    ArrayList<Venta> _misVentas;
    
    //cuando tengo arraylist los inicio en el constructor.
    public Comercio(String nombre)
    {   
        this._elDueño=nombre;
        this._misArticulos= new ArrayList<Articulo>();
        this._misVentas=new ArrayList<Venta>();
    }
    
    public String VenderArticulo(Articulo art, int cantidad)//recibe un articulo y una cantidad
    {   for (Articulo miArt : this._misArticulos) {
            
            if(Articulo.SonIguales(miArt, art))      
           {    
               if(miArt.GetStock()>cantidad)
               {
                   Venta nuevaVenta=new Venta(art,cantidad);
                   this._misVentas.add(nuevaVenta);
                   miArt.SetStock(miArt.GetStock()-cantidad);
                   return "pude vender";
               }else
               {
                   return "no hay stock suficiente";
               }
                       
           }

        }
         return "no tengo el producto";
    }
    
    public String ComprarArticulo(Articulo art, int cantidad)
    {   boolean SiNoEsta=true;
        for (Articulo misArticulo : this._misArticulos) {
            
            if(Articulo.SonIguales(misArticulo, art))
           {                                                 //cantidad
                misArticulo.SetStock(misArticulo.GetStock()+art.GetStock());
               return "Se sumo al stock";         
           }

        }
            art.SetStock(cantidad);
            this._misArticulos.add(art);
            return "Se agrego uno nuevo";
        
        
    }
    
    
    public void ListaArticulos(Articulo articulo)
    {   
        
        this._misArticulos.add(articulo);

    }
    
    public void ListaDeVentas(Venta venta)
    {   
        
        this._misVentas.add(venta);
    }
    
    public void MostrarArticulos()
    {   
        for (Articulo aux : this._misArticulos) {
            aux.MostrarArticulo();
        }
    }
    
    public void MostrarVentas()
    {   
        float gananciaTotal=0;
        for (Venta aux : _misVentas) {
            
            gananciaTotal=gananciaTotal+aux.RetornarGanancias();
            aux.MostrarVenta();
        }
        System.out.println("Ganancia: "+gananciaTotal);
    }
    
}