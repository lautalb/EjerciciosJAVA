/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodiecisiete;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioDiecisiete {

    /**
     * @param args the command line arguments
     * se pide una edad y se informa si es niño, adolescente o mayor de edad.
     */
    public static void main(String[] args) {
        //declaramos scaner y variables
        Scanner miscan=new Scanner(System.in);
        String datoAux;
        Integer edad;
        
        //
        
        //mostramos mensaje y pedimos datos.
        System.out.println("Ingrese edad : ");
        datoAux=miscan.next();
        edad=Integer.parseInt(datoAux);
//        //hacemos la condiciona
//        if (edad<13 )
//        {
//            System.out.println("niño");
//        }
//        
//        if (edad>12 && edad<18 )
//        {
//            System.out.println("adolescente");
//        }
//        
//        if (edad>=17 )
//        {
//            System.out.println("adulto");
//        }
//        
        if (edad>17)
        {
            System.out.println("es mayor");
        }else{
            //son menores a 18
            if(edad<13)
            {
                System.out.println("es niño");
            }else
            {
                System.out.println("es adolescente");
            }
        
        }
        
        
        
        
    }
    
}
