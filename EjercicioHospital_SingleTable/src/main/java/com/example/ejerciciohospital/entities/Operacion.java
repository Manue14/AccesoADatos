package com.example.ejerciciohospital.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="operaciones")
public class Operacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="operacion_id")
    private Integer id;

    @Column(name="descripcion", nullable = false)
    private String descripcion;

    @Column(name="fecha", nullable = false)
    private LocalDate fecha;

    @ManyToOne
    @JoinColumn(name="personal_id")
    private Medico medico;

    public Operacion() {}

    public Operacion(String descripcion, LocalDate fecha) {
        this.descripcion = descripcion;
        this.fecha = fecha;
    }
}
