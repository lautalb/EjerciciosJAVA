/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package local;

import java.util.Date;

/**
 *
 * @author alumno
 */
public class ArticuloComestible extends Articulo{
    
    private String FechaVencimiento;
    
    public ArticuloComestible(int codigoDeBarra,String nombreDeArticulo,float PrecioCosto, int Stock,String fechaVencimiento)
    {   super(codigoDeBarra, nombreDeArticulo, PrecioCosto, Stock);
        this.FechaVencimiento=fechaVencimiento;  
    }
}