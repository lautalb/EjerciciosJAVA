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
public class Escuderia {
    public String pais;
    public String nombre;
    public int AñoFundacion;
    
    public Escuderia(int año, String pais, String nombre)   //los contructores tienen el nombre de la clase.
    {
        this.pais=pais;
        this.nombre=nombre;
        this.AñoFundacion=año;
    }
    
    
}
