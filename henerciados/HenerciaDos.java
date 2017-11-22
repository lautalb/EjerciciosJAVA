/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package henerciados;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author alumno
 */
public class HenerciaDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      FacturaA mifactura = new FacturaA(66);
      FacturaB mifacturab = new FacturaB(50);
      Remito miremito = new Remito(20);
      
     
      ArrayList<Documento> listadoDocumentos;
      listadoDocumentos= new ArrayList<>();
      //agrego una factura A
      listadoDocumentos.add(mifactura);
      //agrego una factura B
      listadoDocumentos.add(mifacturab);
      //agrego un remito
      listadoDocumentos.add(miremito);
      
      for (Documento alguno : listadoDocumentos) {
            alguno.MostrarDatosCompletos();
        }
      
        
        
        ArrayList<Persona> listadoPersonas;
        listadoPersonas= new ArrayList<Persona>();
        
        AlumnoEgresado unAluEg= new AlumnoEgresado();
        listadoPersonas.add(unAluEg);
        
        Alumno unAlumno = new Alumno();
        listadoPersonas.add(unAlumno);
        
        Persona unaPersona= new Persona();
        listadoPersonas.add(unaPersona);
        //tres clases de polimorfismo
    //forma facil de recorrer el arraylist, 
        for (int i = 0; i < listadoPersonas.size(); i++) {
           listadoPersonas.get(i).MostrarLosDatos();
        }
        //forma mucho mas facil, el mejor
        for (Persona alguno : listadoPersonas) {
            alguno.MostrarLosDatos();
        }
        //forma un poco complicada
        Iterator<Persona> iterador=listadoPersonas.iterator();
        while (iterador.hasNext())
        {
           Persona  nueva = iterador.next();
           nueva.MostrarLosDatos();
        }
        
        
        //System.out.println("Listado: "+listadoPersonas);
        
        
        
        
        
        
        //de string
        ArrayList<String> ListadoPalabras;
        ListadoPalabras=new ArrayList<>();
        
        ListadoPalabras.add("primera");
        ListadoPalabras.add("segunda");
        ListadoPalabras.add("tercera");
        
        System.out.println("Listado: "+ListadoPalabras);
    }
    
}
