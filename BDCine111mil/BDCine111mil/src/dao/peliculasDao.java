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

/**
 *
 * @author alumno
 */
public class peliculasDao {
    
    public void mostrarPeliculas()
    {
        
        try {
           miConexion con= new miConexion();
            
            Connection conn = con.RetornarConeccion();
            //Connection conn =miConexion..RetornarConeccion();
            PreparedStatement ps = conn.prepareStatement("select * from peliculas where id = ?");
            ps.setInt(1, 1);
            
            ResultSet rs = ps.executeQuery(); // execute o executeUpdate para insert, update, delete
            
            while ( rs.next() ) {
                System.out.println("" + rs.getString("nombre"));
            }
           
        } catch (Exception e) {
            System.out.println(e);
        }
            
    }
    
     public boolean guardarPelicula( pelicula unaPeli)
    {
        boolean resultado= false;
        System.out.println("guardando");
        try {
            miConexion con= new miConexion();
            
            Connection conn = con.RetornarConeccion();
           
            PreparedStatement ps = conn.prepareStatement(" INSERT INTO `peliculas` (`nombre`) VALUES( '"+unaPeli.getNombre()+"')");
           // ps.setString(1,unaPeli.getNombre());
            
            resultado  = ps.execute(); //  executeQuery  execute o executeUpdate para insert, update, delete
                    System.out.println(resultado);  
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
            
    }
}
