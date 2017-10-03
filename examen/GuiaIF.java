/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class GuiaIF {
    /*
    13- Se ingresa un color y una localidad, si es avellaneda o Lanús y el color es rojo,
    mostrar el mensaje “sos de independiente”.
    */
    public static void HacerEjercicio13()
    {
        String color;
        String localidad;
        Scanner miscan= new Scanner(System.in);
        System.out.println("Ingrese un color");
        color=miscan.next();
        
        
        System.out.println("Ingrese una localidad");
        localidad=miscan.next();
        
        if (color.equals("rojo")&& localidad.equals("avellaneda") || localidad.equals("lanus"))
        {   
            System.out.println("Sos hincha de independiente");
            /**
            if(localidad.equals("avellaneda"))
            {
                System.out.println("sos hincha de independiente");
            }
            if(localidad.equals("lanus"))
            {
                System.out.println("sos hincha de independiente");
            }
            * 
            */
//            if(localidad.equals("avellaneda") || localidad.equals("lanus"))
//            {
//                System.out.println("sos hincha de independiente");
//            }
        }
    }
    
    
    /*
    15-Se pide el nombre, el sexo y la localidad. Si se llama José o maría y es de sexo masculino, 
    viviendo en morón, se muestra el mensaje “sos de morón”.
    */
    public static void HacerEjercicio15()
    {   //se declaran variables y se crea el scanner
        String nombre;
        String sexo;
        String localidad;
        
        Scanner miscan= new Scanner(System.in);
        
        //se toman datos
        System.out.println("Ingrese su nombre");
        nombre=miscan.next();
        
        System.out.println("Ingrese su sexo Femenino(F) y Masculino (M)");
        sexo=miscan.next();
        
        System.out.println("ingrese su localidad");
        localidad=miscan.next();
        
        //hacemos la condicion
        if(nombre.equals("jose") || nombre.equals("maria") && sexo.equals("m")&& localidad.equals("moron") )
        {
            System.out.println("sos de Moròn");
        }
        
    
    }
    /*
    17-Se pide una edad y se informa si es niño adolescente o mayor de edad
    */
    public static void HacerEjercicio17()
    {
         //declaramos scaner y variables
        Scanner miscan=new Scanner(System.in);
        String datoAux;
        Integer edad;
        
        //
        
        //mostramos mensaje y pedimos datos.
        System.out.println("Ingrese edad : ");
        datoAux=miscan.next();
        edad=Integer.parseInt(datoAux);
        
         if (edad>17)
        {
            System.out.println("es mayor");
        }else
        {
            //son menores a 18
            if(edad<13)
            {
                System.out.println("es niño");
            }else
            {
                System.out.println("es adolescente");
            }
        
        }
    }
    
    /*
    19- se ingresa un importe, si supera los 100 pesos se  le suma un impuesto del 23%, si no se les descuenta el 50%
    */
    public static void HacerEjercicio19()
    {   //declaramos variables y el scanner
        String datoAux;
        Double importe;
        Double total;
        Scanner miscan= new Scanner(System.in);
        
        //pedimos datos
        System.out.println("Ingrese el importe");
        datoAux=miscan.next();
        importe=Double.parseDouble(datoAux);
        
        if (importe > 100)
        {   //mayores a 100
            total=importe*0.23+importe;
            /* se  puede hacer de estas formas.
            total=importe*(0.23+1);
            total=1.23*importe;
            */
            System.out.println("El total :"+total);
            
        }else
        {   //menores a 100
            total=importe*0.50;
            System.out.println("El total es : "+total);
        }
        
    }
}
