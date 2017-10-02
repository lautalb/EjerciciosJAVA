/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotreintaycuatro;

import java.util.Scanner;

/**
 *
 * @author Lautalb
 */
public class EjercicioTreintaYCuatro {

    /**
     * @param args the command line arguments
     * 34- Se pide un día de la semana, si es lunes mostrar el mensaje  “Buen comienzo”, 
     * para el resto de los días hábiles mostrar” a aguantar “ si es sábado o domingo  mostrar “ Buen fin de”.

     */
    public static void main(String[] args) {
       //importamos el scanner y creamos variables
        Scanner miscan= new Scanner(System.in);
        String dia;
        
        //mostramos mensaje y pedimos dato.
        System.out.println("Ingrese dia");
        dia= miscan.next();
        
        //hacemos el switch
        switch(dia)
        {
            case "lunes":
                System.out.println("Buen comienzo");
                break;
            
            case "sabado":
            case "domingo":
                System.out.println("Buen fin de");
                break;
             
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("A aguantar");
                break;
        }
    }
    
}
