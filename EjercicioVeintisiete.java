/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioveintisiete;

import java.util.Scanner;

/**
 *
 * @author Lautalb
 */
public class EjercicioVeintisiete {

    /**
     * @param args the command line arguments
     * - para una pileta se necesita saber la superficie, se debe pedir que tipo de pileta tiene 
     * (cuadrada o redonda) de ser redonda, pedir el radio y si es cuadrada pedir el largo y el ancho, 
     * mostrar la superficie de la pileta.

     */
    public static void main(String[] args) {
        //declaramos variables y scanner
        Scanner miscan=new Scanner(System.in);
        String datoAux;
        String pileta;
        Double superficie;
        Double radio;
        Double largo;
        Double ancho;
        
        
        //pedimos datos
        System.out.println("Que tipo de pileta tiene?Cuadrada o Redonda?");
        pileta =miscan.next();
        
        if (pileta.equals("cuadrada"))
        {   //pedimos datos
            System.out.println("Ingrese el largo");
            datoAux=miscan.next();
            largo=Double.parseDouble(datoAux);
            
            //pedimos datos
            System.out.println("Ingrese el ancho");
            datoAux=miscan.next();
            ancho=Double.parseDouble(datoAux);
            //se calcula la superficie   
            superficie=largo*ancho;
            
            //mostramos mensaje
            System.out.println("la superficie de la pileta es: "+superficie);
            
            
        }else
        {
            if (pileta.equals("redonda"))
            {
            System.out.println("Ingrese el radio");
            datoAux=miscan.next();
            radio=Double.parseDouble(datoAux);
            
            superficie=3.14*radio*radio;
            
                System.out.println("la superficie de la pileta es :"+superficie);
            
            }
    }   }
    
}
