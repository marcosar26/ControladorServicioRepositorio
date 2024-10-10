package com.dwes.ControladorServicioRepositorio.controller;

import com.dwes.ControladorServicioRepositorio.dto.HabitacionDisponibilidadRequestDTO;
import com.dwes.ControladorServicioRepositorio.service.DisponibilidadServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class DisponibilidadController {
    private final DisponibilidadServ disponibilidadServ;

    @Autowired
    public DisponibilidadController(DisponibilidadServ disponibilidadServ) {
        this.disponibilidadServ = disponibilidadServ;
    }

    @GetMapping("/buscarFechas")
    public ResponseEntity<List<HabitacionDisponibilidadRequestDTO>> buscarDisponibilidadEnRango(
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fechaInicio,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fechaFin
    ) {
        List<HabitacionDisponibilidadRequestDTO> habitacionesDisponibles = disponibilidadServ.buscarDisponibilidadEnRango(fechaInicio, fechaFin);
        return habitacionesDisponibles.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(habitacionesDisponibles);
    }
}
