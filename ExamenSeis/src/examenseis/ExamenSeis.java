/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenseis;

/**
 *
 * @author lautalb
 */
public class ExamenSeis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        EJERCICIO 4
            A)FALSO
            B)VERDADERO
            C)FALSO
            D)VERDADERO
            E)FALSO
            F)FALSO
            G)VERDADERO
        */
        
        /*
        EJERCICIO 5
        
        SELECT a.TITULO, r.EJEMPLAR
        FROM Articulo as a
        INNER JOIN Revista as r on r.EJEMPLAR=a.EJEMPLAR_REVISTA
        WHERE a.PALABRAS>=200
        AND a.TEMA LIKE "POLITICA"
        ORDER BY r.EJEMPLAR DESC
        
        */
    }
    
}
