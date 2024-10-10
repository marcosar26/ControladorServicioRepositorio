package com.dwes.ControladorServicioRepositorio.repository;

import com.dwes.ControladorServicioRepositorio.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
    Empleado findFirstById(long id);

    Empleado findFirstByTelefono(String telefono);

    List<Empleado> findAllByOrderByApellido();
}
