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



/**
 *
 * @author alumno
 */
public class coneccion {
    
    String jdbc_driver="com.mysql.jdbc.Driver";
    String jdbc_url="jdbc:mysql://localhost:3306/mybd";
    String jdbc_user="root";
    String jdbc_pass="";

    public coneccion() { 
        try {
            Class.forName(jdbc_driver);
            //establecemos la conexion con la base de datos que le indicamos arriba.
            Connection cnn=DriverManager.getConnection(jdbc_url, jdbc_user, jdbc_pass);
            // hacemos una consulta
            PreparedStatement ps =cnn.prepareStatement("select * from peliculas ");
            
            ResultSet rs =ps.executeQuery();
            
            while(rs.next()){
                //le pasamos lo que queremos mostrar
                System.out.println(""+rs.getString("nombre"));
            }
            //cerrar la conexion.
            cnn.close();
        } catch (Exception e) {
            
        }

    }
   
    
}
