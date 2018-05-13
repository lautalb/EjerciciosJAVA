/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Enumerados.TipoDeResultado;
import dao.JugadasDao;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class Jugadas {
    private int id;
    private Jugador jugador;
    private Juego juego;
    private TipoDeResultado resultado;
    
    public Jugadas(){
        
    }
    public Jugadas(int id, Jugador jugador, Juego juego, TipoDeResultado res){
        this.jugador=jugador;
        this.juego=juego;
        this.resultado=res;
        this.id=id;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Juego getJuego() {
        return juego;
    }

    public void setJuego(Juego juego) {
        this.juego = juego;
    }

    public TipoDeResultado getResultado() {
        return resultado;
    }

    public void setResultado(TipoDeResultado resultado) {
        this.resultado = resultado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    @Override
    public String toString() {
        return "Jugadas{" + "jugador=" + jugador + ", juego=" + juego + ", resultado=" + resultado + '}';
    }
    
    public static ArrayList<Object> listarJugadas(){
        JugadasDao jugadas= new JugadasDao();
        return jugadas.listarJugadas();
    }
    
    
    
    
}
