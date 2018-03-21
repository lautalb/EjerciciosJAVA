/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author alumno
 */
public class pelicula {
    private String _nombre;
    private int _duracion;
    private String _clasificacion;

    public pelicula(String _nombre, int _duracion, String _clasificacion) {
        this._nombre = _nombre;
        this._duracion = _duracion;
        this._clasificacion = _clasificacion;
    }

    public int getDuracion() {
        return _duracion;
    }

    public void setDuracion(int _duracion) {
        this._duracion = _duracion;
    }

    public String getClasificacion() {
        return _clasificacion;
    }

    public void setClasificacion(String _clasificacion) {
        this._clasificacion = _clasificacion;
    }

    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }
    
    


    public void mostrarNombre()
    {
        System.out.println("nombre: "+this._nombre);
    }
    
    
}
