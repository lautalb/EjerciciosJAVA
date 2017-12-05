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
public class Gato extends Mascota{
    private boolean _araña;
    
    public Gato(String nombre, String raza, boolean araña)
    {   super(nombre, raza);
        this._araña=araña;
    }
    
    public String GetAraña()
    {
        if(this._araña=true)
        {
            return "si";
        }
        return "no";
    }
    
    public String toStrign()
    {
        return (super.toString()+"araña: "+this.GetAraña());
    }
    
  
    
}
