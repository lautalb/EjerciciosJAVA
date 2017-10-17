/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocincuentaytres;

/**
 *
 * @author Lautalb
 */
public class EjercicioCincuentaYTres {

    /**
     * @param args the command line arguments
     * 53- mostrar la Sucesión de Fibonacci hasta el 100.
     */
    public static void main(String[] args) {
        //declaramos variables
        Integer contador=0;
        Integer maximo=100;
        Integer fibo1;
        Integer fibo2;
        
        
            //iniciamos las variables 
            fibo1=1;
            fibo2=1;
            //mostramos el fibonacci 1
            System.out.println(fibo1+"");
            //hacemos la iteracion
            while(contador+1<maximo)
            {
                contador++;
                System.out.println(fibo2+"");
                fibo2=fibo1+fibo2;
                fibo1=fibo2-fibo1;
                if(fibo2>100)
                {
                    break;
                }
            }
 
    }
    
}
