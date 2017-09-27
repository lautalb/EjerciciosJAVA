/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteracionwhile;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class IteracionWhile {

    /**
     * @param args the command line arguments
     * 
     * ejercicios:
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner miscan = new Scanner(System.in);
        String clave;
    
        
        System.out.println("ingrese clave");
        clave="1234";//miscan.next();
        //para validacion siempre.
        /*
        while(!clave.equals("1234"))
        {
            System.out.println("error Reingrese clave");
            clave=miscan.next();
        }
        
        System.out.println("bienvenido");
        */
        
        Integer miContador=0;
        
        while(miContador<3)
        {
            miContador=miContador+1;
            System.out.println("Contando");
        }
        System.out.println("termine");
        
        
    }
    
}
