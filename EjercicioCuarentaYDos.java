/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocuarentaydos;

import java.util.Scanner;

/**
 *
 * @author Lautalb
 */
public class EjercicioCuarentaYDos {

    /**
     * @param args the command line arguments
     * 42- De un grupo de vehículos (no se sabe la cantidad) se necesita tomar el color, informar cuantos
        rojo y cuantos azules, además del total de vehículos
     */
    public static void main(String[] args) {
        //declaramos variables e importamos y creamos scanner
        Scanner miscan = new Scanner(System.in);
        String datoAux;
        Integer vehiculos;
        String color;
        Integer rojo=0;
        Integer azul=0;
        String continuar="si";
        Integer contador=0;
        
        
        //iteramos
        while(!continuar.equalsIgnoreCase("no"))
        {   
            contador++;
            
            //mostramos mensaje y pedimos datos
            System.out.println("Ingrese el color del auto numero: "+contador);
            color=miscan.next();
                  
            //creamos la bifurcacion
            if(color.equals("rojo"))
            {   //si es rojo aumenta el contador de color rojo
                rojo++;
                
            }else
            {
                if(color.equals("azul"))
                {   //si es azul aumenta el contador azul
                    azul++;
                }
            }
            
            System.out.println("Hola, desea continuar");
            continuar=miscan.next();
        }
        //mostramos la cantidad de vehiculos y cuantos hay de color rojo y azul.
        System.out.println("La cantidad de vehiculos es: "+contador+" la cantidad de color rojo: "+rojo+" y la cantidad de color azul: "+azul);
    }
    
}
