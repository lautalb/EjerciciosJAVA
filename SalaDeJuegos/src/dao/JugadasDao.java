/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Entidades.Juego;
import Entidades.Jugadas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author lauta
 */
public class JugadasDao {

    public ArrayList<Object> listarJugadas(){
        
        ArrayList<Object> lista = new ArrayList<Object>();
        
        try {
            conexion con= new conexion();
            Connection conn= con.RetornarConeccion();
            
            PreparedStatement ps=conn.prepareStatement("SELECT * FROM JUGADAS");
            ResultSet rs=ps.executeQuery();
            
            
            while(rs.next()){
                lista.add(new Object[] {rs.getInt("idJugadas"),rs.getInt("Jugador_idJugador"),rs.getInt("Juego_idJuego"),rs.getString("resultado ")});
            }
        } catch (Exception e) {
            System.out.println("HOLA");
        }
        
        return lista;
    }
}
