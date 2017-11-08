/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploclasesyobjetos;

import java.util.Scanner;

/**
 *
 * @author Lautalb
 */
public class EjemploClasesYObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner miscan=new Scanner(System.in);
        String datoAux;
        Alumno []nuevoAlumno;
        nuevoAlumno=new Alumno[10];
        
        for (int i = 0; i < 1; i++) {
            nuevoAlumno[i]=new Alumno();
            
            System.out.println("Ingrese nombre del Alumno");
            String nombre=miscan.next();
            nuevoAlumno[i].setNombre(nombre);
            
            System.out.println("Ingrese apellido del Alumno");
            String apellido=miscan.next();
            nuevoAlumno[i].setApellido(apellido);
            
            System.out.println("Ingrese correo del Alumno");
            String correo=miscan.next();
            nuevoAlumno[i].setCorreo(correo);
            
            System.out.println("Ingrese sexo del Alumno");
            String sexo=miscan.next();
            nuevoAlumno[i].setSexo(sexo);
            
            System.out.println("Ingrese fecha de nacimiento(DD/MM/AAAA) del Alumno");
            String fechaDeNacimiento=miscan.next();
            nuevoAlumno[i].setFecha(fechaDeNacimiento);
            
            System.out.println("Ingrese localidad del Alumno");
            String localidad=miscan.next();
            nuevoAlumno[i].setLocalidad(localidad);
            
            System.out.println("Ingrese direccion del Alumno");
            String direccion=miscan.next();
            nuevoAlumno[i].setDireccion(direccion);
            
            System.out.println("Ingrese legajo del Alumno");
            datoAux=miscan.next();
            int legajo=Integer.parseInt(datoAux);
            nuevoAlumno[i].setLegajo(legajo);
            
            System.out.println("Ingrese DNI del Alumno");
            datoAux=miscan.next();
            int dni=Integer.parseInt(datoAux);
            nuevoAlumno[i].setDni(dni);

        }
        
        for (int i = 0; i < 1; i++) {
            
            System.out.println("El nombre del alumno "+i+" es: "+nuevoAlumno[i].getNombre());
            System.out.println("El apellido del alumno "+i+" es: "+nuevoAlumno[i].getApellido());
            System.out.println("El correo del alumno "+i+" es: "+nuevoAlumno[i].getCorreo());
            System.out.println("El sexo del alumno "+i+" es: "+nuevoAlumno[i].getSexo());
            System.out.println("La fecha de nacimiento del alumno "+i+" es: "+nuevoAlumno[i].getFecha());
            System.out.println("La localidad del alumno "+i+" es: "+nuevoAlumno[i].getLocalidad());
            System.out.println("La direccion del alumno "+i+" es: "+nuevoAlumno[i].getDireccion());
            System.out.println("El legajo del alumno "+i+" es: "+nuevoAlumno[i].getLegajo());
            System.out.println("El DNI del alumno "+i+" es: "+nuevoAlumno[i].getDni());
            
        }
        
        
        
        
        
        
    }
    
}
