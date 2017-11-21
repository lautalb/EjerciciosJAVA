/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Empleado nuevoEmpleado=new Empleado(25, "Pedro", 20000, ePuesto.Administrativo);
       
        JOptionPane.showMessageDialog(null, nuevoEmpleado.MostrarDatos()); //para mostrar un mensaje
    }
    
}
