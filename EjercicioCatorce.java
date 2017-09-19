/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocatorce;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioCatorce {

    /**
     * @param args the command line arguments
     * Se pide ingresar una clave, si es "utn750" se mostrara el mensaje bienvenido,
     * de lo contrario el mensaje "clave erronea".
     * 
     * 
     */
    
    public static void main(String[] args) {
        // se importa el scanner y se crea variables.
        Scanner misca = new Scanner(System.in);
        String clave;
        
        //se muestra el msj.
        System.out.println("Ingrese la clave.");
        clave = misca.next();
        
       
        
        //se hace la verificacion
        if ("utn750".equals(clave))
        {
            System.out.println("Bienvenido");
        } else
        {
            System.out.println("Clave erronea");
        }
        
        
        
    }
    
}
