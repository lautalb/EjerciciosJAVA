/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Enumerados.TipoDeJuego;
import dao.juegoDao;
import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class Juego {

    private int id;
    private String nombre;
    private TipoDeJuego tipo;

    public Juego(int id, String nombre, TipoDeJuego tipo) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoDeJuego getTipo() {
        return tipo;
    }

    public void setTipo(TipoDeJuego tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Juego{" + "id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + '}';
    }

    public static ArrayList<String> retornarListaJuegos() {
        juegoDao gameDao = new juegoDao();
        return gameDao.retornarJuegos();
    }

}
