/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploclasesyobjetos;

/**
 *
 * @author alumno
 */
public class generarRandom {
    
    
    public static String DameUnNombre()
    {
        String retorno="";
        int random= (int) Math.random()*10;
        switch(random)
        {
            case 0:
                    retorno="alfredo";
                    break;
            case 1:
                retorno="rogelio";
                break;
            case 2:
                retorno="julieta";
                break;
        }        
        return retorno;
    }
    
    public static int DameUnaEdad()
    {
        int random= (int) Math.random()*100;
        
        
        return random;
    }
    
    
}
