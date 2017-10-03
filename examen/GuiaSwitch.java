/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class GuiaSwitch {
    
    /*
    28 – Se ingresa un mes del año, si es febrero o enero, mostrar el mensaje “Feliz verano” 
    de lo contrario Informar “No es Verano”
    */
    public static void HacerEjercicio28()
    {   
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
    
    /*
    29- Se ingresa un mes del año, si es febrero o enero, mostrar el mensaje “Iniciando el año” ,
    si es junio o julio el mensaje” Mitad del año” y si es diciembre el mensaje fin de año.
    */    
    public static void HacerEjercicio29()
    {
        
    }
}
