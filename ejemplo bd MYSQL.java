/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.sql.*;


/**
 *
 * @author alumno
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
            String ruta="jdbc:mysql://localhost:3306/estacionamiento";
            PreparedStatement consulta=null;
            Connection coneccion=null;
            ResultSet resultado=null;
            try {
                
             
                coneccion=DriverManager.getConnection(ruta, "root", "");
                consulta= coneccion.prepareStatement("select * from vehiculo");
                resultado= consulta.executeQuery();
                System.out.println(resultado);
                
               while( resultado.next())
               {
                   System.out.println("patente: " + resultado.getString("patente"));
               }
                
                System.out.println("bien");
            } catch (Exception e) {
                System.out.println("error"+e);
            }
            
    }
    
}
