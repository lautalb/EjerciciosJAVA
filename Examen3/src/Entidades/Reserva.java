/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author lauta
 */
public class Reserva {

    private String fechaReserva;
    private Equipo equipo1;
    private Equipo equipo2;

    public Reserva(String fecha, Equipo equipo1, Equipo equipo2) {
        this.fechaReserva = fecha;
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
    }

    public void setFechaReserva(String fecha) {
        this.fechaReserva = fecha;
    }

    public Equipo getEquipo1() {
        return this.equipo1;
    }

    public void setEquipo1(Equipo e1) {
        this.equipo1 = e1;
    }

    public Equipo getEquipo2() {
        return this.equipo2;
    }

    public void setEquipo2(Equipo e2) {
        this.equipo2 = e2;
    }
    
    public boolean hayJugadoresRepetidos(Equipo e1, Equipo e2){
       
        
        for(int i=0; i<e1.getMaxJugadores(); i++){
            if(e1.getJugador().get(i).equalsIgnoreCase(e2.getJugador().get(i))){
                return true;
            }
        }
        
        return false;
    }

}
