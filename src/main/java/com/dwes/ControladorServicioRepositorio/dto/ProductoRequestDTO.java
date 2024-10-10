package com.dwes.ControladorServicioRepositorio.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ProductoRequestDTO {
    String nombre;
    String categoria;
    double precio;
}
