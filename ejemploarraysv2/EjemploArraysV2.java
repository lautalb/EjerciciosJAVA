/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarraysv2;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjemploArraysV2 {
    
    public static int cantidad=3;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EjemploArraysV2.CargarDato(cantidad);
        
        //EjemploArraysV2.MostrarNombres(nombres);
        //EjemploArraysV2.MostrarPromedio(notas);
//        int NumeroDelMain=0;
//        NumeroDelMain=EjemploArraysV2.DameUnNumero();
//        EjemploArraysV2.MostrarNumero(NumeroDelMain);

        //EjemploArraysV2.MostarRandom();
        
        
       //declaramos un array del tipo string llamado alumno y harcodeamos nombres.
        String[] alumno={"maria","manuel","diego","estela","martin"};
        //declaramos un array de enteros llamado notas y le harcodeamos notas.
        int[] notas={10,2,5,2,7};
        
        //en el aux asigna el valor que retorna el metodo "retornarCantidadDeAprobados".
        int aux=EjemploArraysV2.retornarCantidadDeAprobados(notas);
        System.out.println("los aprobados son: "+aux);
        //en promedio asigna el valor que retorna el metodo "retornarPromedio".
        int promedio=EjemploArraysV2.retornarPromedio(notas);
        System.out.println("el promedio es: "+promedio);
        String laMejorr=EjemploArraysV2.retornarElNombreDeLaMejorNota(notas, alumno);
        
        System.out.println("la mejor es: "+laMejorr);
    }
    
    public static String retornarElNombreDeLaMejorNota(int[] notas, String[] nombres)
    {   String laMejor="";
        int mejor=0;
        for (int i = 0; i < notas.length-1; i++) {
            if (mejor<notas[i])
            {
                mejor=notas[i];
                
                return laMejor=nombres[i];
            }
            
        }
        
        return laMejor;
    }
    //declaramos un metodo que devuelve un valor. en este caso un entero. Le pasamos un parametro de array del tipo entero.
    public static int retornarPromedio(int[] miparametro)
    {   int promedio=0;
        int suma=0;
        //for de 0 hasta la cantidad del array.
        for (int i = 0; i < miparametro.length; i++) {
            suma=suma+miparametro[i];
        }
        //el promedio es la suma dividido la cantidad del array.
        promedio=suma/miparametro.length;
        return promedio;
    }
    //declaramos un metodo que devuelve un entero, y le pasamos un parametro de array del tipo entero.
    public static int retornarCantidadDeAprobados(int[] miparametro)
    {
        int resultado=0;
        //for de 0 a la cantidad del parametro que le enviamos.
        for (int i = 0; i < miparametro.length ; i++) {
            if(miparametro[i]>3)
            {
                resultado++;
            }
        }
        return resultado;
    }
    
    //retorna algo, un enetero o string.
    public static int  DameUnNumero()
    {
        int numeroRandom=44;
    
        return numeroRandom;
    }
    //recibe un parametro y lo utiliza.
    public static void MostrarNumero(int algo)
    {
    
        System.out.println("numero"+ algo);
    }
    
    
    
    
    
    
    //crea una variable y le asigna el valor del proceso "DameUnNumero" despues se lo envia al otro proceso mostrarNumero como parametro.
    public static void MostarRandom()
    {
        int miRandom= EjemploArraysV2.DameUnNumero();
        EjemploArraysV2.MostrarNumero(miRandom);
        
    }
    
    
    
    
    public static void MostrarPromedio(int[] ListadoDeNumeros)
    {   int suma=0;
        for (int i = 0; i < ListadoDeNumeros.length; i++) {
            suma=suma+ListadoDeNumeros[i];
        }
        float promedio=0;
        promedio=suma/ListadoDeNumeros.length;
        System.out.println("el promedio es: "+promedio);
    }
    
    public static void CargarDato(int cantidad)
    {
        Scanner miscan=new Scanner(System.in);
        //array de nombres
        //array de notas
        //pedir tres notas y tres nombres.
        //motras los dos array
        //saco el promedio
        
        String []nombres=new String [cantidad];
        int []notas=new int[cantidad];
        String datoAux;
        int CantidadDeNotas=notas.length;
        float promedio=0;
        int suma=0;
        int contador=0;
        
        for (int i = 0; i < cantidad; i++) {
            contador=contador+1;
            System.out.println("Ingrese nombre numero: "+contador);
            nombres[i]=miscan.next();
            System.out.println("Ingrese nota numero: "+contador);
            datoAux=miscan.next();
            notas[i]=Integer.parseInt(datoAux);
            
        }
        EjemploArraysV2.MostrarNombres(nombres,notas);
        
        
    }
    //le paso el parametro "nombre" que es un array de string y el mostrar nombres lo muestra
    public static void MostrarNombres(String[] ListadoDePalabras,int[] ListadoDeNotas)
    {   //listadodepalabras.length para hacerlo hasta el largo del listado.
        for (int i = 0; i < ListadoDePalabras.length; i++) {
            System.out.println("Nombre: "+ListadoDePalabras[i]);
            System.out.println("Nota: "+ListadoDeNotas[i]);
        }
    }
    
    public static void CargarDatos() {
        Scanner miscan=new Scanner(System.in);
        //array de nombres
        //array de notas
        //pedir tres notas y tres nombres.
        //motras los dos array
        //saco el promedio
        
        String []nombres=new String [3];
        Integer []notas=new Integer[3];
        String datoAux;
        int CantidadDeNotas=notas.length;
        float promedio=0;
        int suma=0;
        int contador=0;
        
        for (int i = 0; i < 3; i++) {
            contador=contador+1;
            System.out.println("Ingrese nombre numero: "+contador);
            nombres[i]=miscan.next();
            System.out.println("Ingrese nota numero: "+contador);
            datoAux=miscan.next();
            notas[i]=Integer.parseInt(datoAux);
            
        }
        contador=0;
        for (int i = 0; i <3; i++) {
            contador=contador+1;
            System.out.println("Nombre numero: "+contador+" = "+nombres[i]);
            System.out.println("Nota numero: "+contador+" = "+notas[i]);
        }
        
        for (int i = 0; i < 3; i++) {
            suma=suma+notas[i];
        }
        promedio=suma/CantidadDeNotas;
        System.out.println("el promedio es: "+promedio);
        
    }
    
    
    
}
