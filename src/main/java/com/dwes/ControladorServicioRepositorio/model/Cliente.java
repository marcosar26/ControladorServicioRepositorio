package com.dwes.ControladorServicioRepositorio.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String dni;
    private String nombre;
    private String apellidos;
    private String direccion;
    private String telefono;
    @ManyToOne
    @JoinColumn(name = "id_oficina")
    private Oficina oficina;
}
