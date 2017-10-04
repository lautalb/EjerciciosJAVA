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
public class GuiaSwitch {
    
    /*
    28 – Se ingresa un mes del año, si es febrero o enero, mostrar el mensaje “Feliz verano” 
    de lo contrario Informar “No es Verano”
    */
    public static void HacerEjercicio28()
    {   
         //declaramos variables e importamos y creamos el scanner
        Scanner miscan = new Scanner (System.in);
        String mes;
        //mostramos mensaje y pedimos dato
        System.out.println("Ingrese mes");
        mes=miscan.next();
        
        //hacemos el switch con las distintas opciones
        switch(mes)
        {
            case "enero":
            case "febrero":    
                System.out.println("Feliz verano");
                break;
            
            default:
                System.out.println("No es verano");
                break;
        
        }
    }
    
    /*
    29- Se ingresa un mes del año, si es febrero o enero, mostrar el mensaje “Iniciando el año” ,
    si es junio o julio el mensaje” Mitad del año” y si es diciembre el mensaje fin de año.
    */    
    public static void HacerEjercicio29()
    {
        //importamos el scanner y creamos variables
        Scanner miscan= new Scanner(System.in);
        String mes;
        
        //mostramos mensaje y pedimos dato.
        System.out.println("Ingrese mes");
        mes = miscan.next();
        
        //hacemos el switch
        switch(mes)
        {
            case "enero":
            case "febrero":
                System.out.println("Iniciando el año");
                break;
             
            case "junio":
            case "julio":
                System.out.println("Mitad del año");
                break;
            
            case "diciembre":
                System.out.println("Fin de año");
                break;
                    
        } 
    }
    
    /*
      30- Se ingresa un mes del año y si es Enero: "que comiences bien el año!” , 
    * si es Marzo: "a clases!” , si es Julio: "se vienen las vacaciones!” , si es Diciembre: "Felices fiesta!”.
    */
    public static void HacerEjercicio30()
    {
     //importamos el scanner y creamos variables
        Scanner miscan= new Scanner(System.in);
        String mes;
        
        //mostramos mensaje y pedimos dato.
        System.out.println("Ingrese mes");
        mes = miscan.next();
        
        //hacemos el switch
        switch(mes)
        {
            case "enero":
                System.out.println("Que comience bien el año");
                break;
             
            case "marzo":
                System.out.println("a clases!");
                break;
                
             case "julio":
                System.out.println("se vienen las vacaciones!");
                break;   
            
            case "diciembre":
                System.out.println("Felices fiesta!");
                break;
                    
        }
    }
    
    /*
    31- Se ingresa un mes del año al seleccionar un mes informar: si tiene 28 días ,
    si tiene 30 días, si tiene 31 días.
    */
     public static void HacerEjercicio31()
    {
     //importamos el scanner y creamos variables
        Scanner miscan= new Scanner(System.in);
        String mes;
        
        //mostramos mensaje y pedimos dato.
        System.out.println("Ingrese mes");
        mes = miscan.next();
        
                
        switch(mes)
        { 
            case "febrero":
                System.out.println("Febrero tiene 28 días");
                break;
            
            case "abril":
            case "junio":
            case "septiembre":
            case "noviembre":        
                System.out.println("Tiene 30 días");
                break;    
           
            case "enero":
            case "marzo":
            case "mayo":
            case "julio": 
            case "agosto":
            case "octubre":
            case "diciembre":    
                System.out.println("Tiene 31 días");
                break;      
        }
    }
     /*
     32- Al ingresar una hora del día, informar: si está entre las 7 y las 11: "Es de mañana.".
     */
    public static void HacerEjercicio32()
     {
      //importamos el scanner y creamos variables
        Scanner miscan= new Scanner(System.in);
        String datoAux;
        Integer hora;
        
        //mostramos mensaje y pedimos dato.
        System.out.println("ingrese hora");
        datoAux = miscan.next();
        //pareseamos
        hora=Integer.parseInt(datoAux);
        
        switch(hora)
        {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                System.out.println("Es de mañana.");
        }
     }
    /*
    33-al ingresar un signo del zodíaco devolver el nombre de la imagen asociada a ese signo
    */
    public static void HacerEjercicio33()
    {
    //importamos el scanner y creamos variables
        Scanner miscan= new Scanner(System.in);
        String signo;
        
        //mostramos mensaje y pedimos dato.
        System.out.println("Ingrese un signo del zodiaco");
        signo = miscan.next();
        
        //hacemos el switch
        switch(signo)
        {
            case "aries":
                    System.out.println("El carnero");
                    break;
                    
            case "tauro":
                    System.out.println("El toro");
                    break; 
                    
            case "geminis":
                    System.out.println("Los gemelos");
                    break; 
                    
            case "cancer":
                    System.out.println("El cangrejo");
                    break; 
             
            case "leo":
                    System.out.println("El leon");
                    break;   
                    
            case "virgo":
                    System.out.println("La mujer");
                    break;
                    
            case "libra":
                    System.out.println("La balanza");
                    break;
                    
            case "escorpio":
                    System.out.println("El escorpión");
                    break; 
                    
            case "sagitario":
                    System.out.println("El centauro");
                    break; 
                    
            case "capricornio":
                    System.out.println("La cabra");
                    break;
                    
            case "acuario":
                    System.out.println("El viejo sabio");
                    break;
                    
            case "piscis":
                    System.out.println("Dos peces");
                    break;        
        
        }
    }
    
    
    /*
    34- Se pide un día de la semana, si es lunes mostrar el mensaje  “Buen comienzo”, 
     * para el resto de los días hábiles mostrar” a aguantar “ si es sábado o domingo  mostrar “ Buen fin de”.
    */
    public static void HacerEjercicio34()
    {
     //importamos el scanner y creamos variables
        Scanner miscan= new Scanner(System.in);
        String dia;
        
        //mostramos mensaje y pedimos dato.
        System.out.println("Ingrese dia");
        dia= miscan.next();
        
        //hacemos el switch
        switch(dia)
        {
            case "lunes":
                System.out.println("Buen comienzo");
                break;
            
            case "sabado":
            case "domingo":
                System.out.println("Buen fin de");
                break;
             
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("A aguantar");
                break;
        }
    }
}