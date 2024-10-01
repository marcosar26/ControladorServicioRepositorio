package com.dwes.ControladorServicioRepositorio.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserRequestDTO {
    private String name;
    private String lastname;
}
