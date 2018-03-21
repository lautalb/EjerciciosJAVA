/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class miConeccion {
    
    
    String jdbc_driver="com.mysql.jdbc.Driver";
    String jdbc_url="jdbc:mysql://localhost:3306/mybd";
    String jdbc_user="root";
    String jdbc_pass="";
    
    public static Connection unaConeccion;

    public miConeccion() throws ClassNotFoundException { 
        
        try {
            Class.forName(jdbc_driver);
            //establecemos la conexion con la base de datos que le indicamos arriba.
            unaConeccion=DriverManager.getConnection(jdbc_url, jdbc_user, jdbc_pass);
            // hacemos una consulta
            
            //cerrar la conexion.
            //unaConeccion.close();
        } catch (SQLException ex) {
            Logger.getLogger(miConeccion.class.getName()).log(Level.SEVERE, null, ex);
            
        }

    }
    
    public Connection devolverConnecion()
    {
        return unaConeccion;
    }
}
