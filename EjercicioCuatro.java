/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocuatro;

import java.util.Scanner;
import jdk.nashorn.internal.ir.Symbol;

/**
 *
 * @author alumno
 */
public class EjercicioCuatro {

    /**
     * @param args the command line arguments
     * Al ingresar una edad y el nombre se debe mostrar el siguiente mensaje:
     * Usted se llama xxxx y tiene xx años de edad.
     */
    public static void main(String[] args) {
       //declaramos variables.
       int edad;
       String nombre;
       
       // importamos y creamos el scanner a utilizar.
        Scanner miscanner= new Scanner(System.in);
        //se pide la edad y el nombre.
        Scanner misca = new Scanner(System.in);
        
        System.out.println("ingrese su edad");
        edad = miscanner.nextInt();
        
        System.out.println("ingrese su nombre");
        nombre = misca.nextLine();
        
        //se muestra el nombre y la edad.
        System.out.println("Su nombre es "+nombre+" y tiene "+edad+" años de edad.");
        
        
        
       
    }
    
}
