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
public class Mascota {
    private String _nombre;
    private String _raza;
    private boolean _estaBañado;
    private String _sexo;
    
    public Mascota(String nombre, String raza)
    {
        this._nombre=nombre;
        this._raza=raza;
        this._estaBañado=false;
    }
    
    public String GetNombre()
    {
        String retorno="";
        
        retorno=this._nombre;
        
        return retorno;
    }
    
    public void Bañar()
    {
        if(this._estaBañado==false)
        {
            this._estaBañado=true;
        }
    }
    
    public String toString()
    {
        return ("Nombre: "+this._nombre+" Raza: "+this._raza);
    }
}
