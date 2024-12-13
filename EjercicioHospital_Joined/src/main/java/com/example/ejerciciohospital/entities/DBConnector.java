package com.example.ejerciciohospital.entities;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.hibernate.HibernateException;

public class DBConnector {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
    private EntityManager em;

    public DBConnector() throws HibernateException {
        this.em = this.emf.createEntityManager();
    }

    public void insertarMedico(Medico medico) {
        try {
            this.em.getTransaction().begin();
            this.em.persist(medico);
            this.em.getTransaction().commit();
            System.out.println("Médico insertado correctamente");
        } catch (Exception e) {
            this.em.getTransaction().rollback();
            System.out.println("Error al insertar médico: " + e.getMessage());
        }
    }

    public void insertarEnfermero(Enfermero enfermero) {
        try {
            this.em.getTransaction().begin();
            this.em.persist(enfermero);
            this.em.getTransaction().commit();
            System.out.println("Enfermero insertado correctamente");
        } catch (Exception e) {
            this.em.getTransaction().rollback();
            System.out.println("Error al insertar enfermero: " + e.getMessage());
        }
    }

    public void insertarCelador(Celador celador) {
        try {
            this.em.getTransaction().begin();
            this.em.persist(celador);
            this.em.getTransaction().commit();
            System.out.println("Celador insertado correctamente");
        } catch (Exception e) {
            this.em.getTransaction().rollback();
            System.out.println("Error al insertar celador: " + e.getMessage());
        }
    }

    public void insertarPlanta(Planta planta) {
        try {
            this.em.getTransaction().begin();
            this.em.persist(planta);
            this.em.getTransaction().commit();
            System.out.println("Planta insertada correctamente");
        } catch (Exception e) {
            this.em.getTransaction().rollback();
            System.out.println("Error al insertar planta: " + e.getMessage());
        }
    }

    public void insertarConsulta(Consulta consulta) {
        try {
            this.em.getTransaction().begin();
            this.em.persist(consulta);
            this.em.getTransaction().commit();
            System.out.println("Consulta insertada correctamente");
        } catch (Exception e) {
            this.em.getTransaction().rollback();
            System.out.println("Error al insertar consulta: " + e.getMessage());
        }
    }

    public void insertarOperacion(Operacion operacion) {
        try {
            this.em.getTransaction().begin();
            this.em.persist(operacion);
            this.em.getTransaction().commit();
            System.out.println("Operación insertada correctamente");
        } catch (Exception e) {
            this.em.getTransaction().rollback();
            System.out.println("Error al insertar operación: " + e.getMessage());
        }
    }
}
