/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entidades.Vehiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author alumno
 */
public class VehiculoDao {
    public List<Vehiculo> retornarVehiculo()
    {   
        List<Vehiculo> listado=new ArrayList<>();
        
        try {
            Connection conn= Conexion.RetornarConeccion();
            
            PreparedStatement ps=conn.prepareStatement("Select * from Vehiculo");
            ResultSet rs = ps.executeQuery();
            System.out.println("==> Listado");
            
             while ( rs.next() ) {
              listado.add(new Vehiculo(rs.getString("patente")));
                
            }
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        Iterator iter=listado.iterator();
        while(iter.hasNext())
        {
            Vehiculo v=(Vehiculo)iter.next();
            System.out.println(v.getPatente());
        }
        
        return listado; 
    }
    
    public int guardarVehiculo(Vehiculo unVehiculo)
    {
        boolean resultado = false;
        int retorno=0;
        
        System.out.println("Guardando");
        try {
            
            Connection conn= Conexion.RetornarConeccion();
            
             PreparedStatement ps = conn.prepareStatement(" INSERT INTO `vehiculo` (`patente`) VALUES( '"+unVehiculo.getPatente()+"')");
             
             retorno  = ps.executeUpdate();
             System.out.println(resultado);
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return retorno;
    }
}
