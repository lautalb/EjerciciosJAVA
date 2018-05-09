/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import dao.jugadorDao;
import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class Jugador {
    private int id;
    private String nombre;
    private String alias;
    
    public Jugador(int id, String nombre, String alias){
        this.id=id;
        this.nombre=nombre;
        this.alias=alias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
    
    public void mostrar(){
        System.out.println("id: "+this.id);
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Alias: "+this.alias);
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", alias=" + alias + '}';
    }
    
    public static ArrayList<String> retornarJugador(){
        jugadorDao playerDao= new jugadorDao();
        return playerDao.retornarJugador();    
    }
    
    
}
