/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotreintaynueve;

import java.util.Scanner;

/**
 *
 * @author Lautalb
 */
public class EjercicioTreintaYNueve {

    /**
     * @param args the command line arguments
     * 39- Pedir 10 números e informar cuantos pares ingresaron.
     * 
     */
    public static void main(String[] args) {
       //declaramos variables e importamos y creamos el scanner
        Scanner miscan = new Scanner(System.in);
        String datoAux;
        Integer numeros;
        Integer contador=0;
        Integer pares=0;
        
        //creamos la iteracion
        while(contador<10)
        {   //aumentamos el contador
            contador++;
            //mostramos mensaje y pedimos datos
            System.out.println("Ingrese numero: "+contador);
            datoAux=miscan.next();
            numeros=Integer.parseInt(datoAux);
            //si es par va a entrar al if
            if (numeros%2==0)
            {   //cuenta los pares
                pares++;
            }
        }
        //mostramos mensaje
        System.out.println("Ingreso: "+pares+" pares");
    }
    
}
