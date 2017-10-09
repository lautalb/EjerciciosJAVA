/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocuarentaycinco;

import java.util.Scanner;

/**
 *
 * @author Lautalb
 */
public class EjercicioCuarentaYCinco {

    /**
     * @param args the command line arguments
     * 45- Pedir edad a un grupo de personas e informar cuando niño, adolescentes y adultos hay en el
    grupo, además de informar el promedio de edad.
     */
    public static void main(String[] args) {
       //declaramos variables e importamos y creamos scanner
        Scanner miscan= new Scanner(System.in);
        String datoAux;
        Integer personas;
        Integer edad;
        Integer niños=0;
        Integer adolecentes=0;
        Integer adultos=0;
        Integer promedio;
        Integer contador=0;
        Integer contadorDeEdad=0;
        
        
        //mostramos mensaje y pedimos datos
        System.out.println("Ingrese cantidad del grupo: ");
        datoAux=miscan.next();
        personas=Integer.parseInt(datoAux);
        //iteramos mientras contador sea menor al numero de personas ingresadas
        while(contador<personas)
        {   //aumentamos el contador de a 1
            contador++;
            //pedimos datos
            System.out.println("Ingrese la edad de la persona numero: "+personas);
            datoAux=miscan.next();
            edad=Integer.parseInt(datoAux);
            //sumamos las edades 
            contadorDeEdad=contadorDeEdad+edad;
            
            //si es mayor a 17 entra aca
            if (edad>17)
            {   //se suma los adultos si es mayor a 17
                adultos++;
            }else
            {
            //son menores a 18
                if(edad<13)
                {   //se suman los niños
                    niños++;
                }else
                {   //aca entre 13 y 17
                    adolecentes++;
                }
        
            }
            
        }
        //hacemos el promedio de edad
        promedio=contadorDeEdad/personas;
        //mostramos la cantidad de adultos, niños y adolecentes y el promedio.
        System.out.println("La cantidad de adultos es: "+adultos+" la cantidad de adolecentes: "+adolecentes+" la cantidad de niños: "+niños+" el promedio de edad: "+promedio);
        
    }
    
}
