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
    
    public Escuderia()   //los contructores tienen el nombre de la clase.
    {   
        this.pais="Argentina";
        this.nombre="Ferrari";
        this.AñoFundacion=1997;
    }
    
    public void SetterPais(String pais)
    {
        this.pais=pais;
    }
    
    public void SetterNombre(String nombre)
    {
        this.nombre=nombre;
    }
    
    public void SetterAño(int año)
    {
        this.AñoFundacion=año;
    }
    
    public String NombreEscuderiaPais()
    {   String retorno="";
        retorno=this.nombre+" "+this.pais+" "+this.AñoFundacion;
        
        return retorno;
    }
    
    
    
}