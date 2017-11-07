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
public class Usuario {
    //atributos
    public String nombre;
    public String clave;
    
    public void mostrarDatos()
    {   //el this no funciona si es en un metodo statico.
        //el this siempre tiene que ir para poder llamar a un atributo.
        System.out.println("su nombre de usuario es: "+this.nombre+" clave: "+this.clave);
    }
}
