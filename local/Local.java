/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package local;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lauta
 */
public class Local {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Articulo nuevoArticulo=new Articulo(12, "CocaCola", 30, 4);
        Articulo nuevoArticulo1=new Articulo(11, "Fanta", 25, 4); 
        
        
        
        
        
        
        
        Venta NuevaVenta= new Venta(nuevoArticulo, 4);
        NuevaVenta.MostrarVenta();
        NuevaVenta.MostrarGanancias();
        
        
        
        
        
        
       
     
                
    }
    
}
