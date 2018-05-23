/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicicleteria;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lauta
 */
public class Bicicleteria {
    /* a)
    Declarar las variables bicicletas, ganancias y cantidadDeVentas de la clase Bicicleteria
    */
    private List<Bicicleta> bicicletas;
    private float ganancias;
    private int cantidadDeVentas;

    public Bicicleteria() {
        this.bicicletas = new ArrayList<Bicicleta>();
        this.cantidadDeVentas = 0;
        this.ganancias = 0;
    }

    /* b)
    Implementar el método addBicicleta de la clase Bicicleteria. El mismo deberá agregar una nueva
    bicicleta en la lista bicicletas    
     */
    public void addBicicleta(Bicicleta nuevaBici) {
        this.bicicletas.add(nuevaBici);
    }

    public void venderBicicleta(Bicicleta bicicleta) {
        this.bicicletas.remove(bicicleta);
        this.cantidadDeVentas++;
        this.ganancias = this.ganancias + bicicleta.getPrecio();
    }

    /* 2)
    Programar en Java el código del método buscarBicicleta en la clase Bicicleteria. El mismo recibirá por
    parámetros una variable llamada nroDeSerie de tipo String y retornará la bicicleta con dicho nroDeSerie.
    En caso de no encontrarlo deberá retornar null.
     */
    public Bicicleta buscarBicicleta(String nroDeSerie) {

        for (int i = 0; i < this.bicicletas.size(); i++) {
            if (this.bicicletas.get(i).getNroDeSerie().equalsIgnoreCase(nroDeSerie)) {
                return this.bicicletas.get(i);
            }
        }

        return null;
    }

}
