/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocincuentaydos;

/**
 *
 * @author Lautalb
 */
public class EjercicioCincuentaYDos {

    /**
     * @param args the command line arguments
     * 52- Informar todos los números perfectos hasta el millón
     */
    public static void main(String[] args) {
        Integer contador=1;
        Integer contador2=0;
        Integer suma=0;
        Integer numero=2;
        
        while(contador2<1000000)
        {
            while(contador<numero-1)
            {   
                 

                 if(numero%contador==0)
                 {  //si es divisor se suma
                     suma=suma+contador;
                 }
                 contador++;
     
            }
            contador=1;
            contador2++;
            if(numero==suma)
                 {
                     System.out.println("el numero: "+numero+" es perfecto");
                 }
            suma=0;
            numero++;
        }
    }
    
}
