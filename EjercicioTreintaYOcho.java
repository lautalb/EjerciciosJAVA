/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotreintayocho;

/**
 *
 * @author Lautalb
 */
public class EjercicioTreintaYOcho {

    /**
     * @param args the command line arguments
     * 38- Mostrar la suma de los primeros 100 números naturales.
     */
    public static void main(String[] args) {
        //declaramos variables
        Integer contador=0;
        Integer suma=0;
        
        while(contador<100)
        {
            contador++;
            suma=suma+contador;
        }
        System.out.println("La suma de los primero 100 numeros naturales es: "+suma);
    }
    
}
