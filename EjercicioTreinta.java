/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotreinta;

import java.util.Scanner;

/**
 *
 * @author Lautalb
 */
public class EjercicioTreinta {

    /**
     * @param args the command line arguments
     * 30- Se ingresa un mes del año y si es Enero: "que comiences bien el año!” , 
     * si es Marzo: "a clases!” , si es Julio: "se vienen las vacaciones!” , si es Diciembre: "Felices fiesta!”.

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
                System.out.println("Que comience bien el año");
                break;
             
            case "marzo":
                System.out.println("a clases!");
                break;
                
             case "julio":
                System.out.println("se vienen las vacaciones!");
                break;   
            
            case "diciembre":
                System.out.println("Felices fiesta!");
                break;
                    
        }
    }
    
}
