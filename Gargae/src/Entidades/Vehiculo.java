/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Dao.VehiculoDao;
import java.util.List;

/**
 *
 * @author alumno
 */
public class Vehiculo {
    private String _patente;
    
    public Vehiculo(String patente)
    {
        this._patente=patente;
    }
    
    public void setPatente(String patente)
    {
        this._patente=patente;
    }
    
    public String getPatente()
    {
        return this._patente;
    }
    
    public static List<Vehiculo> RetornarVehiculos(){
        VehiculoDao vehiculoDao=new VehiculoDao();
        return vehiculoDao.retornarVehiculo();
    }
    
    public int guardarVehiculo(){
        VehiculoDao vehiculoDao=new VehiculoDao();
        return vehiculoDao.guardarVehiculo(this);
    }
    
    
}
