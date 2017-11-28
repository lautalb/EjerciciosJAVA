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
    protected int _codigoBarra;
    protected String _nombreArticulo;
    protected float _precioCosto;
    protected float _precioVenta;
    protected int _stock;
    
    
    
    public Articulo( int codigoDeBarra,String nombreDeArticulo,float PrecioCosto, int Stock) //constructor
    {   
        this._codigoBarra=codigoDeBarra;
        this._nombreArticulo=nombreDeArticulo;
        this._precioCosto=PrecioCosto;
        this._precioVenta=(float)(PrecioCosto*1.25); //se incrementa el precio 25% para la venta.
        this._stock=Stock;
    }
    

    
    public float GetPrecioVenta()//devuelve el precioDeVenta
    {
        float retorno=this._precioVenta;
        return retorno;
    }
    
    public String GetNombreYCodigo()//devuelve el nombre del articulo
    {
        String retorno=this._nombreArticulo+this._codigoBarra;;
        
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
    
    public String getNombre()
    {
        return this._nombreArticulo;
    }
    
    
    
    public int GetStock()// devuelve el stock disponible
    {
        return this._stock;
    }
    
    public float GetPrecioCosto()
    {
        float retorno=0;
            retorno=this._precioCosto;
        return retorno;
    }
    
    public float GetGanancias()
    {
        return this._precioVenta-this._precioCosto;
    }
    
    
    public boolean HayStock() //verifica si hay stock con el nombre del articulo y la cantidad
    {   boolean retorno=false;
        
        if(this._stock>0)
        {
            retorno=true;
            
        }
            return retorno;
        

    }
    

    public static boolean SonIguales(Articulo uno, Articulo dos) //verifica si dos articulos son iguales, 
    {   boolean retorno=false;
    
        if (uno.GetNombreYCodigo().equalsIgnoreCase(dos.GetNombreYCodigo())) 
        {
            retorno=true;
            
        }
            return retorno;

    }
    
   
    
    public void MostrarArticulo()//muestra el articulo
    {
        System.out.println("Nombre: "+this._nombreArticulo);
        System.out.println("Codigo de Barra: "+this._codigoBarra);
        System.out.println("Cantidad disponible: "+this._stock);
        System.out.println("Precio Costo: "+this._precioCosto+"$.");
        System.out.println("Precio de venta: "+this._precioVenta+"$.");
        
        
    }
    
}