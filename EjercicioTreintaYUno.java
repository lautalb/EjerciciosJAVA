/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotreintayuno;

import java.util.Scanner;

/**
 *
 * @author Lautalb
 */
public class EjercicioTreintaYUno {

    /**
     * @param args the command line arguments
     * 31- Se ingresa un mes del año al seleccionar un mes informar: si tiene 28 días ,si tiene 30 días, si tiene 31 días.

     */
    public static void main(String[] args) {
        //importamos el scanner y creamos variables
        Scanner miscan= new Scanner(System.in);
        String mes;
        
        //mostramos mensaje y pedimos dato.
        System.out.println("Ingrese mes");
        mes = miscan.next();
        
                
        switch(mes)
        { 
            case "febrero":
                System.out.println("Febrero tiene 28 días");
                break;
            
            case "abril":
            case "junio":
            case "septiembre":
            case "noviembre":        
                System.out.println("Tiene 30 días");
                break;    
           
            case "enero":
            case "marzo":
            case "mayo":
            case "julio": 
            case "agosto":
            case "octubre":
            case "diciembre":    
                System.out.println("Tiene 31 días");
                break;      
        }
    }
    
}
