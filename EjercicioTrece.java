/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotrece;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioTrece {

    /**
     * @param args the command line arguments
     * se ingresa una edad y se informa si es mayor de edad.
     * 
     */
    public static void main(String[] args) {
        //declaramos variables y creamos el scanner.
        String datoAux;
        Integer edad;
        Scanner miscan= new Scanner(System.in);
        
        //se muestra el mensaje, se pide, guarda y se convierte.
        System.out.println("Ingrese la edad");
        datoAux = miscan.next();
        edad = Integer.parseInt(datoAux);
        
        if(edad >17)
        { 
            System.out.println("usted es mayor");
        }else
        {
            System.out.println("usted es menor");
        }
    }
    
}
