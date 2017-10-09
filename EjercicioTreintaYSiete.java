/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotreintaysiete;

/**
 *
 * @author Lautalb
 */
public class EjercicioTreintaYSiete {

    /**
     * @param args the command line arguments
     * 37- Mostrar todos los numeros impares del 1 al 100.
     */
    public static void main(String[] args) {
        Integer contador=0;
        
        while (contador<100)
        {
            contador++;
            
            System.out.println("Numero par: "+contador);
            contador++;
        }
    }
    
}
