/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosarray;

/**
 *
 * @author Lautalb
 */
public class EjemplosArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //EjemplosArrays.PrimerEjemplo();
        //EjemplosArrays.EjemploDos();
        //EjemplosArrays.TercerEjemplo();
        //EjemplosArrays.InvertirOrden();
        //EjemplosArrays.SacarElMayor();
        //EjemplosArrays.SacarElMenor();
        //EjemplosArrays.SacarLaSuma();
        //EjemplosArrays.SacarElPromedio();
    }
    
    public static void PrimerEjemplo()
    {
        int[] numeros;
        int masNumeros[]={33,77,55,11};
        int []otrosNumeros;
        
        numeros = new int[4];
        numeros[0]=99;
        numeros[1]=22;
        numeros[2]=11;
        numeros[3]=0;
        // da error: numeros[4]=0;
        
        otrosNumeros = new int[10];
        int largo=otrosNumeros.length;
        System.out.println("largo " + largo);
        
        for (int i = 0; i < otrosNumeros.length; i++) {
            otrosNumeros[i]=i*3;
        }  
    }
    
    public static void EjemploDos()
    {
        int[] numerosPares;
        numerosPares = new int[10];
        int indice=0;
        
        for (int i = 0; i < 20; i++) {
            if (i%2==0) {
                numerosPares[indice]=i;
                indice = indice + 1;
            }
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println("El número "+i+" : "+numerosPares[i]);
        }
        
        
    }
    
    public static void TercerEjemplo()
    {
        int[] arraysUno;
        arraysUno = new int[3];
        arraysUno[0]=3;
        arraysUno[1]=5;
        arraysUno[2]=7;
        
        int[] arraysDos;
        arraysDos = new int[3];
        arraysDos[0]=8;
        arraysDos[1]=6;
        arraysDos[2]=2;
        
        int resultado[]= new int[3];
        
        for (int i = 0; i < 3; i++) {
            if (arraysUno[i]>arraysDos[i])
            {
              resultado[i]=arraysUno[i];  
            }
            else
            {
               resultado[i]=arraysDos[i];  
            }
            System.out.println("El resultado es: " + resultado[i]);
        }
      
        
        
    }
    
    public static void InvertirOrden()
    { 
        int arrayInicial[]={33,77,55,11};
        int resultadoArray[];
        int largo = arrayInicial.length;
        
        resultadoArray = new int[largo];
        
        for (int i = 0; i < largo; i++) 
        {
            resultadoArray[largo-1-i]=arrayInicial[i];
        }
        for (int i = 0; i < largo; i++) {
            System.out.println("" + resultadoArray[i]);
        }
        
    }
    
    public static void SacarElMayor()
    {
        int arrayInicial[]={33,77,55,11};
        int maximo=545630;
        
        for (int i = 0; i < arrayInicial.length; i++)
        {
            if (i==0) {
                maximo=arrayInicial[i];
            }
            if (maximo<arrayInicial[i])
            {
                maximo=arrayInicial[i];
            }
        }
        System.out.println("El máximo es " + maximo);
        
    }
    
    public static void SacarElMenor()
    {
        int arrayInicial[]={33,77,55,11};
        int minimo=0;
        
        for (int i = 0; i < arrayInicial.length; i++)
        {
            if (i==0) {
                minimo=arrayInicial[i];
            }
            if (minimo>arrayInicial[i])
            {
                minimo=arrayInicial[i];
            }
        }
        System.out.println("El mínimo es " + minimo);
    }
    
    public static void SacarLaSuma()
    {
        int arrayInicial[]={33,77,55,11};
        int suma=0;
        
        for (int i = 0; i < arrayInicial.length; i++)
        {
            
            suma = suma + arrayInicial[i];
        }
        System.out.println("La suma es " + suma);
    }
    
    public static void SacarElPromedio()
    {
       int arrayInicial[]={33,77,55,11};
        int suma=0;
        int promedio;
        
        for (int i = 0; i < arrayInicial.length; i++) {
            suma = suma + arrayInicial[i];
        }
         System.out.println("La suma es " + suma);
         promedio = suma/arrayInicial.length;
         System.out.println("El promedio es " + promedio);
    }
    
    
    
}
