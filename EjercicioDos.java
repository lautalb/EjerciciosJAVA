/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodos;
// se debe importar este scanner para poder asigar a variables algo.
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioDos {

    /**
     * @param args the command line arguments
     * Se debe pedir un nombre y se debe mostrar el mismo nombre.
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        
            //se crea el scanner
            Scanner misca = new Scanner(System.in);
        //se pide el nombre.
        System.out.println("Ingrese un nombre.");
        
        //se asigas a la variable del Tipo string, el dato ingresado arriba. 
        nombre = misca.nextLine();
        //se muestra el nombre ingresado.
        System.out.println("el nombre ingresado es: "+nombre);
        
    }
    
}
