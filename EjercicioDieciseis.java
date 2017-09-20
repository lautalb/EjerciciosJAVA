/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodieciseis;

import java.util.Scanner;

/**
 *
 * @author Lautalb
 */
public class EjercicioDieciseis {

    /**
     * @param args the command line arguments
     * se ingresa el importe de un pasaje de avion y el mes de viaje, si es enero se le descuenta
     *   // un 10% por temporada baja,
     */
    public static void main(String[] args) {
        //declaramos variables y el scanner
        String datoAux;
        Double pasaje;
        Integer mes;
        Double descuento;
        Double total;
        
        Scanner miscan = new Scanner(System.in);
        
        //se muestra el mensaje
        System.out.println("Ingrese el importe del pasaje de avion");
        //se guardan las variab les y se parsea.
        datoAux = miscan.next();
        pasaje = Double.parseDouble(datoAux);
        
        //se muestra el mensaje
        System.out.println("Ingrese el mes de viaje, Ej : 1-Enero, 2-Febrero etc.");
        //se guarda en la variable y se parsea.
        datoAux = miscan.next();
        mes = Integer.parseInt(datoAux);
        
        //se hace la condicion.
        if (mes ==1)
        {
            //se hace el descuento y se escribe el mensaje a mostrar.
            descuento = pasaje*10/100;
            total = pasaje-descuento;
            
            System.out.println("Por viajar en enero se le descuenta 10% por temporada baja. El descuento es :"+descuento+"$ y El total : "+total);
        }
        
        
    }
    
}
