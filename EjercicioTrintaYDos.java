/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotrintaydos;

import java.util.Scanner;

/**
 *
 * @author Lautalb
 */
public class EjercicioTrintaYDos {

    /**
     * @param args the command line arguments
     * 32- Al ingresar una hora del día, informar: si está entre las 7 y las 11: "Es de mañana.".

     */
    public static void main(String[] args) {
         //importamos el scanner y creamos variables
        Scanner miscan= new Scanner(System.in);
        String datoAux;
        Integer hora;
        
        //mostramos mensaje y pedimos dato.
        System.out.println("ingrese hora");
        datoAux = miscan.next();
        //pareseamos
        hora=Integer.parseInt(datoAux);
        
        switch(hora)
        {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                System.out.println("Es de mañana.");
        }
    }
    
}
