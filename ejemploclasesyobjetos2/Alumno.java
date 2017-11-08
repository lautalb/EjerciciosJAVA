/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploclasesyobjetos;

/**
 *
 * @author Lautalb
 */
public class Alumno {
    
    private String nombre; //>3 letras o "nn"
    private String apellido; //>3 letras o "nn"
    private String correo; //>8 letras o "nn"
    private String sexo; //f o m o"esta mal"
    private String fechaDeNacimiento;
    private String localidad;//>4 letras o "mal localidad"
    private String direccion;//>8 letras o "mal Direccion"
    private int legajo; //de 6 caracteres o"mal legajo"
    private int dni; //= 8 caracteres o "mal dni".
    
    
    public String getNombre()
    {
        return this.nombre.toUpperCase();
    }
    
    public String getApellido()
    {
        return this.apellido.toUpperCase();
    }
    
    public String getCorreo()
    {
        return this.correo.toUpperCase();
    }
    
    public String getSexo()
    {
        return this.sexo.toUpperCase();
    }
    
    public String getFecha()
    {
        return this.fechaDeNacimiento.toUpperCase();
    }
    
    public String getLocalidad()
    {
        return this.localidad.toUpperCase();
    }
    
    public String getDireccion()
    {
        return this.direccion.toUpperCase();
    }
    
    public String getLegajo()
            
    {   int aux=this.legajo;
        String auxiliar=String.valueOf(aux);
        int cantidad=auxiliar.length();
        
        if (cantidad==6)
        {
            return ""+this.legajo;
        }else
        {
            return "MAL LEGAJO";
        }
 
    }
    
    public String getDni()
    {
        int aux=this.dni;
        String auxiliar=String.valueOf(aux);
        int cantidad=auxiliar.length();
        
        if (cantidad==8)
        {
            return ""+this.dni;
        }else
        {
            return "MAL DNI";
        }
    }
    
    public void setNombre(String nombre)
    {   if(nombre.length()<3)
        {
            this.nombre="nn";
        }else
        {
            this.nombre=nombre;
        }
    }
    
    public void setApellido(String apellido)
    {   
        if(apellido.length()<3)
        {
            this.apellido="nn";
        }else
        {
            this.apellido=apellido;
        }
    }
    
    public void setCorreo(String correo)
    {   
        if(correo.length()<8)
        {
            this.correo="nn";
        }else
        {
            this.correo=correo;
        }
    }
    
    public void setSexo(String sexo)
    {   if(sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m"))
        {
            this.sexo=sexo;
        }else
        {
            this.sexo="esta mal";
        }
    }
    
    public void setFecha(String fechaDeNacimiento)
    {
        this.fechaDeNacimiento=fechaDeNacimiento;
    }
    
    public void setLocalidad(String localidad)
    {
        if(localidad.length()<4)
        {
            this.localidad="mal localidad";
        }else
        {
            this.localidad=localidad;
        }
    }
    
    public void setDireccion(String direccion)
    {
       if(direccion.length()<8)
       {
            this.direccion="mal direccion";
       }else
       {
            this.direccion=direccion;
       }
    }
    
    public void setLegajo(int legajo)
    {   
        this.legajo=legajo;
    }
    
    public void setDni(int dni)
    {   
        this.dni=dni;
    }
    
    
    
}