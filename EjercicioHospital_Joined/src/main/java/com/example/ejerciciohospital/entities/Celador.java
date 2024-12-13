package com.example.ejerciciohospital.entities;

import jakarta.persistence.*;

@Entity
@Table(name="celadores")
@PrimaryKeyJoinColumn(name="personal_id")
@DiscriminatorValue(value="4")
public class Celador extends Personal{
    public Celador() {}

    public Celador(String dni, Integer nss, String nombre, Direccion direccion, String telefono) {
        super(dni, nss, nombre, direccion, telefono);
    }
}
