/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosarray;

/**
 *
 * @author Lautalb
 */
public class ejerciciosDeArray {
    
    /**
     * 74- Cargar un array con todos los números pares hasta el 100.
     */
    public static void ejercicioSetentaYCuatro()
    {
        int[] numerosPares;
        numerosPares = new int[51];
        int indice=1;
        
        for (int i = 1; i <= 100; i++) {
            if (i%2==0) {
                numerosPares[indice]=i;
                indice = indice + 1;
            }
        }
        
        for (int i = 1; i <= 50; i++) {
            System.out.println("El número "+i+" : "+numerosPares[i]);
        }
    }
    
    /**
     * 75- Cargar un array con todos los números Múltiplos de 6 hasta el 100.
     */
    public static void ejercicioSetentaYCinco()
    {
        int []multiplosDeSeis;
        multiplosDeSeis=new int[17];
        int posicion=1;
        
        for (int i = 1; i < 100; i++) {
            if(i%6==0)
            {
                multiplosDeSeis[posicion]=i;
                posicion++;
            }
        }
        
        for (int i = 1; i < 17; i++) {
            System.out.println("posicion: "+i+" = "+multiplosDeSeis[i]);
        }
    }
    
    /**
     * 76- Cargar un array de 10 elementos con números Random del 0 al 100
     */
    public static void ejercicioSetentaYSeis()
    {
        int []numerosRamdon;
        numerosRamdon=new int[10];
        
        for (int i = 0; i < 10; i++) {
            numerosRamdon[i]=(int) (Math.random()* 100)+0;
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println("posicion: "+i+" = "+numerosRamdon[i]);
        }
    }
    
    /**
     * 77- Cargar un array de 10 elementos con números Random del 0 al 100, y pasarlo a otro array con
     *  el orden inverso.
     */
    public static void ejercicioSetentaYSiete()
    {
        int []numerosRandom;
        numerosRandom=new int[10];
        int []numerosInversos;
        numerosInversos=new int[10];
        int contador=10;
        
        for (int i = 0; i < 10; i++) {
            numerosRandom[i]=(int) (Math.random()* 100)+0;
            while(contador>0)
            {
                numerosInversos[contador]=numerosRandom[i];
                contador--;
            }
 
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("posicion: "+i+" = "+numerosInversos[i]);   
        }
    }
    
    /**
     * 78- Cargar Dos Arrays de 10 elementos con números Random del 0 al 100.Crear un nuevo array
        que contenga los valores más altos por cada posición del índice.        
     */
    public static void ejercicioSetentaYOcho()
    {
        int[] numerosR1=new int[10];
        int[] numerosR2=new int[10];
        int[] numerosAltos=new int[10];
        
        //llenamos el primer array
        for (int i = 0; i < 10; i++) {
            numerosR1[i]=(int) (Math.random()*100)+0;
            
        }
        //llenamos el segundo array
        for (int i = 0; i < 10; i++) {
            numerosR2[i]=(int) (Math.random()*100)+0;
            
        }
        //hacemos la condicion
        for (int i = 0; i < 10; i++) {
            if(numerosR1[i]>numerosR2[i])
            {
                numerosAltos[i]=numerosR1[i];
            }else
            {
                numerosAltos[i]=numerosR2[i];
            }
        }
        System.out.println("los numeros altos de cada indice son");
        for (int i = 0; i < 10; i++) {
            System.out.println(numerosAltos[i]);
        }
        
        
    }
    
    /**
     * 79- Cargar un array de 10 elementos con números Random del 0 al 100, y mostrar el valor máximo
        del Array.
     */
    public static void ejercicioSetentaYNueve()
    {
        int []numerosRamdon;
        numerosRamdon=new int[10];
        int maximo=0;
        
         for (int i = 0; i < 10; i++) {
            numerosRamdon[i]=(int) (Math.random()* 100)+0;
        }
        
         for (int i = 0; i < 10; i++) {
            if(maximo<numerosRamdon[i])
            {
                maximo=numerosRamdon[i];
            }
        }
         System.out.println("El mayor del array es: "+maximo);
    }
    
