package com.example.ejerciciohospital.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "personal")
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="tipo_personal",discriminatorType=DiscriminatorType.INTEGER)
@DiscriminatorValue(value="0")
public class Personal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="personal_id", nullable = false)
    private Integer id;

    @Column(name="dni", nullable = false, unique = true)
    private String dni;

    @Column(name="nss", unique = true, nullable = false)
    private Integer nss;

    @Column(name="nombre", nullable = false)
    private String nombre;

    @Embedded
    @Column(name="direccion", nullable = false)
    private Direccion direccion;

    @Column(name="telefono", nullable = false)
    private String telefono;

    public Personal() {}

    public Personal(String dni, Integer nss, String nombre, Direccion direccion, String telefono) {
        this.dni = dni;
        this.nss = nss;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Integer getNss() {
        return nss;
    }

    public void setNss(Integer nss) {
        this.nss = nss;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "DNI: " + this.dni + "\n"
                + "NSS: " + this.nss + "\n"
                + "Nombre: " + this.nombre + "\n"
                + "Direccion: " + this.direccion + "\n"
                + "Telefono: " + this.telefono;
    }
}
