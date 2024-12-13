package com.example.ejerciciohospital.entities;

import jakarta.persistence.*;

@Entity
@Table(name="celadores")
public class Celador extends Personal{
    public Celador() {}

    public Celador(String dni, Integer nss, String nombre, Direccion direccion, String telefono) {
        super(dni, nss, nombre, direccion, telefono);
    }
}
