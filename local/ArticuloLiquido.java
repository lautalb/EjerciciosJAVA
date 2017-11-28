/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package local;

/**
 *
 * @author alumno
 */
public class ArticuloLiquido extends Articulo{
    private float _litros;
   public ArticuloLiquido(int codigoDeBarra,String nombreDeArticulo,float PrecioCosto, int Stock, float litros)
   {    
       super(codigoDeBarra, nombreDeArticulo, PrecioCosto, Stock);
       this._litros=litros;
   }
}
