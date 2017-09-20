/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioquince;

import java.util.Scanner;

/**
 *
 * @author Lautalb
 */
public class EjercicioQuince {

    /**
     * @param args the command line arguments
     * se ingresa un importe, si supera los 100$ se le suma un 23%, si es menor a 100$ se 
        //le descuenta el 50%.
     */
    public static void main(String[] args) {
        //declaramos variables y el scanner.
        String datoAux;
        Double importe;
        Double AumentoODescuento;
        double total;
        Scanner miscan= new Scanner(System.in);
        
        //Mostramos el mensaje.
        System.out.println("Ingrese el importe: ");
        //lo guardamos y parseamos.
        datoAux = miscan.next();
        importe = Double.parseDouble(datoAux);
        
        
        //hacemos la condicion
        if (importe >100)
        {
            //se hace el calculo del % y se le suma el importe
            AumentoODescuento = importe*23/100;
            total = importe+AumentoODescuento;
            
            //se muestra el mensaje
            System.out.println("El aumento es: "+AumentoODescuento+"$. El total : "+total+"$." );
        }
        if (importe < 100)
        {
            //se hace el calculo del % y se calcula el total
            AumentoODescuento = importe*50/100;
            total = importe-AumentoODescuento;
            System.out.println("El descuento es :"+AumentoODescuento+"$. El total :"+total+"$.");
        }
        
        
        
    }
    
}
