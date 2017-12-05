/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploveterinaria;

/**
 *
 * @author lauta
 */
public class Perro extends Mascota{
    
    private boolean _muerde;
    private Tamaño _tamaño;
    public Perro(String nombre, String raza, boolean muerde,Tamaño tamaño)
    {   super(nombre, raza);
        this._muerde=muerde;
        this._tamaño=tamaño;

    }
    
    public String toString()
    {
        return (super.toString()+" Tamaño "+this._tamaño);
    }
    
    
}
