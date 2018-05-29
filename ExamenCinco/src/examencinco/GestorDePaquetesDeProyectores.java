/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examencinco;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumno
 */
public class GestorDePaquetesDeProyectores {

    private List<PaqueteProyectores> paquetes;
    private String nombreEmpresa;

    public GestorDePaquetesDeProyectores(String nombre) {
        this.nombreEmpresa = nombre;
        this.paquetes = new ArrayList<PaqueteProyectores>();
    }

    public String getNombreEmpresa() {
        return this.nombreEmpresa;
    }

    public void setNombreEmpresa(String nombre) {
        this.nombreEmpresa = nombre;
    }

    public void agregarPaquete(PaqueteProyectores paqueteNuevo) {
        this.paquetes.add(paqueteNuevo);
    }

    public PaqueteProyectores buscarPaqueteDeProyectores(int codPaquete) {

        for (int i = 0; i < this.paquetes.size(); i++) {
            if (this.paquetes.get(i).getCodPaquete() == codPaquete) {
                return this.paquetes.get(i);
            }
        }

        return null;
        
        /*
        PaqueteProyectores paquetePro= null;
            for(PaqueteProyectores paquete: this.paquetes){
                if(paquete.getCodPaquete == codPaquete){
                    paquetePro=paquete;
                    break;    
                }
            }
        return paquetePro    
        */
        
        
    }
    //Respuesta es la b. Calcula la cantidad de paquetes de proytectores en transito
    public int calcularCantidadDePaquetesEnTransito(){
        int cant = 0;
        for(PaqueteProyectores paq : paquetes){
            if(paq.getEnTransito()){
                cant = cant+1;
            }
        }
        return cant;
    }
    
    //Ejercicio 4 V y F
    /*
        A)Falso
        B)Verdadero
        C)Falso
        D)Falso
        E)Verdadero
        F)Verdadero
        G)Falso
    */
    
    //Ejercicio 5 Consulta MySQL
    /*
        SELECT p.codPaquete, p.destino, p.costoEnvio, p.destinatario, g.nombreEmpresa
        FROM PaquetesProyectores as p
        INNER JOIN GestorDePaquetesDeProyectores as g on g.idGestorDePaquetes=p.GestorDePaquetesDeProyectores_idGestorDePaquetes
        WHERE p.destinatario like "Tucumàn" 
        and p.costoEnvio>300
    */

}
