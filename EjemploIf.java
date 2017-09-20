/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploif;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjemploIf {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        //declaramos variables y creamos el scanner.
        Scanner miscan= new Scanner(System.in);
        String nombre;
        String clave;
        String sexo;
        String localidad;
        String colorFavorito;
        
        //tomo datos
        System.out.println("Ingrese nombre");
        nombre = miscan.next();
        
//        System.out.println("Ingrese clave");
//        clave = miscan.next();
        
        System.out.println("Ingrese sexo: ");
        sexo = miscan.next();
        
        System.out.println("Ingrese localidad");
        localidad = miscan.next();
        
        System.out.println("ingrese color favorito");
        colorFavorito=miscan.next();
        
        /**
         * si es masculino que viva en lanus o avellaneda y que su color favorito sea el rojo mostrar el mensaje
         * sos de independiente.
         * si el nombre es Andrea la localidad es moron y el color favorito es verde o azul se le pone el mensaje
         * feliz primavera.
         * 
         */
        
        
         if (sexo.equals("m")&& localidad.equals("lanus")|| localidad.equals("avellaneda")&& colorFavorito.equals("rojo") )
         {            
             System.out.println("sos de independiente");
            
         }
        
        
        
        
        
        
//        System.out.println("Ingrese color favorito: ");
//        colorFavorito=miscan.next();
//        
//        if (colorFavorito.equals("blanco")|| colorFavorito.equals("celeste"))
//        {
//            System.out.println("patriota!");
//        
//        }
//            
//            
//        //hacemos la condicion
//        if (nombre.equals("admin"))
//        {   //se muestra el mensaje
//            System.out.println("Bievenido administrador!.");
//            //se pone el si no
//        }else
//        {   //se muestra el mensaje
//            System.out.println("Bienvenido "+nombre);
//        }
//        
//        //ingresa m para mascula, f para femenino.
//        //operador && para comprar 2 o mas variables.
//        if (localidad.equals("lanus")&& sexo.equals("f"))
//        {
//            System.out.println("bievenida");
//             
//        }
        // if anidado.
        //if (sexo.equals("f"))
        //{
        //    
        //    System.out.println("Feliz dia de la mujer!.");
        //    if (localidad.equals("lanus"))
        //    {
        //        System.out.println("bievenida");
        //   }
        //} 
         
        
        
         
    }
        
}
    

