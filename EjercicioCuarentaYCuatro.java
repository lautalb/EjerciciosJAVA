/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocuarentaycuatro;

import java.util.Scanner;

/**
 *
 * @author Lautalb
 */
public class EjercicioCuarentaYCuatro {

    /**
     * @param args the command line arguments
     * 44- Pedir un número e informar la suma de todos sus antecesores hasta el cero.
     */
    public static void main(String[] args) {
        //declaramos el scanner y lo importamos, declaramos variables
        Scanner miscan= new Scanner(System.in);
        Integer suma=0;
        Integer numero;
        String datoAux;
        
        //pedimos datos
        System.out.println("Ingrese numero");
        datoAux=miscan.next();
        numero=Integer.parseInt(datoAux);
        
        //mientras numero sea diferente a 0 itera
        while(numero!=0)
        {   //se va restando de a 1 el numero
            numero--;
            //se hace la suma de los numeros anteriores
            suma=suma+numero; 
        }
        //se muestra la suma de los antecesores del numero ingresado.
        System.out.println("La suma de los todos sus antecesores es: "+suma);
    }
    
}
