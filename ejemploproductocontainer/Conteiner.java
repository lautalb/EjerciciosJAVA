/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploproductocontainer;

import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class Conteiner {
    private int _capacidad;
    private ArrayList<Producto> _ListaDeProductos;
    
    public Conteiner(int capacidadTotal)
    {
        this._capacidad=capacidadTotal;
        this._ListaDeProductos= new ArrayList<Producto>();
    }
   
    
    public float GetPrecioTotal()
    { float retorno=0;
        for (Producto auxProducto : this._ListaDeProductos) {
            retorno=retorno+auxProducto.GetPrecio();
        }
        return retorno; 
    }
    
    public int GetCantidadElementos()
    {
        int retorno=this._ListaDeProductos.size();
        
        return  retorno;
    }
    
     public int GetCantidadLuagresLibres()
    {
        int retorno=this._capacidad-this._ListaDeProductos.size();
        
        return  retorno;
    }
    
    public void MostrarConteiner()
    {
        System.out.println("Capacidad maxima: "+this._capacidad);
        System.out.println("Luagres libres: "+this.GetCantidadLuagresLibres());
        System.out.println("Luagres ocupados: "+this.GetCantidadElementos());
        System.out.println("Listado de productos");
        int contador=1;
        for (Producto ListaDeProducto : this._ListaDeProductos) {
            
            System.out.println(contador);
            
            ListaDeProducto.MostrarProducto();
            System.out.println("El precio es: "+ListaDeProducto.GetPrecio());
            
            contador++;
        }
    }
    
    public void OrdenarNombre()
    {
        //terminar ordenar nombre
    }
    
    public boolean CargarProducto(Producto unProducto)
    {   
        boolean retorno=false;
        
        if (this.GetCantidadLuagresLibres()>0)
        {
            this._ListaDeProductos.add(unProducto);
            
            return true;
        }
        
        
        return retorno;
        
    }
    
    public void Ordenar()
    {
        for (int i = 0; i < this._ListaDeProductos.size(); i++) {
            
            for (int j = 0; j < this._ListaDeProductos.size()-1; j++) {
                
                if(this._ListaDeProductos.get(j)._precio>this._ListaDeProductos.get(j+1)._precio)
                {
                    Producto aux;
                    aux=this._ListaDeProductos.get(j);
                    this._ListaDeProductos.set(j, this._ListaDeProductos.get(j+1));
                    this._ListaDeProductos.set(j+1, aux);
                    
                }
            }
        }
    }
}
