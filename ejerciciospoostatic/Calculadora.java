/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospoostatic;

/**
 *
 * @author Lautalb
 */
public class Calculadora {
    
    /**
     * 
     * a. Calcular (público): Recibirá tres parámetros, el primer número, el segundo número
        y la operación matemática. El método devolverá el resultado de la operación
     * @param numero
     * @param numero2
     * @param operador
     * @return 
     */
    public static  double Calcular(int numero, int numero2, String operador)
    {   double resultado=0;
        
        switch (operador)
        {
            case "+":
                resultado=numero+numero2;
                return resultado;
                
            case "*":
                resultado=numero*numero2;
                return resultado;
                
            case "-":
                resultado=numero-numero2;
                return resultado;
                
            case "/":
                System.out.println(Calculadora.Validar(numero2));
                resultado=numero/numero2;
                return resultado;
                
            default: 
                return resultado;
        }
    }
    
    
    private static boolean Validar(int numero)
    {
        boolean validation=true;
        if(numero%2==0)
        {
            return validation=false;
        }else
        {
            return validation=true;
        }
    }
    
    public static void Mostrar(double resultado)
    {
        System.out.println("El resultado es: "+resultado);
    }
}
