/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioveintiocho;

import java.util.Scanner;

/**
 *
 * @author Lautalb
 */
public class EjercicioVeintiOcho {

    /**
     * @param args the command line arguments
     * 28 – Se ingresa un mes del año, si es febrero o enero, mostrar el mensaje “Feliz verano” de lo contrario Informar “No es Verano”

     */
    public static void main(String[] args) {
        //declaramos variables e importamos y creamos el scanner
        Scanner miscan = new Scanner (System.in);
        String mes;
        //mostramos mensaje y pedimos dato
        System.out.println("Ingrese mes");
        mes=miscan.next();
        
        //hacemos el switch con las distintas opciones
        switch(mes)
        {
            case "enero":
            case "febrero":    
                System.out.println("Feliz verano");
                break;
            
            default:
                System.out.println("No es verano");
                break;
        
        }
        
    }
    
}
