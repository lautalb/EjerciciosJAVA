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
public class EjemploProductoContainer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Producto producto1= new Producto(1, "Bicicleta", 2000);
       Nacional producto2= new Nacional(2, "Mesa", 5600, "La Pampa");
       Importado producto3= new Importado(3, "Zapatos",200 , "China", 10);
       Nacional producto4= new Nacional(4, "sillon", 4000, "Cordoba");
       Importado producto5= new Importado(5, "xbox",5000 , "China", 1000);
       Nacional producto6= new Nacional(6, "casco", 2000, "Misiones");
       Importado producto7= new Importado(7, "Robot",7000 , "China", 90);
       
//       Producto a= new Producto(666, "dron", 20);
//       Producto b=a;
//       b._precio=999;
//       
//        System.out.println("El precio de a es: "+a.GetPrecio());
//        
//        
//        
//       
//       Conteiner nuevoConteiner= new Conteiner(10);
//       nuevoConteiner.CargarProducto(a);
//       nuevoConteiner.CargarProducto(a);
//       nuevoConteiner.CargarProducto(a);
//       nuevoConteiner.CargarProducto(a);
//       nuevoConteiner.CargarProducto(a);
//       nuevoConteiner.CargarProducto(a);
//       nuevoConteiner.CargarProducto(a);
//       
//       b._precio=333;
       
       
       //sout producto1.getClass(); devuelve la clase
       //instance of producto/nacional solo sirve con herencias.
       
       
       Conteiner nuevoConteiner= new Conteiner(10);
       if(nuevoConteiner.CargarProducto(producto1))
       {
           System.out.println("Exito");
       }else
       {
           System.out.println("No Cargo");
       }
       if(nuevoConteiner.CargarProducto(producto2))
       {
           System.out.println("Exito");
       }else
       {
           System.out.println("No Cargo");
       }
       if(nuevoConteiner.CargarProducto(producto3))
       {
           System.out.println("Exito");
       }else
       {
           System.out.println("No cargo");
       }
       
       nuevoConteiner.CargarProducto(producto4);
       nuevoConteiner.CargarProducto(producto5);
       nuevoConteiner.CargarProducto(producto6);
       nuevoConteiner.CargarProducto(producto7);
       nuevoConteiner.Ordenar();
       nuevoConteiner.MostrarConteiner();
        //System.out.println(""+nuevoConteiner.toString());
        //System.out.println(""+producto2.toString());
        
        
        
    }
    
}
