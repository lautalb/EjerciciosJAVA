/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static dao.miConeccion.unaConeccion;
import entidades.pelicula;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author alumno
 */
public class peliculasDao {
    
    public void mostrarPeliculas()  {
        
        try {
            miConeccion con=new miConeccion();
        
            Connection conn=con.devolverConnecion();
        
        
            PreparedStatement ps =unaConeccion.prepareStatement("select * from peliculas ");
            
            ResultSet rs =ps.executeQuery();
            
            while(rs.next()){
                //le pasamos lo que queremos mostrar
                System.out.println(""+rs.getString("nombre"));
            }
        } catch (Exception e) {
            
        }
        
    }
    
    public boolean guardarPelicula (pelicula peli)
    {   boolean resultado=false;
        
        try {
            miConeccion con=new miConeccion();
        
            Connection conn=con.devolverConnecion();
            PreparedStatement ps = conn.prepareStatement(" INSERT INTO `peliculas` (`nombre`) VALUES( '"+peli.getNombre()+"')");
            
            resultado=ps.execute();//execute o executeUpdate para insert, update, delete
            
        } catch (Exception e) {
        }
    
        return resultado;
    }
    
    
    
}
