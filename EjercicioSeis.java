/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioseis;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioSeis {

    /**
     * @param args the command line arguments
     * Se piden 3 numeros y se informa el promedio.
     */
    public static void main(String[] args) {
       //declaramos las variables.
       float numeroUno;
       float numeroDos;
       float numeroTres;
       float promedio;
       
       //se importa y crea el scanner a utilizar.
        Scanner miScan= new Scanner(System.in);
        
        //se piden los numeros
        System.out.println("Ingrese el primero numero.");
        numeroUno = miScan.nextFloat();
        //se verifica el numero ingresado.
        System.out.println("el numero ingresado es: "+numeroUno);
        //se pide el segundo numero
        System.out.println("Ingrese el segundo numero.");
        numeroDos =miScan.nextFloat();
        //se verifica el numero ingresado
        System.out.println("el numero ingresado es : "+numeroDos);
        //se pide el tercer numero
        System.out.println("Ingrese el tercer numero.");
        numeroTres = miScan.nextFloat();
        //se verifica el numero ingresado.
        System.out.println("el numero ingresado es : "+numeroTres);
        //se hace el promedio en la variable (promedio)
        promedio = (numeroUno+numeroDos+numeroTres)/3;
        System.out.println("el promedio es : "+promedio);
        
        
        
    }
    
}