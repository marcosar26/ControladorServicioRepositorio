package com.dwes.ControladorServicioRepositorio.repository;

import com.dwes.ControladorServicioRepositorio.model.Oficina;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OficinaRepository extends JpaRepository<Oficina, Long> {
}