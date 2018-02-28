/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasodosmildiesiocho.ejemplos;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ejemplos {
    /**
     * Ejemplo de ingreso de datos
     */
    public static void IngresoDeDatos()
    {
          Scanner miScanner= new Scanner(System.in);
        
        int numeroUno;
        int numeroDos;
        int resultado;
        String aux;
        
        System.out.println("Ingrese el primer numero");
        aux=miScanner.next();
        numeroUno=Integer.parseInt(aux);
        //System.out.println(numeroUno);
        
        System.out.println("Ingrese el segundo numero");
        aux=miScanner.next();
        numeroDos=Integer.parseInt(aux);
        //System.out.println(numeroDos);
        
        resultado=numeroUno+numeroDos;
        
        System.out.println("Resultado: "+resultado);
    }//fin ingresoDeDatos()
    
    /**
     * verificar cual es el mayor
     */
    public static void MostrarMayor()
    {
        Scanner miScanner= new Scanner(System.in);
        
        int numeroUno;
        int numeroDos;
        int resultado;
        String aux;
        
        System.out.println("Ingrese el primer numero");
        aux=miScanner.next();
        numeroUno=Integer.parseInt(aux);
        //System.out.println(numeroUno);
        
        System.out.println("Ingrese el segundo numero");
        aux=miScanner.next();
        numeroDos=Integer.parseInt(aux);
        //System.out.println(numeroDos);
        
        resultado=numeroUno+numeroDos;
        
        System.out.println("Resultado: "+resultado);
        //verificamos cual de los dos numero es el mayor
        if(numeroUno>numeroDos)
        {
            System.out.println("El numero: "+numeroUno+" es el mayor");
        }else
        {
           if(numeroDos>numeroUno)
           {
               System.out.println("El numero: "+numeroDos+" es el mayor");   
           }else
           {
               System.out.println("Los dos numeros son iguales");
           }
        }
    }
    
    /**
     * mostrar hola mundo en consola
     */
    public static void Saludar()
    {
        System.out.println("Hola mundo!");
    }
    
    /**
     * muestra la cantida de dias que tiene el mes
     */
    public static void UsoDelSwitch()
    {   
 
        Scanner miScanner= new Scanner(System.in);
        
        String mes;
        
        System.out.println("ingrese mes");
        mes=miScanner.next();
        //para ponerlo en minuscula y poder usarlo en el switch
        mes=mes.toLowerCase();
        
        switch(mes)
        {
            case "febrero":
                    System.out.println("Tiene 29 dias maximo");
                    break;
                   
            case "abril":
            case "junio":
            case "septiembre":    
            case "noviembre":
                System.out.println("Tiene 30 dias");
                break;
             
            default:
                System.out.println("Tiene 31 dias");
                break;
            
        }
         
         
    }
    /**
     * se pide el ingreso de un dia de la semana y una edad 
     * de ser dia del fin de semana y tener menos de 13 años 
     * mostrar el mensaje "a descansar"
     *-si es dia de la semana y la misma edad el mensaje "a estudiar"
     *-si la edad supera los 18 años el mensaje es "a trabajar" 
     *-si la edad esta entre los 15 y 30" a festejar", solo si es fin de semana
     */
    public static void UsoDelSwitchMasIf()
    {
         Scanner miScanner= new Scanner(System.in);
         String aux;
         String dia;
         int edad;
         
         System.out.println("Ingrese un dia");
         dia=miScanner.next();
         
         System.out.println("Ingrese su edad");
         aux=miScanner.next();
         edad=Integer.parseInt(aux);
         
         dia=dia.toLowerCase();
         switch(dia)
         {
             case "sabado":
             case "domingo": 
                 if(edad<13){
                     System.out.println("a descansar");
                 }else{
                     if(edad>15 && edad<30){
                         System.out.println("a festejar");
                     }
                 }
                 break;
                 
             default:
                 if(edad<13){
                     System.out.println("a estudiar");
                 }
                 else{
                     if(edad>18){
                     System.out.println("a trabajar");
                     }
                 }
                    
         }
    }
    
    public static void usoDelWhileAscendente()
    {
        int contador;
        contador=0;
        
        while(contador<10)
        {   
            contador++;
            System.out.println("es la iteracion del contador: "+contador);
        }
        
        System.out.println("Salio con : "+contador);
        
        
    }
    
    public static void usoDelWhileDescendente()
    {
        int contador;
        contador=10;
        
        while(contador>0)
        {   
            contador--;
            System.out.println("es la iteracion del contador: "+contador);
            
        }
        
        System.out.println("Salio con : "+contador);
        
        
    }

    public static void UsoDelWhileValidar()
    {   
        Scanner miScanner=new Scanner(System.in);
        Integer edad;//mayor a 0 y menor a 100
        Integer sueldo;//mayor a 0
        String sexo; //f o m
        String tipoAlumno;//C=cursante, L = libre, E=egresado
        Integer temperatura;//-200 y +200
        String respuesta;//si o no
        
        
        System.out.println("Ingrese sueldo");
        sueldo=miScanner.nextInt();
        
        while(sueldo<0)
        {
            System.out.println("error, re Ingrese sueldo");
            sueldo=miScanner.nextInt();
        }
        
        System.out.println("Ingrese edad");
        edad=miScanner.nextInt();
        
        while(edad<1 || edad>100)
        {
            System.out.println("error, re Ingrese edad");
            edad=miScanner.nextInt();
        }
        
        System.out.println("Ingrese la temperatura");
        temperatura=miScanner.nextInt();
        
        while(temperatura<-200 || temperatura>200)
        {
            System.out.println("error, re Ingrese la temperatura");
            temperatura=miScanner.nextInt();
        }
        
        System.out.println("Ingrese su sexo");
        sexo=miScanner.next();
        
        
        while(!sexo.equalsIgnoreCase("f") && !sexo.equalsIgnoreCase("m"))
        {
            System.out.println("error, re Ingrese su sexo");
            sexo=miScanner.next();
            sexo=sexo.toLowerCase(); 
        }
        
        System.out.println("Ingrese si es Cursante[C], libre [L] o egresado [E]");
        tipoAlumno=miScanner.next();
        
        while(!tipoAlumno.equalsIgnoreCase("c") && !tipoAlumno.equalsIgnoreCase("l") && !tipoAlumno.equalsIgnoreCase("e"))
        {
            System.out.println("Error, re Ingrese si es Cursante[C], libre [L] o egresado [E]");
            tipoAlumno=miScanner.next();
        
        }
        
        System.out.println("Ingrese respuesta");
        respuesta=miScanner.next();
        
        while(!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no"))
        {
            System.out.println("Error, re Ingrese respuesta");
            respuesta=miScanner.next();
        }
    }
}
