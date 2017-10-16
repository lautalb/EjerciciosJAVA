/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocuarentaysiete;

/**
 *
 * @author Lautalb
 */
public class EjercicioCuarentaYSiete {

    /**
     * @param args the command line arguments
     * 47- Informar todos los números primos del 1 al 1000.
     */
    public static void main(String[] args) {
        Integer numeroIngresado=2;
        
        while(numeroIngresado<1001)
        {
            
            Integer contador=2;
            Integer contadorDivisores=0;

            while (contador<numeroIngresado) 
            {            
                if (numeroIngresado%contador==0)
                {
                    contadorDivisores++;
                    break;
                }
                contador++;
            }
            if (contadorDivisores>0)
            {
                //System.out.println("No es primo");
            }
            else
            {
                System.out.println("Es primo el número :" + numeroIngresado);
            }
            numeroIngresado++;
        }
    }
    
}
