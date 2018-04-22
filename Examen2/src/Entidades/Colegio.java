/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author lauta
 */
public class Colegio {
    private List<Curso> cursos;
    
    public Colegio(){
        this.cursos=new ArrayList<Curso>();
    }
    
    
   
    
    public int obtenerCantidadEstudiantes(Curso c)
    {   int cantidad=0;
        for (Curso curso : cursos){
            if (curso.getNombreCurso().equalsIgnoreCase(c.getNombreCurso())){
                cantidad=curso.cantidadInscriptos();
            }
        }
       
        return cantidad;
    }
    
    public int obtenerAprobados(Curso c)
    {   int cantidad= 0;
        for (Curso curso : cursos){
            if (curso.getNombreCurso().equalsIgnoreCase(c.getNombreCurso())){
                cantidad=curso.verificarAprobados();
            }
        }
        
        return cantidad;
        
    }
    
    
    
    public void agregarCurso(Curso c)
    {
        this.cursos.add(c);
    }
}
