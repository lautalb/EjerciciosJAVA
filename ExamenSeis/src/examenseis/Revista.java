/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenseis;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lautalb
 */
public class Revista {

    private List<Articulo> elementos;
    private String titulo;
    private int ejemplar;

    public Revista(String titulo, int ejemplar) {
        this.titulo = titulo;
        this.ejemplar = ejemplar;
        this.elementos = new ArrayList<Articulo>();
    }

    public boolean addElemento(Articulo articulo) {
        return elementos.add(articulo);
    }

    public Articulo getArticuloEnPosicion(int posicion) {
        Articulo art = null;

        if (posicion > this.elementos.size() || posicion < 0) {
            art = null;
        } else {
            for (int i = 0; i < this.elementos.size(); i++) {
                if (posicion == i) {
                    art = this.elementos.get(i);
                }
            }
        }

        return art;
    }

    public int getCantidadArticulosDeTema(String tema) {
        int respuesta = 0;

        for (Articulo a : this.elementos) {
            for (int i = 0; i < a.getTemas().size(); i++) {
                if (a.getTemas().get(i).equalsIgnoreCase(tema)) {
                    respuesta++;
                }
            }
        }

        return respuesta;
    }

}
