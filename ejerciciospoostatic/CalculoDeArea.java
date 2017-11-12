/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospoostatic;

/**
 *
 * @author Lautalb
 * 5-Realizar una clase llamada CalculoDeArea que posea 3 metodos (estaticos)
 * a. double CalcularCuadrado(double), doublé.
    b. double CalcularTriangulo(double, double) .
    c. double CalcularCirculo(double), 
 * 
 */
public class CalculoDeArea {
   
    
    
    //a)
    static double CalcularCuadrado(double numero)
    {   double area=Math.pow(numero, 2);
        
        return area;
        
    }
    
    //b)
    static double CalcularTriangulo(double base, double altura)
    {   double area=(base*altura)/2;
    
        return area;
    }
    
    //c)
    static double CalcularCirculo(double numero)
    {
        double area=Math.PI*(Math.pow(numero,2));
        
        return area;
    }
}
