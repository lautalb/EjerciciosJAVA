/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.pelicula;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumno
 */
public class peliculasDao {
    
    public List<pelicula> retornarPeliculas()
    {
        
        List<pelicula> listado= new  ArrayList<>();
        try {
            miConexion con= new miConexion();            
            Connection conn = con.RetornarConeccion();
            //Connection conn =miConexion..RetornarConeccion();
            PreparedStatement ps = conn.prepareStatement("select * from peliculas ");         
            ResultSet rs = ps.executeQuery(); // execute o executeUpdate para insert, update, delete
            
            while ( rs.next() ) {
              listado.add(new pelicula(     rs.getString("nombre")));
                
            }
           
        } catch (Exception e) {
            System.out.println(e);
        }
            return listado;
    }
    
     public int guardarPelicula( pelicula unaPeli)
    {
        boolean resultado= false;
        int retorno=0;
        System.out.println("guardando");
        try {
            miConexion con= new miConexion();
            
            Connection conn = con.RetornarConeccion();
           
            PreparedStatement ps = conn.prepareStatement(" INSERT INTO `peliculas` (`nombre`) VALUES( '"+unaPeli.getNombre()+"')");
           // ps.setString(1,unaPeli.getNombre());
            
            retorno  = ps.executeUpdate(); //  executeQuery  execute o executeUpdate para insert, update, delete
                    System.out.println(resultado);  
        } catch (Exception e) {
            System.out.println(e);
        }
        return retorno;
            
    }
}
