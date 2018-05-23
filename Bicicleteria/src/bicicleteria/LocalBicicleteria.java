/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicicleteria;

/**
 *
 * @author lauta
 */
public class LocalBicicleteria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bicicleta bici1=new Bicicleta("1234", "Street", 2015);
        Bicicleta bici2=new Bicicleta("5678", "Racer", 2016);
        
        Bicicleteria nuevaBicicleteria= new Bicicleteria();
        
        nuevaBicicleteria.addBicicleta(bici1);
        nuevaBicicleteria.addBicicleta(bici2);
        
        //para testear el metodo buscarBicicleta
        System.out.println(nuevaBicicleteria.buscarBicicleta("56789"));
        
        /*Ejercicio 4
            A- Entre las tablas Bicicleteria y   =Falso
            Bicicleta existe una relación 1 a 1  
            B- Entre las tablas Bicicleteria y   =Verdadero
            Bicicleta existe una relación 1 a N
            C- Entre las tablas Bicicleteria y   = Falso
            Bicicleta existe una relación N a N
            D- La clave primaria de la tabla     =Verdadero
            Bicicleta es nroDeSerie
            E- La clave foránea de la tabla      =Falso   
            Bicicleta es nroDeSerie
            F- La tabla Bicicleteria no tiene    =Falso
            clave primaria
            G- La tabla Bicicleteria no tiene    =Verdadero
            clave foránea
  
        */
        
        /* Ejercicio 5
            Dado el diagrama de entidad-relación presentado en el ejercicio anterior, escriba una consulta SQL
            que liste la cantidad de ventas y los números de serie de las bicicletas en venta de la bicicletería
            cuyo idBicicleteria = 1. Ordene los resultados de acuerdo a la cantidad de ventas en forma
            descendente.
            
            SELECT b.cantVentas, bic.nroDeSerie 
            FROM Bicicleteria as b
            INNER JOIN Bicicleta as bic on bic.Bicicleteria_idBicicleteria
            WHERE b.idBicicleteria = 1
            ORDER BY (b.cantVentas) DESC

        */
    }
    
}
