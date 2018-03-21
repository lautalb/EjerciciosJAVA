/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdcine111mil;

import dao.miConexion;
import dao.peliculasDao;
import entidades.pelicula;
import java.util.List;

/**
 *
 * @author alumno
 */
public class BDCine111mil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("hola");
       pelicula UnaPeli = new pelicula("titulo nuevo");
       //UnaPeli.setNombre("terminator");
       // todos
       
      if( UnaPeli.guardarPelicula()==0)
      {
          System.out.println("mmmm");
      }else
      {
          System.out.println("exito");
      }
       
       
       List<pelicula> listado= pelicula.retornarPeliculas();
       
  
    }
    
}
