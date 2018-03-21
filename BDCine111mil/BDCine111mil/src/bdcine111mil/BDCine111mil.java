/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdcine111mil;

import dao.miConexion;
import dao.peliculasDao;
import entidades.pelicula;

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
       pelicula UnaPeli = new pelicula();
       UnaPeli.setNombre("terminator");
       // todos
       
      if( UnaPeli.guardarPelicula())
      {
          System.out.println("exito");
      }else
      {
          System.out.println("mmmmm");
      }
       
       peliculasDao peli= new peliculasDao();
       peli.mostrarPeliculas();
  
    }
    
}
