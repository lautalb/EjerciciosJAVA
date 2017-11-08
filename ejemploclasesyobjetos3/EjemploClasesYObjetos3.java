/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploclasesyobjetos3;

/**
 *necesito una lapicera con 2 colores. rojo y azul
 * cada una tiene una cantidad de 100
 * el metodo escribir recibe el color y la cantidad de tinta a utilizar, 
 * de no tener cantidad suficiente se muestra un mensaje.
 * el metodo cargar tinta recibe el color y la cantidad para cargar
 * @author alumno
 */
public class EjemploClasesYObjetos3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Lapicera lapicera=new Lapicera();
        
        
        lapicera.escribir("azul", 80);
        lapicera.cargarTinta("azul", 150);
        
    }
    
}
