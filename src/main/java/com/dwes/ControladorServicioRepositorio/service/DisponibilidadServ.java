package com.dwes.ControladorServicioRepositorio.service;

import com.dwes.ControladorServicioRepositorio.dto.HabitacionDisponibilidadRequestDTO;
import com.dwes.ControladorServicioRepositorio.model.Disponibilidad;
import com.dwes.ControladorServicioRepositorio.model.Habitacion;
import com.dwes.ControladorServicioRepositorio.repository.DisponibilidadRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class DisponibilidadServ {
    private final DisponibilidadRepo disponibilidadRepo;

    @Autowired
    public DisponibilidadServ(DisponibilidadRepo disponibilidadRepo) {
        this.disponibilidadRepo = disponibilidadRepo;
    }

    public List<HabitacionDisponibilidadRequestDTO> buscarDisponibilidadEnRango(LocalDate fechaInicio, LocalDate fechaFin) {
        List<Disponibilidad> disponibles = disponibilidadRepo.findByFechaBetweenAndDisponibleTrue(fechaInicio, fechaFin);
        List<HabitacionDisponibilidadRequestDTO> habitacionesDisponibles = new ArrayList<>();
        for (Disponibilidad disponible : disponibles) {
            Habitacion habitacion = disponible.getHabitacion();
            HabitacionDisponibilidadRequestDTO habitacionDisponible = HabitacionDisponibilidadRequestDTO.builder().
                    id(habitacion.getId())
                    .tipo(habitacion.getTipo())
                    .precio(habitacion.getPrecio())
                    .fecha(disponible.getFecha())
                    .build();
            habitacionesDisponibles.add(habitacionDisponible);
        }
        return habitacionesDisponibles;
    }
}
