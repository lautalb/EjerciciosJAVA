/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplofacturacion;

/**
 *
 * @author alumno
 */
public class Producto {
    private String _descripcion;
    private float _precio;
    private int _cantidad;
    
    
    public void SetterDescrip(String desc)
    {
        this._descripcion=desc;
    }
    
    public void SetterPrecio(float precio)
    {
        this._precio=precio;
    }
    
    public void SetterCantidad(int cantidad)
    {
        this._cantidad=cantidad;
    }
    
    public void MostrarProducto ()
    {
        System.out.println("El producto es: "+this._descripcion);
        System.out.println("El precio es: "+this._precio);
        System.out.println("La cantidad es: "+this._cantidad);
    }
    
    public float DamePrecioFinal()
    {   float retorno=0;
        
        retorno=this._precio*this._cantidad;
        return retorno;
    }
    
    public static Producto RetornarProductoRandom()
    {
        Producto retorno=new Producto();
        retorno._cantidad=9;
        retorno._precio=10;
        retorno._descripcion="chocolatin";
        
        return retorno;
    }
}
