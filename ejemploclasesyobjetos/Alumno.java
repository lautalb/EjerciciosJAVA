/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploclasesyobjetos;

/**
 *
 * @author alumno
 */

public class Alumno {
    //nombre, apellido, correo, sexo, fechade nacimiento, localidad, direccion, legajo y dni
    //crear estos atributos y generar 10 objetos ALUMNOS
    public String nombre; //>3 letras o "nn"
    public String apellido; //>3 letras o "nn"
    public String correo; //>8 letras o "nn"
    public String sexo; //f o m o"esta mal"
    public String fechaDeNacimiento;
    public String localidad;//>4 letras o "mal localidad"
    public String direccion;//>8 letras o "Direccion"
    public int legajo; //de 6 caracteres o"mal"
    public int dni; //= 8 caracteres.
    //para la salida todos los textos en mayuscula.
    
    private String _nombre;
    private String _apellido;
    
    public void setDatos(String unNombre)
    {   
        this._nombre="un nombre";
        this._apellido="un apellido";
        
    }
    
    public void mostrarDatos()
    {
        System.out.println("su nombre: "+this.nombre.toUpperCase());
       
        
        //2da version
        //llamar al metodo estatico.
       //Alumno.MostrarDatos(this);
        
    }
    
    public void dameDatos(String nombre)
    {
        if(nombre.length()<3)
        {
             this.nombre="nn";
        }else
        {
         this.nombre=nombre;
        }
    
       
    }
    
}
