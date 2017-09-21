/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioveintiseis;


import java.util.Scanner;

/**
 *
 * @author Lautalb
 */
public class EjercicioVeintiseis {

    /**
     * @param args the command line arguments
     * - se pide una temperatura y se pide si se quiere pasar Celsius o Fahrenheit, hacer la cuenta y mostrar el resultado.
     * 
     */
    public static void main(String[] args) {
        // creamos variables e importamos y creamos scanner.
        Scanner miscan=new Scanner(System.in);
        
        
        String datoAux;
        String dato;
        Double temperatura;
        Double celsius;
        Double fahrenheit;
        
        //se pide datos;
        System.out.println("Ingrese una temperatura");
        datoAux=miscan.next();
        temperatura=Double.parseDouble(datoAux);
        
        System.out.println("Se quiere pasar a Celsius(C) o Fahrenheit(F)?");
        dato= miscan.next();
        
        if (dato.equals("c"))
        {
            celsius=(temperatura-32)*5/9;
            System.out.println("serian : "+celsius+"°C");
        }
        if (dato.equals("f"))
        {
            fahrenheit=(1.8*temperatura)+32;
            System.out.println("Serian : "+fahrenheit+"°F");
        }
        
    }
    
}
