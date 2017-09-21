/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioveintitres;

import java.util.Scanner;

/**
 *
 * @author Lautalb
 */
public class EjercicioVeintitres {

    /**
     * @param args the command line arguments
     * Debemos pedir el ancho y el largo de un terreno e informar cuantos metros de alambre necesitamos 
     * para dar tres (3) vueltas de alambre.

     */
    public static void main(String[] args) {
       //declaramos variables e importamos y creamos scanner
        Scanner miscan=new Scanner(System.in);
        String datoAux;
        Double ancho;
        Double largo;
        Double total;
        
        //pedimos datos.
        System.out.println("Ingrese el ancho del terreno");
        datoAux=miscan.next();
        ancho=Double.parseDouble(datoAux);
        
        System.out.println("Ingrese el largo del terreno");
        datoAux=miscan.next();
        largo=Double.parseDouble(datoAux);
        
        total=(ancho*largo)*3;
        
        //mostramos el total
        System.out.println("Se necesitarian : "+total+"M de alambre");
                    
    }
    
}
