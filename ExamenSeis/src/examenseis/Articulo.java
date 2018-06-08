/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenseis;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lautalb
 */
public class Articulo {

    private String titular;
    private String periodista;
    private List<String> temas;
    private long idArticulo;
    private int palabras;
    private String texto;

    public Articulo(String titular, String periodista, long idArticulo, int palabras, String texto) {
        this.titular = titular;
        this.periodista = periodista;
        this.idArticulo = idArticulo;
        this.palabras = palabras;
        this.texto = texto;
        this.temas = new ArrayList<String>();
    }

    public List<String> getTemas() {
        return this.temas;
    }

    public boolean addTema(String tema) {
        return this.temas.add(tema);
    }

    public boolean contieneTema(String tema) {
        return this.temas.contains(tema);
    }

    public void setPalabras(int palabras) {
        this.palabras = palabras;
    }

    public int getPalabras() {
        return this.palabras;
    }

    public void setPeridista(String periodista) {
        this.periodista = periodista;
    }

    public String getPeriodista() {
        return this.periodista;
    }

}
