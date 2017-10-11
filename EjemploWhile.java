/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplowhile;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjemploWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //siempre poner el nombre de la class primero y despues . el metodo. para saber de donde sale.
        //EjemploWhile.PromedioConIf();
       // EjemploWhile.PromedioConWhile();
        //EjemploWhile.IteracionSinCantidad();
        //EjemploWhile.SalidaPorLogica();
        //EjemploWhile.PedirNumeros();
       // EjemploWhile.MostrarMenu();
        //EjemploWhile.TomarDatos();
        //EjemploWhile.ContadoresYAcumuladores();
        //EjemploWhile.NumeroPrimo();
        EjemploWhile.PrimosDelUnoAlCien();
        
    }//finaliza el main
    
    public static void PrimosDelUnoAlCien()
    {
        Integer numeroIngresado=1;
        
        while(numeroIngresado<101)
        {
            numeroIngresado++;
            Integer contador=2;
            Integer contadorDeDiv=0; 
            while(contador<numeroIngresado)
            {  

                if(numeroIngresado%contador==0)
                {   
                    contadorDeDiv++;
                    break;
                }
                contador++;
            }

            if(contadorDeDiv>0)
            {
                //System.out.println("No es primo");
            }else
            {
                System.out.println("Es primo el numero: "+numeroIngresado);
            }
        }//fin del primer while
    }
    
    public static void NumeroPrimo()
    {
        Integer numeroIngresado=357;
        Integer contador=2;
        Integer contadorDeDiv=0; 
        while(contador<numeroIngresado)
        {
            
            if(numeroIngresado%contador==0)
            {   
                contadorDeDiv++;
                break;
            }
            contador++;
        }
        
        if(contadorDeDiv>0)
        {
            System.out.println("No es primo");
        }else
        {
            System.out.println("Es primo");
        }
    }
    
    
    
    public static void ContadoresYAcumuladores()
    {
        Integer contador=0;
        Integer acumulador=0;
        Integer multiplicador=1;
        Integer restador=0;
        Integer contadorPares=0;
        Integer contadorDivisoresDe3=0;
        while(contador<10)
        {
            contador++;
            System.out.println("Numero: "+contador);
            acumulador=acumulador+contador;
            multiplicador=multiplicador*contador;
            restador=restador-contador;
            
            if (contador%2==0)
            {
                contadorPares++;
            }
            if(contador%3==0)
            {
                contadorDivisoresDe3++;
            }
        }
        
        System.out.println("la suma: "+acumulador);
        System.out.println("la multiplicacion: "+multiplicador);
        System.out.println("la resta: "+restador);
        System.out.println("pares: "+contadorPares);
        System.out.println("Cantidad de devisores x 3: "+contadorDivisoresDe3);
        
    }
    
    
    
    
    
    
    
    /**
     * Pide los datos de una persona y valida cada uno.
     * datos a pedir:
     * nombre
     * edad(entre 1 y 100 años)
     * sexo(f o m)
     * Estado civicl(S - C - D - V)
     * nacionalidad (N,L,E,R)
     * Sueldo(entre 8000 y 58000)
     * Dona organos(Si o no)
     * clave de no menos de 6 caracteres
     */
    public static void TomarDatos()
    {
        Scanner miscan= new Scanner(System.in);
        String datoAux;
        String nombre;
        Integer edad;
        String sexo;
        String estadoCivil;
        String nacionalidad;
        Integer sueldo;
        String donador;
        String clave;
        
        //pedimos datos
        System.out.println("Ingrese nombre: ");
        nombre=miscan.next();
        
        System.out.println("Ingrese clave: ");
        clave=miscan.next();
        while(clave.length()<6)
        {   //el length cuenta los caracteres de la variable.
            System.out.println("Pocos caracteres, vuelva a ingresar la clave");
            clave=miscan.next();
        }
        
        System.out.println("Ingrese edad: ");
        datoAux=miscan.next();
        edad=Integer.parseInt(datoAux);
        while (edad<1 || edad>100)
        {   //si es menor a 1 y mayor a 100 entra al while y vuelve a pedir
            System.out.println("edad invalidad, vuelva a ingresar su edad");
            datoAux=miscan.next();
            edad=Integer.parseInt(datoAux);
        }
        
        System.out.println("Ingrese sexo (F/M)");
        sexo=miscan.next();
        while (!sexo.equalsIgnoreCase("f") && !sexo.equalsIgnoreCase("m"))
        {   //si es diferente a F y a M entra al while y vuelve a pedir datos
            System.out.println("Sexo invalido, vuelva a ingresar su sexo");
            sexo=miscan.next();
        }
        
        System.out.println("Ingrese estado civil (S/C/D/V)");
        estadoCivil=miscan.next();
        while(!estadoCivil.equalsIgnoreCase("s") && !estadoCivil.equalsIgnoreCase("c") && !estadoCivil.equalsIgnoreCase("d") && !estadoCivil.equalsIgnoreCase("v"))
        {   //si es diferente a S, C, D, V va a volver a pedir datos
            System.out.println("Ingreso un estado civil invalido, vuelva a ingresar su estado civil.");
            estadoCivil=miscan.next();
        }
        
        System.out.println("Ingrese nacionalidad(N/L/E/R)");
        nacionalidad=miscan.next();
        while(!nacionalidad.equalsIgnoreCase("n") && !nacionalidad.equalsIgnoreCase("l") && !nacionalidad.equalsIgnoreCase("e") && !nacionalidad.equalsIgnoreCase("r"))
        {   //si es diferente a N,L,E,R vuelve a pedir datos
            System.out.println("Ingreso una nacionalidad invalidad, vuelva a ingresar su nacionalidad");
            nacionalidad=miscan.next();
        }        
         
        System.out.println("Ingrese sueldo");
        datoAux=miscan.next();
        sueldo=Integer.parseInt(datoAux);
        while(sueldo<8000 || sueldo>58000)
        {   //si es menor a 800 y mayor a 58000 vuelve a pedir
            System.out.println("Ingreso un sueldo invalido, vuelva a ingresar sueldo");
            datoAux=miscan.next();
            sueldo=Integer.parseInt(datoAux);
        }
        
        System.out.println("Es donador? (SI/NO)");
        donador=miscan.next();
        while(!donador.equalsIgnoreCase("si") && !donador.equalsIgnoreCase("no"))
        {   //si es diferente a S y a N vuelve a pedir.
            System.out.println("Ingreso invalido, vuelva a ingresar si es donador o no");
            donador=miscan.next();
        }
        
        //mostramos datos
        System.out.println("Usted se llama: "+nombre);
        System.out.println("Su clave es : "+clave);
        System.out.println("Usted tiene: "+edad+" años de edad.");
        System.out.println("Usted es del sexo: "+sexo);
        System.out.println("Su estado civil es: "+estadoCivil);
        System.out.println("Su nacionadalidad es: "+nacionalidad);
        System.out.println("Su sueldo es: "+sueldo);
        System.out.println("Usted "+donador+" dona.");
    }
    
    
    
    
    
    /**
        Pide dos numeros e informa el promedio.
    */
    public static void PromedioConIf()
    {
        Scanner miscan = new Scanner(System.in);
        Integer numeroUno;
        Integer numeroDos;
        String datoAux;
        Integer promedio;
        
        System.out.println("Ingrese numero #1:");
        datoAux=miscan.next();
        numeroUno=Integer.parseInt(datoAux);
        
        System.out.println("Ingrese numero #2:");
        datoAux=miscan.next();
        numeroDos=Integer.parseInt(datoAux);
        
        promedio=(numeroDos+numeroUno)/2;
        System.out.println("El promedio es: "+promedio);
          
    }//finaliza promedio con if.
    
    
    /**
        Pide dos numeros e informa el promedio.
    */
    public static void PromedioConWhile()
    {
        Scanner miscan = new Scanner(System.in);
        Integer numero;
        Integer contador=0;
        String datoAux;
        Integer promedio;
        Integer suma=0;
        
        while(contador<3)
        {
            contador++;
            
            System.out.println("Ingrese numero #"+contador);
            datoAux=miscan.next();
            numero=Integer.parseInt(datoAux);
            
            suma=suma+numero;
        }
        promedio=suma/contador;
        
        System.out.println("El promedio es: "+promedio);
        
    }
    
    /**
     *  cuando no sabemos la cantidad de iteraciones 
     */
    public static void IteracionSinCantidad()
    {
        String Continuar="si";
        //mientras sea diferente a "no" va a entrar al while, cuando es "no" se termina el while.
        while(!Continuar.equals("no"))
             {
                 System.out.println("Hola, desea continuar");
                 Scanner miscan= new Scanner(System.in);
                 Continuar=miscan.next();
                 
                 
             }
    }
    
    
    public static void SalidaPorLogica() 
    {
        String Continuar="si";
        //mientras sea diferente a "no" va a entrar al while, cuando es "no" se termina el while.
        while(true)
             {
                 System.out.println("Hola, desea continuar");
                 Scanner miscan= new Scanner(System.in);
                 Continuar=miscan.next();
                 if(Continuar.equals("no"))
                 {  //rompe iteracion
                     break;
                 }
                 
             }
    }
    
    public static void PedirNumeros() 
    {   Scanner miscan=new Scanner(System.in);
        Integer numero;
        Integer contador=0;
        String datoAux;
        Integer suma=0;
        //el while se piensa al revez para validar. osea en vez de mayor a 10 se corta, menor a 10 se corta.
        while(contador<10 && suma<50)
        {
            contador++;
            System.out.println("Ingrese numero #"+contador+": ");
            datoAux=miscan.next();
            numero=Integer.parseInt(datoAux);
           suma=suma+numero;
           
        }
        System.out.println("la suma es "+suma);
        System.out.println("la cantidad es: "+contador);
    }
    
    public static void MostrarMenu()
    {
        String opcion="0";
        Scanner miscan=new Scanner(System.in);
        
        while(!opcion.equals("6"))
        {    
            
            System.out.println("1-Sumar");
            System.out.println("2-Restar");
            System.out.println("3-Multiplicar");
            System.out.println("4-Dividir");
            System.out.println("6-Salir");
            System.out.println("Ingrese opcion deseada");
            opcion=miscan.next();
            switch(opcion)
            {
                case "1":
                    EjemploWhile.Sumar();
                    break;
                
                case "2":
                    EjemploWhile.Resta();
                    break;
                    
                case "3":
                    EjemploWhile.Multiplicar();
                    break;
                 
                case "4":
                    EjemploWhile.Dividir();
                    break;
                    
                case "6":
                    System.out.println("Adios!!");
                    break;
                    
                default:
                    System.out.println("Ingreso una opcion equivocada");
            }
        }//del while
        System.out.println("Cerro el menu");
        
    }
    
    public static void Sumar()
    {
        Scanner miscan = new Scanner(System.in);
        Integer numeroUno;
        Integer numeroDos;
        String datoAux;
        Integer resultado;
        //primer numero
        System.out.println("Ingrese primer numero");
        datoAux=miscan.next();
        numeroUno=Integer.parseInt(datoAux);
        
        //segundo numero
        System.out.println("Ingrese segundo numero");
        datoAux=miscan.next();
        numeroDos=Integer.parseInt(datoAux);
        
        resultado=numeroUno+numeroDos;
        System.out.println("El resultado de la suma es: "+resultado);
        
    }
    
    public static void Resta()
    {
    Scanner miscan = new Scanner(System.in);
        Integer numeroUno;
        Integer numeroDos;
        String datoAux;
        Integer resultado;
        //primer numero
        System.out.println("Ingrese primer numero");
        datoAux=miscan.next();
        numeroUno=Integer.parseInt(datoAux);
        
        //segundo numero
        System.out.println("Ingrese segundo numero");
        datoAux=miscan.next();
        numeroDos=Integer.parseInt(datoAux);
        
        resultado=numeroUno-numeroDos;
        System.out.println("El resultado de la resta es: "+resultado);
    }
    
    public static void Multiplicar()
    {
    Scanner miscan = new Scanner(System.in);
        Integer numeroUno;
        Integer numeroDos;
        String datoAux;
        Integer resultado;
        //primer numero
        System.out.println("Ingrese primer numero");
        datoAux=miscan.next();
        numeroUno=Integer.parseInt(datoAux);
        
        //segundo numero
        System.out.println("Ingrese segundo numero");
        datoAux=miscan.next();
        numeroDos=Integer.parseInt(datoAux);
        
        resultado=numeroUno*numeroDos;
        System.out.println("El resultado de la multiplicacion es: "+resultado);
    }
    
    public static void Dividir()
    {
    Scanner miscan = new Scanner(System.in);
        Integer numeroUno;
        Integer numeroDos;
        String datoAux;
        Integer resultado;
        //primer numero
        System.out.println("Ingrese primer numero");
        datoAux=miscan.next();
        numeroUno=Integer.parseInt(datoAux);
        
        //segundo numero
        System.out.println("Ingrese segundo numero");
        datoAux=miscan.next();
        numeroDos=Integer.parseInt(datoAux);
        
        resultado=numeroUno/numeroDos;
        System.out.println("El resultado de la division es: "+resultado);
    }
    
    
    
}