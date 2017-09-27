/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infonumerica;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class InfoNumerica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // se brinda la informacion sobre un número ingresado.
        //modulo es el signo de %, para sacar 
        Scanner miscan= new Scanner(System.in);
        String datoAux;
//        Integer numeroUno;
//        Integer numeroDos;
//        Integer resultado;
//        numeroUno=2;
//        numeroDos=10;
        
//        resultado=2%10;
//        
//        System.out.println("El resultado de 2%10 es : "+resultado);
//        
//        resultado=11%3;
//        
//        System.out.println("El resultado de 10%2 es: "+resultado);
            
          Integer numeroIngresado;
          System.out.println("Ingrese un numero");
          datoAux=miscan.next();
          numeroIngresado=Integer.parseInt(datoAux);
          
          
          
          if (numeroIngresado>100)
          {
              System.out.println("El numero es mayor a 100");
          }else
          { 
              if(numeroIngresado<100)
              {    
              System.out.println("El numero es menor a 100");
              }
          }
            //se descarta el 0 y despues se verifica si es positivo o negativo
          if(numeroIngresado!=0)
          {
              if(numeroIngresado>0)
              {
                  System.out.println("positivo");
              }else
              {
                  System.out.println("negativo");
              }
          }
          
          
          
          
          //se hace la verificacion y despues se descarta el 0.
          /*if(numeroIngresado>0)
          {
              System.out.println("positivo");
          }else
          {
              if(numeroIngresado<0)
              {
                  System.out.println("negativo");
              }
          }
          */
          
          
          
//          if(numeroIngresado > 0 )
//          {
//              System.out.println("es positivo");
//              
//          }else
//          {
//                      System.out.println("es negativo");
//          }
          
          if (numeroIngresado%2==0)
          {
              System.out.println("es par");
          }
          
          /***
           *  1-informar si es mayor o menor a 100
           *  2- informar si es positivo o negativo
           * 3- informar si es par
           */

    }
    
}
