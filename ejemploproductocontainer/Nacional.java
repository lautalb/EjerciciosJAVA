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
public class Nacional extends Producto{
    private String _provincia;
    public Nacional(int idP,String nombreP,float precioP,String provinciaP)
    {
        super(idP, nombreP, precioP);
        this._provincia=provinciaP;
    }
    
    public float GetPrecio()
    {
        
        return super.GetPrecio();
    }
    
    public void MostrarProducto()
    {
        super.MostrarProducto();
        System.out.println("Provincia: "+this._provincia);
    }
    
    
}
