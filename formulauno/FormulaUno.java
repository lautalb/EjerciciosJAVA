/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulauno;

/**
 *
 * @author alumno
 */
public class FormulaUno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Carrera nuevaCarrera=new Carrera();
        
        nuevaCarrera.CorrerCarrera(5);
        Auto Ganador= nuevaCarrera.DameElGanador();
        Ganador.Mostrar();
        System.out.println("termino");
    }
    
}
