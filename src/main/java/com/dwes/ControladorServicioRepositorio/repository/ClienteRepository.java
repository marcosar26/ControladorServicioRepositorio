package com.dwes.ControladorServicioRepositorio.repository;

import com.dwes.ControladorServicioRepositorio.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    List<Cliente> findByNombreAndApellidos(String nombre, String apellidos);

    List<Cliente> findByOficinaId(long idOficina);
}