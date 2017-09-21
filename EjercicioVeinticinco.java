/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioveinticinco;

import java.util.Scanner;

/**
 *
 * @author Lautalb
 */
public class EjercicioVeinticinco {

    /**
     * @param args the command line arguments
     * Sabiendo que necesito 2 bolsas de cal y 3 de cemento para una pared de 1 metro cuadrado,
     * se pide el alto y ancho y se informa la cantidad de cada material que necesito.

     */
    public static void main(String[] args) {
        // declaramos variables e importamos y creamos el scanner
        Scanner miscan=new Scanner(System.in);
        String datoAux;
        Double ancho;
        Double largo;
        Double total;
        Double cal;
        Double cemento;
        
        //pedimos datos.
        System.out.println("Ingrese el ancho del terreno");
        datoAux=miscan.next();
        ancho=Double.parseDouble(datoAux);
        
        System.out.println("Ingrese el largo del terreno");
        datoAux=miscan.next();
        largo=Double.parseDouble(datoAux);
        
        total=ancho*largo;
        
        cal=total*2;
        
        cemento=total*3;
        
        
        System.out.println("Necesitaras "+cal+" Bolsas de cal y "+cemento+" Bolsas de cemento.");
        
    }
    
}
