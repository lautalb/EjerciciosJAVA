/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

import Entidades.DetalleOrden;
import Entidades.Notebook;
import Entidades.Orden;
import java.time.Instant;
import java.util.Date;

/**
 *
 * @author lauta
 */
public class Examen1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Notebook apple= new Notebook("Apple", "1", "Intel I7", 2000);
        Notebook Asus= new Notebook("Asus", "B520", "AMD Ryzen 5", 2000);
        
        DetalleOrden compra=new DetalleOrden(Asus, 1000, 3);
        DetalleOrden compra1= new DetalleOrden(apple, 2000, 2);
        
        java.util.Date fechaActual = new java.util.Date();
        
        Orden orden= new Orden(1, fechaActual);
        orden.agregarItem(compra);
        orden.agregarItem(compra1);
        
        System.out.println("Precio total de la compra: "+orden.calcularTotalORden());
        
        
        
        
    }
    
}
