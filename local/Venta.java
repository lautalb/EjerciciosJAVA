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
        if(ArticuloVendido.HayStock(ArticuloVendido.GetNombreArticulo(), cantidad))//verifica si hay stock para poder vender
        {
            this._articuloVendido=ArticuloVendido;
            this._cantidad=cantidad;
        }else
        {
            System.out.println("No hay stock suficiente");
        }
      
    }
    
    
    
    
    public void MostrarVenta()//muestra la venta
    {   if(this._articuloVendido!=null)
        {
        System.out.println("Articulo vendido: "+this._articuloVendido.GetNombreArticulo()+" Precio: "+this._articuloVendido.GetPrecioVenta()+"$.");
        System.out.println("Cantidad Vendida: "+this._cantidad);
        }
    }
    
    
    
    public double RetornarGanancias()//retorna las ganancias
    {   double calcular=0;
        double retorno=0;
        double precioCosto=this._articuloVendido.GetPrecioCosto();
        double precioVenta=this._articuloVendido.GetPrecioVenta();
        if(this._articuloVendido!=null)
        { 
            calcular=(precioVenta*this._cantidad)-(precioCosto*this._cantidad);
            retorno=calcular;
        }
        return retorno;
    }
    
    public void MostrarGanancias()
    {
        System.out.println("Las ganancia es: "+this.RetornarGanancias()+"$.");
    }
}
