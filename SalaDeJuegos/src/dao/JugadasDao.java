/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Entidades.Juego;
import Entidades.Jugadas;
import Enumerados.TipoDeResultado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author lauta
 */
public class JugadasDao {

    public ArrayList<Jugadas> listarJugadas() {

        ArrayList<Jugadas> lista = new ArrayList<Jugadas>();
        Jugadas jugada;

        try {
            conexion con = new conexion();
            Connection conn = con.RetornarConeccion();

            PreparedStatement ps = conn.prepareStatement("SELECT * FROM JUGADAS");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                jugada = new Jugadas();
                jugada.setId(Integer.parseInt(rs.getString("idJugadas")));
                jugada.setJuego(rs.getString("Juego_idJuego"));
                jugada.setJugador(rs.getString("Jugador_idJugador"));
                switch (rs.getString("resultado")) {
                    case "Gano":
                        jugada.setResultado(TipoDeResultado.Gano);
                        break;

                    case "Perdio":
                        jugada.setResultado(TipoDeResultado.Perdio);
                        break;

                    case "Empato":
                        jugada.setResultado(TipoDeResultado.Empato);
                        break;
                }

                lista.add(jugada);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        return lista;
    }
}
