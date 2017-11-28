/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package local;

/**
 *
 * @author lauta
 */
public class Venta {
    private Articulo _articuloVendido;
    private int _cantidad;
    
    public Venta(Articulo ArticuloVendido, int cantidad) //constructor
    {  
        this._articuloVendido=ArticuloVendido;
         this._cantidad=cantidad; 
      
    }

   public void MostrarVenta()//muestra la venta
   {   
            System.out.println(""+this._cantidad);
            System.out.println("Articulo: ");
            this._articuloVendido.MostrarArticulo();
    }
    
    
    
    public float RetornarGanancias()//retorna las ganancias
    {   
        float retorno=0;
        float gananciaFacturado=this._articuloVendido.GetGanancias()*this._cantidad;

          retorno=gananciaFacturado;
        
        return retorno;
    }
    
//    public void MostrarGanancias()
//    {
//        System.out.println("Las ganancia es: "+this.RetornarGanancias()+"$.");
//    }
}