/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocuarentayseis;

import java.util.Scanner;

/**
 *
 * @author Lautalb
 */
public class EjercicioCuarentaYSeis {

    /**
     * @param args the command line arguments
     * 46- Informar si un número es primo o no.
     */
    public static void main(String[] args) {
       //declaramos el scanner y las variables
       Scanner miscan=new Scanner(System.in);
       String datoAux;
       Integer numero;
       Integer contador=2;
       Integer contadorDeDiv=0;
       
       System.out.println("Ingrese numero");
       datoAux=miscan.next();
       numero=Integer.parseInt(datoAux);
       
       while(contador<numero)
       {
           
           
           if (numero%contador==0)
           {
               contadorDeDiv++;
               break;
           }
          contador++;
       }//fin del while
       
        if(contadorDeDiv>0)
            {
                System.out.println("No es primo");
            }else
            {
                System.out.println("Es primo el numero: "+numero);
            }
       
    }
    
}