    /**
     * 80- - Cargar un array de 10 elementos con números Random del 0 al 100, y mostrar el valor
    mínimo y máximo del Array.
     */
    public static void ejercicioOchenta()
    {
        int []numerosRamdon;
        numerosRamdon=new int[10];
        int maximo=0;
        int minimo=10;
        
         for (int i = 0; i < 10; i++) {
            numerosRamdon[i]=(int) (Math.random()* 100)+0;
        }
        
         for (int i = 0; i < 10; i++) {
            if(maximo<numerosRamdon[i])
            {
                maximo=numerosRamdon[i];
            }
            if(minimo>numerosRamdon[i])
            {
                minimo=numerosRamdon[i];
            }
        }
         
         System.out.println("El valor maximo es : "+maximo+" y el valor minimo: "+minimo);
    }
    
    /**
     * 81- - Cargar un array de 10 elementos con notas de los alumnos Random del 0 al 10, y mostrar la
        nota más alta y la más baja del curso.
     */
    public static void ejercicioOchentaYUno()
    {
        int []notasRamdon;
        notasRamdon=new int[10];
        int notaMaxima=0;
        int notaMinima=10;
        
         for (int i = 0; i < 10; i++) {
            notasRamdon[i]=(int) (Math.random()* 10)+0;
        }
    
         for (int i = 0; i < 10; i++) {
            if(notaMaxima<notasRamdon[i])
            {
                notaMaxima=notasRamdon[i];
            }
            if(notaMinima>notasRamdon[i])
            {
                notaMinima=notasRamdon[i];
            }
            
             
        }
         
         System.out.println("La nota mas alta del curso es: "+notaMaxima+" y la nota mas baja es: "+notaMinima);
         
    }
    
    /**
     * 82- Cargar un array de 10 elementos con notas de los alumnos Random del 0 al 10, y mostrar el
    promedio de notas.
     */
    public static void ejercicioOchentaYDos()
    {
        int []notasRamdon;
        notasRamdon=new int[10];
        float promedio=0;
        int suma=0;
        
         for (int i = 0; i < 10; i++) {
            notasRamdon[i]=(int) (Math.random()* 10)+0;
            suma=suma+notasRamdon[i];
        }
         promedio=suma/notasRamdon.length;
         
         System.out.println("El promedio es : "+promedio);
         
    }
    /**
     * 83- Cargar un array de 10 elementos con notas de los alumnos Random del 0 al 10, y mostrar La
        cantidad de aprobados y la de desaprobados (nota 4 en adelante esta aprobado).
     */
    public static void ejercicioOchentaYTres()
    {   int []notasRamdon;
        notasRamdon=new int[10];
        int aprobados=0;
        int desaprobados=0;
        
        for (int i = 0; i < 10; i++) {
            notasRamdon[i]=(int) (Math.random()* 10)+0;
            if(notasRamdon[i]>3)
            {
                aprobados++;
            }
            else
            {
                desaprobados++;
            }
        }
        
        System.out.println("La cantidad de aprobados son: "+aprobados+" y los desaprobados son: "+desaprobados);
        
    }
    
    /**
     * 84-Cargar un array de 10 elementos con notas de los alumnos Random del 0 al 10, y mostrar el
        porcentaje de aprobados y desaprobados.

     */
    public static void ejercicioOchentaYCuatro()
    {
        int []notasRamdon;
        notasRamdon=new int[10];
        float aprobados=0;
        float desaprobados=0;
        
        for (int i = 0; i < 10; i++) {
            notasRamdon[i]=(int) (Math.random()* 10)+0;
            if(notasRamdon[i]>3)
            {
                aprobados++;
            }
            else
            {
                desaprobados++;
            }
        }
        
        aprobados=(aprobados*notasRamdon.length);
        desaprobados=(desaprobados*notasRamdon.length);
        
        System.out.println("el porcentaje de aprobados es: "+aprobados+"% y el porcentaje de desaprobados es: "+desaprobados+"%");
        
    }
    
    /**
     * 85-Crear tres Arrays (“PrimerArray”,” SegundoArray” y “Resultadoarray”), los dos primeros
        cargarlos con 20 números Random del -20 al 20 y el “Resultadoarray” que contenga la suma de
        los valores de los índices correspondientes.
     */
    public static void ejercicioOchentaYCinco()
    {
        int []primerArray=new int[20];
        int []segundoArray=new int[20];
        int []resultadoArray=new int[20];
        
        
        for (int i = 0; i < 20; i++) {
            primerArray[i]=(int)(Math.random()*40)-20;
            segundoArray[i]=(int)(Math.random()*40)-20;
            
            resultadoArray[i]=primerArray[i]+segundoArray[i];
            
        }
        
        System.out.println("Los resultados de las sumas es : ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Primer array posicion "+i+" + "+"segundo array posicion "+i+" = "+resultadoArray[i]);
        }
        
    }
    
}
