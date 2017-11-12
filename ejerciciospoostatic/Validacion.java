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
public class Validacion {
    
    /**
     * 1- .Ingresar 10 números enteros que pueden estar dentro de un rango, por ejemplo
        entre 100 y -100. Para ello realizar una clase llamada Validación que posea un
        Método estático llamado Validar, que reciba tres parámetros, el límite inferior, el límite
        superior y el número, retorna verdadero y el numero esta en ese intervalo ej:
        Validar(10,50,20) es igual a true.
        Validar(10,20,50 es igual a false
     */
    public static boolean validar(int inferior, int superior, int numero)
    {   boolean validation=false;
        
        
        if(numero>inferior && numero<superior)
        {   
            return validation=true;
        }else
        {   
            return validation=false;
        }
    }
    
    /**
     * 2- Realizar el método estático ValidaS_N() de la clase Validación, se validará el ingreso de
        palabras si son la palabra “SI” o la palabra “NO” retorna true de lo contrario retorna false
     * @param palabra
     * @return
     */
   public static boolean ValidaS_N(String palabra)
   {
       boolean validation=false;
       if(palabra.equalsIgnoreCase("si"))
       {
           
           return validation=true;
       }else
       {
           return validation=false;
       }
   }
   
   /**
    * 3- Realizar el método estático Es_PAR() de la clase Validación, retorna true si el parámetro
        ingresado es par.
    */
   public static boolean Es_PAR(int numero)
   {    boolean validation=false;
        if(numero%2==0)
        {
            
            return validation=true;
        }else
        {
            return validation=false;
        }
       
   }
   
   
}
