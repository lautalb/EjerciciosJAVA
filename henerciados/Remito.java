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
public class Remito extends Documento {
  private Date _fechaEnt;
  
  public Remito(int numero)
    {   
        super(numero);
        
    }
  public void MostrarDatosCompletos()
  {
      super.MostrarDatosCompletos();
      System.out.println("Fecha Ent: "+this._fechaEnt);
  }
}
