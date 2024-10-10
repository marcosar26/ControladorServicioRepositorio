package com.dwes.ControladorServicioRepositorio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Habitacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String tipo;
    private String capacidad;
    private double precio;
}
