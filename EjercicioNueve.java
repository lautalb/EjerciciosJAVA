/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicionueve;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioNueve {

    /**
     * @param args the command line arguments
     * se ingresa la cantidad y precio  de un producto y se informa el total a pagar.
     */
    public static void main(String[] args) {
        //se declaran variables y se importa el scanner a utilizar.
        
        String datoAux;
        Integer cantidad;
        float precio;
        float precioFinal;
        Scanner misca= new Scanner (System.in);
        //se muestra el mensaje.
        System.out.println("Ingrese la cantidad del producto:");
        //se guardan los datos en las variables.
        datoAux= misca.next();
        //se convierte la variable.
        cantidad=Integer.parseInt(datoAux);
        //se muestra el mensaje
        System.out.println("Ingrese el precio del producto:");
        //se pide le precio y se convierte a float.
        datoAux=misca.next();
        precio = Float.parseFloat(datoAux);
       //se calcula el total
        precioFinal=cantidad*precio;
        //se muestra el mensaje + el total.
        System.out.println("el total es :"+precioFinal+"$.");
     
    }
    
}
