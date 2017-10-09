/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotreintayseis;

/**
 *
 * @author Lautalb
 */
public class EjercicioTreintaYSeis {

    /**
     * @param args the command line arguments
     * 36- Mostrar todos los numeros pares del 1 al 100.
     */
    public static void main(String[] args) {
        //declaramos el contador
        Integer contador=1;
        
        while (contador<100)
        {
            contador++;
            
            System.out.println("Numero par: "+contador);
            contador++;
        }
    }
    
}
