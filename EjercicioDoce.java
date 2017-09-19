/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodoce;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioDoce {

    /**
     * @param args the command line arguments
     * Se ingresa el importe  de un producto  importado  y se le debe  agregar el 35%
     * de impuestos interno.
     */
    public static void main(String[] args) {
        //se declaran variables, scanner.
        String datoAux;
        Double importe;
        Double impuesto;
        Double total;
        Scanner misca= new Scanner(System.in);
        
        //se pide el importe del producto.
        System.out.println("Ingrese el importe del producto: ");
        //se guarda en la variable y se convierte.
        datoAux = misca.next();
        importe = Double.parseDouble(datoAux);
        // se calcula el porcentaje
        impuesto=importe*35/100;
        //se guarda el total del importe + el impuesto 35%.
        total=impuesto+importe;
        
        
        System.out.println("el impuesto es  :"+impuesto+" el importe mas el impuesto es : "+total);
        
        
        
    }
    
}
