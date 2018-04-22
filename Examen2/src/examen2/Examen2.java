/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

import Entidades.Alumno;
import Entidades.Colegio;
import Entidades.Curso;
import Entidades.Inscripcion;

/**
 *
 * @author lauta
 */
public class Examen2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno alumno1= new Alumno(32, "Santiago", "Rodriguez", 20);
        Alumno alumno2= new Alumno(20, "Raul", "Casimiro", 22);
        
        Inscripcion in1= new Inscripcion();
        Inscripcion in2= new Inscripcion();
        
        
        // instanciamos un curso que se aprueba con 6 y tiene una cantidad de 20 alumnos maximo
        Curso curso1 = new Curso(6, 20);
        Curso  curso2 = new Curso(7, 20);
        //le seteamos el nombre al curso 1
        curso1.setNombreCurso("Armada");
        
        //hacemos la inscripcion del primer alumno en el curso 1
        in1.setAlumno(alumno1);
        in1.setCurso(curso1);
        in1.setNota(6);
        
        //hacemos la inscripcion del alumno 2 en el curso 1
        in2.setAlumno(alumno2);
        in2.setCurso(curso1);
        in2.setNota(6);
        
        //agregamos las incripciones al curso 1
        curso1.agregarInscripcion(in1);
        curso1.agregarInscripcion(in2);
        
        //instanciamos un colegio y le agregamos el curso 1
        Colegio colegio = new Colegio();
        colegio.agregarCurso(curso1);
        //mostramos la cantidad de alumnos
        System.out.println("Cantidad de alumnos en el curso: "+colegio.obtenerCantidadEstudiantes(curso1));
        
        //mostramos los alumnos aprobados en el curso 1
        System.out.println("Aprobados: "+colegio.obtenerAprobados(curso1));
        
        
        
        
        
        
    }
    
}
