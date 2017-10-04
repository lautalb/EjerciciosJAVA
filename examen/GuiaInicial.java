/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author alumno todos los pares de la guia inicial 4,6,8,10 etc, guia if : impares menos lo de ferreteria ferrete. 
 */
public class GuiaInicial {
    //public = se puede usar en cualquier lado. stactic= quiere decir que es estatico, void es que no retorna ningun valor.
    
    public static void saludar() {
        
        
        System.out.println("buenas tardes");
    }
    //es como un procedimiento
    //1- Se debe mostrar el siguiente mensaje “esto funciona de maravilla”.
    public static void  hacerEjercicio1()
    {
         System.out.println("esto funciona de maravilla");
         
    }
    //muestra un mensaje y pide el nombre, luego lo muestra.
    //2- Se debe pedir el nombre y luego mostrarlo.
    public static void  hacerEjercicio2()
    {
        String nombre;
        Scanner miscan = new Scanner(System.in);
        
        
        System.out.println("ingrese su nombre");
        nombre=miscan.next();
        
        System.out.println("su nombre es: "+nombre);
         
    }
    
    
    
    /*
     4- Al ingresar la edad y el nombre mostrar el siguiente mensaje: “ Usted se llama “ XXXXXX y
     tiene XX años de edad”.
    */
    public static void hacerEjercicio4()
    {
    //declaramos variables.
       Integer edad;
       String nombre;
       String datoAux;
       
       // importamos y creamos el scanner a utilizar.
        Scanner miscan= new Scanner(System.in);
        
        System.out.println("ingrese su edad");
        datoAux=miscan.next();
        edad=Integer.parseInt(datoAux);
        
        System.out.println("ingrese su nombre");
        nombre=miscan.next();
        
        //se muestra el nombre y la edad.
        System.out.println("Su nombre es "+nombre+" y tiene "+edad+" años de edad.");
    
    }
    
    /*
    6- Se piden tres números e informar el promedio.
    */
    public static void hacerEjercicio6()
    {
     //declaramos las variables.
       Double numeroUno;
       Double numeroDos;
       Double numeroTres;
       Double promedio;
       String datoAux;
       
       //se importa y crea el scanner a utilizar.
        Scanner miScan= new Scanner(System.in);
        
        //se piden los numeros
        System.out.println("Ingrese el primero numero.");
        datoAux=miScan.next();
        numeroUno=Double.parseDouble(datoAux);
        
        //se verifica el numero ingresado.
//        System.out.println("el numero ingresado es: "+numeroUno);
        //se pide el segundo numero
        System.out.println("Ingrese el segundo numero.");
        datoAux=miScan.next();
        numeroDos=Double.parseDouble(datoAux);
        
//        System.out.println("el numero ingresado es : "+numeroDos);
        

        //se pide el tercer numero
        System.out.println("Ingrese el tercer numero.");
        datoAux=miScan.next();
        numeroTres=Double.parseDouble(datoAux);
        
        //se verifica el numero ingresado.
//        System.out.println("el numero ingresado es : "+numeroTres);
        
        //se hace el promedio en la variable (promedio)
        promedio = (numeroUno+numeroDos+numeroTres)/3;
        
        System.out.println("el promedio es : "+promedio);
        
    
    }
    
    /*
    8- Se pide el largo y ancho de un terreno y se pide la superficie del mismo.
    */
    public static void hacerEjercicio8()
    {
        // declaramos variables.
        Integer largo;
        Integer ancho;
        Integer superficie;
        String datoAux;
        // importamos y creamos el scanner a utilizar;
        Scanner miscan= new Scanner(System.in);
        
        //pedimos el largo del terreno;
        System.out.println("Ingrese el largo del terreno");
        // lo guardamos en la variable del tipo entero (largo)
        datoAux=miscan.next();
        largo=Integer.parseInt(datoAux);
        // mostramos para verificar
        //System.out.println("el largo es : "+largo);
        //pedimos el ancho del terreno
        System.out.println("Ingrese el ancho del terreno");
        //lo guardamos en la variable del tipo entero(ancho)
        datoAux=miscan.next();
        ancho=Integer.parseInt(datoAux);
        //mostramos para verificar
        //System.out.println("el ancho es : "+ancho);
        //calculamos la superficie
        superficie=largo*ancho;
        //mostramos la superficie del terreno
        System.out.println("La superficie del terreno es: "+superficie);
    }
    
    
    /*
    10- Se ingresa la cantidad de ganadores da la lotería nacional y el monto total del premio,
    */
    public static void hacerEjercicio10()
    {
     //se crean las variables y se importa y crea el scanner.
        String datoAux;
        Integer ganadores;
        Double monto;
        Double total;
        Scanner miscan= new Scanner(System.in);
         
        //se muestra el mensaje, se guarda y convierte el dato.
        System.out.println("Ingrese la cantidad de ganadores: ");
        datoAux = miscan.next();
        ganadores = Integer.parseInt(datoAux);
        
        //se muestra el mensaje, se guarda y convierte.
        System.out.println("Ingrese el monto total del premio: ");
        datoAux = miscan.next();
        monto=Double.parseDouble(datoAux);
        
        //se calcula cuanto va a ganar cada ganador.
        total = monto/ganadores;
        
        //se muestra cuanto va a ganar cada ganador.
        System.out.println("A cada ganador le pertenece: "+total+"$.");
    
    }
    
    /*
    12- Se ingresa el importe de un producto importado y se le debe agregar el 35 % de impuestos
    internos.
    */
    public static void hacerEjercicio12()
    {
     //se declaran variables, scanner.
        String datoAux;
        Double importe;
        Double impuesto;
        Double total;
        Scanner misca= new Scanner(System.in);
        
        //se pide el importe del producto.
        System.out.println("Ingrese el importe del producto: ");
        //se guarda en la variable y se convierte.
        datoAux = misca.next();
        importe = Double.parseDouble(datoAux);
        // se calcula el porcentaje
        impuesto=importe*35/100;
        //se guarda el total del importe + el impuesto 35%.
        total=impuesto+importe;
        
        
        System.out.println("el impuesto es  :"+impuesto+" el importe mas el impuesto es : "+total);
        
    }
    
}
    
    