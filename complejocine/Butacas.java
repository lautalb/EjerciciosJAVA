/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complejocine;

/**
 *
 * @author lauta
 */
public class Butacas {
    private int _numeroDeButaca;
    private boolean _disponibilidad;
    private int _precio;
    
    public Butacas()
    {
        this._numeroDeButaca=1;
        this._disponibilidad=true;
        this._precio=60;
    }
    
    public void SetButaca(int numeroB)
    {
        this._numeroDeButaca=numeroB;
    }
    
    public void SetDispo(boolean entrada)
    {
        this._disponibilidad=entrada;
    }
    
    
    public void MostrarButaca()
    {
        System.out.println("Butaca numero: "+this._numeroDeButaca);
        System.out.println("Disponibilidad: "+ this._disponibilidad);
        System.out.println("El precio: "+this._precio);
        
    }
    
    
   
    
    
}
