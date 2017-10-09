/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocuarentaytres;

import java.util.Scanner;

/**
 *
 * @author Lautalb
 */
public class EjercicioCuarentaYTres {

    /**
     * @param args the command line arguments
     * 43- Se piden los nombres de los alumnos, informar cuantas marías y cuantos José hay en el curso,
        además de cuantos alumnos hay.

     */
    public static void main(String[] args) {
        //creamos e importamos el scanner, creamos variables
       Scanner miscan = new Scanner(System.in);
        String datoAux;
        Integer alumnos;
        String nombre;
        Integer marias=0;
        Integer jose=0;
        Integer contador=0;
        
        //mostramos mensaje y pedimos datos
        System.out.println("Ingrese la cantidad de alumnos");
        datoAux=miscan.next();
        alumnos=Integer.parseInt(datoAux);
        
        //iteramos
        while(contador<alumnos)
        {   //sumamos al contador
            contador++;
            
            //mostramos mensaje y pedimos datos
            System.out.println("Ingrese el nombre del alumno: "+contador);
            nombre=miscan.next();
            
            if(nombre.equals("maria"))
            {   //si el nombre es maria se suma 1
                marias++;
            }else
            {
                if(nombre.equals("jose"))
                {   //si el nombre es jose se suma 1
                    jose++;
                }
            }
        }
        //mostramos la cantidad de alumnos y la cantidad de jose y marias.
        System.out.println("la cantidad de alumnos es: "+alumnos+" la cantidad de Jose: "+jose+" la cantidad de Marias: "+marias);
    }
    
}
