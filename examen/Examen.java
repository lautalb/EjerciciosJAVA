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
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer opcion;
        Scanner miscan= new Scanner(System.in);
        String datoAux;
        
        System.out.println("Que ejercicio quiere probar del 1 al 34?");
        datoAux=miscan.next();
        opcion=Integer.parseInt(datoAux);
     
        
        /*llama al metodo hacer ejercicio 1
        GuiaInicial.hacerEjercicio1();
        llama al metodo hacer ejercicio 2, son como procedimientos y funciones.
        GuiaInicial.hacerEjercicio2();
        */
        switch (opcion)
        {
            /*
            case 1 :
                GuiaInicial.hacerEjercicio1();
                break;
            */
            
            case 2 :
                GuiaInicial.hacerEjercicio2();
                break;
            
            case 4 :
                GuiaInicial.hacerEjercicio4();
                break;    
           
            case 6:
                GuiaInicial.hacerEjercicio6();
                break;
                
            case 8:
                GuiaInicial.hacerEjercicio8();
                break;   
                
            case 10:
                GuiaInicial.hacerEjercicio10();
                break;      
                
            case 12:
                GuiaInicial.hacerEjercicio12();
                break; 
                
            case 13 :
                GuiaIF.HacerEjercicio13();
                break;
            
            case 15 :
                GuiaIF.HacerEjercicio15();
                break;    
           
            case 17:
                GuiaIF.HacerEjercicio17();
                break;
                
            case 19:
                GuiaIF.HacerEjercicio19();
                break;   
            
            case 28:
                GuiaSwitch.HacerEjercicio28();
                break;
                
            case 29:
                GuiaSwitch.HacerEjercicio29();
                break;   
                
            case 30:
                GuiaSwitch.HacerEjercicio30();
                break;
                
            case 31:
                GuiaSwitch.HacerEjercicio31();
                break;
                
            case 32:
                GuiaSwitch.HacerEjercicio32();
                break;
            
            case 33:
                GuiaSwitch.HacerEjercicio33();
                break;
            
            case 34:
                GuiaSwitch.HacerEjercicio34();
                break;
                
        }

        
        

        
    }
    
}