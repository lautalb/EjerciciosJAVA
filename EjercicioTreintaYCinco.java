/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotreintaycinco;

import java.util.Scanner;

/**
 *
 * @author Lautalb
 */
public class EjercicioTreintaYCinco {

    /**
     * @param args the command line arguments
     * Ferretería Ferrete
Debemos hacer una serie de aplicaciones para este negocio
	35- Las lámparas están al mismo precio de $35 pesos final. 
A. Si compra 6 o más lamparitas bajo consumo tiene un descuento del 50%. 
B. Si compra 5 lamparitas bajo consumo marca "ArgentinaLuz" se hace un descuento del 40 % y si es de otra marca el descuento es del 30%. 
C. Si compra 4 lamparitas bajo consumo marca "ArgentinaLuz" o “FelipeLamparas” se hace un descuento del 25 % y si es de otra marca el descuento es del 20%. 
D. Si compra 3 lamparitas bajo consumo marca "ArgentinaLuz" el descuento es del 15%, si es “FelipeLamparas” se hace un descuento del 10 % y si es de otra marca un 5%. 
E. Si el importe final con descuento suma más de $120 se debe sumar un 10% de ingresos brutos en informar del impuesto con el siguiente mensaje:”IIBB Usted pago X”, 
* siendo X el impuesto que se pagó.

     */
    public static void main(String[] args) {
         //declaramos las variables e importamos el scanner a utilizar
        Scanner miscan=new Scanner(System.in);
        
        String auxCantidad;
        Integer cantidadDeLamparitas;
        Integer precioDeLamparita;
        String marcaDeLampara;
        Double impuesto;
        Double precioTotal;
        Double ingresoBrutoTotal;
        
        //Double precioFinal=(double)0; se castea para poder inciar en 0 una variable double
        //definimos el precio de la lamparita
        precioDeLamparita=35;
        //mostramos mensajes y tomamos datos
        System.out.println("Ingrese la cantidad de lamparas");
        auxCantidad=miscan.next();
        cantidadDeLamparitas=Integer.parseInt(auxCantidad);
        
        System.out.println("Ingrese la marca de la lamparita");
        marcaDeLampara=miscan.next();
        
        switch(cantidadDeLamparitas)
        {
            case 5:
                if (marcaDeLampara.equals("argentinaluz") )
                {
                    precioTotal=cantidadDeLamparitas*precioDeLamparita*0.60;
                    System.out.println("debe pagar: "+precioTotal+"$.");
                }else
                {
                    precioTotal=cantidadDeLamparitas*precioDeLamparita*0.70;
                    impuesto=cantidadDeLamparitas*precioDeLamparita*0.10;
                    ingresoBrutoTotal=precioTotal+impuesto;
                    
                    System.out.println("IIBB usted pago: "+ingresoBrutoTotal+"$, siendo "+impuesto+"$ el impuesto que se pagó.");
                    
                    
                }
            break;
            
            case 4:
                if (marcaDeLampara.equals("argentinaluz") || marcaDeLampara.equals("felipelamparas"))
                {
                    precioTotal=cantidadDeLamparitas*precioDeLamparita*0.75;
                    System.out.println("debe pagar: "+precioTotal+"$.");
                    
                }else
                {
                precioTotal=cantidadDeLamparitas*precioDeLamparita*0.80;
                    System.out.println("debe pagar: "+precioTotal+"$.");
                }
                
            break;
            
            case 3:
                if(marcaDeLampara.equals("argentinaluz"))
                {
                    precioTotal=cantidadDeLamparitas*precioDeLamparita*0.85;
                    System.out.println("debe pagar: "+precioTotal+"$.");
                }else
                {
                    if (marcaDeLampara.equals("felipelamparas"))
                    {
                      precioTotal=cantidadDeLamparitas*precioDeLamparita*0.90;
                    System.out.println("debe pagar: "+precioTotal+"$."); 
                    
                    }else
                    {
                        precioTotal=cantidadDeLamparitas*precioDeLamparita*0.95;
                        System.out.println("debe pagar: "+precioTotal+"$.");
                    }
                }
                
                
            break;
            
            default:
                
                precioTotal=cantidadDeLamparitas*precioDeLamparita*0.50;
                System.out.println("debe pagar: "+precioTotal+"$.");
                break;
        
        }
    }
    
}
