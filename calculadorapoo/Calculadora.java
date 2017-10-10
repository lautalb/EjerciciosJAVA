/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorapoo;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Calculadora {
    
    public static void ArrancarCalculadora()
    {   String opcion="0";
    
        System.out.println("Bienvenido a la calculadora");
        while (!opcion.equals("6"))
        {    
            Calculadora.MostrarMenu();
            Scanner miscan=new Scanner(System.in);
            opcion=miscan.next();
            switch(opcion)
            {
                    case "1":
                        Calculadora.Sumar();
                        break;

                    case "2":
                        Calculadora.Resta();
                        break;

                    case "3":
                        Calculadora.Multiplicar();
                        break;

                    case "4":
                        Calculadora.Dividir();
                        break;

                    case "6":
                        System.out.println("Adios!!");
                        break;

                    default:
                        System.out.println("Ingreso una opcion equivocada");
            }//switch
            System.out.println("Cerro el menu");
        }//while
    }   
    
    private static void MostrarMenu()
    {
            System.out.println("1-Sumar");
            System.out.println("2-Restar");
            System.out.println("3-Multiplicar");
            System.out.println("4-Dividir");
            System.out.println("6-Salir");
            System.out.println("Ingrese opcion deseada");
    }
    
    private static void Sumar()
    {
        Scanner miscan = new Scanner(System.in);
        Integer numeroUno;
        Integer numeroDos;
        String datoAux;
        Integer resultado;
        //primer numero
        System.out.println("Ingrese primer numero");
        datoAux=miscan.next();
        numeroUno=Integer.parseInt(datoAux);
        
        //segundo numero
        System.out.println("Ingrese segundo numero");
        datoAux=miscan.next();
        numeroDos=Integer.parseInt(datoAux);
        
        resultado=numeroUno+numeroDos;
        System.out.println("El resultado de la suma es: "+resultado);
        
    }
    
    private static void Resta()
    {
    Scanner miscan = new Scanner(System.in);
        Integer numeroUno;
        Integer numeroDos;
        String datoAux;
        Integer resultado;
        //primer numero
        System.out.println("Ingrese primer numero");
        datoAux=miscan.next();
        numeroUno=Integer.parseInt(datoAux);
        
        //segundo numero
        System.out.println("Ingrese segundo numero");
        datoAux=miscan.next();
        numeroDos=Integer.parseInt(datoAux);
        
        resultado=numeroUno-numeroDos;
        System.out.println("El resultado de la resta es: "+resultado);
    }
    
    private static void Multiplicar()
    {
    Scanner miscan = new Scanner(System.in);
        Integer numeroUno;
        Integer numeroDos;
        String datoAux;
        Integer resultado;
        //primer numero
        System.out.println("Ingrese primer numero");
        datoAux=miscan.next();
        numeroUno=Integer.parseInt(datoAux);
        
        //segundo numero
        System.out.println("Ingrese segundo numero");
        datoAux=miscan.next();
        numeroDos=Integer.parseInt(datoAux);
        
        resultado=numeroUno*numeroDos;
        System.out.println("El resultado de la multiplicacion es: "+resultado);
    }
    
    private static void Dividir()
    {
    Scanner miscan = new Scanner(System.in);
        Integer numeroUno;
        Integer numeroDos;
        String datoAux;
        Integer resultado;
        //primer numero
        System.out.println("Ingrese primer numero");
        datoAux=miscan.next();
        numeroUno=Integer.parseInt(datoAux);
        
        //segundo numero
        System.out.println("Ingrese segundo numero");
        datoAux=miscan.next();
        numeroDos=Integer.parseInt(datoAux);
        
        resultado=numeroUno/numeroDos;
        System.out.println("El resultado de la division es: "+resultado);
    }
    
    
}
