/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package henerciados;

import java.util.Date;

/**
 *
 * @author alumno
 */
public class AlumnoEgresado extends Alumno{
    private Date _fechaEgreso;
    private float _promedio;
    
    public void MostrarLosDatos()
    {
        super.MostrarLosDatos();
        System.out.println("Fecha de Egreso: "+this._fechaEgreso);
        System.out.println("Promedio: "+this._promedio);
    }
}
