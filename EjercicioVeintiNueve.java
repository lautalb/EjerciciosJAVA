/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioveintinueve;

import java.util.Scanner;

/**
 *
 * @author Lautalb
 */
public class EjercicioVeintiNueve {

    /**
     * @param args the command line arguments
     * 29- Se ingresa un mes del año, si es febrero o enero, mostrar el mensaje “Iniciando el año” ,
     * si es junio o julio el mensaje” Mitad del año” y si es diciembre el mensaje fin de año.
     */
    public static void main(String[] args) {
        //importamos el scanner y creamos variables
        Scanner miscan= new Scanner(System.in);
        String mes;
        
        //mostramos mensaje y pedimos dato.
        System.out.println("Ingrese mes");
        mes = miscan.next();
        
        //hacemos el switch
        switch(mes)
        {
            case "enero":
            case "febrero":
                System.out.println("Iniciando el año");
                break;
             
            case "junio":
            case "julio":
                System.out.println("Mitad del año");
                break;
            
            case "diciembre":
                System.out.println("Fin de año");
                break;
                    
        }
        
        
    }
    
}
