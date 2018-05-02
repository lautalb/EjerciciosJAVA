/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Enumerados.TipoDeResultado;

/**
 *
 * @author alumno
 */
public class Jugadas {
    private Jugador jugador;
    private Juego juego;
    private TipoDeResultado resultado;
    
    public Jugadas(Jugador jugador, Juego juego, TipoDeResultado res){
        this.jugador=jugador;
        this.juego=juego;
        this.resultado=res;
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

    @Override
    public String toString() {
        return "Jugadas{" + "jugador=" + jugador + ", juego=" + juego + ", resultado=" + resultado + '}';
    }
    
    
    
    
}
