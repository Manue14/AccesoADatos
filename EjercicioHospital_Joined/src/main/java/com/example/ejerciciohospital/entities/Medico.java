package com.example.ejerciciohospital.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="medicos")
@PrimaryKeyJoinColumn(name="personal_id")
@DiscriminatorValue(value="1")
public class Medico extends Personal {
    @OneToOne
    @JoinColumn(name = "consulta_id")
    private Consulta consulta;

    @OneToOne
    @JoinColumn(name = "personal_id_enfermero", nullable = false)
    private Enfermero enfermero;

    @OneToMany(mappedBy = "medico")
    private List<Operacion> operaciones;

    public Medico() {}

    public Medico(String dni, Integer nss, String nombre, Direccion direccion, String telefono, Consulta consulta, Enfermero enfermero, List<Operacion> operaciones) {
        super(dni, nss, nombre, direccion, telefono);
        this.consulta = consulta;
        this.enfermero = enfermero;
        this.operaciones = operaciones;
    }
}
