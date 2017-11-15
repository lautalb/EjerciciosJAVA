/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulauno;

import java.time.Instant;

/**
 *
 * @author alumno
 */
public class Carrera {
    public Auto[] autosParticipates;
    private String fecha;
    private String Pais;
    
    /**
     * 1- no tiene valor de retorno.
     * 2- Se llama igual que la clase.
     * 3- El por defecto , puede estar o no.
     * 4- se ejecuta solamente al crear el objeto.
     * 
     */
    public Carrera() //constructor
    {   
        //para saber la fecha de hoy
       this.fecha=Instant.now().toString();
       this.Pais="Argentina";
       this.autosParticipates = new Auto[20];
       this.CrearAutosTest();
    }
    
    
    private void CrearAutosTest()
    {
        for (int i = 0; i < this.autosParticipates.length; i++) {
            this.autosParticipates[i]=new Auto(i);
        }
    }
    
    public void CorrerCarrera(int CantidadDevueltas)
    {
        for (int vueltas = 0;  vueltas< CantidadDevueltas; vueltas++) {
            for (int j = 0; j < this.autosParticipates.length; j++) {
                
                int random=(int)(Math.random()*100);
                this.autosParticipates[j].AgregarTiempoRecorrido(random);
            }
        }
    }
    
    public Auto DameElGanador()
    {
        Auto retorno=new Auto(0);
        int menorRecorrido=0;
        for (int i = 0; i < this.autosParticipates.length; i++) {
            if(i==0)
            {
                menorRecorrido=this.autosParticipates[i].DameElTiempoRecorrido();
                retorno=this.autosParticipates[i];
            }else
            {
                if(menorRecorrido>this.autosParticipates[i].DameElTiempoRecorrido())
                {
                    menorRecorrido=this.autosParticipates[i].DameElTiempoRecorrido();
                    retorno=this.autosParticipates[i];
                }
            }
            
        }
        return retorno;
    }

}