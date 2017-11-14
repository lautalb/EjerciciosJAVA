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
public class Auto {
    private int numero;
    private Escuderia MiEscuderia;
    private String modelo;
    private Piloto elPiloto;
    private int TiempoRecorrido;
    
     public Auto(int numero) //constructor
    {
        this.elPiloto= new Piloto();
        this.modelo="Ford";
        this.numero=numero;
        //this.MiEscuderia= new Escuderia(1930,"Italia" , "Ferrari");
        //this.CargarEscuderia();  hacer los metodos para que cargue, año, escuderia y nombre random.
        this.CargarPilotoRandom();
    }
    
    public void Mostrar()
    {   System.out.println("numero: "+this.numero);
        System.out.println("Escuderia: "+this.MiEscuderia.nombre);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("tiempo recorrido: "+this.TiempoRecorrido);
        System.out.println("El ganador es: "+this.elPiloto.DameNombreCompletoMay());
    }
    
    public int DameElTiempoRecorrido()
    {
        
        return this.TiempoRecorrido;
    }
    
    public void AgregarTiempoRecorrido(int tiempo)
    {
        this.TiempoRecorrido=this.TiempoRecorrido+tiempo;
    }
    
    
    private void CargarPilotoRandom()
    {
       this.NombreRandom();
       this.ApellidoRandom();
        
    }
    
     private void NombreRandom()
    {
        int miRandom= (int)(Math.random()*10);
        switch(miRandom)
        {
            case 0:
                this.elPiloto.SetterNombre("Rogelio");
                break;
            
            case 1:
                this.elPiloto.SetterNombre("Alfredo");
                break;
            
            case 2:
                this.elPiloto.SetterNombre("Miguel");
                break;
                
                case 3:
                this.elPiloto.SetterNombre("Julieta");
                break;
                
                case 4:
                this.elPiloto.SetterNombre("Ernesto");
                break;
                
                case 5:
                this.elPiloto.SetterNombre("Elthon");
                break;
                
                case 6:
                this.elPiloto.SetterNombre("juan");
                break;
                
                case 7:
                this.elPiloto.SetterNombre("predo");
                break;
                
                case 8:
                this.elPiloto.SetterNombre("Guillermo");
                break;
                
                case 9:
                this.elPiloto.SetterNombre("Sandom");
                break;
                
        }
    }
     
      private void  ApellidoRandom()
    {
        int miRandom= (int)(Math.random()*10);
        
        switch(miRandom)
        {
            case 0:
                this.elPiloto.SetterApellido("Marinero");
                break;
            
            case 1:
                this.elPiloto.SetterApellido("El locura");
                break;
            
            case 2:
                this.elPiloto.SetterApellido("turro");
                break;
                
                case 3:
                this.elPiloto.SetterApellido("sandoval");
                break;
                
                case 4:
                this.elPiloto.SetterApellido("Cascada");
                break;
                
                case 5:
                this.elPiloto.SetterApellido("Etto");
                break;
                
                case 6:
                this.elPiloto.SetterApellido("Jeremia");
                break;
                
                case 7:
                this.elPiloto.SetterApellido("predo");
                break;
                
                case 8:
                this.elPiloto.SetterApellido("Guillermo");
                break;
                
                case 9:
                this.elPiloto.SetterApellido("Sandom");
                break;
                
        }
        
    }
    
    
}
