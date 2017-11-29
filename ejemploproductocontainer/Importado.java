/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploproductocontainer;

/**
 *
 * @author alumno
 */
public class Importado extends Producto{
    private String _pais;
    private float _impuesto;
    
    public Importado(int idP,String nombreP,float precioP,String paisP,float impuestoP)
    {
        super(idP, nombreP, precioP);
        this._pais=paisP;
        this._impuesto=impuestoP;
        
    }
    
    public float GetPrecio()
    {
        float retorno=0;
        retorno=this._precio+this._impuesto;
        return retorno;
    }
    
    @Override
    public void MostrarProducto()
    {
        super.MostrarProducto();
        System.out.println("Pais: "+this._pais);
        System.out.println("Impuesto: "+this._impuesto);
    }
}
