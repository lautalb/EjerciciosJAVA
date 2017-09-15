/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioocho;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioOcho {

    /**
     * @param args the command line arguments
     * se pide el largo y el ancho de un terreno y se informa la superfice del mismo.
     * 
     * 
     */
    public static void main(String[] args) {
        // declaramos variables.
        int largo;
        int ancho;
        int superficie;
        // importamos y creamos el scanner a utilizar;
        Scanner miSca= new Scanner(System.in);
        
        //pedimos el largo del terreno;
        System.out.println("Ingrese el largo del terreno");
        // lo guardamos en la variable del tipo entero (largo)
        largo=miSca.nextInt();
        // mostramos para verificar
        //System.out.println("el largo es : "+largo);
        //pedimos el ancho del terreno
        System.out.println("Ingrese el ancho del terreno");
        //lo guardamos en la variable del tipo entero(ancho)
        ancho=miSca.nextInt();
        //mostramos para verificar
        //System.out.println("el ancho es : "+ancho);
        //calculamos la superficie
        superficie=largo*ancho;
        //mostramos la superficie del terreno
        System.out.println("La superficie del terreno es: "+superficie);
    }
    
}