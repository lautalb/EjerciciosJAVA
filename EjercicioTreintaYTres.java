/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotreintaytres;

import java.util.Scanner;

/**
 *
 * @author Lautalb
 */
public class EjercicioTreintaYTres {

    /**
     * @param args the command line arguments
     * 33-al ingresar un signo del zodíaco devolver el nombre de la imagen asociada a ese signo

     */
    public static void main(String[] args) {
        //importamos el scanner y creamos variables
        Scanner miscan= new Scanner(System.in);
        String signo;
        
        //mostramos mensaje y pedimos dato.
        System.out.println("Ingrese un signo del zodiaco");
        signo = miscan.next();
        
        //hacemos el switch
        switch(signo)
        {
            case "aries":
                    System.out.println("El carnero");
                    break;
                    
            case "tauro":
                    System.out.println("El toro");
                    break; 
                    
            case "geminis":
                    System.out.println("Los gemelos");
                    break; 
                    
            case "cancer":
                    System.out.println("El cangrejo");
                    break; 
             
            case "leo":
                    System.out.println("El leon");
                    break;   
                    
            case "virgo":
                    System.out.println("La mujer");
                    break;
                    
            case "libra":
                    System.out.println("La balanza");
                    break;
                    
            case "escorpio":
                    System.out.println("El escorpión");
                    break; 
                    
            case "sagitario":
                    System.out.println("El centauro");
                    break; 
                    
            case "capricornio":
                    System.out.println("La cabra");
                    break;
                    
            case "acuario":
                    System.out.println("El viejo sabio");
                    break;
                    
            case "piscis":
                    System.out.println("Dos peces");
                    break;        
        
        }
        
        
    }
    
}
