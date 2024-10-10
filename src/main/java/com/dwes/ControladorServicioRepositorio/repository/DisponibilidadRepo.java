package com.dwes.ControladorServicioRepositorio.repository;

import com.dwes.ControladorServicioRepositorio.model.Disponibilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface DisponibilidadRepo extends JpaRepository<Disponibilidad, Long> {
    List<Disponibilidad> findByFechaBetweenAndDisponibleTrue(LocalDate fechaInicio, LocalDate fechaFin);
}
