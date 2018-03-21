/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class miConexion {
     
    String jdbc_driver = "com.mysql.jdbc.Driver";
    String jdbc_db_url = "jdbc:mysql://localhost:3306/cine";
    String jdbc_user = "root";
    String jdbc_pass = "";
    private static Connection  UnaConeccion;

    public miConexion() throws ClassNotFoundException {
        
        try {
            Class.forName(jdbc_driver);
             UnaConeccion = DriverManager.getConnection(jdbc_db_url, jdbc_user, jdbc_pass);
            
          
           // conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(miConexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public  Connection RetornarConeccion ()
    {
        
        return UnaConeccion;
    }
    
    
}
