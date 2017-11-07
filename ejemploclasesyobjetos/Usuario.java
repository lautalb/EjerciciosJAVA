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
    private String nombre;
    private String clave;
    
    //metodos getters
    public String GetNombre()
    {
       return this.nombre.toUpperCase() ;
       //para devolver le nombre en amyuscula
       
    }
    public String GetClave()
    {
       return this.clave ;
    }
    
    
    
    
    //metodos setters
    //public void SetNombre(String dato)
    public void DameNombre(String dato)
    {
        this.nombre=dato;
    }
    //public void SetClave(String dato)
    public void DameClave(String dato)
    {   if(dato.length()<4)
        {
             this.clave="mal";
        }else
        {
         this.clave=dato;
        }
       
    }
    
    public void mostrarDatos()
    {   //el this no funciona si es en un metodo statico.
        //el this siempre tiene que ir para poder llamar a un atributo.
        System.out.println("usuario es: "+this.GetNombre()+" clave: "+this.clave);
    }
    
    
}
