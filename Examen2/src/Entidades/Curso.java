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
public class Curso {

    private String nombreCurso;
    private int cupo;
    private float notaAprobacion;
    private List<Inscripcion> incripciones;

    public Curso(float nota, int cupo) {
        this.notaAprobacion = nota;
        this.cupo = cupo;
        this.incripciones=new ArrayList<Inscripcion>();
    }

    public void setNombreCurso(String n) {
        this.nombreCurso = n;
    }

    public String getNombreCurso() {
        return this.nombreCurso;
    }
    
    public int cantidadInscriptos()
    {
       int cantidad=0;
       
       cantidad=incripciones.size();
        
       return cantidad;
    }
    
    public void agregarInscripcion(Inscripcion i)
    {
        this.incripciones.add(i);
    }
    
    public int verificarAprobados()
    {   int cantidad=0;
        for(Inscripcion incrip : incripciones){
            if(incrip.getNota()>=this.notaAprobacion){
                cantidad++;
            }
        }
        return cantidad;
    }
    
}
