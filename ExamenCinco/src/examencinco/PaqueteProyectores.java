/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examencinco;

/**
 *
 * @author alumno
 */
public class PaqueteProyectores {

    private int codPaqueteDeProyectores;
    private String destinatario;
    private String destino;
    private float costoEnvio;
    private boolean enTransito;

    public PaqueteProyectores(int codPaquete, String destinatario, String destino, float costoEnvio) {

        this.codPaqueteDeProyectores = codPaquete;
        this.destinatario = destinatario;
        this.destino = destino;
        this.costoEnvio = costoEnvio;

    }

    public float getCostoEnvio() {
        return costoEnvio;
    }

    public void setCostoEnvio(float costoEnvio) {
        this.costoEnvio = costoEnvio;
    }

    public boolean getEnTransito() {
        return this.enTransito;
    }

    public void setEnTransito(boolean transito) {
        this.enTransito = transito;
    }

    public int getCodPaquete() {
        return this.codPaqueteDeProyectores;
    }

    public void setCodPaquete(int codPaquete) {
        this.codPaqueteDeProyectores = codPaquete;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getDestinatario() {
        return this.destinatario;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDestino() {
        return this.destino;
    }

}
