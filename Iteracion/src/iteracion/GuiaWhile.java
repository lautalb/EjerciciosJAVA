/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteracion;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class GuiaWhile {

    /*
       Pedir 5 edades e informar cuantos mayores a 18 hay. 
     */
    public static void SacarCantidadDeMayores() {

        //declaramos la variables e importamos y creamos el scanner
        String datoAux;
        Integer edad;
        Integer contador = 0;
        Scanner miscan = new Scanner(System.in);
        Integer mayores = 0;
        Integer cantidadDeMenores = 0;

        //creamos el while para 5 personas
        while (contador < 5) {

            //sumamos al contador de a 1
            contador++;

            //pedimos datos
            System.out.println("Ingrese edad numero: " + contador);
            datoAux = miscan.next();
            edad = Integer.parseInt(datoAux);

            //creamos la condicion, si es mayor a 17 que se sume en la variable mayores.
            if (edad > 17) {   //el contador de mayores, mayores++ es = (mayores=mayores+1); como un contador.
                mayores++;
                /* para verificar los mayores.
                System.out.println("mayores = "+mayores);
                 */
            } else {   //sumamos los menores
                cantidadDeMenores++;
            }

        }

        //mostramos la cantidad de mayores y menores, el total de los dos tiene que ser 5.
        System.out.println("La cantidad de mayores a 18 son: " + mayores + ", la cantidad de menores: " + cantidadDeMenores);
    }

    /*
       Pedir 5 numeros e informar cuantos positivos hay. 
     */
    public static void SacarCantidadDePositivos() {   //declaramos la variables y creamos el scanner
        String datoAux;
        Integer numero;
        Integer contador = 0;
        Scanner miscan = new Scanner(System.in);
        Integer cantidadDePositivos = 0;
        //creamos el while hasta 5 numeros
        while (contador < 5) {   //incrementamos el contador cada vez que entra al while
            contador++;
            // pedimos datos y parseamos
            System.out.println("ingrese numero");
            datoAux = miscan.next();
            numero = Integer.parseInt(datoAux);

            //creamos la condicion >0 para los positivos
            if (numero > 0) {   //incrementamos la variable si es positivo
                cantidadDePositivos++;
            }

        }
        //mostramos la cantidad de positivos
        System.out.println("la cantidad de numeros positivos es: " + cantidadDePositivos);
    }

    /*
       Pedir 5 numeros e informar cuantos pares hay. 
     */
    public static void SacarCantidadDePares() {   //declaramos las variables y creamos el scanner
        String datoAux;
        Integer numero;
        Integer contador = 0;
        Scanner miscan = new Scanner(System.in);
        Integer cantidadDePares = 0;
        //creamos la iteracion para 5 numeros
        while (contador < 5) {   //incrementamos el contador
            contador++;

            //pedimos datos
            System.out.println("ingrese numero");
            datoAux = miscan.next();
            numero = Integer.parseInt(datoAux);

            //creamos la condicion si el resto da 0 es par, si no es impar
            if (numero % 2 == 0) {   //incrementamos si es par
                cantidadDePares++;
            }

        }
        //mostramos los pares
        System.out.println("la cantidad de numeros pares es: " + cantidadDePares);

    }

    /*
    pedir 5 nombres e informar cuantas marias hay.
     */
    public static void SacarCantidadDeMarias() {
        //declaramos las variables y creamos el scanner
        String nombre;
        Integer contador = 0;
        Scanner miscan = new Scanner(System.in);
        Integer cantidadDeMarias = 0;
        //creamos la iteracion para 5 nombres
        while (contador < 5) {   //incrementamos el contador
            contador++;

            //pedimos datos
            System.out.println("ingrese nombre");
            nombre = miscan.next();

            //creamos la condicion si nombre es = a maria incrementa el contador
            if (nombre.equals("maria")) {   //incrementamos si es par
                cantidadDeMarias++;
            }

        }
        //mostramos la cantidad de marias
        System.out.println("la cantidad de Marias es: " + cantidadDeMarias);

    }

    public static void CuentaRegresiva() {
        Integer contador = 0;
        Integer sumador = 0;
        Integer promedio = 0;
        Integer cantidad;
        cantidad = 10;
        while (contador < cantidad) {
            contador++;
            System.out.println("numero: " + contador);

            sumador = sumador + contador;

        }
        promedio = sumador / cantidad;
        System.out.println("promedio: " + promedio);
    }

    public static void promedioDeEdad() {
        Scanner miscan = new Scanner(System.in);
        String respuesta;
        Integer edad;
        Integer contador = 0;
        String datoAux;
        Integer promedioDeEdad;
        Integer sumaDeEdades = 0;

        System.out.println("hay alguien para la edad");
        respuesta = miscan.next();
        while (respuesta.equals("si")) {   //tomo datos
            System.out.println("Ingrese su edad");
            datoAux = miscan.next();
            edad = Integer.parseInt(datoAux);
            //acumulo las edades
            sumaDeEdades = sumaDeEdades + edad;
            //incremento contador
            contador++;

            //vuelvo a preguntar y cargo la respuesta, si es no sale del while.
            System.out.println("hay alguien mas para la edad");
            respuesta = miscan.next();

        }
        //hago el promedio de edad
        promedioDeEdad = sumaDeEdades / contador;
        //muestro el promedio
        System.out.println("el promedio  de edad es : " + promedioDeEdad);
    }
    
    public static void mostrarPares()
    {   
        Integer contador=0;
        
        
        while(contador<100)
        {
            contador++;
            if(contador%2==0)
            {
                System.out.println("es par: "+contador);
            }
        }
            
    }

    public static void saludar() {
        System.out.println("Hola");
    }

}
