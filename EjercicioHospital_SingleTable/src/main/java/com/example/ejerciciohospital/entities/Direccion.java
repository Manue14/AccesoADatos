package com.example.ejerciciohospital.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Direccion {
    private String calle;
    private int numero;
    private String municipio;
    private String provincia;

    public Direccion() {}

    public Direccion(String calle, int numero, String municipio, String provincia) {
        this.calle = calle;
        this.numero = numero;
        this.municipio = municipio;
        this.provincia = provincia;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return this.calle + " nº " + this.numero + " " + this.municipio + ", " + this.provincia;
    }
}
