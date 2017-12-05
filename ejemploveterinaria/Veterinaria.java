/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploveterinaria;

import java.util.ArrayList;

/**
 *
 * @author lauta
 */
public class Veterinaria {
    private String _nombre;
    private String _dueño;
    private ArrayList<Mascota> _misMascotas;
    private float _precioGato;
    private float _precioPerro;
    
    public Veterinaria (String nombre, String nombreDueño, float precioG,float precioP)
    {
        this._nombre=nombre;
        this._dueño=nombreDueño;
        this._precioGato=precioG;
        this._precioPerro=precioP;
        this._misMascotas=new ArrayList<Mascota>();
    }
    
    public void IngresarAnimal(Mascota unaMascota)
    {
        this._misMascotas.add(unaMascota);
    }
    
    public void MostrarTotalFacturado()
    {   int cantidadDePerros=0;
        int cantidadDeGatos=0;
        float TotalFacturadoPerro=0;
        float TotalFacturadoGato=0;
        float total;
        
        for (Mascota mascotas : _misMascotas) 
        {
           if(mascotas instanceof Perro)
            {
             cantidadDePerros++;
            } 
        }
         TotalFacturadoPerro=cantidadDePerros*this._precioPerro;
         
        for (Mascota mascotas : _misMascotas) 
         {
            if(mascotas instanceof Gato)
            {
              cantidadDeGatos++;
            } 
        }
            TotalFacturadoGato=cantidadDeGatos*this._precioGato; 
            
        total=TotalFacturadoPerro+TotalFacturadoGato;
        System.out.println("El total facturado es: "+total);
    }
    
    public void MostrarTotalFacturadoPorTipo(String tipo)
    {   int cantidadDePerros=0;
        int cantidadDeGatos=0;
        float TotalFacturadoPerro=0;
        float TotalFacturadoGato=0;
        
        if(tipo.equalsIgnoreCase("perro"))
        {
            for (Mascota mascotas : _misMascotas) 
            {
                if(mascotas instanceof Perro)
                {

                  cantidadDePerros++;
                } 
            }
         TotalFacturadoPerro=cantidadDePerros*this._precioPerro;
            System.out.println(TotalFacturadoPerro+"$");
        }else
        {
            if(tipo.equalsIgnoreCase("gato"))
            {
                for (Mascota mascotas : _misMascotas) 
                {
                    if(mascotas instanceof Gato)
                    {

                      cantidadDeGatos++;
                    } 
                }
                TotalFacturadoGato=cantidadDeGatos*this._precioGato;
                System.out.println(TotalFacturadoGato+"$");
            }
        }
      
    }
    
    public void MostrarVeterinaria()
    {
        System.out.println("Nombre de la veterinaria: "+this._nombre);
        System.out.println("Dueño : "+this._dueño);
        System.out.println("Precio de gato: "+this._precioGato);
        System.out.println("Precio de perro: "+this._precioPerro);
        int contador=1;
        for (Mascota lista : _misMascotas) {
            System.out.println("N°: "+contador);
            
            System.out.println(lista.toString());
            contador++;
        }
    }
}
