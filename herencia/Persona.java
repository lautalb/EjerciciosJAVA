/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author alumno
 */
public class Persona {
    protected String nombre;
    protected int edad;
    
    public Persona(int edad, String nombre)
    {
        this.edad=edad;
        this.nombre=nombre;
    }
    
    public String MostrarDatos()
    {   
        StringBuilder cadena = new StringBuilder();
        cadena.append("Nombre: "+this.nombre + "\n");
        cadena.append("Edad: "+this.edad+"\n");
        return cadena.toString();
    }
            
            
}
