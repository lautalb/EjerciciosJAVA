/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotres;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioTres {

    /**
     * @param args the command line arguments
     * se debe pedir el nombre y el apellido, luego mostrarlo en el siguiente mensaje
     * su nombre es xxxx y xxxxx es su apellido
     */
    public static void main(String[] args) {
        // se declaran las variables.
        String nombre;
        String apellido;
        //se importa y crea el scanner para usarlo.
        Scanner miscanner= new Scanner(System.in);
        //se pide el nombre y apellido.
        System.out.println("Ingrese su nombre y despues su apellido");
        //se guarda lo ingresado en la variable del tipo string (nombre) y (apellido).
        nombre = miscanner.nextLine();
        apellido = miscanner.nextLine();
        
        //se muestra el nombre y apellido ingresado.
        System.out.println("Su nombre es: "+nombre+" y "+apellido+" es su apellido.");
        
        
        
    }
    
}