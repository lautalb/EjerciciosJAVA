/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author alumno
 */
public class Producto {
    String nombre;
    String precio;
    
    public Producto(String nombre, String precio)
    {
        this.nombre=nombre;
        this.precio=precio;
    }
    
    public String mostrarProducto()
    {
        return this.nombre+" "+this.precio;
    }
    
    
}
