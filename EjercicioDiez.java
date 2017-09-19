/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.diez;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioDiez {

    /**
     * @param args the command line arguments
     * Se ingresa la cantidad de ganadores de la loteria nacional y el monto total  del premio,
     * informar cuanto dinero le corresponde a cada uno.
     * 
     */
    public static void main(String[] args) {
        //se crean las variables y se importa y crea el scanner.
        String datoAux;
        Integer ganadores;
        Double monto;
        Double total;
        Scanner miscan= new Scanner(System.in);
         
        //se muestra el mensaje, se guarda y convierte el dato.
        System.out.println("Ingrese la cantidad de ganadores: ");
        datoAux = miscan.next();
        ganadores = Integer.parseInt(datoAux);
        
        //se muestra el mensaje, se guarda y convierte.
        System.out.println("Ingrese el monto total del premio: ");
        datoAux = miscan.next();
        monto=Double.parseDouble(datoAux);
        
        //se calcula cuanto va a ganar cada ganador.
        total = monto/ganadores;
        
        //se muestra cuanto va a ganar cada ganador.
        System.out.println("A cada ganador le pertenece: "+total+"$.");
    }
    
}
