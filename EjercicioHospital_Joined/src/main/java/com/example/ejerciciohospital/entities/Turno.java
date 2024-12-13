package com.example.ejerciciohospital.entities;

import jakarta.persistence.*;

@Entity
@Table(name="turnos")
public class Turno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="turno_id", nullable = false)
    private Integer id;

   private Float horas;


}
