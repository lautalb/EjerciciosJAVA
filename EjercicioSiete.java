/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosiete;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioSiete {

    /**
     * @param args the command line arguments
     * se pide la base de un cuadrado y se informa el perimetro.
     */
    public static void main(String[] args) {
        // se declaran las variables.
        int base;
        int perimetro;
        //se importa y crea el scanner a utilizar.
        Scanner miScan = new Scanner(System.in);
        //se pide la base del cuadrado.
        System.out.println("Ingrese la base del cuadrado.");
        //se guarda en la variable del tipo entero (base)
        base = miScan.nextInt();
        
        //se calcula el perimetro
        perimetro = base*4;
        
        // se informa el perimetro      
        System.out.println("el perimetro del cuadrado es : "+perimetro);
        
        
    }
    
}