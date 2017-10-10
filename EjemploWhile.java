/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplowhile;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjemploWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //siempre poner el nombre de la class primero y despues . el metodo. para saber de donde sale.
        //EjemploWhile.PromedioConIf();
       // EjemploWhile.PromedioConWhile();
        //EjemploWhile.IteracionSinCantidad();
        //EjemploWhile.SalidaPorLogica();
        //EjemploWhile.PedirNumeros();
        EjemploWhile.MostrarMenu();
    }//finaliza el main
    
    /**
        Pide dos numeros e informa el promedio.
    */
    public static void PromedioConIf()
    {
        Scanner miscan = new Scanner(System.in);
        Integer numeroUno;
        Integer numeroDos;
        String datoAux;
        Integer promedio;
        
        System.out.println("Ingrese numero #1:");
        datoAux=miscan.next();
        numeroUno=Integer.parseInt(datoAux);
        
        System.out.println("Ingrese numero #2:");
        datoAux=miscan.next();
        numeroDos=Integer.parseInt(datoAux);
        
        promedio=(numeroDos+numeroUno)/2;
        System.out.println("El promedio es: "+promedio);
          
    }//finaliza promedio con if.
    
    
    /**
        Pide dos numeros e informa el promedio.
    */
    public static void PromedioConWhile()
    {
        Scanner miscan = new Scanner(System.in);
        Integer numero;
        Integer contador=0;
        String datoAux;
        Integer promedio;
        Integer suma=0;
        
        while(contador<3)
        {
            contador++;
            
            System.out.println("Ingrese numero #"+contador);
            datoAux=miscan.next();
            numero=Integer.parseInt(datoAux);
            
            suma=suma+numero;
        }
        promedio=suma/contador;
        
        System.out.println("El promedio es: "+promedio);
        
    }
    
    /**
     *  cuando no sabemos la cantidad de iteraciones 
     */
    public static void IteracionSinCantidad()
    {
        String Continuar="si";
        //mientras sea diferente a "no" va a entrar al while, cuando es "no" se termina el while.
        while(!Continuar.equals("no"))
             {
                 System.out.println("Hola, desea continuar");
                 Scanner miscan= new Scanner(System.in);
                 Continuar=miscan.next();
                 
                 
             }
    }
    
    
    public static void SalidaPorLogica() 
    {
        String Continuar="si";
        //mientras sea diferente a "no" va a entrar al while, cuando es "no" se termina el while.
        while(true)
             {
                 System.out.println("Hola, desea continuar");
                 Scanner miscan= new Scanner(System.in);
                 Continuar=miscan.next();
                 if(Continuar.equals("no"))
                 {  //rompe iteracion
                     break;
                 }
                 
             }
    }
    
    public static void PedirNumeros() 
    {   Scanner miscan=new Scanner(System.in);
        Integer numero;
        Integer contador=0;
        String datoAux;
        Integer suma=0;
        //el while se piensa al revez para validar. osea en vez de mayor a 10 se corta, menor a 10 se corta.
        while(contador<10 && suma<50)
        {
            contador++;
            System.out.println("Ingrese numero #"+contador+": ");
            datoAux=miscan.next();
            numero=Integer.parseInt(datoAux);
           suma=suma+numero;
           
        }
        System.out.println("la suma es "+suma);
        System.out.println("la cantidad es: "+contador);
    }
    
    public static void MostrarMenu()
    {
        String opcion="0";
        Scanner miscan=new Scanner(System.in);
        
        while(!opcion.equals("6"))
        {    
            
            System.out.println("1-Sumar");
            System.out.println("2-Restar");
            System.out.println("3-Multiplicar");
            System.out.println("4-Dividir");
            System.out.println("6-Salir");
            System.out.println("Ingrese opcion deseada");
            opcion=miscan.next();
            switch(opcion)
            {
                case "1":
                    EjemploWhile.Sumar();
                    break;
                
                case "2":
                    EjemploWhile.Resta();
                    break;
                    
                case "3":
                    EjemploWhile.Multiplicar();
                    break;
                 
                case "4":
                    EjemploWhile.Dividir();
                    break;
                    
                case "6":
                    System.out.println("Adios!!");
                    break;
                    
                default:
                    System.out.println("Ingreso una opcion equivocada");
            }
        }//del while
        System.out.println("Cerro el menu");
        
    }
    
    public static void Sumar()
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
    
    public static void Resta()
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
    
    public static void Multiplicar()
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
    
    public static void Dividir()
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
