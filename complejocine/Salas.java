/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complejocine;

import java.util.Objects;

/**
 *
 * @author lauta
 */
public class Salas {
    private int[] _butacas;
    private String _pelicula;
    private int _numeroDeSala;
    private String _horario;
    
    
    public Salas()
    {
        this._butacas=new int[3];
        this._horario="16:30hs";
        this._numeroDeSala=5;
        this._pelicula="Fast and furious";
    }
    
    
    public String ButacasLibres()
    {   
        int acu=0;
        
        String retorno="";
        
        for (int i = 0; i < this._butacas.length; i++) {
           
            if(this._butacas[i]!=0)
            {
                acu++;
            }
        }
        
        retorno= "Butacas ocupadas: " + acu + "/"+this._butacas.length;
        
        return retorno;
    }
    
    public int PrimerButacaLibre()
    {
       int retorno = -1;
        for (int i = 0; i < this._butacas.length; i++) {
            if ((this._butacas[i])==0)
            {
                retorno=i;
                this._butacas[i]=retorno;
                return retorno;
            }
        }//fin del for
        return retorno;
    }
    
    public void LLenarButaca()
    {
        int indice;
        indice=this.PrimerButacaLibre();
        
        if(indice>-1)
        {
            this._butacas[indice]=1;
            System.out.println("Compra Exitosa");
        }else
        {
            System.out.println("No hay mas butacas disponibles");
        } 
        
    }
    
    
    
    
}
