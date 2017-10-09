/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocuarentayuno;

import java.util.Scanner;

/**
 *
 * @author Lautalb
 */
public class EjercicioCuarentaYUno {

    /**
     * @param args the command line arguments
     * 41- Pedir un número y mostrar todos sus antecesores hasta el cero.
     */
    public static void main(String[] args) {
        Scanner miscan = new Scanner(System.in);
        String datoAux;
        Integer numero;
       
        
        System.out.println("Ingrese un numero");
        datoAux=miscan.next();
        numero=Integer.parseInt(datoAux);
        
        System.out.println("El numero ingresado es: "+numero);
        while(numero!=0)
        {
            
            numero--;
            System.out.println("el antecesor: "+numero);
        }
    }
    
}
