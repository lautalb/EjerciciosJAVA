/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author lauta
 */
public class Notebook {
    private String marca;
    private String modelo;
    private String procesador;
    private float tamañoDisco;
    
    public Notebook(String marca, String modelo, String procesador, float tamañoDisco)
    {
        this.marca=marca;
        this.modelo=modelo;
        this.procesador=procesador;
        this.tamañoDisco=tamañoDisco;
        
    }
    
    public String getMarca()
    {
        return this.marca;
    }
    
    public String getModelo()
    {
        return this.modelo;
    }
    
    public String getProcesador()
    {
        return this.procesador;
    }
    
    public float getTamañoDisco()
    {
        return this.tamañoDisco;
    }
    
}

