/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocinco;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioCinco {

    /**
     * @param args the command line arguments
     * Se necesita pedir 2 numeros y sumarlos, mostrar el resultado
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int numeroUno;
        int numeroDos;
        int suma;
        // se crea el scanner que se va a usar.
            Scanner misca = new Scanner(System.in);
            
            
        //se pide le primer numero.
            System.out.println("Ingrese dos numeros a sumar: ");
            //se guarda en la variable y se muestra para verificar el mismo.
            numeroUno = misca.nextInt();
            System.out.println("numero ingresado:  "+numeroUno);
            //Se pide el segundo numero.
            System.out.println("Ingrese el segundo numero a sumar: ");
            //Se guarda en la variable y se muestra para verificar el mismo.
            numeroDos = misca.nextInt();
            System.out.println("Numero ingresado : "+numeroDos);
           //se suman las variables asignandola a la variable Suma.
            suma=numeroUno+numeroDos;
            //Se muestra el resultado.
            System.out.println("El resultado de la suma es : "+suma);
        
        
    }
    
}
