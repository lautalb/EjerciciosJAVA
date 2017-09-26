/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchdos;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class SwitchDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner miscan = new Scanner(System.in);
        Integer MesDelAño;
        String datoAux;
        
        datoAux= miscan.next();
        MesDelAño=Integer.parseInt(datoAux);
        
        switch (MesDelAño)
        {
            case 1 :
       
             //mostramos el mensaje
             System.out.println(" es verano ");
             break;
        
        
        
        
        }
        
    }
    
}
