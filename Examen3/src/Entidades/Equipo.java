/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lauta
 */
public class Equipo {
    private String nombre;
    private List<String> jugadores;
    private int max_jugadores;
    
    public Equipo(String nombre, int jugadores){
        this.nombre=nombre;
        this.max_jugadores=jugadores;
        this.jugadores= new ArrayList<String>();
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    
    public void addJugador(String jugador){
        if(this.jugadores.size()>=this.max_jugadores){
            System.out.println("Equipo lleno");
        }else{
           this.jugadores.add(jugador); 
        } 
    }
    
    public List<String> getJugador()
    {
        return this.jugadores;
    }
    
    public void setMaxJugadores(int max_jugadores){
        this.max_jugadores=max_jugadores;
    }
    
    public int getMaxJugadores()
    {
        return this.max_jugadores;
    }
    
    
}
