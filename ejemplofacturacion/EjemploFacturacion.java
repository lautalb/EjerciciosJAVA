/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplofacturacion;

/**
 *
 * @author alumno
 */
public class EjemploFacturacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // registrar una venta
//        Persona unCliente;
//        unCliente=new Persona("Fabio","Enrique");
//        Persona unEmpleado;
//        unEmpleado=new Persona("Fabio","Enrique");
//      
        /*
        Producto unProducto;
        unProducto=new Producto();
        unProducto.SetterCantidad(3);
        unProducto.SetterDescrip("fanta");
        unProducto.SetterPrecio(35);
        
        Producto unProducto2;
        unProducto2=new Producto();
        unProducto2.SetterCantidad(3);
        unProducto2.SetterDescrip("Coca Cola");
        unProducto2.SetterPrecio(45);
        
        Producto unProducto3;
        unProducto3=new Producto();
        unProducto3.SetterCantidad(3);
        unProducto3.SetterDescrip("Sprite");
        unProducto3.SetterPrecio(40);
        */
        
        Venta nuevaVenta;
        nuevaVenta=new Venta();
        nuevaVenta.elCliente=Persona.RetornarPersonaRandom();
        nuevaVenta.miEmpleado=Persona.RetornarPersonaRandom();
        /*
        nuevaVenta.elCliente=Persona.RetornarPersonaRandom();
        nuevaVenta.miEmpleado=Persona.RetornarPersonaRandom();
        //nuevaVenta.productoVendido=unProducto;
        */
        /*
        nuevaVenta.ListadoProductos[0]=unProducto;
        nuevaVenta.ListadoProductos[1]=unProducto2;
        nuevaVenta.ListadoProductos[2]=unProducto3;
        */
        
        nuevaVenta.CargarProducto(Producto.RetornarProductoRandom());
        nuevaVenta.CargarProducto(Producto.RetornarProductoRandom());
      
        
        nuevaVenta.MostrarVenta();
        
        
    }
    
}
