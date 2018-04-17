/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author lauta
 */
public class Actor {
    private String nombreActor;
    private String especialidad;
    private float honorario;
    private int experiencia;
    
    public Actor(String nombreActor, String especialidad, float honorario)
    {
        this.nombreActor=nombreActor;
        this.especialidad=especialidad;
        this.honorario=honorario;
        
    }
    
    public void setExperiencia(int experiencia)
    {
        this.experiencia=experiencia;
    }
    
    public float getExperiencia()
    {
        return this.experiencia;
    }
    
    public String getEspecialidad()
    {
        return this.especialidad;
    }
    
    public String getNombreActor()
    {
        return this.nombreActor;
    }
    
    public float getHonorario()
    {
        return this.honorario;
    }
    
    
}
