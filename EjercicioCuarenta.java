/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocuarenta;

import java.util.Scanner;

/**
 *
 * @author Lautalb
 */
public class EjercicioCuarenta {

    /**
     * @param args the command line arguments
     * 40- Pedir 10 números e informar cuantos negativos, positivos y ceros ingresaron.
     */
    public static void main(String[] args) {
        Scanner miscan = new Scanner(System.in);
        String datoAux;
        Integer numeros;
        Integer contador=0;
        Integer negativos=0;
        Integer positivos=0;
        Integer ceros=0;
        
        //creamos la iteracion
        while(contador<10)
        {   //aumentamos el contador
            contador++;
            //mostramos mensaje y pedimos datos
            System.out.println("Ingrese numero: "+contador);
            datoAux=miscan.next();
            numeros=Integer.parseInt(datoAux);
            //si es par va a entrar al if
            if (numeros==0)
            {   //cuenta los 0
                ceros++;
            }else
            {
                if(numeros<0)
                {
                    negativos++;
                }else
                {
                    positivos++;
                }
            }
                
        }
        //mostramos mensaje
        System.out.println("La cantidad de ceros ingresados es: "+ceros+" la cantidad de negativos: "+negativos+" y la cantidad de positivos : "+positivos);
    }
    
}
