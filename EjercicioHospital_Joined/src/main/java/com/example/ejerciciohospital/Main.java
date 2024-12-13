package com.example.ejerciciohospital;

import com.example.ejerciciohospital.entities.*;
import org.hibernate.HibernateException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            DBConnector conn = new DBConnector();

            Direccion direccion1 = new Direccion("Avenida de Madrid", 44, "Vigo", "Pontevedra");
            Celador celador = new Celador("39491778L", 123456789, "Manu", direccion1, "698148138");

            Planta planta1 = new Planta(1, "1ºPlanta");
            Consulta consulta1 = new Consulta("Endocrinología", planta1);

            Operacion operacion1 = new Operacion("Prueba 1", LocalDate.now());
            Operacion operacion2 = new Operacion("Prueba 2", LocalDate.now());
            List<Operacion> operaciones = new ArrayList<>();
            operaciones.add(operacion1);
            operaciones.add(operacion2);

            Enfermero enfermero = new Enfermero("12345678Z", 987654321, "Antonio", direccion1, "698123476");

            Medico medico = new Medico("543216789O", 999999000, "Ana", direccion1, "968736511", consulta1, enfermero, operaciones);

            conn.insertarCelador(celador);

            conn.insertarPlanta(planta1);

            conn.insertarConsulta(consulta1);

            conn.insertarOperacion(operacion1);
            conn.insertarOperacion(operacion2);

            conn.insertarEnfermero(enfermero);

            conn.insertarMedico(medico);

        } catch (HibernateException e) {
            System.out.println("Error al conectar con la base de datos: " + e.getMessage());
        }
    }
}
