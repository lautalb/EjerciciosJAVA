/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class Conexion {
    String jdbc_driver = "com.mysql.jdbc.Driver";
    String jdbc_db_url = "jdbc:mysql://localhost:3306/";
    String baseDeDatos="Garage";
    String jdbc_user = "root";
    String jdbc_pass = "";
    private static Connection  UnaConeccion;
    
    public Conexion() throws ClassNotFoundException {
        
        try {
            Class.forName(jdbc_driver);
             UnaConeccion = (Connection) DriverManager.getConnection(jdbc_db_url+this.baseDeDatos, jdbc_user, jdbc_pass);
            
          
           // conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public  static Connection RetornarConeccion ()
    {   Conexion conec;
        try {
            
            if(UnaConeccion==null || UnaConeccion.isClosed())
            {
                try {
                     conec = new Conexion();
                } catch (Exception e) {
                }
            }
        } catch (Exception e) {
            System.out.println("error"+e);
        }
        
        return UnaConeccion;
    }
    
}
