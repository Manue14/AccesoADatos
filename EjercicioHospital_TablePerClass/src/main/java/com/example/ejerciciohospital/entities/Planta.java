package com.example.ejerciciohospital.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="plantas")
public class Planta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "planta_id", nullable = false)
    private Integer id;

    @Column(name = "numero", nullable = false, unique = true)
    private Integer numero;

    @Column(name = "nombre", nullable = false, unique = true)
    private String nombre;

    @OneToMany(mappedBy = "planta", targetEntity = Consulta.class)
    private List<Consulta> consultas;

    @ManyToMany(mappedBy = "plantas", targetEntity = Limpiador.class)
    private List<Limpiador> limpiadores;

    public Planta() {}

    public Planta(Integer numero, String nombre) {
        this.numero = numero;
        this.nombre = nombre;
    }
}
