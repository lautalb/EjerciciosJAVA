/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen3;

import Entidades.Equipo;
import Entidades.Reserva;
import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;

/**
 *
 * @author lauta
 */
public class Examen3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instanciamos el equipo y le ponems nombre y la cantidad maxima de jugadores
        Equipo nuevoEquipo= new Equipo("Mejoralito", 2);
        Equipo nuevoEquipo2= new Equipo("San fran", 2);
        Reserva reserva = new Reserva("25-04-18", nuevoEquipo, nuevoEquipo2);
        
        //testeamos que el metodo add jugador no sobrepase la cantidad maxima de jugadores
        nuevoEquipo.addJugador("jorgito");
        nuevoEquipo.addJugador("pablito");
        nuevoEquipo.addJugador("juancito");
        nuevoEquipo.addJugador("pedrito");
        nuevoEquipo.addJugador("jorgito");
        
        //agregamos 2 jugadores al equipo 2 y ponemos 1 repetido para verificar el nuevo metodo
        nuevoEquipo2.addJugador("jorgito");
        nuevoEquipo2.addJugador("jona");
        
        
        //mostramos el equipo
        System.out.println(nuevoEquipo.getJugador());
        
        //mostramos si hay jugadores repetidos, true: si hay, false: no hay
        System.out.println(reserva.hayJugadoresRepetidos(nuevoEquipo, nuevoEquipo2));
        
        
    }
    
}
