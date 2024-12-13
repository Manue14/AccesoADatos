package com.example.ejerciciohospital.entities;

import jakarta.persistence.*;

@Entity
@Table(name="consultas")
public class Consulta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="consulta_id", nullable = false)
    private Integer id;

    @Column(name="nombre", nullable = false, unique = true)
    private String nombre;

    @OneToOne(mappedBy = "consulta", targetEntity = Medico.class)
    private Medico medico;

    @OneToOne(mappedBy = "consulta", targetEntity = Enfermero.class)
    private Enfermero enfermero;

    @ManyToOne
    @JoinColumn(name="planta_id", nullable = false)
    private Planta planta;

    public Consulta() {}

    public Consulta(String nombre, Planta planta) {
        this.nombre = nombre;
        this.planta = planta;
    }
}
