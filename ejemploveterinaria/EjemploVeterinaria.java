/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploveterinaria;

/**
 *
 * @author lauta
 */
public class EjemploVeterinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro nuevoPerro= new Perro("Horni", "Pitbull", true,Tamaño.Grande);
        Gato nuevoGato = new Gato("ojo", "siames", false);
        
        Veterinaria nuevaVeterinaria= new Veterinaria("Los amigos", "Gimena", 100, 150);
        
        nuevaVeterinaria.IngresarAnimal(nuevoGato);
        nuevaVeterinaria.IngresarAnimal(nuevoPerro);
        nuevaVeterinaria.IngresarAnimal(nuevoGato);
        
        
        nuevaVeterinaria.MostrarVeterinaria();
        System.out.print("Total facturado por perro: ");
        nuevaVeterinaria.MostrarTotalFacturadoPorTipo("perro");
        System.out.print("Total facturado por gato: ");
        nuevaVeterinaria.MostrarTotalFacturadoPorTipo("gato");
        
        nuevaVeterinaria.MostrarTotalFacturado();
        
        
    }
    
}
