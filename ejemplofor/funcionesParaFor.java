/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplofor;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class funcionesParaFor {
    
    public static void saludar()
    {
        System.out.println("Hola mundo");
    }
    
    public static void mostrarNumerosCreciente()
    { //for(3partes) for(declaracion e iniciacion ; condicion(true o folse) ; contador++(cualquier calculo) )
        int contador;
        for (contador= 0; contador < 100; contador++) {
            
            System.out.println("El numero es: "+ contador);
        }
        
        
    }
    
    
    public static void mostrarNumerosDecreciente()
    {
        for (int contador = 1000; contador > 0; contador--) {
            
            System.out.println("el numero es : "+contador);
        }
    }
    
    public static void mostrarNumerosPares()
    {
        for (int contador = 1; contador <= 100; contador++) {
            contador++;
            System.out.println("Pares: "+contador);
            
            /**
                if (contador%2==0)
                {
                 System.out.println("numero par: "+contador);
                }
            */
        }
        
    }
    
     public static void mostrarNumerosDivisiblesPorSeis()
    {
        for (int contador = 1; contador < 100; contador++) {
             
            if(contador%6==0)
           {
                System.out.println("Es divisible por seis : "+contador);
           }
        }
        
    }
     
     public static void mostrarTablaDeMultiplicar()
     {   Scanner miscan = new Scanner(System.in);
         Integer numero;
         String datoAux;
         int resultado;
         
         System.out.println("Ingrese numero para mostrar tabla de multiplicar[1 a 20]");
         datoAux=miscan.next();
         numero=Integer.parseInt(datoAux);
         
            while(numero>0 && numero<21 )
            { 
                for (int contador = 1; contador < 11; contador++) {
                    
                    resultado=numero*contador;
                    
                    System.out.println(numero+" * "+ contador+" = "+resultado);

                }//fin del for
                break;
            } //fin del while   
     }
     
     
     public static void mostrarTablaDeDividir()
     {   Scanner miscan = new Scanner(System.in);
         float numero;
         String datoAux;
         float resultado;
         
         System.out.println("Ingrese numero para mostrar tabla de divir[1 a 20]");
         datoAux=miscan.next();
         numero=Float.parseFloat(datoAux);
         
            while(numero>0 && numero<21 )
            { 
                for (int contador = 1; contador < 11; contador++) {
                    
                    resultado=numero/contador;
                   
                    System.out.println(numero+" / "+ contador+" = "+resultado);

                }//fin del for
                break;
            } //fin del while   
     }
    
     /**
      * Informar si un numero es primo
      */
     public static void saberSiEsPrimo()
     {
         //declaramos el scanner y las variables
       Scanner miscan=new Scanner(System.in);
       String datoAux;
       Integer numero;
       
       Integer contadorDeDiv=0;
       
       System.out.println("Ingrese numero");
       datoAux=miscan.next();
       numero=Integer.parseInt(datoAux);
       
       for(Integer contador=2;contador<numero;contador++)
       {
           
           
           if (numero%contador==0)
           {
               contadorDeDiv++;
               break;
           }
          
       }//fin del for
       
        if(contadorDeDiv>0)
            {
                System.out.println("No es primo");
            }else
            {
                System.out.println("Es primo el numero: "+numero);
            }
        
        /**
         * String bandera="no"; o flag
         * boolean bandera=true; con booleando es lo mismo.
         * 
         * for(Integer contador=2;contador<numero;contador++)
       {
           
           
           if (numero%contador==0)
           {
               bandera="si" o  bandera=false;
               break;
           }
          
       }//fin del for
       * 
       * if(bandera.equals("si"))   con equals
       *    (bandera==false)    con booleano, es lo mismo
            {
                System.out.println("No es primo");
            }else
            {
                System.out.println("Es primo el numero: "+numero);
            }
       * 
       * 
         */
        
        
        /**
         *  otra forma de hacerlo
         * for(Integer contador=2;contador<numero;contador++)
            {
           
           
                if (numero%contador==0)
                {
                    
                    break;
                 }
          
                }//fin del for
       
                if(contador==numero)
            {
                System.out.println("Es primo el numero: "+numero);
            }else
            {
                System.out.println("no es primo el numero: "+numero);
            }
         */
       
     }
     
     public static void numerosPrimosDel1Al100()
     {
         Integer numeroIngresado=2;
        
        while(numeroIngresado<100)
        {
            
            
            Integer contadorDivisores=0;

            for (Integer contador=2;contador<numeroIngresado;contador++) 
            {            
                if (numeroIngresado%contador==0)
                {
                    contadorDivisores++;
                    break;
                }
                
            }
            if (contadorDivisores>0)
            {
                //System.out.println("No es primo");
            }
            else
            {
                System.out.println("Es primo el número :" + numeroIngresado);
            }
            numeroIngresado++;
        }
     
     }
     
     public static void centroNumerico()
     {
         int numero=6;
         int sumaAnteriores=0;
         int sumaPosteriores=0;
         boolean EsCentroNumero=false;
         
         for (int contador = 1; contador < numero; contador++) {
             sumaAnteriores=sumaAnteriores+contador;
            
         }
         //System.out.println(sumaAnteriores);
         
         for (int posterior = numero+1; ; posterior++) {
             
             sumaPosteriores=sumaPosteriores+posterior;
             
             if(sumaAnteriores==sumaPosteriores    )
             {  
                EsCentroNumero=true;
                break;
             }
             if (sumaPosteriores>sumaAnteriores)
             {
                 break;
             }
         }
         
         if (EsCentroNumero)
         {
             System.out.println("Es centro numerico");
         }else
         {
             System.out.println("No es.");
         }
     }  
     
     public static void centroNumericosDel1Al1000()
     {  //la variable numero es la cantidad de veces que hay que repetir todo. : del 1 al 1000.
         for (int numero = 6; numero < 1000; numero++) {
             
         
            
            int sumaAnteriores=0;
            int sumaPosteriores=0;
            boolean EsCentroNumero=false;

            for (int contador = 1; contador < numero; contador++) {
                sumaAnteriores=sumaAnteriores+contador;//suma los numeros anteriores del numero

            }//fin del for 2
            //System.out.println(sumaAnteriores);

            for (int posterior = numero+1; ; posterior++) {
        //suma los numeros posteriores al numero y despues verifica, si la suma d elos anteriores y posteriores es lo mismo es centro numerico, si no, no.
                sumaPosteriores=sumaPosteriores+posterior;

                if(sumaAnteriores==sumaPosteriores    )
                {  
                   EsCentroNumero=true;
                   break;
                }
                if (sumaPosteriores>sumaAnteriores)
                {
                    break;
                }
            }//fin del for 3

            if (EsCentroNumero)
            {
                System.out.println("Es centro numerico: "+numero);
            }
         }//fin del for 1   
     }
     
     public static void FibonacciSucesion()
     {
         int numero=1;
         int anterior=0;
         int Fibonacci=1;
         int actual=1;
         
         
         for (int contador = 0; contador < 30; contador++) {
             Fibonacci=anterior+actual;
             anterior=actual;
             actual=Fibonacci;
                     
             System.out.println("es el: "+Fibonacci);
             
             
         }
     }
     
     public static void sacaMayor()
     {
         int numUno=3;
         int numDos=6;
         int numTres=9;
         
         
             //comparamos la primera variable con la segunda y la tercera
             if(numUno>numDos && numUno>numTres)
             {  //el mayor es la primera variable
                 System.out.println("el mayor es: "+numUno);
                 
             }else//1
             {  //comparamos la segunda variable con la primera y tercera
                 if(numDos>numUno && numDos>numTres)
                 {  //el mayor es la segunda variable
                     System.out.println("el mayor es: "+numDos);
                     
                     //si no es ninguno de las aneteriores entra aca
                 }else//2
                 {  //y el mayor es la tercera variable.
                     System.out.println("el mayor es: "+numTres);
                     
                 }//fin del segundo else
             }//fin del primer else
             
        }
     
     /**
      * Recorrer los numeros del 1 al 100.
      * mostrar en lugar del numero la palabra "UTN" para todos los multiplos de 3(tres)
      * mostrar en lugar del numero la palabra "FRA" para todos los multiplos de 5(cinco)
      * mostrar la palabra "UTNFRA" para todos los multiplos de 3 y 5.
      */            
     public static void recorrerDel1Al100()
     {  //iteracion de 1 al 100 inclusive.
         for (int contador = 1; contador <= 100; contador++) {
             
             if(contador%3==0 && contador%5==0)
             {  //si es multiplo de 3 y de 5 muestra este mensaje
                 System.out.println("UTNFRA");
             }else//1
             {
                 if(contador%5==0)
                 {  //si es multiplo de 5 muestra este otro
                     System.out.println("FRA");
                 }else//2
                 {
                     if(contador%3==00)
                     {  //si es multiplo de 3 muestra este mensaje
                         System.out.println("UTN");
                     }else//3
                     {  //si no es multiplo de 3 y de 5 muestra el numero.
                         System.out.println(""+contador);
                     }//fin del 3 else

                 }//fin del 2 else
                 
             }//fin del 1 else
             
             
         }
     }
     /**
      * 
      */
     public static void numeroAmstrong()
     {   int numeroIngresado=153;
         int numero=numeroIngresado;
         int suma=0;
         int cantidadDeDigitos=0;
         if(numero<0)
         {
             numero=numero*-1;
         }
         while(numero>0)
         {
             numero=numero/10;
             cantidadDeDigitos++;
         }
         
         int digito;
         int auxNumero=numeroIngresado;
         while(auxNumero>0)
         {
            digito=auxNumero%10;
            suma=suma+(int)(Math.pow(digito, cantidadDeDigitos));
            auxNumero=auxNumero/10;
            //System.out.println("digito: "+digito);
         }
         
         if(suma==numeroIngresado)
         {
             System.out.println("es Armstrong");
         }
         else
         {
             System.out.println("no es...");
         }
         //System.out.println(cantidadDeDigitos);
     }
     
     public static void HacerPiramide()
     {  
         int cantidadDeFilas=7;
         for (int contador = 1; contador < cantidadDeFilas; contador++) {
             for (int contadorLugares = cantidadDeFilas-1; contadorLugares > contador; contadorLugares--) {
                 System.out.print(" ");
             }
             for (int contador2 = 1; contador2 <=(2*contador-1); contador2++) {
                 System.out.print("x");
             }
             System.out.println("");
         }
     }
     
     public static void mostrarFilas()
     {
         int cantidadDeFilas=6;
         for (int contador = 1; contador < cantidadDeFilas; contador++) {
                                                 
             for (int contador2 = 1; contador2 <=contador; contador2++) {
                 System.out.print(contador2);
             }
             System.out.println("");
         }
     }
}