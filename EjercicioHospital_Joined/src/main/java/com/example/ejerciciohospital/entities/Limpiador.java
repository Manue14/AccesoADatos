package com.example.ejerciciohospital.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="limpiadores")
@PrimaryKeyJoinColumn(name="personal_id")
@DiscriminatorValue(value="3")
public class Limpiador extends Personal{
    @ManyToMany
    @JoinTable(name = "limpiador_planta",
        joinColumns = @JoinColumn(name = "personal_id"),
            inverseJoinColumns = @JoinColumn(name = "planta_id"))
    private List<Planta> plantas;
}
