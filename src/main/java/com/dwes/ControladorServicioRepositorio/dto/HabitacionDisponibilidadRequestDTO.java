package com.dwes.ControladorServicioRepositorio.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Builder
@Data
public class HabitacionDisponibilidadRequestDTO {
    private long id;
    private String tipo;
    private double precio;
    private LocalDate fecha;
}
