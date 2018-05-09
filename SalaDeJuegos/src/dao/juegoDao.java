/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class juegoDao {
    public ArrayList<String> retornarJuegos(){
        
        ArrayList<String> lista = new ArrayList<String>();
        
        try {
            conexion con= new conexion();
            Connection conn= con.RetornarConeccion();
            
            PreparedStatement ps=conn.prepareStatement("SELECT nombre FROM juego");
            ResultSet rs=ps.executeQuery();
            
            
            while(rs.next()){
                
                lista.add(rs.getString("nombre"));
            }
        } catch (Exception e) {
            System.out.println("HOLA");
        }
        
        return lista;
    }
}
