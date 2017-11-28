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
public class Articulo{ 
    private int _codigoBarra;
    private String _nombreArticulo;
    private double _precioCosto;
    private double _precioVenta;
    private int _stock;
    
    
    
    public Articulo( int codigoDeBarra,String nombreDeArticulo,double PrecioCosto, int Stock) //constructor
    {   
        this._codigoBarra=codigoDeBarra;
        this._nombreArticulo=nombreDeArticulo;
        this._precioCosto=PrecioCosto;
        this._precioVenta=PrecioCosto*1.25; //se incrementa el precio 25% para la venta.
        this._stock=Stock;
    }
    
    
    
    
    public double GetPrecioVenta()//devuelve el precioDeVenta
    {
        double retorno=this._precioVenta;
        return retorno;
    }
    
    public String GetNombreArticulo()//devuelve el nombre del articulo
    {
        String retorno=this._nombreArticulo;
        
        return retorno;
    }
    
    public int GetCodigoBarra()//devuelve el codigo de Barra
    {
        int retorno=this._codigoBarra;
        
        return retorno;
    }
    
    public void SetPrecioCosto(float precio)//setea el precio que salio el articulo
    {
        this._precioCosto=precio;
    }
    
    public void SetStock(int cantidad)//setea la cantidad que va haber disponible
    {
        this._stock=cantidad;
    }
    
    public int GetStock()// devuelve el stock disponible
    {
        return this._stock;
    }
    
    public double GetPrecioCosto()
    {
        double retorno=0;
            retorno=this._precioCosto;
        return retorno;
    }
    
    
    public boolean HayStock(String nombreDeArticulo, int cantidad) //verifica si hay stock con el nombre del articulo y la cantidad
    {   boolean retorno=false;
        
        if(nombreDeArticulo.equalsIgnoreCase(this._nombreArticulo) && (cantidad<=this._stock))
        {
            retorno=true;
            return retorno;
        }else
        {
            retorno=false;
            return retorno;
        }

    }
    
    
    
    public static boolean SonIguales(Articulo uno, Articulo dos) //verifica si dos articulos son iguales, 
    {   boolean retorno=false;
    
        if (uno._nombreArticulo.equalsIgnoreCase(dos._nombreArticulo) && (uno._codigoBarra==dos._codigoBarra)) 
        {
            retorno=true;
            return retorno;
        }else
        {
            retorno=false;
            return retorno;
        }
        
    }
    
   
    
    public void MostrarArticulo()//muestra el articulo
    {
        System.out.println("Nombre: "+this._nombreArticulo);
        System.out.println("Codigo de Barra: "+this._codigoBarra);
        System.out.println("Cantidad disponible: "+this._stock);
        System.out.println("Precio de venta: "+this._precioVenta);
    }
    
}
