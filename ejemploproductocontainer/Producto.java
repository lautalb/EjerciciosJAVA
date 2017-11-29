/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploproductocontainer;

/**
 *
 * @author alumno
 */
public class Producto {
    private int _id;
    public String _nombre;
    public float _precio;
    
    public Producto(int idP,String nombreP, float precioP)
    {   this._id=idP;
        this._nombre=nombreP;
        this._precio=precioP;
    }
    
    public float GetPrecio()
    {
        float retorno=0;
        retorno=this._precio;
        return retorno;
    }
    
    public void MostrarProducto()
    {   
        System.out.println(this.toString());
        
    }
    
    public String toString()
    {
        return ("id: "+this._id+" nombre: "+this._nombre);
    }
}
