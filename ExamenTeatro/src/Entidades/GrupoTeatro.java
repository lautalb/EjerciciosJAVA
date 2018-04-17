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
public class GrupoTeatro {

    private List<Actor> actores;
    private int cantidadObras;
    private float honorariosAcumulados;

    public GrupoTeatro() {
        actores = new ArrayList<Actor>();
        this.cantidadObras = 0;
        this.honorariosAcumulados = 0;
    }

    public void addActor(String nombreActor, String especialidad, float honorario, int experiencia) {
        Actor actor = new Actor(nombreActor, especialidad, honorario);
        actor.setExperiencia(experiencia);
        this.actores.add(actor);
    }

    public void agendarOBra(Actor actor) {
        for (Actor miActor : actores) {
            if (miActor.getNombreActor().equalsIgnoreCase(actor.getNombreActor())) {
                this.cantidadObras++;
                this.honorariosAcumulados = this.honorariosAcumulados + actor.getHonorario();
            }
        }

    }
    
    public int obtenerCantidadEspecialidad(String especialidad)
    {   int contador=0;
        for (Actor actore : actores) {
            if(actore.getEspecialidad().equalsIgnoreCase(especialidad)){
                contador++;
            }
        }
        return contador;
    }

}
