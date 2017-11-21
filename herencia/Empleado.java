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
 class Empleado extends Persona{ //hereda todo lo de la clase persona
   protected ePuesto Puesto;
   protected double Sueldo;
   
   public Empleado(int edad, String nombre, double sueldo, ePuesto puesto)
    {   
       super(edad, nombre);//para llamar al constructor heredado y llenarlo.
       this.Sueldo=sueldo;
       this.Puesto=puesto;
        
    }
   
   public String MostrarDatos()
   {
       StringBuilder cadena= new StringBuilder();
       cadena.append(super.MostrarDatos());
       cadena.append("Sueldo: "+this.Sueldo+"\n");
       cadena.append("Puesto: "+this.Puesto);
       
       return cadena.toString();
   }
   
   
}

