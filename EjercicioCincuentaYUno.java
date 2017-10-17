/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocincuentayuno;

import java.util.Scanner;

/**
 *
 * @author Lautalb
 */
public class EjercicioCincuentaYUno {

    /**
     * @param args the command line arguments
     * 51-Informar si un número es número perfecto
     */
    public static void main(String[] args) {
        Scanner miscan=new Scanner(System.in);
        String datoAux;
        Integer numero;
        Integer contador=0;
        Integer suma=0;
        
        
        System.out.println("Ingrese numero: ");
        datoAux=miscan.next();
        numero=Integer.parseInt(datoAux);
        
        //mientras contador sea menor al numero -1, para que no haga el numero ingresado ya que un numero es perfecto si se suma todos sus divisores menos el numero ingresado.
        while(contador<numero-1)
        {
             contador++;
             
             if(numero%contador==0)
             {  //si es divisor se suma
                 suma=suma+contador;
             }        
        }//fin del while
        
        if(numero == suma)
             {  //si el numero = a la suma de sus divisores es perfecto
                 System.out.println("el numero es perfecto");
             }else
             {  
                 System.out.println("el numero no es perfecto");
             }
        
    }
    
}
