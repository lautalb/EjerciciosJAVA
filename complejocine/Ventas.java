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
public class Ventas {
    
  
   private Salas _disponibilidad;
    
    
    public Ventas()
    {
      
    }
    
    public void ComprarEntradas(int entradas)
    {   int Entradas=entradas;
        Salas nuevaVenta= new Salas();
        for (int i = 0; i < Entradas; i++) {
            nuevaVenta.LLenarButaca();
            System.out.println(nuevaVenta.ButacasLibres());
        }
          
    }
    
   
    
    
    
    
}
