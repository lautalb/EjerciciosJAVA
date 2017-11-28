/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package local;

import java.time.Instant;
import java.util.Date;

/**
 *
 * @author alumno
 */
public class Local {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Articulo nuevoArticulo=new Articulo(12, "Fanta", 30, 4);
        
        Articulo nuevoArticulo2=new Articulo(11, "Sprite", 80, 5);
        
        Articulo nuevoArticulo3= new Articulo(12, "Fanta", 30, 28);
        
        Comercio ElBolicheDeTony;
        ElBolicheDeTony=new Comercio("Tony");
        
        //compra
        String respuesta;
        respuesta=ElBolicheDeTony.ComprarArticulo(nuevoArticulo, 3);
        System.out.println("Resputas: "+respuesta);
        
        
        String respuesta2;
        respuesta2=ElBolicheDeTony.ComprarArticulo(nuevoArticulo2, 10);
        System.out.println("Resputas: "+respuesta2);
       
        String respuesta3;
        respuesta3=ElBolicheDeTony.ComprarArticulo(nuevoArticulo3, 25);
        System.out.println("Resputas: "+respuesta3);
        
        
        
        //venta
        ElBolicheDeTony.MostrarVentas();
        
        
        
        
        
        
         
    }
    
}
