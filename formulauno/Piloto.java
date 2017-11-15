/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulauno;

/**
 *
 * @author alumno
 */
public class Piloto {
    private String nombre;
    private String apellido;
    
    public Piloto()
    {
        this.nombre="natalia";
        this.apellido="natalia";
    }
    
    public void SetterNombre(String nombre)
    {
        this.nombre=nombre;
    }
    public void SetterApellido(String apellido)
    {
        this.apellido=apellido;
    }
    
    public String DameNombreCompletoMay()
    {
        String retorno="";
        retorno=this.nombre+" "+this.apellido;
        retorno=retorno.toUpperCase();
        
        return retorno;
    }
    
}