package com.example.ejerciciohospital.entities;

import jakarta.persistence.*;

@Entity
@Table(name="enfermeros")
public class Enfermero extends Personal {
    @OneToOne(mappedBy = "enfermero", targetEntity = Medico.class)
    private Medico medico;

    public Enfermero() {}

    public Enfermero(String dni, Integer nss, String nombre, Direccion direccion, String telefono) {
        super(dni, nss, nombre, direccion, telefono);
    }
}
